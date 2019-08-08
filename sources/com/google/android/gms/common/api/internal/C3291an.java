package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3266f.C3268b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.an */
final class C3291an implements C3268b {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f9569a;

    /* renamed from: b */
    private final /* synthetic */ C3378o f9570b;

    /* renamed from: c */
    private final /* synthetic */ C3289al f9571c;

    C3291an(C3289al alVar, AtomicReference atomicReference, C3378o oVar) {
        this.f9571c = alVar;
        this.f9569a = atomicReference;
        this.f9570b = oVar;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.f9571c.m11734a((C3266f) this.f9569a.get(), this.f9570b, true);
    }
}
