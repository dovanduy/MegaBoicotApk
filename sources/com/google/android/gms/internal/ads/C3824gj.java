package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gj */
public final class C3824gj extends aiz implements C3822gh {
    C3824gj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo14937a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14938a(int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        mo14354b(7, v_);
    }

    /* renamed from: a */
    public final void mo14939a(C3810fw fwVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) fwVar);
        mo14354b(5, v_);
    }

    /* renamed from: b */
    public final void mo14940b() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: c */
    public final void mo14941c() throws RemoteException {
        mo14354b(3, mo14355v_());
    }

    /* renamed from: d */
    public final void mo14942d() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: e */
    public final void mo14943e() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: f */
    public final void mo14944f() throws RemoteException {
        mo14354b(8, mo14355v_());
    }
}
