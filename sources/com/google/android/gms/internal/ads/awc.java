package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class awc extends aiz implements awb {
    awc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo14918a() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14919a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(1, v_);
    }
}
