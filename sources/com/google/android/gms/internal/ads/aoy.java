package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class aoy extends aiz implements aow {
    aoy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: a */
    public final void mo14529a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14530a(int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        mo14354b(2, v_);
    }

    /* renamed from: b */
    public final void mo14531b() throws RemoteException {
        mo14354b(3, mo14355v_());
    }

    /* renamed from: c */
    public final void mo14532c() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: d */
    public final void mo14533d() throws RemoteException {
        mo14354b(5, mo14355v_());
    }

    /* renamed from: e */
    public final void mo14534e() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: f */
    public final void mo14535f() throws RemoteException {
        mo14354b(7, mo14355v_());
    }
}
