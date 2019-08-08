package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3494m;
import com.google.android.gms.internal.p145b.C4410a;
import com.google.android.gms.internal.p145b.C4412c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C4914g extends C4410a implements C4913f {
    C4914g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo17804a(int i) throws RemoteException {
        Parcel a = mo16307a();
        a.writeInt(i);
        mo16310b(7, a);
    }

    /* renamed from: a */
    public final void mo17805a(C3494m mVar, int i, boolean z) throws RemoteException {
        Parcel a = mo16307a();
        C4412c.m18837a(a, (IInterface) mVar);
        a.writeInt(i);
        C4412c.m18839a(a, z);
        mo16310b(9, a);
    }

    /* renamed from: a */
    public final void mo17806a(zah zah, C4911d dVar) throws RemoteException {
        Parcel a = mo16307a();
        C4412c.m18838a(a, (Parcelable) zah);
        C4412c.m18837a(a, (IInterface) dVar);
        mo16310b(12, a);
    }
}
