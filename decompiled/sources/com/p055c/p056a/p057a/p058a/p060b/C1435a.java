package com.p055c.p056a.p057a.p058a.p060b;

import com.p055c.p056a.p057a.p058a.p064e.C1465e;

/* renamed from: com.c.a.a.a.b.a */
public final class C1435a {

    /* renamed from: a */
    private final C1444i f4374a;

    private C1435a(C1444i iVar) {
        this.f4374a = iVar;
    }

    /* renamed from: a */
    public static C1435a m5917a(C1437b bVar) {
        C1444i iVar = (C1444i) bVar;
        C1465e.m6070a((Object) bVar, "AdSession is null");
        C1465e.m6075d(iVar);
        C1465e.m6073b(iVar);
        C1435a aVar = new C1435a(iVar);
        iVar.mo6507f().mo6563a(aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo6473a() {
        C1465e.m6073b(this.f4374a);
        C1465e.m6077f(this.f4374a);
        if (!this.f4374a.mo6510i()) {
            try {
                this.f4374a.mo6484a();
            } catch (Exception unused) {
            }
        }
        if (this.f4374a.mo6510i()) {
            this.f4374a.mo6506e();
        }
    }
}
