package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3235a;

public final class apl extends aiz implements apk {
    apl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo14557a(C3235a aVar, zzjn zzjn, String str, bca bca, int i, int i2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(C3415h.f9877b);
        v_.writeInt(i2);
        Parcel a = mo14352a(2, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
