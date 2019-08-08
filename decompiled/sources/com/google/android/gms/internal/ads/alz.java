package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C3469d.C3470a;

final class alz implements C3470a {

    /* renamed from: a */
    private final /* synthetic */ alw f11396a;

    alz(alw alw) {
        this.f11396a = alw;
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
        synchronized (this.f11396a.f11390b) {
            this.f11396a.f11393e = null;
            this.f11396a.f11390b.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo13484a(Bundle bundle) {
        synchronized (this.f11396a.f11390b) {
            try {
                if (this.f11396a.f11391c != null) {
                    this.f11396a.f11393e = this.f11396a.f11391c.mo13018e();
                }
            } catch (DeadObjectException e) {
                C3900je.m17430b("Unable to obtain a cache service instance.", e);
                this.f11396a.m14414c();
            }
            this.f11396a.f11390b.notifyAll();
        }
    }
}
