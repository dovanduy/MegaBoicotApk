package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3471b;

final class ama implements C3471b {

    /* renamed from: a */
    private final /* synthetic */ alw f11399a;

    ama(alw alw) {
        this.f11399a = alw;
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        synchronized (this.f11399a.f11390b) {
            this.f11399a.f11393e = null;
            if (this.f11399a.f11391c != null) {
                this.f11399a.f11391c = null;
            }
            this.f11399a.f11390b.notifyAll();
        }
    }
}
