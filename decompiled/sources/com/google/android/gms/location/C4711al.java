package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4658ad;
import com.google.android.gms.internal.location.C4690u;

/* renamed from: com.google.android.gms.location.al */
public abstract class C4711al extends C4690u implements C4710ak {
    public C4711al() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public static C4710ak m20301a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C4710ak ? (C4710ak) queryLocalInterface : new C4712am(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16923a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo16939a((Location) C4658ad.m20186a(parcel, Location.CREATOR));
        return true;
    }
}
