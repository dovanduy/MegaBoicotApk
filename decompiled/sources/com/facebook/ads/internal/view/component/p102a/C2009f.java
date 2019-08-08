package com.facebook.ads.internal.view.component.p102a;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;

/* renamed from: com.facebook.ads.internal.view.component.a.f */
public class C2009f extends C2004c {

    /* renamed from: c */
    private static final int f6338c = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: d */
    private final C2017k f6339d;

    public C2009f(C2006e eVar, boolean z, C1597h hVar) {
        super(eVar, hVar, z);
        this.f6339d = new C2017k(eVar.mo8180a(), eVar.mo8183d());
        this.f6339d.mo8210a(eVar.mo8187h(), eVar.mo8188i(), 10, getTitleDescContainer(), z);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(f6311a, f6311a, f6311a, f6311a);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(eVar.mo8180a());
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(f6311a, 0, f6311a, 0);
        frameLayout.addView(this.f6339d, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    /* renamed from: a */
    public void mo8173a(C1601l lVar, String str, double d) {
        super.mo8173a(lVar, str, d);
        if (d > 0.0d) {
            this.f6339d.mo8208a((int) (((double) (f6338c - (f6311a * 2))) / d));
        }
    }

    /* renamed from: a */
    public boolean mo8144a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo8174c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8140e() {
        return false;
    }
}
