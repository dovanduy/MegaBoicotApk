package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bcl extends aiz implements bcj {
    bcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo15075a() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
