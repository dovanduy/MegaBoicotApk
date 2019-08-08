package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.C3165a;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.gk */
public final class C3825gk implements C3165a {

    /* renamed from: a */
    private final C3810fw f13141a;

    public C3825gk(C3810fw fwVar) {
        this.f13141a = fwVar;
    }

    /* renamed from: a */
    public final String mo12834a() {
        if (this.f13141a == null) {
            return null;
        }
        try {
            return this.f13141a.mo15307a();
        } catch (RemoteException e) {
            C3987mk.m17432c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    /* renamed from: b */
    public final int mo12835b() {
        if (this.f13141a == null) {
            return 0;
        }
        try {
            return this.f13141a.mo15308b();
        } catch (RemoteException e) {
            C3987mk.m17432c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
