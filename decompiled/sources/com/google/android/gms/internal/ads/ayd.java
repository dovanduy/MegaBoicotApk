package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.Random;

final class ayd extends aox {

    /* renamed from: a */
    private final aow f12379a;

    ayd(aow aow) {
        this.f12379a = aow;
    }

    /* renamed from: a */
    public final void mo14529a() throws RemoteException {
        if (ayn.m15777a()) {
            int intValue = ((Integer) aoq.m14620f().mo14695a(aru.f11856bb)).intValue();
            int intValue2 = ((Integer) aoq.m14620f().mo14695a(aru.f11857bc)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                C3025aw.m10930r().mo14957a();
            } else {
                C3909jn.f13411a.postDelayed(aye.f12380a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f12379a.mo14529a();
    }

    /* renamed from: a */
    public final void mo14530a(int i) throws RemoteException {
        this.f12379a.mo14530a(i);
    }

    /* renamed from: b */
    public final void mo14531b() throws RemoteException {
        this.f12379a.mo14531b();
    }

    /* renamed from: c */
    public final void mo14532c() throws RemoteException {
        this.f12379a.mo14532c();
    }

    /* renamed from: d */
    public final void mo14533d() throws RemoteException {
        this.f12379a.mo14533d();
    }

    /* renamed from: e */
    public final void mo14534e() throws RemoteException {
        this.f12379a.mo14534e();
    }

    /* renamed from: f */
    public final void mo14535f() throws RemoteException {
        this.f12379a.mo14535f();
    }
}
