package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface MediaSourceEventListener {

    public static final class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        private static final class ListenerAndHandler {
            public final Handler handler;
            public final MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler2, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler2;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, MediaPeriodId mediaPeriodId2, long j) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId2;
            this.mediaTimeOffsetMs = j;
        }

        public EventDispatcher withParameters(int i, MediaPeriodId mediaPeriodId2, long j) {
            EventDispatcher eventDispatcher = new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId2, j);
            return eventDispatcher;
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkArgument((handler == null || mediaSourceEventListener == null) ? false : true);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void mediaPeriodCreated() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onMediaPeriodCreated(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void mediaPeriodReleased() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onMediaPeriodReleased(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void loadStarted(DataSpec dataSpec, int i, long j) {
            loadStarted(dataSpec, i, -1, null, 0, null, C2793C.TIME_UNSET, C2793C.TIME_UNSET, j);
        }

        public void loadStarted(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, j3, 0, 0);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2));
            loadStarted(loadEventInfo, mediaLoadData);
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onLoadStarted(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(DataSpec dataSpec, int i, long j, long j2, long j3) {
            loadCompleted(dataSpec, i, -1, null, 0, null, C2793C.TIME_UNSET, C2793C.TIME_UNSET, j, j2, j3);
        }

        public void loadCompleted(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2));
            loadCompleted(loadEventInfo, mediaLoadData);
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onLoadCompleted(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(DataSpec dataSpec, int i, long j, long j2, long j3) {
            loadCanceled(dataSpec, i, -1, null, 0, null, C2793C.TIME_UNSET, C2793C.TIME_UNSET, j, j2, j3);
        }

        public void loadCanceled(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2));
            loadCanceled(loadEventInfo, mediaLoadData);
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onLoadCanceled(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(DataSpec dataSpec, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            loadError(dataSpec, i, -1, null, 0, null, C2793C.TIME_UNSET, C2793C.TIME_UNSET, j, j2, j3, iOException, z);
        }

        public void loadError(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2));
            loadError(loadEventInfo, mediaLoadData, iOException, z);
        }

        public void loadError(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Handler handler = listenerAndHandler.handler;
                final LoadEventInfo loadEventInfo2 = loadEventInfo;
                final MediaLoadData mediaLoadData2 = mediaLoadData;
                final IOException iOException2 = iOException;
                final boolean z2 = z;
                C28906 r2 = new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onLoadError(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, loadEventInfo2, mediaLoadData2, iOException2, z2);
                    }
                };
                postOrRun(handler, r2);
            }
        }

        public void readingStarted() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onReadingStarted(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            MediaLoadData mediaLoadData = new MediaLoadData(1, i, null, 3, null, adjustMediaTime(j), adjustMediaTime(j2));
            upstreamDiscarded(mediaLoadData);
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onUpstreamDiscarded(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void downstreamFormatChanged(int i, Format format, int i2, Object obj, long j) {
            MediaLoadData mediaLoadData = new MediaLoadData(1, i, format, i2, obj, adjustMediaTime(j), C2793C.TIME_UNSET);
            downstreamFormatChanged(mediaLoadData);
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable() {
                    public void run() {
                        mediaSourceEventListener.onDownstreamFormatChanged(EventDispatcher.this.windowIndex, EventDispatcher.this.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        private long adjustMediaTime(long j) {
            long usToMs = C2793C.usToMs(j);
            if (usToMs == C2793C.TIME_UNSET) {
                return C2793C.TIME_UNSET;
            }
            return this.mediaTimeOffsetMs + usToMs;
        }

        private void postOrRun(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static final class LoadEventInfo {
        public final long bytesLoaded;
        public final DataSpec dataSpec;
        public final long elapsedRealtimeMs;
        public final long loadDurationMs;

        public LoadEventInfo(DataSpec dataSpec2, long j, long j2, long j3) {
            this.dataSpec = dataSpec2;
            this.elapsedRealtimeMs = j;
            this.loadDurationMs = j2;
            this.bytesLoaded = j3;
        }
    }

    public static final class MediaLoadData {
        public final int dataType;
        public final long mediaEndTimeMs;
        public final long mediaStartTimeMs;
        public final Format trackFormat;
        public final Object trackSelectionData;
        public final int trackSelectionReason;
        public final int trackType;

        public MediaLoadData(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.dataType = i;
            this.trackType = i2;
            this.trackFormat = format;
            this.trackSelectionReason = i3;
            this.trackSelectionData = obj;
            this.mediaStartTimeMs = j;
            this.mediaEndTimeMs = j2;
        }
    }

    void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId);

    void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId);

    void onReadingStarted(int i, MediaPeriodId mediaPeriodId);

    void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
