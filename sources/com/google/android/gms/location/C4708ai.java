package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4658ad;
import com.google.android.gms.internal.location.C4690u;

/* renamed from: com.google.android.gms.location.ai */
public abstract class C4708ai extends C4690u implements C4707ah {
    /* renamed from: a */
    public static C4707ah m20296a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C4707ah ? (C4707ah) queryLocalInterface : new C4709aj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16923a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo16937a((LocationResult) C4658ad.m20186a(parcel, LocationResult.CREATOR));
                break;
            case 2:
                mo16936a((LocationAvailability) C4658ad.m20186a(parcel, LocationAvailability.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
