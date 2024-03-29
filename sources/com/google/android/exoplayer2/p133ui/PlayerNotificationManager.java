package com.google.android.exoplayer2.p133ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.app.C0301u.C0302a;
import android.support.p017v4.app.C0301u.C0305c;
import android.support.p017v4.app.C0301u.C0306d;
import android.support.p017v4.app.C0309x;
import android.support.p017v4.media.p024a.C0473a.C0474a;
import android.support.p017v4.media.session.MediaSessionCompat.Token;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.DefaultEventListener;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager */
public class PlayerNotificationManager {
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REWIND_MS = 5000;
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    private int badgeIconType;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    /* access modifiers changed from: private */
    public ControlDispatcher controlDispatcher;
    /* access modifiers changed from: private */
    public int currentNotificationTag;
    /* access modifiers changed from: private */
    public final CustomActionReceiver customActionReceiver;
    /* access modifiers changed from: private */
    public final Map<String, C0302a> customActions;
    private int defaults;
    /* access modifiers changed from: private */
    public long fastForwardMs;
    private final IntentFilter intentFilter;
    /* access modifiers changed from: private */
    public boolean isNotificationStarted;
    /* access modifiers changed from: private */
    public int lastPlaybackState;
    /* access modifiers changed from: private */
    public final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private NotificationListener notificationListener;
    private final C0309x notificationManager;
    private boolean ongoing;
    private final Map<String, C0302a> playbackActions;
    /* access modifiers changed from: private */
    public Player player;
    private final EventListener playerListener;
    private int priority;
    /* access modifiers changed from: private */
    public long rewindMs;
    private int smallIconResourceId;
    private String stopAction;
    private PendingIntent stopPendingIntent;
    private boolean useChronometer;
    private boolean useNavigationActions;
    private boolean usePlayPauseActions;
    private int visibility;
    /* access modifiers changed from: private */
    public boolean wasPlayWhenReady;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$BitmapCallback */
    public final class BitmapCallback {
        /* access modifiers changed from: private */
        public final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(final Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.mainHandler.post(new Runnable() {
                    public void run() {
                        if (PlayerNotificationManager.this.player != null && BitmapCallback.this.notificationTag == PlayerNotificationManager.this.currentNotificationTag && PlayerNotificationManager.this.isNotificationStarted) {
                            PlayerNotificationManager.this.updateNotification(bitmap);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver */
    public interface CustomActionReceiver {
        Map<String, C0302a> createCustomActions(Context context);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter */
    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        String getCurrentContentText(Player player);

        String getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver */
    private class NotificationBroadcastReceiver extends BroadcastReceiver {
        private final Window window = new Window();

        public NotificationBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            Player access$000 = PlayerNotificationManager.this.player;
            if (access$000 != null && PlayerNotificationManager.this.isNotificationStarted) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action) || PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(access$000, PlayerNotificationManager.ACTION_PLAY.equals(action));
                } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action) || PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(access$000, access$000.getCurrentWindowIndex(), access$000.getCurrentPosition() + (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action) ? PlayerNotificationManager.this.fastForwardMs : -PlayerNotificationManager.this.rewindMs));
                } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    int nextWindowIndex = access$000.getNextWindowIndex();
                    if (nextWindowIndex != -1) {
                        PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(access$000, nextWindowIndex, C2793C.TIME_UNSET);
                    }
                } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    access$000.getCurrentTimeline().getWindow(access$000.getCurrentWindowIndex(), this.window);
                    int previousWindowIndex = access$000.getPreviousWindowIndex();
                    if (previousWindowIndex == -1 || (access$000.getCurrentPosition() > PlayerNotificationManager.MAX_POSITION_FOR_SEEK_TO_PREVIOUS && (!this.window.isDynamic || this.window.isSeekable))) {
                        PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(access$000, access$000.getCurrentWindowIndex(), C2793C.TIME_UNSET);
                    } else {
                        PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(access$000, previousWindowIndex, C2793C.TIME_UNSET);
                    }
                } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchStop(access$000, true);
                    PlayerNotificationManager.this.stopNotification();
                } else if (PlayerNotificationManager.this.customActionReceiver != null && PlayerNotificationManager.this.customActions.containsKey(action)) {
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(access$000, action, intent);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener */
    public interface NotificationListener {
        void onNotificationCancelled(int i);

        void onNotificationStarted(int i, Notification notification);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$PlayerListener */
    private class PlayerListener extends DefaultEventListener {
        private PlayerListener() {
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (!((PlayerNotificationManager.this.wasPlayWhenReady == z || i == 1) && PlayerNotificationManager.this.lastPlaybackState == i)) {
                PlayerNotificationManager.this.startOrUpdateNotification();
            }
            PlayerNotificationManager.this.wasPlayWhenReady = z;
            PlayerNotificationManager.this.lastPlaybackState = i;
        }

        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            if (PlayerNotificationManager.this.player != null && PlayerNotificationManager.this.player.getPlaybackState() != 1) {
                PlayerNotificationManager.this.startOrUpdateNotification();
            }
        }

        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            if (PlayerNotificationManager.this.player != null && PlayerNotificationManager.this.player.getPlaybackState() != 1) {
                PlayerNotificationManager.this.startOrUpdateNotification();
            }
        }

        public void onPositionDiscontinuity(int i) {
            PlayerNotificationManager.this.startOrUpdateNotification();
        }

        public void onRepeatModeChanged(int i) {
            if (PlayerNotificationManager.this.player != null && PlayerNotificationManager.this.player.getPlaybackState() != 1) {
                PlayerNotificationManager.this.startOrUpdateNotification();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Priority */
    public @interface Priority {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Visibility */
    public @interface Visibility {
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context2, String str, int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter2) {
        NotificationUtil.createNotificationChannel(context2, str, i, 2);
        return new PlayerNotificationManager(context2, str, i2, mediaDescriptionAdapter2);
    }

    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2) {
        this(context2, str, i, mediaDescriptionAdapter2, null);
    }

    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2, CustomActionReceiver customActionReceiver2) {
        Map<String, C0302a> map;
        this.context = context2.getApplicationContext();
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter2;
        this.customActionReceiver = customActionReceiver2;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.notificationManager = C0309x.m1146a(context2);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.useNavigationActions = true;
        this.usePlayPauseActions = true;
        this.ongoing = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.smallIconResourceId = C2933R.C2934drawable.exo_notification_small_icon;
        this.defaults = 0;
        this.priority = -1;
        this.fastForwardMs = 15000;
        this.rewindMs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.stopAction = ACTION_STOP;
        this.badgeIconType = 1;
        this.visibility = 1;
        this.playbackActions = createPlaybackActions(context2);
        for (String addAction : this.playbackActions.keySet()) {
            this.intentFilter.addAction(addAction);
        }
        if (customActionReceiver2 != null) {
            map = customActionReceiver2.createCustomActions(context2);
        } else {
            map = Collections.emptyMap();
        }
        this.customActions = map;
        for (String addAction2 : this.customActions.keySet()) {
            this.intentFilter.addAction(addAction2);
        }
        this.stopPendingIntent = ((C0302a) Assertions.checkNotNull(this.playbackActions.get(ACTION_STOP))).f686e;
    }

    public final void setPlayer(Player player2) {
        if (this.player != player2) {
            if (this.player != null) {
                this.player.removeListener(this.playerListener);
                if (player2 == null) {
                    stopNotification();
                }
            }
            this.player = player2;
            if (player2 != null) {
                this.wasPlayWhenReady = player2.getPlayWhenReady();
                this.lastPlaybackState = player2.getPlaybackState();
                player2.addListener(this.playerListener);
                if (this.lastPlaybackState != 1) {
                    startOrUpdateNotification();
                }
            }
        }
    }

    public final void setControlDispatcher(ControlDispatcher controlDispatcher2) {
        if (controlDispatcher2 == null) {
            controlDispatcher2 = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher2;
    }

    public final void setNotificationListener(NotificationListener notificationListener2) {
        this.notificationListener = notificationListener2;
    }

    public final void setFastForwardIncrementMs(long j) {
        if (this.fastForwardMs != j) {
            this.fastForwardMs = j;
            maybeUpdateNotification();
        }
    }

    public final void setRewindIncrementMs(long j) {
        if (this.rewindMs != j) {
            this.rewindMs = j;
            maybeUpdateNotification();
        }
    }

    public final void setUseNavigationActions(boolean z) {
        if (this.useNavigationActions != z) {
            this.useNavigationActions = z;
            maybeUpdateNotification();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            maybeUpdateNotification();
        }
    }

    public final void setStopAction(String str) {
        if (!Util.areEqual(str, this.stopAction)) {
            this.stopAction = str;
            if (ACTION_STOP.equals(str)) {
                this.stopPendingIntent = ((C0302a) Assertions.checkNotNull(this.playbackActions.get(ACTION_STOP))).f686e;
            } else if (str != null) {
                this.stopPendingIntent = ((C0302a) Assertions.checkNotNull(this.customActions.get(str))).f686e;
            } else {
                this.stopPendingIntent = null;
            }
            maybeUpdateNotification();
        }
    }

    public final void setMediaSessionToken(Token token) {
        if (!Util.areEqual(this.mediaSessionToken, token)) {
            this.mediaSessionToken = token;
            maybeUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType != i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    this.badgeIconType = i;
                    maybeUpdateNotification();
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            maybeUpdateNotification();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            maybeUpdateNotification();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            maybeUpdateNotification();
        }
    }

    public final void setOngoing(boolean z) {
        if (this.ongoing != z) {
            this.ongoing = z;
            maybeUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority != i) {
            switch (i) {
                case -2:
                case -1:
                case 0:
                case 1:
                case 2:
                    this.priority = i;
                    maybeUpdateNotification();
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            maybeUpdateNotification();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            maybeUpdateNotification();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility != i) {
            switch (i) {
                case -1:
                case 0:
                case 1:
                    this.visibility = i;
                    maybeUpdateNotification();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: private */
    @RequiresNonNull({"player"})
    public Notification updateNotification(Bitmap bitmap) {
        Notification createNotification = createNotification(this.player, bitmap);
        this.notificationManager.mo1095a(this.notificationId, createNotification);
        return createNotification;
    }

    /* access modifiers changed from: private */
    public void startOrUpdateNotification() {
        if (this.player != null) {
            Notification updateNotification = updateNotification(null);
            if (!this.isNotificationStarted) {
                this.isNotificationStarted = true;
                this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
                if (this.notificationListener != null) {
                    this.notificationListener.onNotificationStarted(this.notificationId, updateNotification);
                }
            }
        }
    }

    private void maybeUpdateNotification() {
        if (this.isNotificationStarted && this.player != null) {
            updateNotification(null);
        }
    }

    /* access modifiers changed from: private */
    public void stopNotification() {
        if (this.isNotificationStarted) {
            this.notificationManager.mo1094a(this.notificationId);
            this.isNotificationStarted = false;
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            if (this.notificationListener != null) {
                this.notificationListener.onNotificationCancelled(this.notificationId);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Notification createNotification(Player player2, Bitmap bitmap) {
        C0302a aVar;
        boolean isPlayingAd = player2.isPlayingAd();
        C0305c cVar = new C0305c(this.context, this.channelId);
        List actions = getActions(player2);
        for (int i = 0; i < actions.size(); i++) {
            String str = (String) actions.get(i);
            if (this.playbackActions.containsKey(str)) {
                aVar = (C0302a) this.playbackActions.get(str);
            } else {
                aVar = (C0302a) this.customActions.get(str);
            }
            if (aVar != null) {
                cVar.mo1063a(aVar);
            }
        }
        C0474a aVar2 = new C0474a();
        cVar.mo1064a((C0306d) aVar2);
        if (this.mediaSessionToken != null) {
            aVar2.mo1649a(this.mediaSessionToken);
        }
        aVar2.mo1651a(getActionIndicesForCompactView(player2));
        boolean z = this.stopAction != null && !isPlayingAd;
        aVar2.mo1650a(z);
        if (z && this.stopPendingIntent != null) {
            cVar.mo1070b(this.stopPendingIntent);
            aVar2.mo1648a(this.stopPendingIntent);
        }
        cVar.mo1083f(this.badgeIconType).mo1076c(this.ongoing).mo1078d(this.color).mo1079d(this.colorized).mo1056a(this.smallIconResourceId).mo1081e(this.visibility).mo1074c(this.priority).mo1069b(this.defaults);
        if (!this.useChronometer || player2.isCurrentWindowDynamic() || !player2.getPlayWhenReady() || player2.getPlaybackState() != 3) {
            cVar.mo1067a(false).mo1072b(false);
        } else {
            cVar.mo1059a(System.currentTimeMillis() - player2.getContentPosition()).mo1067a(true).mo1072b(true);
        }
        cVar.mo1065a((CharSequence) this.mediaDescriptionAdapter.getCurrentContentTitle(player2));
        cVar.mo1071b((CharSequence) this.mediaDescriptionAdapter.getCurrentContentText(player2));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter2 = this.mediaDescriptionAdapter;
            int i2 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i2;
            bitmap = mediaDescriptionAdapter2.getCurrentLargeIcon(player2, new BitmapCallback(i2));
        }
        if (bitmap != null) {
            cVar.mo1061a(bitmap);
        }
        PendingIntent createCurrentContentIntent = this.mediaDescriptionAdapter.createCurrentContentIntent(player2);
        if (createCurrentContentIntent != null) {
            cVar.mo1060a(createCurrentContentIntent);
        }
        return cVar.mo1068b();
    }

    /* access modifiers changed from: protected */
    public List<String> getActions(Player player2) {
        ArrayList arrayList = new ArrayList();
        if (!player2.isPlayingAd()) {
            if (this.useNavigationActions) {
                arrayList.add(ACTION_PREVIOUS);
            }
            if (this.rewindMs > 0) {
                arrayList.add(ACTION_REWIND);
            }
            if (this.usePlayPauseActions) {
                if (player2.getPlayWhenReady()) {
                    arrayList.add(ACTION_PAUSE);
                } else {
                    arrayList.add(ACTION_PLAY);
                }
            }
            if (this.fastForwardMs > 0) {
                arrayList.add(ACTION_FAST_FORWARD);
            }
            if (this.useNavigationActions && player2.getNextWindowIndex() != -1) {
                arrayList.add(ACTION_NEXT);
            }
            if (this.customActionReceiver != null) {
                arrayList.addAll(this.customActionReceiver.getCustomActions(player2));
            }
            if (ACTION_STOP.equals(this.stopAction)) {
                arrayList.add(this.stopAction);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int[] getActionIndicesForCompactView(Player player2) {
        if (!this.usePlayPauseActions) {
            return new int[0];
        }
        return new int[]{(this.useNavigationActions ? 1 : 0) + ((this.fastForwardMs > 0 ? 1 : (this.fastForwardMs == 0 ? 0 : -1)) > 0 ? 1 : 0)};
    }

    private static Map<String, C0302a> createPlaybackActions(Context context2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new C0302a(C2933R.C2934drawable.exo_notification_play, context2.getString(C2933R.string.exo_controls_play_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_PLAY).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_PAUSE, new C0302a(C2933R.C2934drawable.exo_notification_pause, context2.getString(C2933R.string.exo_controls_pause_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_PAUSE).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_STOP, new C0302a(C2933R.C2934drawable.exo_notification_stop, context2.getString(C2933R.string.exo_controls_stop_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_STOP).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_REWIND, new C0302a(C2933R.C2934drawable.exo_notification_rewind, context2.getString(C2933R.string.exo_controls_rewind_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_REWIND).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_FAST_FORWARD, new C0302a(C2933R.C2934drawable.exo_notification_fastforward, context2.getString(C2933R.string.exo_controls_fastforward_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_FAST_FORWARD).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_PREVIOUS, new C0302a(C2933R.C2934drawable.exo_notification_previous, context2.getString(C2933R.string.exo_controls_previous_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_PREVIOUS).setPackage(context2.getPackageName()), 268435456)));
        hashMap.put(ACTION_NEXT, new C0302a(C2933R.C2934drawable.exo_notification_next, context2.getString(C2933R.string.exo_controls_next_description), PendingIntent.getBroadcast(context2, 0, new Intent(ACTION_NEXT).setPackage(context2.getPackageName()), 268435456)));
        return hashMap;
    }
}
