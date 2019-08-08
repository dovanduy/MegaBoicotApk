package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class aps extends aiz implements apq {
    aps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo14545a(String str, String str2) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        v_.writeString(str2);
        mo14354b(1, v_);
    }
}
