package com.facebook.ads.internal.view.component.p102a;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.component.C2030j;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.c */
public abstract class C2004c extends RelativeLayout {

    /* renamed from: a */
    static final int f6311a = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: b */
    static final int f6312b = ((int) (28.0f * C2342x.f7369b));

    /* renamed from: c */
    private final C2030j f6313c;

    /* renamed from: d */
    private final C1983a f6314d;

    /* renamed from: e */
    private final C1802c f6315e;

    protected C2004c(C2006e eVar, C1597h hVar, boolean z) {
        super(eVar.mo8180a());
        this.f6315e = eVar.mo8181b();
        C1983a aVar = new C1983a(eVar.mo8180a(), mo8139d(), mo8140e(), "com.facebook.ads.interstitial.clicked", hVar, eVar.mo8181b(), eVar.mo8182c(), eVar.mo8184e(), eVar.mo8185f());
        this.f6314d = aVar;
        C2342x.m9081a((View) this.f6314d);
        C2030j jVar = new C2030j(getContext(), hVar, z, mo8172b(), mo8174c());
        this.f6313c = jVar;
        C2342x.m9081a((View) this.f6313c);
    }

    /* renamed from: a */
    public void mo8173a(C1601l lVar, String str, double d) {
        this.f6313c.mo8234a(lVar.mo7196a().mo7148b(), lVar.mo7196a().mo7149c(), null, false, !mo8144a() && d > 0.0d && d < 1.0d);
        this.f6314d.mo8130a(lVar.mo7197b(), str, new HashMap());
    }

    /* renamed from: a */
    public abstract boolean mo8144a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo8172b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo8174c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo8139d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8140e() {
        return true;
    }

    public C1802c getAdEventManager() {
        return this.f6315e;
    }

    /* access modifiers changed from: protected */
    public C1983a getCtaButton() {
        return this.f6314d;
    }

    public int getExactMediaHeightIfAvailable() {
        return 0;
    }

    public int getExactMediaWidthIfAvailable() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public C2030j getTitleDescContainer() {
        return this.f6313c;
    }
}
