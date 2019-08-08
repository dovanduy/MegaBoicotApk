package com.facebook.ads.internal.view.component.p102a;

import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C1983a.C1987a;
import com.facebook.ads.internal.view.p101c.C1980d;

/* renamed from: com.facebook.ads.internal.view.component.a.o */
class C2021o extends FrameLayout {

    /* renamed from: a */
    final C2020n f6380a;

    public C2021o(C2006e eVar, C1597h hVar, int i, int i2, C1987a aVar) {
        super(eVar.mo8180a());
        boolean z = true;
        if (eVar.mo8190k() == 1) {
            z = false;
        }
        new C1980d(this, 12).mo8115a(z ? C2342x.f7368a.heightPixels : i, z ? i2 : C2342x.f7368a.widthPixels).mo8118a(((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7198c().mo7133g());
        FrameLayout frameLayout = new FrameLayout(eVar.mo8180a());
        addView(frameLayout, new LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-433903825);
        FrameLayout frameLayout2 = new FrameLayout(eVar.mo8180a());
        if (!z) {
            i2 = -1;
        }
        if (z) {
            i = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i);
        layoutParams.gravity = 48;
        addView(frameLayout2, layoutParams);
        this.f6380a = new C2020n(eVar, hVar, aVar);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        frameLayout2.addView(this.f6380a, layoutParams2);
    }

    /* renamed from: a */
    public void mo8214a(String str, String str2, String str3, boolean z, boolean z2) {
        this.f6380a.mo8212a(str, str2, str3, z, z2);
    }
}
