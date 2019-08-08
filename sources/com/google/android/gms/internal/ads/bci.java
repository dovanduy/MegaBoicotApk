package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class bci extends aiz implements bcg {
    bci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo15056a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo15057a(int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo15058a(ave ave, String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) ave);
        v_.writeString(str);
        mo14354b(10, v_);
    }

    /* renamed from: a */
    public final void mo15061a(bcj bcj) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) bcj);
        mo14354b(7, v_);
    }

    /* renamed from: a */
    public final void mo15062a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(12, v_);
    }

    /* renamed from: a */
    public final void mo15063a(String str, String str2) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        v_.writeString(str2);
        mo14354b(9, v_);
    }

    /* renamed from: b */
    public final void mo15064b() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: c */
    public final void mo15065c() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: d */
    public final void mo15066d() throws RemoteException {
        mo14354b(5, mo14355v_());
    }

    /* renamed from: e */
    public final void mo15067e() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: f */
    public final void mo15068f() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: g */
    public final void mo15069g() throws RemoteException {
        mo14354b(11, mo14355v_());
    }
}
