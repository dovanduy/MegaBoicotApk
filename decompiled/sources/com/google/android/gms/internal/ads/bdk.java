package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.mediation.C3163l;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3718cm
public final class bdk extends bcu {

    /* renamed from: a */
    private final C3163l f12695a;

    public bdk(C3163l lVar) {
        this.f12695a = lVar;
    }

    /* renamed from: a */
    public final String mo15151a() {
        return this.f12695a.mo12801a();
    }

    /* renamed from: a */
    public final void mo15152a(C3235a aVar) {
        this.f12695a.mo12802a((View) C3238b.m11574a(aVar));
    }

    /* renamed from: a */
    public final void mo15153a(C3235a aVar, C3235a aVar2, C3235a aVar3) {
        this.f12695a.mo9639a((View) C3238b.m11574a(aVar), (HashMap) C3238b.m11574a(aVar2), (HashMap) C3238b.m11574a(aVar3));
    }

    /* renamed from: b */
    public final List mo15154b() {
        List<C2982b> b = this.f12695a.mo12810b();
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            for (C2982b bVar : b) {
                arrayList.add(new asy(bVar.mo12326a(), bVar.mo12327b(), bVar.mo12328c()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo15155b(C3235a aVar) {
        this.f12695a.mo12811b((View) C3238b.m11574a(aVar));
    }

    /* renamed from: c */
    public final String mo15156c() {
        return this.f12695a.mo12814c();
    }

    /* renamed from: d */
    public final auh mo15157d() {
        C2982b d = this.f12695a.mo12816d();
        if (d != null) {
            return new asy(d.mo12326a(), d.mo12327b(), d.mo12328c());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo15158e() {
        return this.f12695a.mo12818e();
    }

    /* renamed from: f */
    public final String mo15159f() {
        return this.f12695a.mo12820f();
    }

    /* renamed from: g */
    public final double mo15160g() {
        if (this.f12695a.mo12822g() != null) {
            return this.f12695a.mo12822g().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: h */
    public final String mo15161h() {
        return this.f12695a.mo12823h();
    }

    /* renamed from: i */
    public final String mo15162i() {
        return this.f12695a.mo12824i();
    }

    /* renamed from: j */
    public final aqe mo15163j() {
        if (this.f12695a.mo12825j() != null) {
            return this.f12695a.mo12825j().mo12373a();
        }
        return null;
    }

    /* renamed from: k */
    public final aud mo15164k() {
        return null;
    }

    /* renamed from: l */
    public final C3235a mo15165l() {
        View l = this.f12695a.mo12827l();
        if (l == null) {
            return null;
        }
        return C3238b.m11573a(l);
    }

    /* renamed from: m */
    public final C3235a mo15166m() {
        View m = this.f12695a.mo12828m();
        if (m == null) {
            return null;
        }
        return C3238b.m11573a(m);
    }

    /* renamed from: n */
    public final C3235a mo15167n() {
        Object n = this.f12695a.mo12829n();
        if (n == null) {
            return null;
        }
        return C3238b.m11573a(n);
    }

    /* renamed from: o */
    public final Bundle mo15168o() {
        return this.f12695a.mo12830o();
    }

    /* renamed from: p */
    public final boolean mo15169p() {
        return this.f12695a.mo12831p();
    }

    /* renamed from: q */
    public final boolean mo15170q() {
        return this.f12695a.mo12832q();
    }

    /* renamed from: r */
    public final void mo15171r() {
        this.f12695a.mo12833r();
    }
}
