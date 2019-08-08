package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4654a;
import com.google.android.gms.internal.location.C4658ad;

/* renamed from: com.google.android.gms.location.aj */
public final class C4709aj extends C4654a implements C4707ah {
    C4709aj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo16936a(LocationAvailability locationAvailability) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) locationAvailability);
        mo16908b(2, a);
    }

    /* renamed from: a */
    public final void mo16937a(LocationResult locationResult) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) locationResult);
        mo16908b(1, a);
    }
}
