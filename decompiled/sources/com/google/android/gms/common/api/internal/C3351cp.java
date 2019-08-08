package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cp */
final class C3351cp implements C3314bi {

    /* renamed from: a */
    private final /* synthetic */ C3348cm f9700a;

    private C3351cp(C3348cm cmVar) {
        this.f9700a = cmVar;
    }

    /* renamed from: a */
    public final void mo13194a(Bundle bundle) {
        this.f9700a.f9696m.lock();
        try {
            this.f9700a.f9694k = ConnectionResult.f9434a;
            this.f9700a.m11947e();
        } finally {
            this.f9700a.f9696m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13195a(ConnectionResult connectionResult) {
        this.f9700a.f9696m.lock();
        try {
            this.f9700a.f9694k = connectionResult;
            this.f9700a.m11947e();
        } finally {
            this.f9700a.f9696m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13193a(int i, boolean z) {
        this.f9700a.f9696m.lock();
        try {
            if (this.f9700a.f9695l) {
                this.f9700a.f9695l = false;
                this.f9700a.m11934a(i, z);
                return;
            }
            this.f9700a.f9695l = true;
            this.f9700a.f9687d.onConnectionSuspended(i);
            this.f9700a.f9696m.unlock();
        } finally {
            this.f9700a.f9696m.unlock();
        }
    }

    /* synthetic */ C3351cp(C3348cm cmVar, C3349cn cnVar) {
        this(cmVar);
    }
}
