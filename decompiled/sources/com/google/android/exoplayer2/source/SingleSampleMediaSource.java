package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class SingleSampleMediaSource extends BaseMediaSource {
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private final Format format;
    private final int minLoadableRetryCount;
    private final Timeline timeline;
    private final boolean treatLoadErrorsAsEndOfStream;

    @Deprecated
    public interface EventListener {
        void onLoadError(int i, IOException iOException);
    }

    private static final class EventListenerWrapper extends DefaultMediaSourceEventListener {
        private final EventListener eventListener;
        private final int eventSourceId;

        public EventListenerWrapper(EventListener eventListener2, int i) {
            this.eventListener = (EventListener) Assertions.checkNotNull(eventListener2);
            this.eventSourceId = i;
        }

        public void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            this.eventListener.onLoadError(this.eventSourceId, iOException);
        }
    }

    public static final class Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private boolean isCreateCalled;
        private int minLoadableRetryCount = 3;
        private Object tag;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this.dataSourceFactory = (com.google.android.exoplayer2.upstream.DataSource.Factory) Assertions.checkNotNull(factory);
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

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            Assertions.checkState(!this.isCreateCalled);
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }

        public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long j) {
            this.isCreateCalled = true;
            SingleSampleMediaSource singleSampleMediaSource = new SingleSampleMediaSource(uri, this.dataSourceFactory, format, j, this.minLoadableRetryCount, this.treatLoadErrorsAsEndOfStream, this.tag);
            return singleSampleMediaSource;
        }

        @Deprecated
        public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long j, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            SingleSampleMediaSource createMediaSource = createMediaSource(uri, format, j);
            if (!(handler == null || mediaSourceEventListener == null)) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    public void releaseSourceInternal() {
    }

    @Deprecated
    public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format2, long j) {
        this(uri, factory, format2, j, 3);
    }

    @Deprecated
    public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format2, long j, int i) {
        this(uri, factory, format2, j, i, false, null);
    }

    @Deprecated
    public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format2, long j, int i, Handler handler, EventListener eventListener, int i2, boolean z) {
        Handler handler2 = handler;
        EventListener eventListener2 = eventListener;
        this(uri, factory, format2, j, i, z, null);
        if (handler2 == null || eventListener2 == null) {
            return;
        }
        addEventListener(handler2, new EventListenerWrapper(eventListener2, i2));
    }

    private SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format2, long j, int i, boolean z, Object obj) {
        this.dataSourceFactory = factory;
        this.format = format2;
        this.durationUs = j;
        this.minLoadableRetryCount = i;
        this.treatLoadErrorsAsEndOfStream = z;
        this.dataSpec = new DataSpec(uri);
        SinglePeriodTimeline singlePeriodTimeline = new SinglePeriodTimeline(j, true, false, obj);
        this.timeline = singlePeriodTimeline;
    }

    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        refreshSourceInfo(this.timeline, null);
    }

    public MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator) {
        Assertions.checkArgument(mediaPeriodId.periodIndex == 0);
        SingleSampleMediaPeriod singleSampleMediaPeriod = new SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, this.format, this.durationUs, this.minLoadableRetryCount, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
        return singleSampleMediaPeriod;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }
}
