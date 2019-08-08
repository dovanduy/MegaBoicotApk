package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tf */
public final class C4171tf extends aiz implements C4170te {
    C4171tf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzatv mo16070a(zzatt zzatt) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzatt);
        Parcel a = mo14352a(1, v_);
        zzatv zzatv = (zzatv) ajb.m14214a(a, zzatv.CREATOR);
        a.recycle();
        return zzatv;
    }
}
