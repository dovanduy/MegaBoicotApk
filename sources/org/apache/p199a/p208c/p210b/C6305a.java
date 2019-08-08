package org.apache.p199a.p208c.p210b;

/* renamed from: org.apache.a.c.b.a */
/* compiled from: BasicRouteDirector */
public class C6305a implements C6307c {
    /* renamed from: a */
    public int mo22483a(C6309e eVar, C6309e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        } else if (eVar2 == null || eVar2.mo22489c() < 1) {
            return mo22482a(eVar);
        } else {
            if (eVar.mo22489c() > 1) {
                return mo22485c(eVar, eVar2);
            }
            return mo22484b(eVar, eVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22482a(C6309e eVar) {
        return eVar.mo22489c() > 1 ? 2 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22484b(C6309e eVar, C6309e eVar2) {
        if (eVar2.mo22489c() > 1 || !eVar.mo22486a().equals(eVar2.mo22486a()) || eVar.mo22495g() != eVar2.mo22495g()) {
            return -1;
        }
        if (eVar.mo22488b() == null || eVar.mo22488b().equals(eVar2.mo22488b())) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo22485c(C6309e eVar, C6309e eVar2) {
        if (eVar2.mo22489c() <= 1 || !eVar.mo22486a().equals(eVar2.mo22486a())) {
            return -1;
        }
        int c = eVar.mo22489c();
        int c2 = eVar2.mo22489c();
        if (c < c2) {
            return -1;
        }
        for (int i = 0; i < c2 - 1; i++) {
            if (!eVar.mo22487a(i).equals(eVar2.mo22487a(i))) {
                return -1;
            }
        }
        if (c > c2) {
            return 4;
        }
        if ((eVar2.mo22492e() && !eVar.mo22492e()) || (eVar2.mo22494f() && !eVar.mo22494f())) {
            return -1;
        }
        if (eVar.mo22492e() && !eVar2.mo22492e()) {
            return 3;
        }
        if (eVar.mo22494f() && !eVar2.mo22494f()) {
            return 5;
        }
        if (eVar.mo22495g() != eVar2.mo22495g()) {
            return -1;
        }
        return 0;
    }
}
