package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class aqj extends aiz implements aqh {
    aqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: a */
    public final void mo14576a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14577a(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(5, v_);
    }

    /* renamed from: b */
    public final void mo14578b() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: c */
    public final void mo14579c() throws RemoteException {
        mo14354b(3, mo14355v_());
    }

    /* renamed from: d */
    public final void mo14580d() throws RemoteException {
        mo14354b(4, mo14355v_());
    }
}
