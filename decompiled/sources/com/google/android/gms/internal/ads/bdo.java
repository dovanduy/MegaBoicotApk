package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bdo extends aiz implements bdn {
    bdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo15179a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(3, v_);
    }
}
