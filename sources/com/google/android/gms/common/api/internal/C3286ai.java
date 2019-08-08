package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;

/* renamed from: com.google.android.gms.common.api.internal.ai */
final class C3286ai implements C3268b, C3269c {

    /* renamed from: a */
    private final /* synthetic */ C3389z f9540a;

    private C3286ai(C3389z zVar) {
        this.f9540a = zVar;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.f9540a.f9819k.mo17796a(new C3284ag(this.f9540a));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f9540a.f9810b.lock();
        try {
            if (this.f9540a.m12180a(connectionResult)) {
                this.f9540a.m12196g();
                this.f9540a.m12191e();
            } else {
                this.f9540a.m12183b(connectionResult);
            }
        } finally {
            this.f9540a.f9810b.unlock();
        }
    }

    /* synthetic */ C3286ai(C3389z zVar, C3278aa aaVar) {
        this(zVar);
    }
}
