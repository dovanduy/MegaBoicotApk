package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.p072b.C1595f;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1808h;
import com.facebook.ads.internal.p115w.p117b.C2312e;
import com.facebook.ads.internal.p115w.p117b.C2312e.C2314a;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C2029i;
import com.facebook.ads.internal.view.p099a.C1916b;
import com.facebook.ads.internal.view.p108g.C2080b;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.f */
public class C2058f extends RelativeLayout implements C1910a {

    /* renamed from: a */
    private static final LayoutParams f6542a = new LayoutParams(-1, -1);

    /* renamed from: b */
    private static final int f6543b = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6544c = ((int) (56.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6545d = ((int) (230.0f * C2342x.f7369b));

    /* renamed from: e */
    private final C1595f f6546e;

    /* renamed from: f */
    private final C1911a f6547f;

    /* renamed from: g */
    private final C1802c f6548g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2341w f6549h = new C2341w();

    /* renamed from: i */
    private final C2376a f6550i;

    /* renamed from: j */
    private final C2377a f6551j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2312e f6552k;

    /* renamed from: l */
    private final int f6553l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6554m;

    /* renamed from: n */
    private boolean f6555n;

    /* renamed from: o */
    private WeakReference<AudienceNetworkActivity> f6556o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C2029i f6557p;

    /* renamed from: q */
    private final TextView f6558q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final LinearLayout f6559r;

    /* renamed from: s */
    private final BackButtonInterceptor f6560s = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            return true;
        }
    };

    /* renamed from: com.facebook.ads.internal.view.f$a */
    public static class C2062a extends C1777d {

        /* renamed from: a */
        private C1608q f6564a;

        public C2062a(C1608q qVar) {
            this.f6564a = qVar;
        }

