package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class bch extends aja implements bcg {
    public bch() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static bcg m16067a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof bcg ? (bcg) queryLocalInterface : new bci(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        bcj bcj;
        switch (i) {
            case 1:
                mo15056a();
                break;
            case 2:
                mo15064b();
                break;
            case 3:
                mo15057a(parcel.readInt());
                break;
            case 4:
                mo15065c();
                break;
            case 5:
                mo15066d();
                break;
            case 6:
                mo15067e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bcj = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    bcj = queryLocalInterface instanceof bcj ? (bcj) queryLocalInterface : new bcl(readStrongBinder);
                }
                mo15061a(bcj);
                break;
            case 8:
                mo15068f();
                break;
            case 9:
                mo15063a(parcel.readString(), parcel.readString());
                break;
            case 10:
                mo15058a(avf.m15484a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                mo15069g();
                break;
            case 12:
                mo15062a(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
