package com.facebook.ads.internal.view.p108g;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.p017v4.view.p027b.C0575a;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1591e.C1593a;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.component.C2027g;
import com.facebook.ads.internal.view.component.C2031k;
import com.facebook.ads.internal.view.p099a.C1912a.C1915a;
import com.facebook.ads.internal.view.p099a.C1916b;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.g.b */
public class C2080b extends C2027g {

    /* renamed from: b */
    private static final int f6626b = ((int) (48.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6627c = ((int) (40.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6628d = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6629e = ((int) (56.0f * C2342x.f7369b));

    /* renamed from: f */
    private static final int f6630f = ((int) (200.0f * C2342x.f7369b));

    /* renamed from: g */
    private C1608q f6631g;

    /* renamed from: h */
    private final C1802c f6632h;

    /* renamed from: i */
    private final C2376a f6633i;

    /* renamed from: j */
    private final C2341w f6634j;

    /* renamed from: k */
    private final Map<String, String> f6635k = new HashMap();

    /* renamed from: l */
    private RelativeLayout f6636l;

    /* renamed from: m */
    private C2031k f6637m;

    /* renamed from: n */
    private ImageView f6638n;

    /* renamed from: o */
    private C2213l f6639o;

    /* renamed from: p */
    private ObjectAnimator f6640p;

    /* renamed from: q */
    private boolean f6641q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f6642r;

    /* renamed from: s */
    private boolean f6643s;

    /* renamed from: t */
    private boolean f6644t = false;

    /* renamed from: u */
    private boolean f6645u;

    /* renamed from: v */
    private C1713c f6646v;

    /* renamed from: w */
    private C1712a f6647w;

    public C2080b(Context context, C1608q qVar, C1802c cVar, C2376a aVar, C2341w wVar, C1911a aVar2) {
        super(context);
        this.f6631g = qVar;
        this.f6632h = cVar;
        this.f6633i = aVar;
        this.f6634j = wVar;
        this.f6638n = new C2026f(context);
        this.f6639o = new C2213l(context, true);
        this.f6639o.setClickable(false);
        this.f6638n.setScaleType(ScaleType.CENTER_CROP);
        addView(this.f6638n, new LayoutParams(-1, -1));
        new C1980d(this.f6638n).mo8114a().mo8116a((C1981e) new C1981e() {
            /* renamed from: a */
            public void mo6849a(boolean z) {
                C2080b.this.f6642r = z;
                C2080b.this.m8445e();
            }
        }).mo8118a(this.f6631g.mo7235j().mo7133g());
        String a = qVar.mo7113a();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setPadding(f6628d, f6628d, f6628d, f6628d);
        relativeLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(relativeLayout);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -872415232});
        gradientDrawable.setCornerRadius(0.0f);
        C2342x.m9083a((View) relativeLayout, (Drawable) gradientDrawable);
        this.f6636l = new RelativeLayout(getContext());
        C2342x.m9081a((View) this.f6636l);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(12);
        relativeLayout.addView(this.f6636l, layoutParams);
        this.f6637m = new C2031k(getContext(), a, this.f6631g.mo7232g().mo7152f(), aVar2);
        this.f6637m.mo8241a(this.f6631g.mo7232g().mo7147a(), true, 22, -1);
        this.f6637m.mo8243b(this.f6631g.mo7232g().mo7150d(), false, 14, -1);
        this.f6637m.mo8244c(this.f6631g.mo7232g().mo7153g(), false, 14, -1);
        this.f6637m.mo8245d(this.f6631g.mo7232g().mo7151e(), false, 14, -1);
        this.f6636l.addView(this.f6637m, new LayoutParams(-1, -2));
        C2026f fVar = new C2026f(getContext());
        LayoutParams layoutParams2 = new LayoutParams(f6626b, f6626b);
        layoutParams2.addRule(2, this.f6636l.getId());
        fVar.setLayoutParams(layoutParams2);
        fVar.setFullCircleCorners(this.f6631g.mo7232g().mo7152f().equals(C1593a.PAGE_POST));
        relativeLayout.addView(fVar);
        new C1980d((ImageView) fVar).mo8115a(f6626b, f6626b).mo8118a(this.f6631g.mo7231f().mo7201b());
        m8444c(this.f6643s);
    }

    /* renamed from: b */
    private void m8443b(C1713c cVar, C1712a aVar) {
        View view;
        String str;
        int i;
        C2347b bVar;
        if (getWidth() >= f6630f && getHeight() >= f6630f) {
            if (aVar == C1712a.REPORT) {
                str = C1710a.m7140j(getContext());
                bVar = C2347b.REPORT_AD;
                i = -552389;
            } else {
                str = C1710a.m7139i(getContext());
                bVar = C2347b.HIDE_AD;
                i = -13272859;
            }
            view = new C1915a(getContext()).mo7961a(str).mo7964b(C1710a.m7141k(getContext())).mo7966c(cVar.mo7479b()).mo7962a(false).mo7960a(bVar).mo7958a(i).mo7965b(false).mo7967c(false).mo7969e(false).mo7963a();
        } else {
            view = getAdHiddenViewTextOnly();
        }
        C2342x.m9082a(view, -1);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        removeAllViews();
        addView(view);
    }

    /* renamed from: c */
    private void m8444c(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.f6637m.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(f6627c, f6627c);
        if (z) {
            layoutParams.rightMargin = 0;
            layoutParams2.topMargin = f6628d;
            layoutParams2.rightMargin = f6628d;
            layoutParams2.addRule(11);
            layoutParams2.addRule(10);
            addView(this.f6639o, layoutParams2);
            return;
        }
        layoutParams.rightMargin = f6629e;
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        this.f6636l.addView(this.f6639o, layoutParams2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m8445e() {
        if (this.f6641q && this.f6642r) {
            this.f6633i.mo8779a(this.f6635k);
            this.f6635k.put("touch", C2323k.m9046a(this.f6634j.mo8743e()));
            this.f6635k.put("is_cyoa", Boolean.TRUE.toString());
            this.f6632h.mo7702o(this.f6631g.mo7113a(), this.f6635k);
        }
    }

    private View getAdHiddenViewTextOnly() {
        TextView textView = new TextView(getContext());
        C2342x.m9089a(textView, true, 14);
        textView.setText(C1710a.m7141k(getContext()));
        textView.setGravity(17);
        return textView;
    }

    /* renamed from: a */
    public void mo8327a(int i) {
        this.f6635k.put("ad_intro_position", String.valueOf(i));
    }

    /* renamed from: a */
    public void mo8328a(C1713c cVar, C1712a aVar) {
        this.f6644t = true;
        this.f6646v = cVar;
        this.f6647w = aVar;
        m8443b(cVar, aVar);
    }

    /* renamed from: a */
    public void mo8329a(boolean z) {
        this.f6637m.mo8242a(z);
    }

    /* renamed from: a */
    public void mo8330a(boolean z, int i) {
        if (this.f6640p != null) {
            this.f6640p.cancel();
        }
        float f = 0.99f;
        float f2 = z ? 1.01f : 0.99f;
        if (!z) {
            f = 1.01f;
        }
        this.f6640p = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{f2, f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{f2, f})});
        this.f6640p.setInterpolator(new C0575a());
        this.f6640p.setDuration((long) i);
        this.f6640p.setRepeatCount(-1);
        this.f6640p.setRepeatMode(2);
        this.f6640p.start();
        this.f6645u = false;
    }

    /* renamed from: a */
    public boolean mo8331a() {
        return this.f6644t;
    }

    /* renamed from: b */
    public void mo8332b() {
        if (this.f6640p != null && !this.f6645u) {
            if (VERSION.SDK_INT >= 19) {
                this.f6640p.pause();
                return;
            }
            this.f6640p.cancel();
        }
    }

    /* renamed from: b */
    public void mo8333b(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        int i = 0;
        layoutParams.width = z ? -1 : 0;
        if (!z) {
            i = -1;
        }
        layoutParams.height = i;
    }

    /* renamed from: c */
    public void mo8334c() {
        if (this.f6640p != null && !this.f6645u) {
            if (VERSION.SDK_INT >= 19) {
                this.f6640p.resume();
                return;
            }
            this.f6640p.start();
        }
    }

    /* renamed from: d */
    public void mo8335d() {
        if (this.f6640p != null) {
            this.f6640p.cancel();
        }
        this.f6645u = true;
    }

    public C1608q getAdDataBundle() {
        return this.f6631g;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && mo8331a()) {
            removeAllViews();
            m8443b(this.f6646v, this.f6647w);
        }
    }

    public void setAdReportingFlowListener(C1916b bVar) {
        this.f6637m.setAdReportingFlowListener(bVar);
    }

    public void setShouldPlayButtonOnTop(boolean z) {
        if (z != this.f6643s) {
            this.f6643s = z;
            C2342x.m9091b(this.f6639o);
            m8444c(this.f6643s);
        }
    }

    public void setViewability(boolean z) {
        this.f6641q = z;
        m8445e();
    }
}
