package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

public final class auj extends aiz implements auh {
    auj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final C3235a mo14753a() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo14754b() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        Uri uri = (Uri) ajb.m14214a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo14755c() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
