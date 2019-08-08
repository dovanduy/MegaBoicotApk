package com.facebook.ads.internal.view.p107f;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.adapters.p072b.C1586b;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2312e;
import com.facebook.ads.internal.p115w.p117b.C2312e.C2314a;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C2098i;
import com.facebook.ads.internal.view.C2098i.C2108a;
import com.facebook.ads.internal.view.C2098i.C2109b;
import com.facebook.ads.internal.view.component.C2023c;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p101c.C1967a.C1970b;
import com.facebook.ads.internal.view.p101c.C1967a.C1971c;
import com.facebook.ads.internal.view.p101c.C1967a.C1972d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.f.b */
public class C2069b extends RelativeLayout implements C1972d, C2314a {

    /* renamed from: a */
    private static final int f6582a = ((int) (64.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final LayoutParams f6583b = new LayoutParams(-1, -1);

    /* renamed from: c */
    private static final int f6584c = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6585d = ((int) (12.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6586e = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: f */
    private static final float f6587f = ((float) ((int) (4.0f * C2342x.f7369b)));

    /* renamed from: g */
    private final C1606o f6588g;

    /* renamed from: h */
    private final C1605n f6589h;

    /* renamed from: i */
    private final C1586b f6590i;

    /* renamed from: j */
    private final C1802c f6591j;

    /* renamed from: k */
    private final C2098i f6592k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicBoolean f6593l = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C2312e f6594m;

    /* renamed from: n */
    private final C2312e f6595n;

    /* renamed from: o */
    private final boolean f6596o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public WeakReference<C1967a> f6597p;

    /* renamed from: q */
    private C1970b f6598q;

    /* renamed from: r */
    private C2023c f6599r;

    /* renamed from: s */
    private C2066a f6600s;

    /* renamed from: t */
    private RelativeLayout f6601t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f6602u = false;

    /* renamed from: v */
    private Toast f6603v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2076c f6604w;

    /* renamed from: com.facebook.ads.internal.view.f.b$a */
    private static class C2074a implements OnClickListener {

        /* renamed from: a */
        final WeakReference<C2069b> f6609a;

        C2074a(C2069b bVar) {
            this.f6609a = new WeakReference<>(bVar);
        }

        public void onClick(View view) {
            if (this.f6609a.get() != null) {
                C2069b.m8420g((C2069b) this.f6609a.get());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$b */
    private static class C2075b implements OnTouchListener {

        /* renamed from: a */
        final WeakReference<C1967a> f6610a;

        /* renamed from: b */
        final C1802c f6611b;

        /* renamed from: c */
        final C1606o f6612c;

        private C2075b(C1967a aVar, C1802c cVar, C1606o oVar) {
            this.f6610a = new WeakReference<>(aVar);
            this.f6611b = cVar;
            this.f6612c = oVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6610a.get() != null && motionEvent.getAction() == 1) {
                HashMap hashMap = new HashMap();
                ((C1967a) this.f6610a.get()).getViewabilityChecker().mo8779a((Map<String, String>) hashMap);
                hashMap.put("touch", C2323k.m9046a(((C1967a) this.f6610a.get()).getTouchDataRecorder().mo8743e()));
                this.f6611b.mo7691d(this.f6612c.mo7227g(), hashMap);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$c */
    public interface C2076c {
        /* renamed from: a */
        void mo8316a();

        /* renamed from: a */
        void mo8317a(C2376a aVar, C2341w wVar);

        /* renamed from: a */
        void mo8318a(boolean z);

        /* renamed from: b */
        void mo8319b();

        /* renamed from: c */
        void mo8320c();

        /* renamed from: d */
        void mo8321d();
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$d */
    private class C2077d {
        private C2077d() {
        }

        @JavascriptInterface
        public void onCTAClick() {
            C2069b.m8420g(C2069b.this);
        }
    }

    public C2069b(Context context, C1606o oVar, C1802c cVar, C1911a aVar, C2076c cVar2, boolean z, boolean z2) {
        super(context);
        this.f6588g = oVar;
        this.f6589h = oVar.mo7226f().mo7136j();
        this.f6590i = oVar.mo7225e();
        this.f6591j = cVar;
        this.f6604w = cVar2;
        this.f6592k = new C2098i(context, aVar, C2108a.CROSS);
        this.f6596o = z2;
        this.f6594m = new C2312e(z ? this.f6589h.mo7212c() : 0, this);
        this.f6595n = new C2312e(this.f6589h.mo7217h() ? 2 : 0, new C2314a() {
            /* renamed from: a */
            public void mo8306a() {
                C2069b.this.m8419g();
            }

            /* renamed from: a */
            public void mo8307a(int i) {
            }
        });
        this.f6592k.mo8353a(this.f6590i.mo7120a(), true);
        this.f6592k.setShowPageDetails(false);
        this.f6592k.mo8355a(this.f6588g.mo7222b(), this.f6588g.mo7227g(), this.f6589h.mo7212c());
        this.f6592k.setToolbarListener(new C2109b() {
            /* renamed from: a */
            public void mo8207a() {
                if (C2069b.this.f6604w != null) {
                    C2069b.this.f6604w.mo8320c();
                }
            }
        });
        C2342x.m9081a((View) this.f6592k);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f6592k.setLayoutParams(layoutParams);
        this.f6600s = new C2066a(getContext(), this.f6588g);
        setLayoutParams(f6583b);
        C2342x.m9082a((View) this, this.f6590i.mo7120a().mo7174d(true));
        addView(this.f6600s, f6583b);
        C2342x.m9082a((View) this, -14473425);
        setLayoutParams(f6583b);
    }

    /* renamed from: a */
    private static TextView m8410a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                m8410a((ViewGroup) childAt);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m8414b(int i) {
        if (this.f6603v != null) {
            this.f6603v.setGravity(49, 0, f6582a);
            String valueOf = String.valueOf(i);
            TextView a = m8410a((ViewGroup) this.f6603v.getView());
            if (a != null) {
                a.setText(this.f6589h.mo7214e().replace("[secs]", valueOf));
                a.setGravity(17);
            }
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m8418f(C2069b bVar) {
        if (bVar.f6603v == null || bVar.f6603v.getView().getWindowVisibility() != 0) {
            bVar.f6603v = Toast.makeText(bVar.getContext(), bVar.f6589h.mo7214e(), 1);
            bVar.m8414b(bVar.f6594m.mo8720e());
            bVar.f6603v.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m8419g() {
        if (this.f6604w != null) {
            this.f6604w.mo8316a();
        }
        this.f6601t = new RelativeLayout(getContext());
        C2342x.m9081a((View) this.f6601t);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(f6584c, f6585d, f6584c, f6585d);
        layoutParams.addRule(12);
        this.f6601t.setLayoutParams(layoutParams);
        C2023c cVar = new C2023c(getContext(), true, false, this.f6590i.mo7120a());
        cVar.setButtonColor(452984831);
        cVar.setText(this.f6588g.mo7224d().mo7179b());
        cVar.getBackground().setAlpha(0);
        C2342x.m9081a((View) cVar);
        cVar.setOnClickListener(new C2074a(this));
        cVar.setTextSize(14.0f);
        cVar.setIncludeFontPadding(false);
        cVar.setPadding(f6586e, f6586e, f6586e, f6586e);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        cVar.setLayoutParams(layoutParams2);
        if (!this.f6596o) {
            cVar.setVisibility(8);
        }
        this.f6599r = cVar;
        C2023c cVar2 = this.f6599r;
        C2030j jVar = new C2030j(getContext(), this.f6588g.mo7225e().mo7120a(), true, 16, 14, 0);
        C2342x.m9081a((View) jVar);
        jVar.mo8234a(this.f6588g.mo7223c().mo7147a(), this.f6588g.mo7223c().mo7148b(), null, false, true);
        TextView descriptionTextView = jVar.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TruncateAt.END);
        TextView titleTextView = jVar.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TruncateAt.END);
        LayoutParams layoutParams3 = new LayoutParams(-1, -2);
        layoutParams3.addRule(0, cVar2.getId());
        layoutParams3.setMargins(0, 0, f6584c, 0);
        jVar.setLayoutParams(layoutParams3);
        LayoutParams layoutParams4 = (LayoutParams) this.f6599r.getLayoutParams();
        layoutParams4.addRule(6, jVar.getId());
        layoutParams4.addRule(8, jVar.getId());
        this.f6598q = new C1971c() {
            /* renamed from: a */
            public void mo8086a(int i, String str) {
                C2069b.this.f6602u = true;
                if (C2069b.this.f6597p.get() != null) {
                    ((C1967a) C2069b.this.f6597p.get()).setVisibility(4);
                }
                if (C2069b.this.f6604w != null) {
                    C2069b.this.f6604w.mo8321d();
                }
            }

            /* renamed from: b */
            public void mo7250b() {
                if (C2069b.this.f6593l.compareAndSet(false, true) && C2069b.this.f6597p.get() != null && C2069b.this.f6604w != null) {
                    C1967a aVar = (C1967a) C2069b.this.f6597p.get();
                    C2069b.this.f6604w.mo8317a(aVar.getViewabilityChecker(), aVar.getTouchDataRecorder());
                    C2069b.this.f6594m.mo8716a();
                }
            }
        };
        C1967a aVar = new C1967a(getContext(), new WeakReference(this.f6598q), 10);
        aVar.setLogMultipleImpressions(false);
        aVar.setWaitForAssetsToLoad(true);
        aVar.setCheckAssetsByJavascriptBridge(false);
        aVar.setWebViewTimeoutInMillis(this.f6589h.mo7216g());
        aVar.setRequestId(this.f6588g.mo7221a());
        WebSettings settings = aVar.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        this.f6597p = new WeakReference<>(aVar);
        aVar.loadUrl(getMarkupUrl());
        aVar.setOnTouchListener(new C2075b(aVar, this.f6591j, this.f6588g));
        aVar.addJavascriptInterface(new C2077d(), "FbPlayableAd");
        aVar.setCornerRadius(f6587f);
        C2342x.m9082a((View) this, -14473425);
        LayoutParams layoutParams5 = new LayoutParams(-1, -1);
        layoutParams5.setMargins(f6584c, 0, f6584c, 0);
        layoutParams5.addRule(3, this.f6592k.getId());
        layoutParams5.addRule(2, this.f6601t.getId());
        aVar.setLayoutParams(layoutParams5);
        aVar.setVisibility(4);
        aVar.setOnAssetsLoadedListener(this);
        this.f6601t.addView(jVar);
        this.f6601t.addView(this.f6599r);
        addView(this.f6592k);
        addView(aVar);
        addView(this.f6601t);
        this.f6592k.setVisibility(4);
        aVar.setVisibility(4);
        aVar.setTranslationY(50.0f);
        this.f6601t.setVisibility(4);
        this.f6601t.setTranslationY(200.0f);
    }

    /* renamed from: g */
    static /* synthetic */ void m8420g(C2069b bVar) {
        boolean z = !bVar.f6596o && !bVar.f6594m.mo8719d();
        if (bVar.f6604w != null) {
            bVar.f6604w.mo8318a(z);
        }
        if (z) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C2069b.m8418f(C2069b.this);
                }
            });
        }
    }

    private String getMarkupUrl() {
        return !TextUtils.isEmpty(this.f6589h.mo7219j()) ? this.f6589h.mo7219j() : this.f6589h.mo7209a();
    }

    /* renamed from: a */
    public void mo8306a() {
        if (this.f6604w != null) {
            this.f6604w.mo8319b();
        }
        this.f6592k.mo8357a(true);
        if (!this.f6596o) {
            C2342x.m9086a((ViewGroup) this, 500);
            this.f6599r.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo8307a(int i) {
        this.f6592k.setProgress(100.0f * (1.0f - (((float) i) / ((float) this.f6589h.mo7212c()))));
        m8414b(i);
    }

    /* renamed from: b */
    public void mo8087b() {
        if (!this.f6602u && this.f6597p.get() != null) {
            C1967a adWebView = getAdWebView();
            if (adWebView != null) {
                C2342x.m9085a((ViewGroup) this);
                adWebView.setVisibility(0);
                C2342x.m9091b(this.f6600s);
                this.f6592k.setVisibility(0);
                this.f6601t.setVisibility(0);
                adWebView.animate().setStartDelay(100).setDuration(300).translationYBy(-50.0f);
                this.f6601t.animate().setStartDelay(100).setDuration(300).translationYBy(-200.0f);
            }
        }
    }

    /* renamed from: c */
    public void mo8308c() {
        if (this.f6589h.mo7217h()) {
            this.f6595n.mo8716a();
            return;
        }
        removeAllViews();
        m8419g();
    }

    /* renamed from: d */
    public void mo8309d() {
        C2312e eVar;
        if (!this.f6595n.mo8719d()) {
            eVar = this.f6595n;
        } else if (!this.f6594m.mo8718c()) {
            eVar = this.f6594m;
        } else {
            return;
        }
        eVar.mo8716a();
    }

    /* renamed from: e */
    public void mo8310e() {
        this.f6595n.mo8717b();
        this.f6594m.mo8717b();
    }

    /* renamed from: f */
    public void mo8311f() {
        this.f6595n.mo8717b();
        this.f6594m.mo8717b();
        this.f6592k.setToolbarListener(null);
        C1967a aVar = this.f6597p != null ? (C1967a) this.f6597p.get() : null;
        if (aVar != null) {
            aVar.removeJavascriptInterface("FbPlayableAd");
        }
        this.f6604w = null;
        this.f6603v = null;
    }

    public C1967a getAdWebView() {
        if (this.f6597p != null) {
            return (C1967a) this.f6597p.get();
        }
        return null;
    }
}
