package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fy */
public final class C3812fy extends aiz implements C3810fw {
    C3812fy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo15307a() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo15308b() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
