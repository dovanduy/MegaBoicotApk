package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.co */
final class C3350co implements C3314bi {

    /* renamed from: a */
    private final /* synthetic */ C3348cm f9699a;

    private C3350co(C3348cm cmVar) {
        this.f9699a = cmVar;
    }

    /* renamed from: a */
    public final void mo13194a(Bundle bundle) {
        this.f9699a.f9696m.lock();
        try {
            this.f9699a.m11935a(bundle);
            this.f9699a.f9693j = ConnectionResult.f9434a;
            this.f9699a.m11947e();
        } finally {
            this.f9699a.f9696m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13195a(ConnectionResult connectionResult) {
        this.f9699a.f9696m.lock();
        try {
            this.f9699a.f9693j = connectionResult;
            this.f9699a.m11947e();
        } finally {
            this.f9699a.f9696m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13193a(int i, boolean z) {
        this.f9699a.f9696m.lock();
        try {
            if (!this.f9699a.f9695l && this.f9699a.f9694k != null) {
                if (this.f9699a.f9694k.mo13042b()) {
                    this.f9699a.f9695l = true;
                    this.f9699a.f9688e.onConnectionSuspended(i);
                    this.f9699a.f9696m.unlock();
                    return;
                }
            }
            this.f9699a.f9695l = false;
            this.f9699a.m11934a(i, z);
        } finally {
            this.f9699a.f9696m.unlock();
        }
    }

    /* synthetic */ C3350co(C3348cm cmVar, C3349cn cnVar) {
        this(cmVar);
    }
}
