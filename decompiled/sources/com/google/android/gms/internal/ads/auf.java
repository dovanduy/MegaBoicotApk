package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class auf extends aiz implements aud {
    auf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo14739a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<auh> mo14740b() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        ArrayList b = ajb.m14219b(a);
        a.recycle();
        return b;
    }
}
