package com.facebook.ads.internal.p115w.p117b;

import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;

/* renamed from: com.facebook.ads.internal.w.b.t */
public class C2333t implements OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    private final View f7330a;

    /* renamed from: b */
    private int f7331b;

    /* renamed from: c */
    private Window f7332c;

    /* renamed from: d */
    private C2336a f7333d = C2336a.DEFAULT;

    /* renamed from: e */
    private final Runnable f7334e = new Runnable() {
        public void run() {
            C2333t.this.m9062a(false);
        }
    };

    /* renamed from: com.facebook.ads.internal.w.b.t$2 */
    static /* synthetic */ class C23352 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7336a = new int[C2336a.values().length];

        static {
            try {
                f7336a[C2336a.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.w.b.t$a */
    public enum C2336a {
        DEFAULT,
        FULL_SCREEN
    }

    public C2333t(View view) {
        this.f7330a = view;
        this.f7330a.setOnSystemUiVisibilityChangeListener(this);
    }

    /* renamed from: a */
    private void m9060a(int i, boolean z) {
        int i2;
        if (this.f7332c != null) {
            LayoutParams attributes = this.f7332c.getAttributes();
            if (z) {
                i2 = i | attributes.flags;
            } else {
                i2 = (i ^ -1) & attributes.flags;
            }
            attributes.flags = i2;
            this.f7332c.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9062a(boolean z) {
        if (!C2336a.DEFAULT.equals(this.f7333d)) {
            int i = 3840;
            if (!z) {
                i = 3847;
            }
            Handler handler = this.f7330a.getHandler();
            if (handler != null && z) {
                handler.removeCallbacks(this.f7334e);
                handler.postDelayed(this.f7334e, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
            this.f7330a.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo8731a() {
        this.f7332c = null;
    }

    /* renamed from: a */
    public void mo8732a(Window window) {
        this.f7332c = window;
    }

    /* renamed from: a */
    public void mo8733a(C2336a aVar) {
        this.f7333d = aVar;
        if (C23352.f7336a[this.f7333d.ordinal()] != 1) {
            m9060a(67108864, false);
            m9060a(134217728, false);
            this.f7330a.setSystemUiVisibility(0);
            return;
        }
        m9060a(67108864, true);
        m9060a(134217728, true);
        m9062a(false);
    }

    public void onSystemUiVisibilityChange(int i) {
        int i2 = this.f7331b ^ i;
        this.f7331b = i;
        if ((i2 & 2) != 0 && (i & 2) == 0) {
            m9062a(true);
        }
    }
}
