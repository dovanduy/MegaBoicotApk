package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4654a;
import com.google.android.gms.internal.location.C4658ad;

/* renamed from: com.google.android.gms.location.am */
public final class C4712am extends C4654a implements C4710ak {
    C4712am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final void mo16939a(Location location) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) location);
        mo16908b(1, a);
    }
}
