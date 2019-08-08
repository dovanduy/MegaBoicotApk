package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class apb extends aiz implements aoz {
    apb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: a */
    public final String mo12631a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12632a(zzjj zzjj) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjj);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo12633a(zzjj zzjj, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeInt(i);
        mo14354b(5, v_);
    }

    /* renamed from: b */
    public final String mo12634b() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final boolean mo12635c() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }
}
