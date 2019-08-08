package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C3360d.C3361a;

/* renamed from: com.google.android.gms.common.api.internal.bb */
final class C3307bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f9606a;

    /* renamed from: b */
    private final /* synthetic */ C3361a f9607b;

    C3307bb(C3361a aVar, ConnectionResult connectionResult) {
        this.f9607b = aVar;
        this.f9606a = connectionResult;
    }

    public final void run() {
        this.f9607b.onConnectionFailed(this.f9606a);
    }
}
