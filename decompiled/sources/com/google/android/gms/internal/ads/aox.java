package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class aox extends aja implements aow {
    public aox() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo14529a();
                break;
            case 2:
                mo14530a(parcel.readInt());
                break;
            case 3:
                mo14531b();
                break;
            case 4:
                mo14532c();
                break;
            case 5:
                mo14533d();
                break;
            case 6:
                mo14534e();
                break;
            case 7:
                mo14535f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
