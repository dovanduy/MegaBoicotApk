package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3235a;

public final class auq extends aiz implements aup {
    auq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo14884a(C3235a aVar, C3235a aVar2, C3235a aVar3, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) aVar2);
        ajb.m14215a(v_, (IInterface) aVar3);
        v_.writeInt(C3415h.f9877b);
        Parcel a = mo14352a(1, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
