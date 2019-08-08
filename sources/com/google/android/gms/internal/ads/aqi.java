package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class aqi extends aja implements aqh {
    public aqi() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo14576a();
                break;
            case 2:
                mo14578b();
                break;
            case 3:
                mo14579c();
                break;
            case 4:
                mo14580d();
                break;
            case 5:
                mo14577a(ajb.m14218a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
