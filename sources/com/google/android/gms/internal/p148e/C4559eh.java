package com.google.android.gms.internal.p148e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.e.eh */
public final class C4559eh extends C4434ab implements C4497cf {
    C4559eh(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo16565a(Bundle bundle) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) bundle);
        Parcel a2 = mo16332a(1, a);
        Bundle bundle2 = (Bundle) C4442aj.m18887a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
