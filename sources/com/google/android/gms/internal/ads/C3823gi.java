package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gi */
public abstract class C3823gi extends aja implements C3822gh {
    public C3823gi() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C3822gh m16747a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof C3822gh ? (C3822gh) queryLocalInterface : new C3824gj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C3810fw fwVar;
        switch (i) {
            case 1:
                mo14937a();
                break;
            case 2:
                mo14940b();
                break;
            case 3:
                mo14941c();
                break;
            case 4:
                mo14942d();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    fwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    fwVar = queryLocalInterface instanceof C3810fw ? (C3810fw) queryLocalInterface : new C3812fy(readStrongBinder);
                }
                mo14939a(fwVar);
                break;
            case 6:
                mo14943e();
                break;
            case 7:
                mo14938a(parcel.readInt());
                break;
            case 8:
                mo14944f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
