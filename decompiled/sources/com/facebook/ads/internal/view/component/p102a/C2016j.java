package com.facebook.ads.internal.view.component.p102a;

import android.content.res.Resources;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.a.j */
class C2016j extends C2004c {

    /* renamed from: c */
    private static final int f6362c = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: d */
    private final C2017k f6363d;

    /* renamed from: e */
    private int f6364e;

    public C2016j(C2006e eVar, C1597h hVar) {
        super(eVar, hVar, true);
        this.f6363d = new C2017k(eVar.mo8180a(), eVar.mo8183d());
        this.f6363d.mo8209a(eVar.mo8187h(), eVar.mo8188i());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(this.f6363d, layoutParams);
    }

    /* renamed from: a */
    public void mo8173a(C1601l lVar, String str, double d) {
        super.mo8173a(lVar, str, d);
        if (d > 0.0d) {
            int i = (int) (((double) (f6362c - (f6311a * 2))) / d);
            if (C2342x.f7368a.heightPixels - i < C2020n.f6371a) {
                i = C2342x.f7368a.heightPixels - C2020n.f6371a;
            }
            this.f6363d.mo8208a(i);
            this.f6364e = i;
        }
    }

    /* renamed from: a */
    public boolean mo8144a() {
        return true;
    }

    public int getExactMediaHeightIfAvailable() {
        return this.f6364e;
    }
}
