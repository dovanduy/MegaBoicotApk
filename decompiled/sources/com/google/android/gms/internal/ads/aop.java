package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3238b;

final class aop extends C3664a<C4111r> {

    /* renamed from: a */
    private final /* synthetic */ Activity f11638a;

    /* renamed from: b */
    private final /* synthetic */ aoh f11639b;

    aop(aoh aoh, Activity activity) {
        this.f11639b = aoh;
        this.f11638a = activity;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        C4111r a = this.f11639b.f11607h.mo15860a(this.f11638a);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11638a, "ad_overlay");
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createAdOverlay(C3238b.m11573a(this.f11638a));
    }
}
