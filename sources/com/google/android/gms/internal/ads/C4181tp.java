package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tp */
public final class C4181tp {

    /* renamed from: a */
    private C4300xc f14079a;

    private C4181tp(C4300xc xcVar) {
        this.f14079a = xcVar;
    }

    /* renamed from: a */
    static final C4181tp m18188a(C4300xc xcVar) throws GeneralSecurityException {
        if (xcVar != null && xcVar.mo16185c() > 0) {
            return new C4181tp(xcVar);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4300xc mo16084a() {
        return this.f14079a;
    }

    public final String toString() {
        return C4189tx.m18212a(this.f14079a).toString();
    }
}
