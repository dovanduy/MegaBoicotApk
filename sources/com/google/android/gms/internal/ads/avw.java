package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a.C3236a;

public abstract class avw extends aja implements avv {
    /* renamed from: a */
    public static avv m15536a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof avv ? (avv) queryLocalInterface : new avx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo14916a(C3666api.m14711a(parcel.readStrongBinder()), C3236a.m11572a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
