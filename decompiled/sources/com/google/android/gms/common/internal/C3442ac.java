package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3469d.C3471b;

/* renamed from: com.google.android.gms.common.internal.ac */
final class C3442ac implements C3471b {

    /* renamed from: a */
    private final /* synthetic */ C3269c f9960a;

    C3442ac(C3269c cVar) {
        this.f9960a = cVar;
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        this.f9960a.onConnectionFailed(connectionResult);
    }
}
