package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class bcc extends aiz implements bca {
    bcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public final bcd mo15079a(String str) throws RemoteException {
        bcd bcd;
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(1, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bcd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bcd = queryLocalInterface instanceof bcd ? (bcd) queryLocalInterface : new bcf(readStrongBinder);
        }
        a.recycle();
        return bcd;
    }

    /* renamed from: b */
    public final boolean mo15081b(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(2, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final bdp mo15082c(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(3, v_);
        bdp a2 = bdq.m16400a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
