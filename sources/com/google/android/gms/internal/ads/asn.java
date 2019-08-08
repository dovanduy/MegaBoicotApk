package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public final class asn extends aiz implements asl {
    asn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo14727a() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo14728a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(3, v_);
    }

    /* renamed from: b */
    public final String mo14729b() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo14730c() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: d */
    public final void mo14731d() throws RemoteException {
        mo14354b(5, mo14355v_());
    }
}
