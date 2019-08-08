package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class amg extends aiz implements amf {
    amg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzhi mo14516a(zzhl zzhl) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzhl);
        Parcel a = mo14352a(1, v_);
        zzhi zzhi = (zzhi) ajb.m14214a(a, zzhi.CREATOR);
        a.recycle();
        return zzhi;
    }
}
