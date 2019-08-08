package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3270g.C3271a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.s */
final class C3382s implements C3271a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f9798a;

    /* renamed from: b */
    private final /* synthetic */ C3381r f9799b;

    C3382s(C3381r rVar, BasePendingResult basePendingResult) {
        this.f9799b = rVar;
        this.f9798a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo13159a(Status status) {
        this.f9799b.f9796a.remove(this.f9798a);
    }
}
