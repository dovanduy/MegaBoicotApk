package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.mediation.C3159h;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3718cm
public final class bdb extends bcr {

    /* renamed from: a */
    private final C3159h f12675a;

    public bdb(C3159h hVar) {
        this.f12675a = hVar;
    }

    /* renamed from: a */
    public final String mo15132a() {
        return this.f12675a.mo12788i();
    }

    /* renamed from: a */
    public final void mo15133a(C3235a aVar) {
        this.f12675a.mo12760c((View) C3238b.m11574a(aVar));
    }

    /* renamed from: a */
    public final void mo15134a(C3235a aVar, C3235a aVar2, C3235a aVar3) {
        this.f12675a.mo12752a((View) C3238b.m11574a(aVar), (HashMap) C3238b.m11574a(aVar2), (HashMap) C3238b.m11574a(aVar3));
    }

    /* renamed from: b */
    public final List mo15135b() {
        List<C2982b> j = this.f12675a.mo12789j();
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
    public final void mo15136b(C3235a aVar) {
        this.f12675a.mo9638a((View) C3238b.m11574a(aVar));
    }

    /* renamed from: c */
    public final String mo15137c() {
        return this.f12675a.mo12790k();
    }

    /* renamed from: c */
    public final void mo15138c(C3235a aVar) {
        this.f12675a.mo12756b((View) C3238b.m11574a(aVar));
    }

    /* renamed from: d */
    public final auh mo15139d() {
        C2982b l = this.f12675a.mo12791l();
        if (l != null) {
            return new asy(l.mo12326a(), l.mo12327b(), l.mo12328c());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo15140e() {
        return this.f12675a.mo12792m();
    }

    /* renamed from: f */
    public final String mo15141f() {
        return this.f12675a.mo12793n();
    }

    /* renamed from: g */
    public final void mo15142g() {
        this.f12675a.mo12762e();
    }

    /* renamed from: h */
    public final boolean mo15143h() {
        return this.f12675a.mo12755a();
    }

    /* renamed from: i */
    public final boolean mo15144i() {
        return this.f12675a.mo12758b();
    }

    /* renamed from: j */
    public final Bundle mo15145j() {
        return this.f12675a.mo12759c();
    }

    /* renamed from: k */
    public final C3235a mo15146k() {
        View d = this.f12675a.mo12761d();
        if (d == null) {
            return null;
        }
        return C3238b.m11573a(d);
    }

    /* renamed from: l */
    public final aqe mo15147l() {
        if (this.f12675a.mo12764g() != null) {
            return this.f12675a.mo12764g().mo12373a();
        }
        return null;
    }

    /* renamed from: m */
    public final aud mo15148m() {
        return null;
    }

    /* renamed from: n */
    public final C3235a mo15149n() {
        View f = this.f12675a.mo12763f();
        if (f == null) {
            return null;
        }
        return C3238b.m11573a(f);
    }

    /* renamed from: o */
    public final C3235a mo15150o() {
        return null;
    }
}
