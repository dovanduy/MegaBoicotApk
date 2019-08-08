package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a.C3236a;

public abstract class aqa extends aja implements apz {
    public aqa() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo12698a();
                break;
            case 2:
                mo12699a(parcel.readFloat());
                break;
            case 3:
                mo12702a(parcel.readString());
                break;
            case 4:
                mo12704a(ajb.m14218a(parcel));
                break;
            case 5:
                mo12700a(C3236a.m11572a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                mo12703a(parcel.readString(), C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 7:
                float b = mo12705b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                break;
            case 8:
                boolean c = mo12706c();
                parcel2.writeNoException();
                ajb.m14217a(parcel2, c);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
