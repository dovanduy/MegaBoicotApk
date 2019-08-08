package com.facebook.ads.internal.view.component.p102a;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.component.C1983a.C1987a;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.p101c.C1980d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.n */
public class C2020n extends LinearLayout {

    /* renamed from: a */
    public static final int f6371a = ((int) (C2342x.f7369b * 275.0f));

    /* renamed from: b */
    private static final int f6372b = ((int) (C2342x.f7369b * 56.0f));

    /* renamed from: c */
    private static final int f6373c = ((int) (C2342x.f7369b * 4.0f));

    /* renamed from: d */
    private static final int f6374d = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: e */
    private static final int f6375e = ((int) (C2342x.f7369b * 16.0f));

    /* renamed from: f */
    private static final int f6376f = ((int) (C2342x.f7369b * 20.0f));

    /* renamed from: g */
    private final C2030j f6377g;

    /* renamed from: h */
    private final C2026f f6378h;

    /* renamed from: i */
    private C2019m f6379i;

    public C2020n(C2006e eVar, C1597h hVar, C1987a aVar) {
        C1987a aVar2 = aVar;
        super(eVar.mo8180a());
        setOrientation(1);
        setGravity(17);
        this.f6378h = new C2026f(eVar.mo8180a());
        this.f6378h.setFullCircleCorners(true);
        setupIconView(eVar);
        LayoutParams layoutParams = new LayoutParams(f6372b, f6372b);
        addView(this.f6378h, layoutParams);
        layoutParams.bottomMargin = f6373c;
        C2030j jVar = new C2030j(getContext(), hVar, true, true, false);
        this.f6377g = jVar;
        C2342x.m9081a((View) this.f6377g);
        this.f6377g.setTitleGravity(17);
        this.f6377g.setDescriptionGravity(17);
        this.f6377g.mo8235a(true, 17);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.setMargins(f6375e, 0, f6375e, f6373c);
        addView(this.f6377g, layoutParams2);
        C2342x.m9081a((View) this.f6377g);
        LayoutParams layoutParams3 = new LayoutParams(-2, -2);
        layoutParams3.topMargin = f6376f;
        layoutParams3.bottomMargin = f6373c;
        if (eVar.mo8190k() == 1) {
            this.f6379i = new C2019m(eVar, ((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7197b().mo7179b(), hVar, aVar2);
            addView(this.f6379i, layoutParams3);
            return;
        }
        C2006e eVar2 = eVar;
        C1597h hVar2 = new C1597h();
        hVar2.mo7171a(654311423);
        C1983a aVar3 = new C1983a(eVar.mo8180a(), true, false, "com.facebook.ads.interstitial.clicked", hVar2, eVar.mo8181b(), eVar.mo8182c(), eVar.mo8184e(), eVar.mo8185f());
        aVar3.mo8131a(((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7197b(), eVar.mo8186g().mo7189c(), (Map<String, String>) new HashMap<String,String>(), aVar2);
        aVar3.setPadding(f6374d, f6373c, f6374d, f6373c);
        aVar3.setBackgroundColor(0);
        aVar3.setTextColor(-1);
        aVar3.setTypeface(Typeface.defaultFromStyle(1));
        addView(aVar3, layoutParams3);
    }

    private void setupIconView(C2006e eVar) {
        C1980d dVar = new C1980d((ImageView) this.f6378h);
        dVar.mo8115a(f6372b, f6372b);
        dVar.mo8118a(eVar.mo8186g().mo7185a().mo7201b());
    }

    /* renamed from: a */
    public void mo8212a(String str, String str2, String str3, boolean z, boolean z2) {
        this.f6377g.mo8234a(str, str2, str3, z, z2);
    }

    public C2019m getSwipeUpCtaButton() {
        return this.f6379i;
    }
}
