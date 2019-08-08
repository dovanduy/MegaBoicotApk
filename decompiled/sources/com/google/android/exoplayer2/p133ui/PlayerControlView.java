package com.google.android.exoplayer2.p133ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.DefaultEventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.p133ui.TimeBar.OnScrubListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_REWIND_MS = 5000;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final ComponentListener componentListener;
    /* access modifiers changed from: private */
    public ControlDispatcher controlDispatcher;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    /* access modifiers changed from: private */
    public final View fastForwardButton;
    private int fastForwardMs;
    /* access modifiers changed from: private */
    public final StringBuilder formatBuilder;
    /* access modifiers changed from: private */
    public final Formatter formatter;
    /* access modifiers changed from: private */
    public final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    /* access modifiers changed from: private */
    public final View nextButton;
    /* access modifiers changed from: private */
    public final View pauseButton;
    private final Period period;
    /* access modifiers changed from: private */
    public final View playButton;
    /* access modifiers changed from: private */
    public PlaybackPreparer playbackPreparer;
    private boolean[] playedAdGroups;
    /* access modifiers changed from: private */
    public Player player;
    /* access modifiers changed from: private */
    public final TextView positionView;
    /* access modifiers changed from: private */
    public final View previousButton;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    /* access modifiers changed from: private */
    public final ImageView repeatToggleButton;
    /* access modifiers changed from: private */
    public int repeatToggleModes;
    /* access modifiers changed from: private */
    public final View rewindButton;
    private int rewindMs;
    /* access modifiers changed from: private */
    public boolean scrubbing;
    private boolean showMultiWindowTimeBar;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    /* access modifiers changed from: private */
    public final View shuffleButton;
    private final TimeBar timeBar;
    private final Runnable updateProgressAction;
    private VisibilityListener visibilityListener;
    private final Window window;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener */
    private final class ComponentListener extends DefaultEventListener implements OnClickListener, OnScrubListener {
        private ComponentListener() {
        }

        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView.this.removeCallbacks(PlayerControlView.this.hideAction);
            PlayerControlView.this.scrubbing = true;
        }

        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (!z && PlayerControlView.this.player != null) {
                PlayerControlView.this.seekToTimeBarPosition(j);
            }
            PlayerControlView.this.hideAfterTimeout();
        }

        public void onPlayerStateChanged(boolean z, int i) {
            PlayerControlView.this.updatePlayPauseButton();
            PlayerControlView.this.updateProgress();
        }

        public void onRepeatModeChanged(int i) {
            PlayerControlView.this.updateRepeatModeButton();
            PlayerControlView.this.updateNavigation();
        }

        public void onShuffleModeEnabledChanged(boolean z) {
            PlayerControlView.this.updateShuffleButton();
            PlayerControlView.this.updateNavigation();
        }

        public void onPositionDiscontinuity(int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateProgress();
        }

        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateTimeBarMode();
            PlayerControlView.this.updateProgress();
        }

        public void onClick(View view) {
            if (PlayerControlView.this.player != null) {
                if (PlayerControlView.this.nextButton == view) {
                    PlayerControlView.this.next();
                } else if (PlayerControlView.this.previousButton == view) {
                    PlayerControlView.this.previous();
                } else if (PlayerControlView.this.fastForwardButton == view) {
                    PlayerControlView.this.fastForward();
                } else if (PlayerControlView.this.rewindButton == view) {
                    PlayerControlView.this.rewind();
                } else if (PlayerControlView.this.playButton == view) {
                    if (PlayerControlView.this.player.getPlaybackState() == 1) {
                        if (PlayerControlView.this.playbackPreparer != null) {
                            PlayerControlView.this.playbackPreparer.preparePlayback();
                        }
                    } else if (PlayerControlView.this.player.getPlaybackState() == 4) {
                        PlayerControlView.this.controlDispatcher.dispatchSeekTo(PlayerControlView.this.player, PlayerControlView.this.player.getCurrentWindowIndex(), C2793C.TIME_UNSET);
                    }
                    PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(PlayerControlView.this.player, true);
                } else if (PlayerControlView.this.pauseButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(PlayerControlView.this.player, false);
                } else if (PlayerControlView.this.repeatToggleButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetRepeatMode(PlayerControlView.this.player, RepeatModeUtil.getNextRepeatMode(PlayerControlView.this.player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                } else if (PlayerControlView.this.shuffleButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetShuffleModeEnabled(PlayerControlView.this.player, true ^ PlayerControlView.this.player.getShuffleModeEnabled());
                }
            }
            PlayerControlView.this.hideAfterTimeout();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        this.updateProgressAction = new Runnable() {
            public void run() {
                PlayerControlView.this.updateProgress();
            }
        };
        this.hideAction = new Runnable() {
            public void run() {
                PlayerControlView.this.hide();
            }
        };
        int i2 = C2933R.layout.exo_player_control_view;
        this.rewindMs = 5000;
        this.fastForwardMs = 15000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.hideAtMs = C2793C.TIME_UNSET;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C2933R.styleable.PlayerControlView, 0, 0);
            try {
                this.rewindMs = obtainStyledAttributes.getInt(C2933R.styleable.PlayerControlView_rewind_increment, this.rewindMs);
                this.fastForwardMs = obtainStyledAttributes.getInt(C2933R.styleable.PlayerControlView_fastforward_increment, this.fastForwardMs);
                this.showTimeoutMs = obtainStyledAttributes.getInt(C2933R.styleable.PlayerControlView_show_timeout, this.showTimeoutMs);
                i2 = obtainStyledAttributes.getResourceId(C2933R.styleable.PlayerControlView_controller_layout_id, i2);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(C2933R.styleable.PlayerControlView_show_shuffle_button, this.showShuffleButton);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.period = new Period();
        this.window = new Window();
        this.formatBuilder = new StringBuilder();
        this.formatter = new Formatter(this.formatBuilder, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        this.componentListener = new ComponentListener();
        this.controlDispatcher = new DefaultControlDispatcher();
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        this.durationView = (TextView) findViewById(C2933R.C2935id.exo_duration);
        this.positionView = (TextView) findViewById(C2933R.C2935id.exo_position);
        this.timeBar = (TimeBar) findViewById(C2933R.C2935id.exo_progress);
        if (this.timeBar != null) {
            this.timeBar.addListener(this.componentListener);
        }
        this.playButton = findViewById(C2933R.C2935id.exo_play);
        if (this.playButton != null) {
            this.playButton.setOnClickListener(this.componentListener);
        }
        this.pauseButton = findViewById(C2933R.C2935id.exo_pause);
        if (this.pauseButton != null) {
            this.pauseButton.setOnClickListener(this.componentListener);
        }
        this.previousButton = findViewById(C2933R.C2935id.exo_prev);
        if (this.previousButton != null) {
            this.previousButton.setOnClickListener(this.componentListener);
        }
        this.nextButton = findViewById(C2933R.C2935id.exo_next);
        if (this.nextButton != null) {
            this.nextButton.setOnClickListener(this.componentListener);
        }
        this.rewindButton = findViewById(C2933R.C2935id.exo_rew);
        if (this.rewindButton != null) {
            this.rewindButton.setOnClickListener(this.componentListener);
        }
        this.fastForwardButton = findViewById(C2933R.C2935id.exo_ffwd);
        if (this.fastForwardButton != null) {
            this.fastForwardButton.setOnClickListener(this.componentListener);
        }
        this.repeatToggleButton = (ImageView) findViewById(C2933R.C2935id.exo_repeat_toggle);
        if (this.repeatToggleButton != null) {
            this.repeatToggleButton.setOnClickListener(this.componentListener);
        }
        this.shuffleButton = findViewById(C2933R.C2935id.exo_shuffle);
        if (this.shuffleButton != null) {
            this.shuffleButton.setOnClickListener(this.componentListener);
        }
        Resources resources = context.getResources();
        this.repeatOffButtonDrawable = resources.getDrawable(C2933R.C2934drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(C2933R.C2934drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(C2933R.C2934drawable.exo_controls_repeat_all);
        this.repeatOffButtonContentDescription = resources.getString(C2933R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(C2933R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(C2933R.string.exo_controls_repeat_all_description);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C2933R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player2) {
        if (this.player != player2) {
            if (this.player != null) {
                this.player.removeListener(this.componentListener);
            }
            this.player = player2;
            if (player2 != null) {
                player2.addListener(this.componentListener);
            }
            updateAll();
        }
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeBarMode();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            if (jArr.length == zArr.length) {
                z = true;
            }
            Assertions.checkArgument(z);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateProgress();
    }

    public void setVisibilityListener(VisibilityListener visibilityListener2) {
        this.visibilityListener = visibilityListener2;
    }

    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer2) {
        this.playbackPreparer = playbackPreparer2;
    }

    public void setControlDispatcher(ControlDispatcher controlDispatcher2) {
        if (controlDispatcher2 == null) {
            controlDispatcher2 = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher2;
    }

    public void setRewindIncrementMs(int i) {
        this.rewindMs = i;
        updateNavigation();
    }

    public void setFastForwardIncrementMs(int i) {
        this.fastForwardMs = i;
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        if (this.player != null) {
            int repeatMode = this.player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 2);
            }
        }
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            if (this.visibilityListener != null) {
                this.visibilityListener.onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
        }
        hideAfterTimeout();
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            if (this.visibilityListener != null) {
                this.visibilityListener.onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C2793C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    /* access modifiers changed from: private */
    public void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            this.hideAtMs = SystemClock.uptimeMillis() + ((long) this.showTimeoutMs);
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, (long) this.showTimeoutMs);
                return;
            }
            return;
        }
        this.hideAtMs = C2793C.TIME_UNSET;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateProgress();
    }

    /* access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow) {
            boolean isPlaying = isPlaying();
            int i = 8;
            boolean z2 = true;
            if (this.playButton != null) {
                z = (isPlaying && this.playButton.isFocused()) | false;
                this.playButton.setVisibility(isPlaying ? 8 : 0);
            } else {
                z = false;
            }
            if (this.pauseButton != null) {
                if (isPlaying || !this.pauseButton.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view = this.pauseButton;
                if (isPlaying) {
                    i = 0;
                }
                view.setVisibility(i);
            }
            if (z) {
                requestPlayPauseFocus();
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        if (isVisible() && this.isAttachedToWindow) {
            Timeline currentTimeline = this.player != null ? this.player.getCurrentTimeline() : null;
            boolean z4 = true;
            if (!(currentTimeline != null && !currentTimeline.isEmpty()) || this.player.isPlayingAd()) {
                z3 = false;
                z2 = false;
                z = false;
            } else {
                currentTimeline.getWindow(this.player.getCurrentWindowIndex(), this.window);
                z3 = this.window.isSeekable;
                z = z3 || !this.window.isDynamic || this.player.getPreviousWindowIndex() != -1;
                z2 = this.window.isDynamic || this.player.getNextWindowIndex() != -1;
            }
            setButtonEnabled(z, this.previousButton);
            setButtonEnabled(z2, this.nextButton);
            setButtonEnabled(this.fastForwardMs > 0 && z3, this.fastForwardButton);
            if (this.rewindMs <= 0 || !z3) {
                z4 = false;
            }
            setButtonEnabled(z4, this.rewindButton);
            if (this.timeBar != null) {
                this.timeBar.setEnabled(z3);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateRepeatModeButton() {
        if (isVisible() && this.isAttachedToWindow && this.repeatToggleButton != null) {
            if (this.repeatToggleModes == 0) {
                this.repeatToggleButton.setVisibility(8);
            } else if (this.player == null) {
                setButtonEnabled(false, this.repeatToggleButton);
            } else {
                setButtonEnabled(true, this.repeatToggleButton);
                switch (this.player.getRepeatMode()) {
                    case 0:
                        this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                        this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                        break;
                    case 1:
                        this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                        this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
                        break;
                    case 2:
                        this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                        this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
                        break;
                }
                this.repeatToggleButton.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateShuffleButton() {
        if (isVisible() && this.isAttachedToWindow && this.shuffleButton != null) {
            if (!this.showShuffleButton) {
                this.shuffleButton.setVisibility(8);
            } else if (this.player == null) {
                setButtonEnabled(false, this.shuffleButton);
            } else {
                this.shuffleButton.setAlpha(this.player.getShuffleModeEnabled() ? 1.0f : 0.3f);
                this.shuffleButton.setEnabled(true);
                this.shuffleButton.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateTimeBarMode() {
        if (this.player != null) {
            this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(this.player.getCurrentTimeline(), this.window);
        }
    }

    /* access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int i3;
        long j5;
        int i4;
        long j6;
        if (isVisible() && this.isAttachedToWindow) {
            boolean z = true;
            if (this.player != null) {
                Timeline currentTimeline = this.player.getCurrentTimeline();
                if (!currentTimeline.isEmpty()) {
                    int currentWindowIndex = this.player.getCurrentWindowIndex();
                    int i5 = this.multiWindowTimeBar ? 0 : currentWindowIndex;
                    int windowCount = this.multiWindowTimeBar ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
                    j5 = 0;
                    i3 = 0;
                    j4 = 0;
                    while (true) {
                        if (i5 > windowCount) {
                            break;
                        }
                        if (i5 == currentWindowIndex) {
                            j4 = j5;
                        }
                        currentTimeline.getWindow(i5, this.window);
                        if (this.window.durationUs == C2793C.TIME_UNSET) {
                            Assertions.checkState(this.multiWindowTimeBar ^ z);
                            break;
                        }
                        int i6 = this.window.firstPeriodIndex;
                        while (i6 <= this.window.lastPeriodIndex) {
                            currentTimeline.getPeriod(i6, this.period);
                            int adGroupCount = this.period.getAdGroupCount();
                            int i7 = i3;
                            int i8 = 0;
                            while (i8 < adGroupCount) {
                                long adGroupTimeUs = this.period.getAdGroupTimeUs(i8);
                                if (adGroupTimeUs == Long.MIN_VALUE) {
                                    if (this.period.durationUs != C2793C.TIME_UNSET) {
                                        j6 = this.period.durationUs;
                                    }
                                    i4 = currentWindowIndex;
                                    i8++;
                                    currentWindowIndex = i4;
                                } else {
                                    j6 = adGroupTimeUs;
                                }
                                long positionInWindowUs = j6 + this.period.getPositionInWindowUs();
                                if (positionInWindowUs >= 0 && positionInWindowUs <= this.window.durationUs) {
                                    if (i7 == this.adGroupTimesMs.length) {
                                        int length = this.adGroupTimesMs.length == 0 ? 1 : this.adGroupTimesMs.length * 2;
                                        this.adGroupTimesMs = Arrays.copyOf(this.adGroupTimesMs, length);
                                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                    }
                                    i4 = currentWindowIndex;
                                    this.adGroupTimesMs[i7] = C2793C.usToMs(j5 + positionInWindowUs);
                                    this.playedAdGroups[i7] = this.period.hasPlayedAdGroup(i8);
                                    i7++;
                                    i8++;
                                    currentWindowIndex = i4;
                                }
                                i4 = currentWindowIndex;
                                i8++;
                                currentWindowIndex = i4;
                            }
                            int i9 = currentWindowIndex;
                            i6++;
                            i3 = i7;
                        }
                        i5++;
                        j5 += this.window.durationUs;
                        currentWindowIndex = currentWindowIndex;
                        z = true;
                    }
                } else {
                    j5 = 0;
                    i3 = 0;
                    j4 = 0;
                }
                j3 = C2793C.usToMs(j5);
                long usToMs = C2793C.usToMs(j4);
                if (this.player.isPlayingAd()) {
                    j2 = usToMs + this.player.getContentPosition();
                    j = j2;
                } else {
                    j2 = usToMs + this.player.getCurrentPosition();
                    j = usToMs + this.player.getBufferedPosition();
                }
                if (this.timeBar != null) {
                    int length2 = this.extraAdGroupTimesMs.length;
                    int i10 = i3 + length2;
                    if (i10 > this.adGroupTimesMs.length) {
                        this.adGroupTimesMs = Arrays.copyOf(this.adGroupTimesMs, i10);
                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i10);
                    }
                    System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i3, length2);
                    System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i3, length2);
                    this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i10);
                }
            } else {
                j3 = 0;
                j2 = 0;
                j = 0;
            }
            if (this.durationView != null) {
                this.durationView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j3));
            }
            if (this.positionView != null && !this.scrubbing) {
                this.positionView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j2));
            }
            if (this.timeBar != null) {
                this.timeBar.setPosition(j2);
                this.timeBar.setBufferedPosition(j);
                this.timeBar.setDuration(j3);
            }
            removeCallbacks(this.updateProgressAction);
            if (this.player == null) {
                i2 = 1;
                i = 1;
            } else {
                i = this.player.getPlaybackState();
                i2 = 1;
            }
            if (!(i == i2 || i == 4)) {
                long j7 = 1000;
                if (this.player.getPlayWhenReady() && i == 3) {
                    float f = this.player.getPlaybackParameters().speed;
                    if (f > 0.1f) {
                        if (f <= 5.0f) {
                            long max = (long) (AdError.NETWORK_ERROR_CODE / Math.max(1, Math.round(1.0f / f)));
                            long j8 = max - (j2 % max);
                            if (j8 < max / 5) {
                                j8 += max;
                            }
                            j7 = f == 1.0f ? j8 : (long) (((float) j8) / f);
                        } else {
                            j7 = 200;
                        }
                    }
                }
                postDelayed(this.updateProgressAction, j7);
            }
        }
    }

    private void requestPlayPauseFocus() {
        boolean isPlaying = isPlaying();
        if (!isPlaying && this.playButton != null) {
            this.playButton.requestFocus();
        } else if (isPlaying && this.pauseButton != null) {
            this.pauseButton.requestFocus();
        }
    }

    private void setButtonEnabled(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? 1.0f : 0.3f);
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void previous() {
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (!currentTimeline.isEmpty()) {
            currentTimeline.getWindow(this.player.getCurrentWindowIndex(), this.window);
            int previousWindowIndex = this.player.getPreviousWindowIndex();
            if (previousWindowIndex == -1 || (this.player.getCurrentPosition() > MAX_POSITION_FOR_SEEK_TO_PREVIOUS && (!this.window.isDynamic || this.window.isSeekable))) {
                seekTo(0);
            } else {
                seekTo(previousWindowIndex, C2793C.TIME_UNSET);
            }
        }
    }

    /* access modifiers changed from: private */
    public void next() {
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (!currentTimeline.isEmpty()) {
            int currentWindowIndex = this.player.getCurrentWindowIndex();
            int nextWindowIndex = this.player.getNextWindowIndex();
            if (nextWindowIndex != -1) {
                seekTo(nextWindowIndex, C2793C.TIME_UNSET);
            } else if (currentTimeline.getWindow(currentWindowIndex, this.window, false).isDynamic) {
                seekTo(currentWindowIndex, C2793C.TIME_UNSET);
            }
        }
    }

    /* access modifiers changed from: private */
    public void rewind() {
        if (this.rewindMs > 0) {
            seekTo(Math.max(this.player.getCurrentPosition() - ((long) this.rewindMs), 0));
        }
    }

    /* access modifiers changed from: private */
    public void fastForward() {
        if (this.fastForwardMs > 0) {
            long duration = this.player.getDuration();
            long currentPosition = this.player.getCurrentPosition() + ((long) this.fastForwardMs);
            if (duration != C2793C.TIME_UNSET) {
                currentPosition = Math.min(currentPosition, duration);
            }
            seekTo(currentPosition);
        }
    }

    private void seekTo(long j) {
        seekTo(this.player.getCurrentWindowIndex(), j);
    }

    private void seekTo(int i, long j) {
        if (!this.controlDispatcher.dispatchSeekTo(this.player, i, j)) {
            updateProgress();
        }
    }

    /* access modifiers changed from: private */
    public void seekToTimeBarPosition(long j) {
        int i;
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            i = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(i, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                } else if (i == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    i++;
                    j -= durationMs;
                }
            }
        } else {
            i = this.player.getCurrentWindowIndex();
        }
        seekTo(i, j);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (this.hideAtMs != C2793C.TIME_UNSET) {
            long uptimeMillis = this.hideAtMs - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode != 90) {
                if (keyCode != 89) {
                    if (keyEvent.getRepeatCount() == 0) {
                        switch (keyCode) {
                            case 85:
                                this.controlDispatcher.dispatchSetPlayWhenReady(this.player, !this.player.getPlayWhenReady());
                                break;
                            case 87:
                                next();
                                break;
                            case 88:
                                previous();
                                break;
                            case 126:
                                this.controlDispatcher.dispatchSetPlayWhenReady(this.player, true);
                                break;
                            case 127:
                                this.controlDispatcher.dispatchSetPlayWhenReady(this.player, false);
                                break;
                        }
                    }
                } else {
                    rewind();
                }
            } else {
                fastForward();
            }
        }
        return true;
    }

    private boolean isPlaying() {
        if (this.player == null || this.player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Window window2) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window2).durationUs == C2793C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }
}
