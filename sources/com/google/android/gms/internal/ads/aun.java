package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

public abstract class aun extends aja implements aum {
    public aun() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public static aum m15369a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof aum ? (aum) queryLocalInterface : new auo(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo14652a(parcel.readString(), C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 2:
                C3235a a = mo14648a(parcel.readString());
                parcel2.writeNoException();
                ajb.m14215a(parcel2, (IInterface) a);
                break;
            case 3:
                mo14650a(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 4:
                mo14649a();
                break;
            case 5:
                mo14651a(C3236a.m11572a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                mo14653b(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