        /* renamed from: a */
        public C1608q mo8303a() {
            return this.f6564a;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$b */
    private static class C2063b implements OnClickListener, OnTouchListener {

        /* renamed from: a */
        final WeakReference<C2058f> f6565a;

        /* renamed from: b */
        final WeakReference<C2080b> f6566b;

        public C2063b(C2058f fVar, C2080b bVar) {
            this.f6565a = new WeakReference<>(fVar);
            this.f6566b = new WeakReference<>(bVar);
        }

        public void onClick(View view) {
            if (this.f6565a.get() != null && this.f6566b.get() != null && !((C2080b) this.f6566b.get()).mo8331a()) {
                C2058f.m8389a((C2058f) this.f6565a.get(), ((C2080b) this.f6566b.get()).getAdDataBundle());
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6565a.get() != null) {
                ((C2058f) this.f6565a.get()).getTouchDataRecorder().mo8738a(motionEvent, (View) this.f6565a.get(), view);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$c */
    public static class C2064c implements C1916b {

        /* renamed from: a */
        final WeakReference<C2058f> f6567a;

        /* renamed from: b */
        final WeakReference<C2080b> f6568b;

        C2064c(C2058f fVar, C2080b bVar) {
            this.f6567a = new WeakReference<>(fVar);
            this.f6568b = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public void mo7970a() {
            C2058f fVar = (C2058f) this.f6567a.get();
            if (fVar != null) {
                fVar.setIsAdReportingLayoutVisible(true);
                fVar.mo8297c(true);
            }
        }

        /* renamed from: a */
        public void mo7971a(C1713c cVar, C1712a aVar) {
            if (this.f6568b.get() != null) {
                ((C2080b) this.f6568b.get()).mo8328a(cVar, aVar);
            }
        }

        /* renamed from: a */
        public void mo7972a(boolean z) {
            if (this.f6567a.get() != null) {
                ((C2058f) this.f6567a.get()).setIsAdReportingLayoutVisible(false);
                if (z) {
                    ((C2058f) this.f6567a.get()).mo8296a();
                    return;
                }
                ((C2058f) this.f6567a.get()).mo8297c(false);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$d */
    private static class C2065d implements C2314a {

        /* renamed from: a */
        private final WeakReference<C2058f> f6569a;

        /* renamed from: b */
        private final WeakReference<C2029i> f6570b;

        /* renamed from: c */
        private final C1595f f6571c;

        /* renamed from: d */
        private int f6572d;

        public C2065d(C2058f fVar, C1595f fVar2, int i) {
            this.f6569a = new WeakReference<>(fVar);
            this.f6570b = new WeakReference<>(fVar.f6557p);
            this.f6571c = fVar2;
            this.f6572d = i;
        }

        /* renamed from: a */
        public void mo8306a() {
            if (this.f6569a.get() != null) {
                LinearLayout b = ((C2058f) this.f6569a.get()).f6559r;
                int b2 = this.f6571c.mo7166i().mo7123b();
                if (((C2080b) b.getChildAt(b2)).mo8331a()) {
                    int i = 0;
                    while (true) {
                        if (i >= b.getChildCount()) {
                            break;
                        } else if (!((C2080b) b.getChildAt(i)).mo8331a()) {
                            b2 = i;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                C2058f.m8389a((C2058f) this.f6569a.get(), (C1608q) this.f6571c.mo7167j().get(b2));
            }
        }

        /* renamed from: a */
        public void mo8307a(int i) {
            C2029i iVar = (C2029i) this.f6570b.get();
            if (iVar != null) {
                iVar.setProgress(((this.f6572d - i) * 100) / this.f6572d);
                iVar.setText(this.f6571c.mo7162e().mo7169a(String.valueOf(i)));
            }
        }
    }

    public C2058f(Context context, C1595f fVar, C1802c cVar, C1911a aVar) {
        super(context);
        this.f6546e = fVar;
        this.f6548g = cVar;
        this.f6553l = this.f6546e.mo7166i().mo7122a() / AdError.NETWORK_ERROR_CODE;
        this.f6547f = aVar;
        this.f6551j = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (!C2058f.this.f6549h.mo8740b()) {
                    C2058f.this.f6549h.mo8737a();
                    for (int i = 0; i < C2058f.this.f6559r.getChildCount(); i++) {
                        if (C2058f.this.f6559r.getChildAt(i) instanceof C2080b) {
                            C2080b bVar = (C2080b) C2058f.this.f6559r.getChildAt(i);
                            bVar.mo8327a(i);
                            bVar.setViewability(true);
                        }
                    }
                    if (!C2058f.this.f6554m) {
                        C2058f.this.f6552k.mo8716a();
                    }
                }
            }
        };
        this.f6550i = new C2376a(this, 1, this.f6551j);
        this.f6550i.mo8778a(250);
        this.f6557p = new C2029i(context);
        C2342x.m9081a((View) this.f6557p);
        this.f6558q = new TextView(getContext());
        C2342x.m9081a((View) this.f6558q);
        this.f6559r = new LinearLayout(getContext());
        boolean z = getResources().getConfiguration().orientation == 1;
        this.f6557p.setProgress(0);
        this.f6557p.mo8231a(false, Color.parseColor(this.f6546e.mo7164g()), 14);
        this.f6557p.setText(this.f6546e.mo7162e().mo7169a(String.valueOf(this.f6553l)));
        C2342x.m9082a((View) this.f6557p, 0);
        LayoutParams layoutParams = new LayoutParams(-1, f6544c);
        layoutParams.addRule(10);
        addView(this.f6557p, layoutParams);
        this.f6558q.setText(this.f6546e.mo7162e().mo7168a());
        C2342x.m9089a(this.f6558q, true, 32);
        this.f6558q.setTextColor(Color.parseColor(this.f6546e.mo7165h()));
        LayoutParams layoutParams2 = new LayoutParams(z ? f6545d : -1, -2);
        layoutParams2.setMargins(f6543b, 0, f6543b, f6543b / 2);
        layoutParams2.addRule(3, this.f6557p.getId());
        addView(this.f6558q, layoutParams2);
        this.f6559r.setPadding(f6543b / 2, f6543b / 2, f6543b / 2, f6543b / 2);
        this.f6559r.setOrientation(z ? 1 : 0);
        m8390a(z, this.f6546e.mo7167j());
        LayoutParams layoutParams3 = new LayoutParams(-1, -1);
        layoutParams3.addRule(3, this.f6558q.getId());
        addView(this.f6559r, layoutParams3);
        C2342x.m9082a((View) this, Color.parseColor(this.f6546e.mo7163f()));
        this.f6552k = new C2312e(this.f6553l, new C2065d(this, this.f6546e, this.f6553l));
        this.f6550i.mo8777a();
    }

    /* renamed from: a */
    static /* synthetic */ void m8389a(C2058f fVar, C1608q qVar) {
        if (!fVar.f6554m) {
            fVar.f6554m = true;
            fVar.f6552k.mo8717b();
            if (fVar.f6550i != null) {
                fVar.f6550i.mo8782c();
            }
            View view = new View(fVar.getContext());
            view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                }
            });
            fVar.addView(view, new LayoutParams(-1, -1));
            C1808h hVar = new C1808h();
            for (int i = 0; i < fVar.f6559r.getChildCount(); i++) {
                C2080b bVar = (C2080b) fVar.f6559r.getChildAt(i);
                if (bVar.getAdDataBundle() == qVar) {
                    hVar.mo7713c(i);
                }
                bVar.mo8335d();
            }
            String a = qVar.mo7113a();
            hVar.mo7714d((fVar.f6553l - fVar.f6552k.mo8720e()) * AdError.NETWORK_ERROR_CODE);
            hVar.mo7715e(fVar.f6553l * AdError.NETWORK_ERROR_CODE);
            hVar.mo7710a(fVar.f6546e.mo7167j().size());
            hVar.mo7711a(fVar.f6552k.mo8719d());
            hVar.mo7712b(fVar.f6546e.mo7166i().mo7123b());
            HashMap hashMap = new HashMap();
            fVar.f6550i.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(fVar.f6549h.mo8743e()));
            hashMap.put("ad_selection", C2323k.m9046a(hVar.mo7709a()));
            hashMap.put("is_cyoa", Boolean.TRUE.toString());
            fVar.f6548g.mo7703p(a, hashMap);
            qVar.mo7114a(fVar.f6546e.mo7116b());
            qVar.mo7115a(fVar.f6546e.mo7118c());
            C2342x.m9092c(fVar);
            C2342x.m9091b(fVar);
            fVar.f6547f.mo6796a(C2133aa.REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD.mo8442a(), (C1777d) new C2062a(qVar));
            if (!(fVar.f6556o == null || fVar.f6556o.get() == null)) {
                ((AudienceNetworkActivity) fVar.f6556o.get()).removeBackButtonInterceptor(fVar.f6560s);
            }
        }
    }

    /* renamed from: a */
    private void m8390a(boolean z, List<C1608q> list) {
        this.f6559r.setWeightSum((float) list.size());
        boolean z2 = list.size() == 2;
        boolean z3 = list.size() >= 3 && !z;
        int i = 0;
        for (C1608q bVar : list) {
            C2080b bVar2 = new C2080b(getContext(), bVar, this.f6548g, this.f6550i, this.f6549h, this.f6547f);
            bVar2.setShouldPlayButtonOnTop(z3);
            bVar2.mo8329a(this.f6546e.mo7166i().mo7125d());
            bVar2.setCornerRadius(10);
            int i2 = -1;
            int i3 = z ? -1 : 0;
            if (z) {
                i2 = 0;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i2);
            layoutParams.setMargins(f6543b / 2, f6543b / 2, f6543b / 2, f6543b / 2);
            layoutParams.weight = 1.0f;
            C2063b bVar3 = new C2063b(this, bVar2);
            bVar2.setOnTouchListener(bVar3);
            bVar2.setOnClickListener(bVar3);
            bVar2.setAdReportingFlowListener(new C2064c(this, bVar2));
            if (z2) {
                bVar2.mo8330a(i % 2 != 0, this.f6546e.mo7166i().mo7124c());
            }
            this.f6559r.addView(bVar2, layoutParams);
            i++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8296a() {
        boolean z = true;
        for (int i = 0; i < this.f6559r.getChildCount(); i++) {
            C2080b bVar = (C2080b) this.f6559r.getChildAt(i);
            z &= bVar.mo8331a();
            bVar.mo8335d();
        }
        if (z && this.f6547f != null) {
            this.f6547f.mo6795a(C2133aa.REWARDED_VIDEO_END_ACTIVITY.mo8442a());
        }
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.f6547f != null) {
            setLayoutParams(f6542a);
            this.f6547f.mo6793a((View) this);
            audienceNetworkActivity.addBackButtonInterceptor(this.f6560s);
            this.f6556o = new WeakReference<>(audienceNetworkActivity);
        }
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
        this.f6552k.mo8717b();
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f6552k.mo8717b();
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        if (this.f6554m) {
            return;
        }
        if (z || !this.f6555n) {
            this.f6552k.mo8716a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8297c(boolean z) {
        for (int i = 0; i < this.f6559r.getChildCount(); i++) {
            if (z) {
                ((C2080b) this.f6559r.getChildAt(i)).mo8332b();
            } else {
                ((C2080b) this.f6559r.getChildAt(i)).mo8334c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final C2341w getTouchDataRecorder() {
        return this.f6549h;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = true;
        boolean z2 = configuration.orientation == 1;
        ((LayoutParams) this.f6558q.getLayoutParams()).width = z2 ? f6545d : -1;
        this.f6559r.setOrientation(z2 ? 1 : 0);
        if (this.f6546e.mo7167j().size() < 3 || z2) {
            z = false;
        }
        for (int i = 0; i < this.f6559r.getChildCount(); i++) {
            C2080b bVar = (C2080b) this.f6559r.getChildAt(i);
            bVar.mo8333b(z2);
            bVar.setShouldPlayButtonOnTop(z);
        }
    }

    public void onDestroy() {
        this.f6552k.mo8717b();
        if (this.f6550i != null) {
            this.f6550i.mo8782c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6549h.mo8738a(motionEvent, this, this);
        if (motionEvent.getAction() == 1) {
            HashMap hashMap = new HashMap();
            this.f6550i.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f6549h.mo8743e()));
            hashMap.put("is_cyoa", Boolean.TRUE.toString());
            this.f6548g.mo7691d(((C1608q) this.f6546e.mo7167j().get(0)).mo7113a(), hashMap);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void setIsAdReportingLayoutVisible(boolean z) {
        this.f6555n = z;
    }

    public void setListener(C1911a aVar) {
    }
}
