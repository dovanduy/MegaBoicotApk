package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class bcb extends aja implements bca {
    public bcb() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static bca m15997a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof bca ? (bca) queryLocalInterface : new bcc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = mo15079a(parcel.readString());
                break;
            case 2:
                boolean b = mo15081b(parcel.readString());
                parcel2.writeNoException();
                ajb.m14217a(parcel2, b);
                break;
            case 3:
                iInterface = mo15082c(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        ajb.m14215a(parcel2, iInterface);
        return true;
    }
}
