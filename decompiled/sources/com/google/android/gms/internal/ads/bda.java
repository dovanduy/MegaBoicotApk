package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.mediation.C3158g;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3718cm
public final class bda extends bco {

    /* renamed from: a */
    private final C3158g f12674a;

    public bda(C3158g gVar) {
        this.f12674a = gVar;
    }

    /* renamed from: a */
    public final String mo15110a() {
        return this.f12674a.mo12774i();
    }

    /* renamed from: a */
    public final void mo15111a(C3235a aVar) {
        this.f12674a.mo12760c((View) C3238b.m11574a(aVar));
    }

    /* renamed from: a */
    public final void mo15112a(C3235a aVar, C3235a aVar2, C3235a aVar3) {
        this.f12674a.mo12752a((View) C3238b.m11574a(aVar), (HashMap) C3238b.m11574a(aVar2), (HashMap) C3238b.m11574a(aVar3));
    }

    /* renamed from: b */
    public final List mo15113b() {
        List<C2982b> j = this.f12674a.mo12775j();
        if (j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2982b bVar : j) {
            arrayList.add(new asy(bVar.mo12326a(), bVar.mo12327b(), bVar.mo12328c()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo15114b(C3235a aVar) {
        this.f12674a.mo9638a((View) C3238b.m11574a(aVar));
    }

    /* renamed from: c */
    public final String mo15115c() {
        return this.f12674a.mo12776k();
    }

    /* renamed from: c */
    public final void mo15116c(C3235a aVar) {
        this.f12674a.mo12756b((View) C3238b.m11574a(aVar));
    }

    /* renamed from: d */
    public final auh mo15117d() {
        C2982b l = this.f12674a.mo12777l();
        if (l != null) {
            return new asy(l.mo12326a(), l.mo12327b(), l.mo12328c());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo15118e() {
        return this.f12674a.mo12778m();
    }

    /* renamed from: f */
    public final double mo15119f() {
        return this.f12674a.mo12779n();
    }

    /* renamed from: g */
    public final String mo15120g() {
        return this.f12674a.mo12780o();
    }

    /* renamed from: h */
    public final String mo15121h() {
        return this.f12674a.mo12781p();
    }

    /* renamed from: i */
    public final void mo15122i() {
        this.f12674a.mo12762e();
    }

    /* renamed from: j */
    public final boolean mo15123j() {
        return this.f12674a.mo12755a();
    }

    /* renamed from: k */
    public final boolean mo15124k() {
        return this.f12674a.mo12758b();
    }

    /* renamed from: l */
    public final Bundle mo15125l() {
        return this.f12674a.mo12759c();
    }

    /* renamed from: m */
    public final aqe mo15126m() {
        if (this.f12674a.mo12764g() != null) {
            return this.f12674a.mo12764g().mo12373a();
        }
        return null;
    }

    /* renamed from: n */
    public final C3235a mo15127n() {
        View d = this.f12674a.mo12761d();
        if (d == null) {
            return null;
        }
        return C3238b.m11573a(d);
    }

    /* renamed from: o */
    public final aud mo15128o() {
        return null;
    }

    /* renamed from: p */
    public final C3235a mo15129p() {
        View f = this.f12674a.mo12763f();
        if (f == null) {
            return null;
        }
        return C3238b.m11573a(f);
    }

    /* renamed from: q */
    public final C3235a mo15130q() {
        return null;
    }
}
