package com.google.android.exoplayer2.p133ui;

import android.content.Context;
import android.util.AttributeSet;

@Deprecated
/* renamed from: com.google.android.exoplayer2.ui.PlaybackControlView */
public class PlaybackControlView extends PlayerControlView {
    @Deprecated
    public static final ControlDispatcher DEFAULT_CONTROL_DISPATCHER = new DefaultControlDispatcher();
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_REWIND_MS = 5000;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.ui.PlaybackControlView$ControlDispatcher */
    public interface ControlDispatcher extends com.google.android.exoplayer2.ControlDispatcher {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlaybackControlView$DefaultControlDispatcher */
    private static final class DefaultControlDispatcher extends com.google.android.exoplayer2.DefaultControlDispatcher implements ControlDispatcher {
        private DefaultControlDispatcher() {
        }
    }

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.ui.PlaybackControlView$VisibilityListener */
    public interface VisibilityListener extends com.google.android.exoplayer2.p133ui.PlayerControlView.VisibilityListener {
    }

    public PlaybackControlView(Context context) {
        super(context);
    }

    public PlaybackControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlaybackControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PlaybackControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i, attributeSet2);
    }
}
