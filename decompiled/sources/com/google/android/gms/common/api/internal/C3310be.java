package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.be */
final class C3310be implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f9610a;

    /* renamed from: b */
    private final /* synthetic */ C3363c f9611b;

    C3310be(C3363c cVar, ConnectionResult connectionResult) {
        this.f9611b = cVar;
        this.f9610a = connectionResult;
    }

    public final void run() {
        if (this.f9610a.mo13042b()) {
            this.f9611b.f9775f = true;
            if (this.f9611b.f9771b.mo13101j()) {
                this.f9611b.m12097a();
                return;
            }
            try {
                this.f9611b.f9771b.mo13096a(null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((C3361a) C3360d.this.f9750m.get(this.f9611b.f9772c)).onConnectionFailed(new ConnectionResult(10));
            }
        } else {
            ((C3361a) C3360d.this.f9750m.get(this.f9611b.f9772c)).onConnectionFailed(this.f9610a);
        }
    }
}
