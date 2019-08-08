package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

public final class auo extends aiz implements aum {
    auo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final C3235a mo14648a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(2, v_);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo14649a() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14650a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo14651a(C3235a aVar, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeInt(i);
        mo14354b(5, v_);
    }

    /* renamed from: a */
    public final void mo14652a(String str, C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(1, v_);
    }

    /* renamed from: b */
    public final void mo14653b(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(6, v_);
    }
}
