package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class apy extends aiz implements apw {
    apy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: a */
    public final long mo14554a() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
