package com.facebook.ads.internal.view.p110i;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p088o.C1778e;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.p110i.C2159c.C2162a;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2149q;
import com.facebook.ads.internal.view.p110i.p112b.C2151s;
import com.facebook.ads.internal.view.p110i.p112b.C2152t;
import com.facebook.ads.internal.view.p110i.p112b.C2153u;
import com.facebook.ads.internal.view.p110i.p112b.C2155w;
import com.facebook.ads.internal.view.p110i.p112b.C2157y;
import com.facebook.ads.internal.view.p110i.p112b.C2158z;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p114d.C2231a;
import com.facebook.ads.internal.view.p110i.p114d.C2235b;
import com.facebook.ads.internal.view.p110i.p114d.C2239c;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import com.facebook.ads.internal.view.p110i.p114d.C2241e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.i.a */
public class C2110a extends RelativeLayout implements C2162a, C2241e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2145m f6737b = new C2145m();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2137e f6738c = new C2137e();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C2151s f6739d = new C2151s();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C2152t f6740e = new C2152t();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C2143k f6741f = new C2143k();

    /* renamed from: g */
    private static final C2155w f6742g = new C2155w();

    /* renamed from: h */
    private static final C2158z f6743h = new C2158z();

    /* renamed from: i */
    private static final C2157y f6744i = new C2157y();

    /* renamed from: a */
    protected final C2239c f6745a;

    /* renamed from: j */
    private C2229d f6746j;

    /* renamed from: k */
    private final List<C2117b> f6747k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Handler f6748l = new Handler();

    /* renamed from: m */
    private final Handler f6749m = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1778e<C1779f, C1777d> f6750n = new C1778e<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f6751o;

    /* renamed from: p */
    private boolean f6752p;

    /* renamed from: q */
    private boolean f6753q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f6754r = 200;

    /* renamed from: s */
    private final OnTouchListener f6755s = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C2110a.this.f6750n.mo7625a(new C2153u(view, motionEvent));
            return false;
        }
    };

    public C2110a(Context context) {
        super(context);
        this.f6745a = C1795a.m7434a(context) ? new C2231a(context) : new C2235b(context);
        mo8650a();
    }

    public C2110a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6745a = C1795a.m7434a(context) ? new C2231a(context, attributeSet) : new C2235b(context, attributeSet);
        mo8650a();
    }

    public C2110a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6745a = C1795a.m7434a(context) ? new C2231a(context, attributeSet, i) : new C2235b(context, attributeSet, i);
        mo8650a();
    }

    @TargetApi(21)
    public C2110a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6745a = C1795a.m7434a(context) ? new C2231a(context, attributeSet, i, i2) : new C2235b(context, attributeSet, i, i2);
        mo8650a();
    }

    /* renamed from: a */
    private void mo8650a() {
        if (mo8403h() && (this.f6745a instanceof C2231a)) {
            ((C2231a) this.f6745a).setTestMode(AdInternalSettings.isTestMode(getContext()));
        }
        this.f6745a.setRequestedVolume(1.0f);
        this.f6745a.setVideoStateChangeListener(this);
        this.f6746j = new C2229d(getContext(), this.f6745a);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f6746j, layoutParams);
        setOnTouchListener(this.f6755s);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo8651b() {
        this.f6748l.postDelayed(new Runnable() {
            public void run() {
                if (!C2110a.this.f6751o) {
                    C2110a.this.f6750n.mo7625a(new C2147o(C2110a.this.getCurrentPositionInMillis()));
                    C2110a.this.f6748l.postDelayed(this, (long) C2110a.this.f6754r);
                }
            }
        }, (long) this.f6754r);
    }

    /* renamed from: a */
    public void mo8378a(int i) {
        this.f6748l.removeCallbacksAndMessages(null);
        this.f6745a.mo8542a(i);
    }

    /* renamed from: a */
    public void mo8379a(final int i, final int i2) {
        this.f6749m.post(new Runnable() {
            public void run() {
                C2110a.this.f6750n.mo7625a(new C2149q(i, i2));
            }
        });
        mo8651b();
    }

    /* renamed from: a */
    public void mo8380a(C2116a aVar) {
        if (this.f6751o && this.f6745a.getState() == C2240d.PLAYBACK_COMPLETED) {
            this.f6751o = false;
        }
        this.f6745a.mo8543a(aVar);
    }

    /* renamed from: a */
    public void mo8381a(C2117b bVar) {
        this.f6747k.add(bVar);
    }

    /* renamed from: a */
    public void mo8382a(final C2240d dVar) {
        final int currentPositionInMillis = getCurrentPositionInMillis();
        final int duration = getDuration();
        this.f6749m.post(new Runnable() {
            public void run() {
                C1778e b;
                C1777d r;
                C1778e b2;
                C1777d cVar;
                if (dVar == C2240d.PREPARED) {
                    b2 = C2110a.this.f6750n;
                    cVar = C2110a.f6737b;
                } else if (dVar == C2240d.ERROR) {
                    C2110a.this.f6751o = true;
                    b2 = C2110a.this.f6750n;
                    cVar = C2110a.f6738c;
                } else if (dVar == C2240d.PLAYBACK_COMPLETED) {
                    C2110a.this.f6751o = true;
                    C2110a.this.f6748l.removeCallbacksAndMessages(null);
                    b2 = C2110a.this.f6750n;
                    cVar = new C2135c(currentPositionInMillis, duration);
                } else if (dVar == C2240d.STARTED) {
                    C2110a.this.f6750n.mo7625a(C2110a.f6741f);
                    C2110a.this.f6748l.removeCallbacksAndMessages(null);
                    C2110a.this.mo8651b();
                    return;
                } else {
                    if (dVar == C2240d.PAUSED) {
                        b = C2110a.this.f6750n;
                        r = new C2141i(currentPositionInMillis);
                    } else if (dVar == C2240d.IDLE) {
                        b = C2110a.this.f6750n;
                        r = C2110a.f6740e;
                    } else {
                        return;
                    }
                    b.mo7625a(r);
                    C2110a.this.f6748l.removeCallbacksAndMessages(null);
                    return;
                }
                b2.mo7625a(cVar);
            }
        });
    }

    /* renamed from: a */
    public void mo8383a(boolean z) {
        if (!mo8408m()) {
            this.f6745a.mo8544a(z);
            this.f6753q = z;
        }
    }

    /* renamed from: c */
    public void mo8384c() {
        for (C2117b bVar : this.f6747k) {
            if (bVar instanceof C2118c) {
                C2118c cVar = (C2118c) bVar;
                if (cVar.getParent() == null) {
                    if (cVar instanceof C2194g) {
                        this.f6746j.mo8536a(cVar);
                    } else {
                        addView(cVar);
                    }
                }
            }
            bVar.mo8356a(this);
        }
    }

    /* renamed from: d */
    public void mo8385d() {
        for (C2117b bVar : this.f6747k) {
            if (bVar instanceof C2118c) {
                C2118c cVar = (C2118c) bVar;
                if (cVar instanceof C2194g) {
                    this.f6746j.mo8537b(cVar);
                } else {
                    C2342x.m9091b(cVar);
                }
            }
            bVar.mo8360b(this);
        }
    }

    /* renamed from: e */
    public void mo8386e() {
        if (!mo8408m()) {
            this.f6745a.mo8541a();
        }
    }

    /* renamed from: f */
    public void mo8387f() {
        this.f6749m.post(new Runnable() {
            public void run() {
                C2110a.this.getEventBus().mo7625a(C2110a.f6739d);
            }
        });
        this.f6745a.mo8545b();
    }

    /* renamed from: g */
    public void mo8388g() {
        this.f6745a.mo8546c();
    }

    public int getCurrentPositionInMillis() {
        return this.f6745a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f6745a.getDuration();
    }

    public C1778e<C1779f, C1777d> getEventBus() {
        return this.f6750n;
    }

    public long getInitialBufferTime() {
        return this.f6745a.getInitialBufferTime();
    }

    public C2240d getState() {
        return this.f6745a.getState();
    }

    /* access modifiers changed from: protected */
    public Handler getStateHandler() {
        return this.f6749m;
    }

    public TextureView getTextureView() {
        return (TextureView) this.f6745a;
    }

    public int getVideoHeight() {
        return this.f6745a.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.f6754r;
    }

    public C2116a getVideoStartReason() {
        return this.f6745a.getStartReason();
    }

    public View getVideoView() {
        return this.f6746j;
    }

    public int getVideoWidth() {
        return this.f6745a.getVideoWidth();
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f6745a.getVolume();
    }

    /* renamed from: h */
    public boolean mo8403h() {
        return C1795a.m7434a(getContext());
    }

    /* renamed from: i */
    public boolean mo8404i() {
        return this.f6752p;
    }

    /* renamed from: j */
    public boolean mo8405j() {
        return getState() == C2240d.STARTED;
    }

    /* renamed from: k */
    public boolean mo8406k() {
        return this.f6745a.mo8547d();
    }

    /* renamed from: l */
    public void mo8407l() {
        this.f6745a.setVideoStateChangeListener(null);
        this.f6745a.mo8548e();
    }

    /* renamed from: m */
    public boolean mo8408m() {
        return getState() == C2240d.PAUSED;
    }

    /* renamed from: n */
    public boolean mo8409n() {
        return mo8408m() && this.f6753q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        this.f6750n.mo7625a(f6744i);
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f6750n.mo7625a(f6743h);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.f6745a != null) {
            this.f6745a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.f6752p = z;
        this.f6745a.setFullScreen(z);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.f6745a.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.f6754r = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            mo8385d();
        } else {
            mo8384c();
            this.f6745a.setup(uri);
        }
        this.f6751o = false;
    }

    public void setVideoURI(String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f) {
        this.f6745a.setRequestedVolume(f);
        getEventBus().mo7625a(f6742g);
    }
}
