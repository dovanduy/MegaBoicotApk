package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.ShuffleOrder.DefaultShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> implements Target {
    private static final int MSG_ADD = 0;
    private static final int MSG_ADD_MULTIPLE = 1;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_MOVE = 3;
    private static final int MSG_NOTIFY_LISTENER = 5;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private final boolean isAtomic;
    private boolean listenerNotificationScheduled;
    private final Map<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private final List<EventDispatcher> pendingOnCompletionActions;
    private int periodCount;
    private ExoPlayer player;
    private final MediaSourceHolder query;
    private ShuffleOrder shuffleOrder;
    private final Window window;
    private int windowCount;

    private static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid = new HashMap<>();
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, int i, int i2, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            this.windowCount = i;
            this.periodCount = i2;
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            int i3 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i3] = mediaSourceHolder.timeline;
                this.firstPeriodInChildIndices[i3] = mediaSourceHolder.firstPeriodIndexInChild;
                this.firstWindowInChildIndices[i3] = mediaSourceHolder.firstWindowIndexInChild;
                this.uids[i3] = mediaSourceHolder.uid;
                int i4 = i3 + 1;
                this.childIndexByUid.put(this.uids[i3], Integer.valueOf(i3));
                i3 = i4;
            }
        }

        /* access modifiers changed from: protected */
        public int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public int getChildIndexByWindowIndex(int i) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public int getChildIndexByChildUid(Object obj) {
            Integer num = (Integer) this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        public Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        /* access modifiers changed from: protected */
        public int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        /* access modifiers changed from: protected */
        public int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        /* access modifiers changed from: protected */
        public Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        public int getWindowCount() {
            return this.windowCount;
        }

        public int getPeriodCount() {
            return this.periodCount;
        }
    }

    private static final class DeferredTimeline extends ForwardingTimeline {
        private static final Object DUMMY_ID = new Object();
        private static final DummyTimeline dummyTimeline = new DummyTimeline();
        private static final Period period = new Period();
        private final Object replacedId;

        public DeferredTimeline() {
            this(dummyTimeline, null);
        }

        private DeferredTimeline(Timeline timeline, Object obj) {
            super(timeline);
            this.replacedId = obj;
        }

        public DeferredTimeline cloneWithNewTimeline(Timeline timeline) {
            return new DeferredTimeline(timeline, (this.replacedId != null || timeline.getPeriodCount() <= 0) ? this.replacedId : timeline.getPeriod(0, period, true).uid);
        }

        public Timeline getTimeline() {
            return this.timeline;
        }

        public Period getPeriod(int i, Period period2, boolean z) {
            this.timeline.getPeriod(i, period2, z);
            if (Util.areEqual(period2.uid, this.replacedId)) {
                period2.uid = DUMMY_ID;
            }
            return period2;
        }

        public int getIndexOfPeriod(Object obj) {
            Timeline timeline = this.timeline;
            if (DUMMY_ID.equals(obj)) {
                obj = this.replacedId;
            }
            return timeline.getIndexOfPeriod(obj);
        }
    }

    private static final class DummyTimeline extends Timeline {
        public int getIndexOfPeriod(Object obj) {
            return obj == null ? 0 : -1;
        }

        public int getPeriodCount() {
            return 1;
        }

        public int getWindowCount() {
            return 1;
        }

        private DummyTimeline() {
        }

        public Window getWindow(int i, Window window, boolean z, long j) {
            long j2 = 0;
            if (j > 0) {
                j2 = C2793C.TIME_UNSET;
            }
            return window.set(null, C2793C.TIME_UNSET, C2793C.TIME_UNSET, false, true, j2, C2793C.TIME_UNSET, 0, 0, 0);
        }

        public Period getPeriod(int i, Period period, boolean z) {
            return period.set(null, null, 0, C2793C.TIME_UNSET, 0);
        }
    }

    private static final class EventDispatcher {
        public final Handler eventHandler;
        public final Runnable runnable;

        public EventDispatcher(Runnable runnable2) {
            this.runnable = runnable2;
            this.eventHandler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        public void dispatchEvent() {
            this.eventHandler.post(this.runnable);
        }
    }

    static final class MediaSourceHolder implements Comparable<MediaSourceHolder> {
        public List<DeferredMediaPeriod> activeMediaPeriods = new ArrayList();
        public int childIndex;
        public int firstPeriodIndexInChild;
        public int firstWindowIndexInChild;
        public boolean isPrepared;
        public boolean isRemoved;
        public final MediaSource mediaSource;
        public DeferredTimeline timeline = new DeferredTimeline();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource2) {
            this.mediaSource = mediaSource2;
        }

        public void reset(int i, int i2, int i3) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.firstPeriodIndexInChild = i3;
            this.isPrepared = false;
            this.isRemoved = false;
            this.activeMediaPeriods.clear();
        }

        public int compareTo(MediaSourceHolder mediaSourceHolder) {
            return this.firstPeriodIndexInChild - mediaSourceHolder.firstPeriodIndexInChild;
        }
    }

    private static final class MessageData<T> {
        public final EventDispatcher actionOnCompletion;
        public final T customData;
        public final int index;

        public MessageData(int i, T t, Runnable runnable) {
            this.index = i;
            this.actionOnCompletion = runnable != null ? new EventDispatcher(runnable) : null;
            this.customData = t;
        }
    }

    public ConcatenatingMediaSource() {
        this(false, (ShuffleOrder) new DefaultShuffleOrder(0));
    }

    public ConcatenatingMediaSource(boolean z) {
        this(z, (ShuffleOrder) new DefaultShuffleOrder(0));
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder2) {
        this(z, shuffleOrder2, new MediaSource[0]);
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder2, MediaSource... mediaSourceArr) {
        for (MediaSource checkNotNull : mediaSourceArr) {
            Assertions.checkNotNull(checkNotNull);
        }
        if (shuffleOrder2.getLength() > 0) {
            shuffleOrder2 = shuffleOrder2.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder2;
        this.mediaSourceByMediaPeriod = new IdentityHashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.pendingOnCompletionActions = new ArrayList();
        this.query = new MediaSourceHolder(null);
        this.isAtomic = z;
        this.window = new Window();
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public final synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, null);
    }

    public final synchronized void addMediaSource(MediaSource mediaSource, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, runnable);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource) {
        addMediaSource(i, mediaSource, null);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource, Runnable runnable) {
        Assertions.checkNotNull(mediaSource);
        MediaSourceHolder mediaSourceHolder = new MediaSourceHolder(mediaSource);
        this.mediaSourcesPublic.add(i, mediaSourceHolder);
        if (this.player != null) {
            this.player.createMessage(this).setType(0).setPayload(new MessageData(i, mediaSourceHolder, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, null);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection, Runnable runnable) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, runnable);
    }

    public final synchronized void addMediaSources(int i, Collection<MediaSource> collection) {
        addMediaSources(i, collection, null);
    }

    public final synchronized void addMediaSources(int i, Collection<MediaSource> collection, Runnable runnable) {
        for (MediaSource checkNotNull : collection) {
            Assertions.checkNotNull(checkNotNull);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (MediaSource mediaSourceHolder : collection) {
            arrayList.add(new MediaSourceHolder(mediaSourceHolder));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (this.player != null && !collection.isEmpty()) {
            this.player.createMessage(this).setType(1).setPayload(new MessageData(i, arrayList, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void removeMediaSource(int i) {
        removeMediaSource(i, null);
    }

    public final synchronized void removeMediaSource(int i, Runnable runnable) {
        this.mediaSourcesPublic.remove(i);
        if (this.player != null) {
            this.player.createMessage(this).setType(2).setPayload(new MessageData(i, null, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void moveMediaSource(int i, int i2) {
        moveMediaSource(i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void moveMediaSource(int r3, int r4, java.lang.Runnable r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != r4) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourcesPublic     // Catch:{ all -> 0x0037 }
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r2.mediaSourcesPublic     // Catch:{ all -> 0x0037 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0037 }
            r0.add(r4, r1)     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.PlayerMessage r0 = r0.createMessage(r2)     // Catch:{ all -> 0x0037 }
            r1 = 3
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData     // Catch:{ all -> 0x0037 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0037 }
            r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.PlayerMessage r3 = r0.setPayload(r1)     // Catch:{ all -> 0x0037 }
            r3.send()     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x0030:
            if (r5 == 0) goto L_0x0035
            r5.run()     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ConcatenatingMediaSource.moveMediaSource(int, int, java.lang.Runnable):void");
    }

    public final synchronized void clear() {
        clear(null);
    }

    public final synchronized void clear(Runnable runnable) {
        this.mediaSourcesPublic.clear();
        if (this.player != null) {
            this.player.createMessage(this).setType(4).setPayload(runnable != null ? new EventDispatcher(runnable) : null).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    public final synchronized MediaSource getMediaSource(int i) {
        return ((MediaSourceHolder) this.mediaSourcesPublic.get(i)).mediaSource;
    }

    public final synchronized void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        super.prepareSourceInternal(exoPlayer, z);
        this.player = exoPlayer;
        if (this.mediaSourcesPublic.isEmpty()) {
            notifyListener();
        } else {
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
            addMediaSourcesInternal(0, this.mediaSourcesPublic);
            scheduleListenerNotification(null);
        }
    }

    public final MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(findMediaSourceHolderByPeriodIndex(mediaPeriodId.periodIndex));
        DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSourceHolder.mediaSource, mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex - mediaSourceHolder.firstPeriodIndexInChild), allocator);
        this.mediaSourceByMediaPeriod.put(deferredMediaPeriod, mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriods.add(deferredMediaPeriod);
        if (mediaSourceHolder.isPrepared) {
            deferredMediaPeriod.createPeriod();
        }
        return deferredMediaPeriod;
    }

    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        ((DeferredMediaPeriod) mediaPeriod).releasePeriod();
        mediaSourceHolder.activeMediaPeriods.remove(mediaPeriod);
        if (mediaSourceHolder.activeMediaPeriods.isEmpty() && mediaSourceHolder.isRemoved) {
            releaseChildSource(mediaSourceHolder);
        }
    }

    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.player = null;
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        this.windowCount = 0;
        this.periodCount = 0;
    }

    /* access modifiers changed from: protected */
    public final void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline, Object obj) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* access modifiers changed from: protected */
    public MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
            if (((DeferredMediaPeriod) mediaSourceHolder.activeMediaPeriods.get(i)).f8644id.windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex + mediaSourceHolder.firstPeriodIndexInChild);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    public final void handleMessage(int i, Object obj) throws ExoPlaybackException {
        switch (i) {
            case 0:
                MessageData messageData = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, 1);
                addMediaSourceInternal(messageData.index, (MediaSourceHolder) messageData.customData);
                scheduleListenerNotification(messageData.actionOnCompletion);
                return;
            case 1:
                MessageData messageData2 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData2.index, ((Collection) messageData2.customData).size());
                addMediaSourcesInternal(messageData2.index, (Collection) messageData2.customData);
                scheduleListenerNotification(messageData2.actionOnCompletion);
                return;
            case 2:
                MessageData messageData3 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(messageData3.index);
                removeMediaSourceInternal(messageData3.index);
                scheduleListenerNotification(messageData3.actionOnCompletion);
                return;
            case 3:
                MessageData messageData4 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(messageData4.index);
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(((Integer) messageData4.customData).intValue(), 1);
                moveMediaSourceInternal(messageData4.index, ((Integer) messageData4.customData).intValue());
                scheduleListenerNotification(messageData4.actionOnCompletion);
                return;
            case 4:
                clearInternal();
                scheduleListenerNotification((EventDispatcher) obj);
                return;
            case 5:
                notifyListener();
                return;
            case 6:
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ((EventDispatcher) list.get(i2)).dispatchEvent();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void scheduleListenerNotification(EventDispatcher eventDispatcher) {
        if (!this.listenerNotificationScheduled) {
            this.player.createMessage(this).setType(5).send();
            this.listenerNotificationScheduled = true;
        }
        if (eventDispatcher != null) {
            this.pendingOnCompletionActions.add(eventDispatcher);
        }
    }

    private void notifyListener() {
        this.listenerNotificationScheduled = false;
        List emptyList = this.pendingOnCompletionActions.isEmpty() ? Collections.emptyList() : new ArrayList(this.pendingOnCompletionActions);
        this.pendingOnCompletionActions.clear();
        ConcatenatedTimeline concatenatedTimeline = new ConcatenatedTimeline(this.mediaSourceHolders, this.windowCount, this.periodCount, this.shuffleOrder, this.isAtomic);
        refreshSourceInfo(concatenatedTimeline, null);
        if (!emptyList.isEmpty()) {
            this.player.createMessage(this).setType(6).setPayload(emptyList).send();
        }
    }

    private void addMediaSourceInternal(int i, MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.timeline.getWindowCount(), mediaSourceHolder2.firstPeriodIndexInChild + mediaSourceHolder2.timeline.getPeriodCount());
        } else {
            mediaSourceHolder.reset(i, 0, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.timeline.getWindowCount(), mediaSourceHolder.timeline.getPeriodCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
    }

    private void addMediaSourcesInternal(int i, Collection<MediaSourceHolder> collection) {
        for (MediaSourceHolder addMediaSourceInternal : collection) {
            int i2 = i + 1;
            addMediaSourceInternal(i, addMediaSourceInternal);
            i = i2;
        }
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder == null) {
            throw new IllegalArgumentException();
        }
        DeferredTimeline deferredTimeline = mediaSourceHolder.timeline;
        if (deferredTimeline.getTimeline() != timeline) {
            int windowCount2 = timeline.getWindowCount() - deferredTimeline.getWindowCount();
            int periodCount2 = timeline.getPeriodCount() - deferredTimeline.getPeriodCount();
            if (!(windowCount2 == 0 && periodCount2 == 0)) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount2, periodCount2);
            }
            mediaSourceHolder.timeline = deferredTimeline.cloneWithNewTimeline(timeline);
            if (!mediaSourceHolder.isPrepared && !timeline.isEmpty()) {
                timeline.getWindow(0, this.window);
                long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs() + this.window.getDefaultPositionUs();
                for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
                    DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) mediaSourceHolder.activeMediaPeriods.get(i);
                    deferredMediaPeriod.setDefaultPreparePositionUs(positionInFirstPeriodUs);
                    deferredMediaPeriod.createPeriod();
                }
                mediaSourceHolder.isPrepared = true;
            }
            scheduleListenerNotification(null);
        }
    }

    private void clearInternal() {
        for (int size = this.mediaSourceHolders.size() - 1; size >= 0; size--) {
            removeMediaSourceInternal(size);
        }
    }

    private void removeMediaSourceInternal(int i) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.remove(i);
        DeferredTimeline deferredTimeline = mediaSourceHolder.timeline;
        correctOffsets(i, -1, -deferredTimeline.getWindowCount(), -deferredTimeline.getPeriodCount());
        mediaSourceHolder.isRemoved = true;
        if (mediaSourceHolder.activeMediaPeriods.isEmpty()) {
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = ((MediaSourceHolder) this.mediaSourceHolders.get(min)).firstWindowIndexInChild;
        int i4 = ((MediaSourceHolder) this.mediaSourceHolders.get(min)).firstPeriodIndexInChild;
        this.mediaSourceHolders.add(i2, this.mediaSourceHolders.remove(i));
        while (min <= max) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(min);
            mediaSourceHolder.firstWindowIndexInChild = i3;
            mediaSourceHolder.firstPeriodIndexInChild = i4;
            i3 += mediaSourceHolder.timeline.getWindowCount();
            i4 += mediaSourceHolder.timeline.getPeriodCount();
            min++;
        }
    }

    private void correctOffsets(int i, int i2, int i3, int i4) {
        this.windowCount += i3;
        this.periodCount += i4;
        while (i < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(i);
            mediaSourceHolder.childIndex += i2;
            MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) this.mediaSourceHolders.get(i);
            mediaSourceHolder2.firstWindowIndexInChild += i3;
            MediaSourceHolder mediaSourceHolder3 = (MediaSourceHolder) this.mediaSourceHolders.get(i);
            mediaSourceHolder3.firstPeriodIndexInChild += i4;
            i++;
        }
    }

    private int findMediaSourceHolderByPeriodIndex(int i) {
        this.query.firstPeriodIndexInChild = i;
        int binarySearch = Collections.binarySearch(this.mediaSourceHolders, this.query);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.mediaSourceHolders.size() - 1) {
            int i2 = binarySearch + 1;
            if (((MediaSourceHolder) this.mediaSourceHolders.get(i2)).firstPeriodIndexInChild != i) {
                break;
            }
            binarySearch = i2;
        }
        return binarySearch;
    }
}
