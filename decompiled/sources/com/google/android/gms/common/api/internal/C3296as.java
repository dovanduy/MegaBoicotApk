package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.as */
final class C3296as extends C3312bg {

    /* renamed from: a */
    private WeakReference<C3289al> f9579a;

    C3296as(C3289al alVar) {
        this.f9579a = new WeakReference<>(alVar);
    }

    /* renamed from: a */
    public final void mo13206a() {
        C3289al alVar = (C3289al) this.f9579a.get();
        if (alVar != null) {
            alVar.m11742p();
        }
    }
}
