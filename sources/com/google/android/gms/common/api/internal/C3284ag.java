package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C4910c;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ag */
final class C3284ag extends C4910c {

    /* renamed from: a */
    private final WeakReference<C3389z> f9537a;

    C3284ag(C3389z zVar) {
        this.f9537a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public final void mo13183a(zaj zaj) {
        C3389z zVar = (C3389z) this.f9537a.get();
        if (zVar != null) {
            zVar.f9809a.mo13211a((C3299av) new C3285ah(this, zVar, zVar, zaj));
        }
    }
}
