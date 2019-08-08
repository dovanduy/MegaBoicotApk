package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.ad */
final class C3281ad extends C3299av {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f9532a;

    /* renamed from: b */
    private final /* synthetic */ C3280ac f9533b;

    C3281ad(C3280ac acVar, C3297at atVar, ConnectionResult connectionResult) {
        this.f9533b = acVar;
        this.f9532a = connectionResult;
        super(atVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13182a() {
        this.f9533b.f9530a.m12183b(this.f9532a);
    }
}
