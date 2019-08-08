package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;

/* renamed from: com.facebook.ads.internal.view.i.c.h */
public class C2197h extends C2118c implements OnTouchListener {

    /* renamed from: a */
    private final C2146n f6914a;

    /* renamed from: b */
    private final C2142j f6915b;

    /* renamed from: c */
    private final C2144l f6916c;

    /* renamed from: d */
    private final C2136d f6917d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2219m f6918e;

    public C2197h(Context context) {
        this(context, null);
    }

    public C2197h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2197h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6914a = new C2146n() {
            /* renamed from: a */
            public void mo6895a(C2145m mVar) {
                C2197h.this.setVisibility(0);
            }
        };
        this.f6915b = new C2142j() {
            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2197h.this.f6918e.setChecked(true);
            }
        };
        this.f6916c = new C2144l() {
            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                C2197h.this.f6918e.setChecked(false);
            }
        };
        this.f6917d = new C2136d() {
            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                C2197h.this.f6918e.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6918e = new C2219m(context);
        this.f6918e.setChecked(true);
        LayoutParams layoutParams = new LayoutParams((int) (displayMetrics.density * 25.0f), (int) (25.0f * displayMetrics.density));
        setVisibility(8);
        addView(this.f6918e, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        this.f6918e.setOnTouchListener(this);
        setOnTouchListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7626a((T[]) new C1779f[]{this.f6914a, this.f6917d, this.f6915b, this.f6916c});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7628b((T[]) new C1779f[]{this.f6916c, this.f6915b, this.f6917d, this.f6914a});
        }
        setOnTouchListener(null);
        this.f6918e.setOnTouchListener(null);
        super.mo8426b();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        C2110a videoView = getVideoView();
        if (videoView == null) {
            return false;
        }
        if (videoView.getState() == C2240d.PREPARED || videoView.getState() == C2240d.PAUSED || videoView.getState() == C2240d.PLAYBACK_COMPLETED) {
            videoView.mo8380a(C2116a.USER_STARTED);
            return true;
        }
        if (videoView.getState() == C2240d.STARTED) {
            videoView.mo8383a(true);
        }
        return false;
    }
}
