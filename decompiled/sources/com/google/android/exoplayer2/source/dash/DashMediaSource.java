package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower.Dummy;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_FIXED_MS = 30000;
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_PREFER_MANIFEST_MS = -1;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final int NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final String TAG = "DashMediaSource";
    private final com.google.android.exoplayer2.source.dash.DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private boolean dynamicMediaPresentationEnded;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private final long livePresentationDelayMs;
    /* access modifiers changed from: private */
    public Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
    private final EventDispatcher manifestEventDispatcher;
    /* access modifiers changed from: private */
    public IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final int minLoadableRetryCount;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;
    private final Object tag;

    private static final class DashTimeline extends Timeline {
        private final int firstPeriodId;
        private final DashManifest manifest;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;
        private final Object windowTag;

        public int getWindowCount() {
            return 1;
        }

        public DashTimeline(long j, long j2, int i, long j3, long j4, long j5, DashManifest dashManifest, Object obj) {
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j3;
            this.windowDurationUs = j4;
            this.windowDefaultStartPositionUs = j5;
            this.manifest = dashManifest;
            this.windowTag = obj;
        }

        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        public Period getPeriod(int i, Period period, boolean z) {
            Assertions.checkIndex(i, 0, this.manifest.getPeriodCount());
            Integer num = null;
            Object obj = z ? this.manifest.getPeriod(i).f8649id : null;
            if (z) {
                num = Integer.valueOf(this.firstPeriodId + Assertions.checkIndex(i, 0, this.manifest.getPeriodCount()));
            }
            return period.set(obj, num, 0, this.manifest.getPeriodDurationUs(i), C2793C.msToUs(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        public Window getWindow(int i, Window window, boolean z, long j) {
            Assertions.checkIndex(i, 0, 1);
            return window.set(z ? this.windowTag : null, this.presentationStartTimeMs, this.windowStartTimeMs, true, this.manifest.dynamic, getAdjustedWindowDefaultStartPositionUs(j), this.windowDurationUs, 0, this.manifest.getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        public int getIndexOfPeriod(Object obj) {
            int i = -1;
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int intValue = ((Integer) obj).intValue();
            if (intValue >= this.firstPeriodId && intValue < this.firstPeriodId + getPeriodCount()) {
                i = intValue - this.firstPeriodId;
            }
            return i;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
            long j2 = this.windowDefaultStartPositionUs;
            if (!this.manifest.dynamic) {
                return j2;
            }
            if (j > 0) {
                long j3 = j2 + j;
                if (j3 > this.windowDurationUs) {
                    return C2793C.TIME_UNSET;
                }
                j2 = j3;
            }
            long j4 = this.offsetInFirstPeriodUs + j2;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.manifest.getPeriodCount() - 1 && j4 >= periodDurationUs) {
                long j5 = j4 - periodDurationUs;
                i++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i);
                j4 = j5;
            }
            com.google.android.exoplayer2.source.dash.manifest.Period period = this.manifest.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            if (adaptationSetIndex == -1) {
                return j2;
            }
            DashSegmentIndex index = ((Representation) ((AdaptationSet) period.adaptationSets.get(adaptationSetIndex)).representations.get(0)).getIndex();
            return (index == null || index.getSegmentCount(periodDurationUs) == 0) ? j2 : (j2 + index.getTimeUs(index.getSegmentNum(j4, periodDurationUs))) - j4;
        }
    }

    private final class DefaultPlayerEmsgCallback implements PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }

        public void onDashManifestPublishTimeExpired(long j) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }

        public void onDashLiveMediaPresentationEndSignalEncountered() {
            DashMediaSource.this.onDashLiveMediaPresentationEndSignalEncountered();
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final com.google.android.exoplayer2.source.dash.DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        private boolean isCreateCalled;
        private long livePresentationDelayMs = -1;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
        private Parser<? extends DashManifest> manifestParser;
        private int minLoadableRetryCount = 3;
        private Object tag;

        public Factory(com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory2) {
            this.chunkSourceFactory = (com.google.android.exoplayer2.source.dash.DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
        }

        public Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        public Factory setMinLoadableRetryCount(int i) {
            Assertions.checkState(!this.isCreateCalled);
            this.minLoadableRetryCount = i;
            return this;
        }

        public Factory setLivePresentationDelayMs(long j) {
            Assertions.checkState(!this.isCreateCalled);
            this.livePresentationDelayMs = j;
            return this;
        }

        public Factory setManifestParser(Parser<? extends DashManifest> parser) {
            Assertions.checkState(!this.isCreateCalled);
            this.manifestParser = (Parser) Assertions.checkNotNull(parser);
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2) {
            Assertions.checkState(!this.isCreateCalled);
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory2);
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            Assertions.checkArgument(!dashManifest.dynamic);
            this.isCreateCalled = true;
            DashMediaSource dashMediaSource = new DashMediaSource(dashManifest, null, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.minLoadableRetryCount, this.livePresentationDelayMs, this.tag);
            return dashMediaSource;
        }

        @Deprecated
        public DashMediaSource createMediaSource(DashManifest dashManifest, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource createMediaSource = createMediaSource(dashManifest);
            if (!(handler == null || mediaSourceEventListener == null)) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }

        public DashMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.manifestParser == null) {
                this.manifestParser = new DashManifestParser();
            }
            DashMediaSource dashMediaSource = new DashMediaSource(null, (Uri) Assertions.checkNotNull(uri), this.manifestDataSourceFactory, this.manifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.minLoadableRetryCount, this.livePresentationDelayMs, this.tag);
            return dashMediaSource;
        }

        @Deprecated
        public DashMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource createMediaSource = createMediaSource(uri);
            if (!(handler == null || mediaSourceEventListener == null)) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }

        public int[] getSupportedTypes() {
            return new int[]{0};
        }
    }

    static final class Iso8601Parser implements Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        Iso8601Parser() {
        }

        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            long j;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(C2793C.UTF8_NAME))).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(readLine);
                if (!matcher.matches()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't parse timestamp: ");
                    sb.append(readLine);
                    throw new ParserException(sb.toString());
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if ("Z".equals(matcher.group(2))) {
                    j = time;
                } else {
                    long j2 = "+".equals(matcher.group(4)) ? 1 : -1;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    j = time - (j2 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000));
                }
                return Long.valueOf(j);
            } catch (ParseException e) {
                throw new ParserException((Throwable) e);
            }
        }
    }

    private final class ManifestCallback implements Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j2);
        }

        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        public int onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        ManifestLoadErrorThrower() {
        }

        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        public void maybeThrowError(int i) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }
    }

    private static final class PeriodSeekInfo {
        public final long availableEndTimeUs;
        public final long availableStartTimeUs;
        public final boolean isIndexExplicit;

        public static PeriodSeekInfo createPeriodSeekInfo(com.google.android.exoplayer2.source.dash.manifest.Period period, long j) {
            boolean z;
            int i;
            boolean z2;
            long j2;
            com.google.android.exoplayer2.source.dash.manifest.Period period2 = period;
            long j3 = j;
            int size = period2.adaptationSets.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                int i4 = ((AdaptationSet) period2.adaptationSets.get(i3)).type;
                if (i4 == 1 || i4 == 2) {
                    z = true;
                } else {
                    i3++;
                }
            }
            boolean z3 = false;
            long j4 = Long.MAX_VALUE;
            long j5 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i5 < size) {
                AdaptationSet adaptationSet = (AdaptationSet) period2.adaptationSets.get(i5);
                if (!z || adaptationSet.type != 3) {
                    DashSegmentIndex index = ((Representation) adaptationSet.representations.get(i2)).getIndex();
                    if (index == null) {
                        PeriodSeekInfo periodSeekInfo = new PeriodSeekInfo(true, 0, j3);
                        return periodSeekInfo;
                    }
                    boolean isExplicit = index.isExplicit() | z3;
                    int segmentCount = index.getSegmentCount(j3);
                    if (segmentCount == 0) {
                        i = size;
                        z2 = z;
                        z3 = isExplicit;
                        z4 = true;
                        j5 = 0;
                        j4 = 0;
                    } else if (!z4) {
                        z2 = z;
                        long firstSegmentNum = index.getFirstSegmentNum();
                        i = size;
                        long max = Math.max(j5, index.getTimeUs(firstSegmentNum));
                        if (segmentCount != -1) {
                            long j6 = (firstSegmentNum + ((long) segmentCount)) - 1;
                            j2 = max;
                            j4 = Math.min(j4, index.getTimeUs(j6) + index.getDurationUs(j6, j3));
                        } else {
                            j2 = max;
                        }
                        z3 = isExplicit;
                        j5 = j2;
                    } else {
                        i = size;
                        z2 = z;
                        z3 = isExplicit;
                    }
                } else {
                    i = size;
                    z2 = z;
                }
                i5++;
                z = z2;
                size = i;
                period2 = period;
                i2 = 0;
            }
            PeriodSeekInfo periodSeekInfo2 = new PeriodSeekInfo(z3, j5, j4);
            return periodSeekInfo2;
        }

        private PeriodSeekInfo(boolean z, long j, long j2) {
            this.isIndexExplicit = z;
            this.availableStartTimeUs = j;
            this.availableEndTimeUs = j2;
        }
    }

    private final class UtcTimestampCallback implements Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j2);
        }

        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        public int onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    private static final class XsDateTimeParser implements Parser<Long> {
        private XsDateTimeParser() {
        }

        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    @Deprecated
    public DashMediaSource(DashManifest dashManifest, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(dashManifest, factory, 3, handler2, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(DashManifest dashManifest, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory, int i, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        Handler handler3 = handler2;
        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
        this(dashManifest, null, null, null, factory, new DefaultCompositeSequenceableLoaderFactory(), i, -1, null);
        if (handler3 == null || mediaSourceEventListener2 == null) {
        } else {
            addEventListener(handler3, mediaSourceEventListener2);
        }
    }

    @Deprecated
    public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory2, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, factory2, 3, -1, handler2, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory2, int i, long j, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, new DashManifestParser(), factory2, i, j, handler2, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Parser<? extends DashManifest> parser, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory2, int i, long j, Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
        Handler handler3 = handler2;
        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
        this(null, uri, factory, parser, factory2, new DefaultCompositeSequenceableLoaderFactory(), i, j, null);
        if (handler3 == null || mediaSourceEventListener2 == null) {
        } else {
            addEventListener(handler3, mediaSourceEventListener2);
        }
    }

    private DashMediaSource(DashManifest dashManifest, Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Parser<? extends DashManifest> parser, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2, int i, long j, Object obj) {
        this.initialManifestUri = uri;
        this.manifest = dashManifest;
        this.manifestUri = uri;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.minLoadableRetryCount = i;
        this.livePresentationDelayMs = j;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory2;
        this.tag = obj;
        this.sideloadedManifest = dashManifest != null;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = C2793C.TIME_UNSET;
        if (this.sideloadedManifest) {
            Assertions.checkState(!dashManifest.dynamic);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new Dummy();
            return;
        }
        this.manifestCallback = new ManifestCallback();
        this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
        this.refreshManifestRunnable = new Runnable() {
            public void run() {
                DashMediaSource.this.startLoadingManifest();
            }
        };
        this.simulateManifestRefreshRunnable = new Runnable() {
            public void run() {
                DashMediaSource.this.processManifest(false);
            }
        };
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("Loader:DashMediaSource");
        this.handler = new Handler();
        startLoadingManifest();
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator) {
        int i = mediaPeriodId.periodIndex;
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + i, this.manifest, i, this.chunkSourceFactory, this.minLoadableRetryCount, createEventDispatcher(mediaPeriodId, this.manifest.getPeriod(i).startMs), this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback);
        this.periodsById.put(dashMediaPeriod.f8646id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f8646id);
    }

    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        if (this.loader != null) {
            this.loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0;
        this.manifestLoadEndTimestampMs = 0;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        if (this.handler != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = 0;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = C2793C.TIME_UNSET;
        this.dynamicMediaPresentationEnded = false;
        this.firstPeriodId = 0;
        this.periodsById.clear();
    }

    /* access modifiers changed from: 0000 */
    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    /* access modifiers changed from: 0000 */
    public void onDashLiveMediaPresentationEndSignalEncountered() {
        this.dynamicMediaPresentationEnded = true;
    }

    /* access modifiers changed from: 0000 */
    public void onDashManifestPublishTimeExpired(long j) {
        if (this.expiredManifestPublishTimeUs == C2793C.TIME_UNSET || this.expiredManifestPublishTimeUs < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onManifestLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r11, long r12, long r14) {
        /*
            r10 = this;
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r10.manifestEventDispatcher
            com.google.android.exoplayer2.upstream.DataSpec r1 = r11.dataSpec
            int r2 = r11.type
            long r7 = r11.bytesLoaded()
            r3 = r12
            r5 = r14
            r0.loadCompleted(r1, r2, r3, r5, r7)
            java.lang.Object r0 = r11.getResult()
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = (com.google.android.exoplayer2.source.dash.manifest.DashManifest) r0
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r10.manifest
            r2 = 0
            if (r1 != 0) goto L_0x001c
            r1 = r2
            goto L_0x0022
        L_0x001c:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r10.manifest
            int r1 = r1.getPeriodCount()
        L_0x0022:
            com.google.android.exoplayer2.source.dash.manifest.Period r3 = r0.getPeriod(r2)
            long r3 = r3.startMs
            r5 = r2
        L_0x0029:
            if (r5 >= r1) goto L_0x003a
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r10.manifest
            com.google.android.exoplayer2.source.dash.manifest.Period r6 = r6.getPeriod(r5)
            long r6 = r6.startMs
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x003a
            int r5 = r5 + 1
            goto L_0x0029
        L_0x003a:
            boolean r3 = r0.dynamic
            r4 = 1
            if (r3 == 0) goto L_0x00b8
            int r3 = r1 - r5
            int r6 = r0.getPeriodCount()
            if (r3 <= r6) goto L_0x0050
            java.lang.String r3 = "DashMediaSource"
            java.lang.String r6 = "Loaded out of sync manifest"
            android.util.Log.w(r3, r6)
        L_0x004e:
            r3 = r4
            goto L_0x009a
        L_0x0050:
            boolean r3 = r10.dynamicMediaPresentationEnded
            if (r3 != 0) goto L_0x006d
            long r6 = r10.expiredManifestPublishTimeUs
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x006b
            long r6 = r0.publishTimeMs
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r10.expiredManifestPublishTimeUs
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r3 = r2
            goto L_0x009a
        L_0x006d:
            java.lang.String r3 = "DashMediaSource"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Loaded stale dynamic manifest: "
            r6.append(r7)
            long r7 = r0.publishTimeMs
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            boolean r7 = r10.dynamicMediaPresentationEnded
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            long r7 = r10.expiredManifestPublishTimeUs
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r3, r6)
            goto L_0x004e
        L_0x009a:
            if (r3 == 0) goto L_0x00b6
            int r11 = r10.staleManifestReloadAttempt
            int r12 = r11 + 1
            r10.staleManifestReloadAttempt = r12
            int r12 = r10.minLoadableRetryCount
            if (r11 >= r12) goto L_0x00ae
            long r11 = r10.getManifestLoadRetryDelayMillis()
            r10.scheduleManifestRefresh(r11)
            goto L_0x00b5
        L_0x00ae:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r11 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r11.<init>()
            r10.manifestFatalError = r11
        L_0x00b5:
            return
        L_0x00b6:
            r10.staleManifestReloadAttempt = r2
        L_0x00b8:
            r10.manifest = r0
            boolean r0 = r10.manifestLoadPending
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r10.manifest
            boolean r2 = r2.dynamic
            r0 = r0 & r2
            r10.manifestLoadPending = r0
            long r2 = r12 - r14
            r10.manifestLoadStartTimestampMs = r2
            r10.manifestLoadEndTimestampMs = r12
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r12 = r10.manifest
            android.net.Uri r12 = r12.location
            if (r12 == 0) goto L_0x00e5
            java.lang.Object r12 = r10.manifestUriLock
            monitor-enter(r12)
            com.google.android.exoplayer2.upstream.DataSpec r11 = r11.dataSpec     // Catch:{ all -> 0x00e2 }
            android.net.Uri r11 = r11.uri     // Catch:{ all -> 0x00e2 }
            android.net.Uri r13 = r10.manifestUri     // Catch:{ all -> 0x00e2 }
            if (r11 != r13) goto L_0x00e0
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r11 = r10.manifest     // Catch:{ all -> 0x00e2 }
            android.net.Uri r11 = r11.location     // Catch:{ all -> 0x00e2 }
            r10.manifestUri = r11     // Catch:{ all -> 0x00e2 }
        L_0x00e0:
            monitor-exit(r12)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e5
        L_0x00e2:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00e2 }
            throw r11
        L_0x00e5:
            if (r1 != 0) goto L_0x00f9
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r11 = r10.manifest
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r11 = r11.utcTiming
            if (r11 == 0) goto L_0x00f5
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r11 = r10.manifest
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r11 = r11.utcTiming
            r10.resolveUtcTimingElement(r11)
            goto L_0x0101
        L_0x00f5:
            r10.processManifest(r4)
            goto L_0x0101
        L_0x00f9:
            int r11 = r10.firstPeriodId
            int r11 = r11 + r5
            r10.firstPeriodId = r11
            r10.processManifest(r4)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.onManifestLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable, long, long):void");
    }

    /* access modifiers changed from: 0000 */
    public int onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException) {
        ParsingLoadable<DashManifest> parsingLoadable2 = parsingLoadable;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof ParserException;
        this.manifestEventDispatcher.loadError(parsingLoadable2.dataSpec, parsingLoadable2.type, j, j2, parsingLoadable2.bytesLoaded(), iOException2, z);
        return z ? 3 : 0;
    }

    /* access modifiers changed from: 0000 */
    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        this.manifestEventDispatcher.loadCompleted(parsingLoadable.dataSpec, parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded());
        onUtcTimestampResolved(((Long) parsingLoadable.getResult()).longValue() - j);
    }

    /* access modifiers changed from: 0000 */
    public int onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
        ParsingLoadable<Long> parsingLoadable2 = parsingLoadable;
        this.manifestEventDispatcher.loadError(parsingLoadable2.dataSpec, parsingLoadable2.type, j, j2, parsingLoadable2.bytesLoaded(), iOException, true);
        onUtcTimestampResolutionError(iOException);
        return 2;
    }

    /* access modifiers changed from: 0000 */
    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j2) {
        this.manifestEventDispatcher.loadCanceled(parsingLoadable.dataSpec, parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded());
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    private void onUtcTimestampResolutionError(IOException iOException) {
        Log.e(TAG, "Failed to resolve UtcTiming element.", iOException);
        processManifest(true);
    }

    /* access modifiers changed from: private */
    public void processManifest(boolean z) {
        boolean z2;
        long j;
        long periodDurationUs;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int keyAt = this.periodsById.keyAt(i);
            if (keyAt >= this.firstPeriodId) {
                ((DashMediaPeriod) this.periodsById.valueAt(i)).updateManifest(this.manifest, keyAt - this.firstPeriodId);
            }
        }
        int periodCount = this.manifest.getPeriodCount() - 1;
        PeriodSeekInfo createPeriodSeekInfo = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(0), this.manifest.getPeriodDurationUs(0));
        PeriodSeekInfo createPeriodSeekInfo2 = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(periodCount), this.manifest.getPeriodDurationUs(periodCount));
        long j2 = createPeriodSeekInfo.availableStartTimeUs;
        long j3 = createPeriodSeekInfo2.availableEndTimeUs;
        if (!this.manifest.dynamic || createPeriodSeekInfo2.isIndexExplicit) {
            z2 = false;
        } else {
            j3 = Math.min((getNowUnixTimeUs() - C2793C.msToUs(this.manifest.availabilityStartTimeMs)) - C2793C.msToUs(this.manifest.getPeriod(periodCount).startMs), j3);
            if (this.manifest.timeShiftBufferDepthMs != C2793C.TIME_UNSET) {
                long msToUs = j3 - C2793C.msToUs(this.manifest.timeShiftBufferDepthMs);
                while (msToUs < 0 && periodCount > 0) {
                    periodCount--;
                    msToUs += this.manifest.getPeriodDurationUs(periodCount);
                }
                if (periodCount == 0) {
                    periodDurationUs = Math.max(j2, msToUs);
                } else {
                    periodDurationUs = this.manifest.getPeriodDurationUs(0);
                }
                j2 = periodDurationUs;
            }
            z2 = true;
        }
        long j4 = j3 - j2;
        int i2 = 0;
        while (i2 < this.manifest.getPeriodCount() - 1) {
            i2++;
            j4 += this.manifest.getPeriodDurationUs(i2);
        }
        if (this.manifest.dynamic) {
            long j5 = this.livePresentationDelayMs;
            if (j5 == -1) {
                j5 = this.manifest.suggestedPresentationDelayMs != C2793C.TIME_UNSET ? this.manifest.suggestedPresentationDelayMs : 30000;
            }
            long msToUs2 = j4 - C2793C.msToUs(j5);
            j = msToUs2 < MIN_LIVE_DEFAULT_START_POSITION_US ? Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j4 / 2) : msToUs2;
        } else {
            j = 0;
        }
        DashTimeline dashTimeline = new DashTimeline(this.manifest.availabilityStartTimeMs, this.manifest.availabilityStartTimeMs + this.manifest.getPeriod(0).startMs + C2793C.usToMs(j2), this.firstPeriodId, j2, j4, j, this.manifest, this.tag);
        refreshSourceInfo(dashTimeline, this.manifest);
        if (!this.sideloadedManifest) {
            this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
            if (z2) {
                this.handler.postDelayed(this.simulateManifestRefreshRunnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            }
            if (this.manifestLoadPending) {
                startLoadingManifest();
            } else if (z && this.manifest.dynamic && this.manifest.minUpdatePeriodMs != C2793C.TIME_UNSET) {
                long j6 = this.manifest.minUpdatePeriodMs;
                if (j6 == 0) {
                    j6 = 5000;
                }
                scheduleManifestRefresh(Math.max(0, (this.manifestLoadStartTimestampMs + j6) - SystemClock.elapsedRealtime()));
            }
        }
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    /* access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.minLoadableRetryCount);
    }

    private long getManifestLoadRetryDelayMillis() {
        return (long) Math.min((this.staleManifestReloadAttempt - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Callback<ParsingLoadable<T>> callback, int i) {
        this.manifestEventDispatcher.loadStarted(parsingLoadable.dataSpec, parsingLoadable.type, this.loader.startLoading(parsingLoadable, callback, i));
    }

    private long getNowUnixTimeUs() {
        if (this.elapsedRealtimeOffsetMs != 0) {
            return C2793C.msToUs(SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs);
        }
        return C2793C.msToUs(System.currentTimeMillis());
    }
}
