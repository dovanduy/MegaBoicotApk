package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3235a;

public final class apg extends aiz implements apf {
    apg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: a */
    public final IBinder mo14556a(C3235a aVar, String str, bca bca, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(C3415h.f9877b);
        Parcel a = mo14352a(1, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
