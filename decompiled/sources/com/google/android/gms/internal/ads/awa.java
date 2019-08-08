package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class awa extends aiz implements avy {
    awa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo14917a(awd awd) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) awd);
        mo14354b(1, v_);
    }
}
