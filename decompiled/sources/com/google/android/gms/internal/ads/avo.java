package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class avo extends aiz implements avl {
    avo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo14888a(ava ava) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) ava);
        mo14354b(1, v_);
    }
}
