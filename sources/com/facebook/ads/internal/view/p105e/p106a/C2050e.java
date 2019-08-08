package com.facebook.ads.internal.view.p105e.p106a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p028v7.widget.C0951ai;
import android.support.p028v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C2033d;
import com.facebook.ads.internal.view.C2264o;
import com.facebook.ads.internal.view.component.C2025e;
import com.facebook.ads.internal.view.p105e.p106a.C2046c.C2047a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e.a.e */
public class C2050e extends C2264o {

    /* renamed from: d */
    private static final int f6499d = ((int) (48.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6500e = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: f */
    private static final int f6501f = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: g */
    private static final int f6502g = ((int) (56.0f * C2342x.f7369b));

    /* renamed from: h */
    private static final int f6503h = ((int) (12.0f * C2342x.f7369b));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2341w f6504i = new C2341w();

    /* renamed from: j */
    private C1724b f6505j;

    /* renamed from: k */
    private LinearLayout f6506k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f6507l;

    /* renamed from: m */
    private List<C2045b> f6508m;

    /* renamed from: n */
    private C2041a f6509n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2025e f6510o;

    /* renamed from: p */
    private C2033d f6511p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2376a f6512q;

    /* renamed from: r */
    private C2377a f6513r;

    /* renamed from: s */
    private int f6514s;

    /* renamed from: t */
    private int f6515t;

    public C2050e(Context context, C1802c cVar, C1724b bVar, C1911a aVar) {
        super(context, cVar, aVar);
        this.f6505j = bVar;
    }

    /* renamed from: a */
    public void mo8287a() {
        if (this.f6506k != null) {
            this.f6506k.removeAllViews();
            this.f6506k = null;
        }
        if (this.f6511p != null) {
            this.f6511p.removeAllViews();
            this.f6511p = null;
        }
        if (this.f6510o != null) {
            this.f6510o.removeAllViews();
            this.f6510o = null;
        }
    }

    /* renamed from: a */
    public void mo8288a(int i, Bundle bundle) {
        LinearLayout linearLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        C2050e eVar;
        int i6 = i;
        this.f6506k = new LinearLayout(getContext());
        if (i6 == 1) {
            linearLayout = this.f6506k;
            i2 = 17;
        } else {
            linearLayout = this.f6506k;
            i2 = 48;
        }
        linearLayout.setGravity(i2);
        this.f6506k.setLayoutParams(new LayoutParams(-1, -1));
        this.f6506k.setOrientation(1);
        int i7 = C2342x.f7368a.widthPixels;
        int i8 = C2342x.f7368a.heightPixels;
        if (i6 == 1) {
            int min = Math.min(i7 - (f6500e * 4), i8 / 2);
            int i9 = (i7 - min) / 8;
            i4 = i9;
            i5 = min;
            i3 = 4 * i9;
        } else {
            int i10 = i8 - ((f6502g + f6499d) + (f6500e * 2));
            int i11 = f6500e;
            i4 = i11;
            i5 = i10;
            i3 = 2 * i11;
        }
        this.f6513r = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                HashMap hashMap = new HashMap();
                if (!C2050e.this.f6504i.mo8740b()) {
                    C2050e.this.f6504i.mo8737a();
                    if (C2050e.this.getAudienceNetworkListener() != null) {
                        C2050e.this.getAudienceNetworkListener().mo6795a("com.facebook.ads.interstitial.impression.logged");
                    }
                    if (!TextUtils.isEmpty(C2050e.this.f6507l)) {
                        C2050e.this.f6512q.mo8779a((Map<String, String>) hashMap);
                        hashMap.put("touch", C2323k.m9046a(C2050e.this.f6504i.mo8743e()));
                        C2050e.this.mo8646a(hashMap);
                        C2050e.this.f7123a.mo7686a(C2050e.this.f6507l, hashMap);
                    }
                }
            }
        };
        this.f6512q = new C2376a(this, 1, this.f6513r);
        this.f6512q.mo8778a(this.f6514s);
        this.f6512q.mo8780b(this.f6515t);
        this.f6511p = new C2033d(getContext());
        this.f6511p.setLayoutParams(new LayoutParams(-1, -2));
        C2041a aVar = new C2041a(this.f6511p, i6, this.f6508m, this.f6512q, bundle);
        this.f6509n = aVar;
        C2033d dVar = this.f6511p;
        List<C2045b> list = this.f6508m;
        C1802c cVar = this.f7123a;
        C1724b bVar = this.f6505j;
        C2376a aVar2 = this.f6512q;
        C2341w wVar = this.f6504i;
        C1911a audienceNetworkListener = getAudienceNetworkListener();
        C1597h a = i6 == 1 ? this.f7125c.mo7120a() : this.f7125c.mo7121b();
        String str = this.f6507l;
        C2041a aVar3 = this.f6509n;
        C2046c cVar2 = r1;
        C2033d dVar2 = dVar;
        C2046c cVar3 = new C2046c(list, cVar, bVar, aVar2, wVar, audienceNetworkListener, a, str, i5, i4, i3, i6, aVar3);
        dVar2.setAdapter(cVar2);
        int i12 = i;
        if (i12 == 1) {
            eVar = this;
            C2041a aVar4 = eVar.f6509n;
            new C0951ai().mo5068a((RecyclerView) eVar.f6511p);
            aVar4.mo8264a((C2047a) new C2047a() {
                /* renamed from: a */
                public void mo8274a(int i) {
                    if (C2050e.this.f6510o != null) {
                        C2050e.this.f6510o.mo8223a(i);
                    }
                }
            });
            eVar.f6510o = new C2025e(getContext(), eVar.f7125c.mo7120a(), eVar.f6508m.size());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f6501f);
            layoutParams.setMargins(0, f6503h, 0, 0);
            eVar.f6510o.setLayoutParams(layoutParams);
        } else {
            eVar = this;
        }
        eVar.f6506k.addView(eVar.f6511p);
        if (eVar.f6510o != null) {
            eVar.f6506k.addView(eVar.f6510o);
        }
        eVar.mo8643a(eVar.f6506k, false, i12);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        C1600k kVar = (C1600k) intent.getSerializableExtra("ad_data_bundle");
        super.mo8644a(audienceNetworkActivity, kVar);
        this.f6507l = kVar.mo7189c();
        this.f6514s = kVar.mo7192f();
        this.f6515t = kVar.mo7193g();
        List d = kVar.mo7190d();
        this.f6508m = new ArrayList(d.size());
        for (int i = 0; i < d.size(); i++) {
            this.f6508m.add(new C2045b(i, d.size(), (C1601l) d.get(i)));
        }
        mo8288a(audienceNetworkActivity.getResources().getConfiguration().orientation, bundle);
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
        if (this.f6509n != null) {
            this.f6509n.mo8263a(bundle);
        }
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        if (this.f6509n != null) {
            this.f6509n.mo8262a();
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f6509n.mo8265b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        mo7270a(bundle);
        mo8287a();
        mo8288a(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.f6507l)) {
            HashMap hashMap = new HashMap();
            this.f6512q.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f6504i.mo8743e()));
            this.f7123a.mo7699l(this.f6507l, hashMap);
        }
        mo8287a();
        this.f6512q.mo8782c();
        this.f6512q = null;
        this.f6513r = null;
        this.f6508m = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6504i.mo8738a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
