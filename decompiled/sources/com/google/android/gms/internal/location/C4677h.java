package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.h */
public final class C4677h extends C4654a implements C4675f {
    C4677h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final void mo16920a(zzad zzad) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) zzad);
        mo16908b(1, a);
    }
}
