package com.facebook.ads.internal.view.p110i.p113c;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2148p;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.i.c.o */
public class C2224o extends RelativeLayout implements C2117b {

    /* renamed from: a */
    private static final int f6980a = ((int) (6.0f * C2342x.f7369b));

    /* renamed from: b */
    private ObjectAnimator f6981b;

    /* renamed from: c */
    private AtomicInteger f6982c;

    /* renamed from: d */
    private ProgressBar f6983d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2110a f6984e;

    /* renamed from: f */
    private C1779f f6985f;

    /* renamed from: g */
    private C1779f f6986g;

    /* renamed from: h */
    private C1779f f6987h;

    /* renamed from: i */
    private C1779f f6988i;

    public C2224o(Context context) {
        this(context, f6980a, -12549889);
    }

    public C2224o(Context context, int i, int i2) {
        super(context);
        this.f6985f = new C2148p() {
            /* renamed from: a */
            public void mo6895a(C2147o oVar) {
                if (C2224o.this.f6984e != null) {
                    C2224o.m8792a(C2224o.this, C2224o.this.f6984e.getDuration(), C2224o.this.f6984e.getCurrentPositionInMillis());
                }
            }
        };
        this.f6986g = new C2142j() {
            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2224o.this.m8793b();
            }
        };
        this.f6987h = new C2144l() {
            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                if (C2224o.this.f6984e != null) {
                    C2224o.m8792a(C2224o.this, C2224o.this.f6984e.getDuration(), C2224o.this.f6984e.getCurrentPositionInMillis());
                }
            }
        };
        this.f6988i = new C2136d() {
            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                if (C2224o.this.f6984e != null) {
                    C2224o.m8795c(C2224o.this);
                }
            }
        };
        this.f6982c = new AtomicInteger(-1);
        this.f6983d = new ProgressBar(context, null, 16842872);
        this.f6983d.setLayoutParams(new LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.f6983d.setMax(10000);
        addView(this.f6983d);
    }

    /* renamed from: a */
    static /* synthetic */ void m8792a(C2224o oVar, int i, int i2) {
        oVar.m8793b();
        if (oVar.f6982c.get() < i2 && i > i2) {
            oVar.f6981b = ObjectAnimator.ofInt(oVar.f6983d, "progress", new int[]{(i2 * 10000) / i, (Math.min(i2 + 250, i) * 10000) / i});
            oVar.f6981b.setDuration((long) Math.min(250, i - i2));
            oVar.f6981b.setInterpolator(new LinearInterpolator());
            oVar.f6981b.start();
            oVar.f6982c.set(i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8793b() {
        if (this.f6981b != null) {
            this.f6981b.cancel();
            this.f6981b.setTarget(null);
            this.f6981b = null;
            this.f6983d.clearAnimation();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m8795c(C2224o oVar) {
        oVar.m8793b();
        oVar.f6981b = ObjectAnimator.ofInt(oVar.f6983d, "progress", new int[]{0, 0});
        oVar.f6981b.setDuration(0);
        oVar.f6981b.setInterpolator(new LinearInterpolator());
        oVar.f6981b.start();
        oVar.f6982c.set(0);
    }

    /* renamed from: a */
    public void mo8530a() {
        m8793b();
        this.f6983d = null;
        this.f6984e = null;
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6984e = aVar;
        aVar.getEventBus().mo7626a((T[]) new C1779f[]{this.f6986g, this.f6987h, this.f6985f, this.f6988i});
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        aVar.getEventBus().mo7628b((T[]) new C1779f[]{this.f6985f, this.f6987h, this.f6986g, this.f6988i});
        this.f6984e = null;
    }

    public void setProgressBarColor(int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ColorDrawable(0), new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.f6983d.setProgressDrawable(layerDrawable);
    }
}
