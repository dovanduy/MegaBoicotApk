package com.google.android.gms.common.internal.p141a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p145b.C4410a;
import com.google.android.gms.internal.p145b.C4412c;

/* renamed from: com.google.android.gms.common.internal.a.n */
public final class C3439n extends C4410a implements C3438m {
    C3439n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo13481a(C3436k kVar) throws RemoteException {
        Parcel a = mo16307a();
        C4412c.m18837a(a, (IInterface) kVar);
        mo16311c(1, a);
    }
}
