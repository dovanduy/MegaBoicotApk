package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3471b;

final class awz implements C3471b {

    /* renamed from: a */
    private final /* synthetic */ C4019np f12336a;

    /* renamed from: b */
    private final /* synthetic */ awu f12337b;

    awz(awu awu, C4019np npVar) {
        this.f12337b = awu;
        this.f12336a = npVar;
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        synchronized (this.f12337b.f12325d) {
            this.f12336a.mo15685a(new RuntimeException("Connection failed."));
        }
    }
}
