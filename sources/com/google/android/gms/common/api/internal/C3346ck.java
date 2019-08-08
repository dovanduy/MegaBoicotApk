package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.internal.ck */
public final class C3346ck implements C3268b, C3269c {

    /* renamed from: a */
    public final C3244a<?> f9681a;

    /* renamed from: b */
    private final boolean f9682b;

    /* renamed from: c */
    private C3347cl f9683c;

    public C3346ck(C3244a<?> aVar, boolean z) {
        this.f9681a = aVar;
        this.f9682b = z;
    }

    public final void onConnected(Bundle bundle) {
        m11928a();
        this.f9683c.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        m11928a();
        this.f9683c.onConnectionSuspended(i);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m11928a();
        this.f9683c.mo13210a(connectionResult, this.f9681a, this.f9682b);
    }

    /* renamed from: a */
    public final void mo13289a(C3347cl clVar) {
        this.f9683c = clVar;
    }

    /* renamed from: a */
    private final void m11928a() {
        C3513t.m12626a(this.f9683c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
