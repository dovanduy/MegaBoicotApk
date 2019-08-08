package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.ao */
final class C3292ao implements C3269c {

    /* renamed from: a */
    private final /* synthetic */ C3378o f9572a;

    C3292ao(C3289al alVar, C3378o oVar) {
        this.f9572a = oVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f9572a.mo13162b(new Status(8));
    }
}
