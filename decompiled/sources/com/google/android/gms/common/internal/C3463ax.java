package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4419c;
import com.google.android.gms.p137b.C3235a;

/* renamed from: com.google.android.gms.common.internal.ax */
public final class C3463ax extends C4417a implements C3461av {
    C3463ax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo13525a(zzk zzk, C3235a aVar) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18846a(c, (Parcelable) zzk);
        C4419c.m18845a(c, (IInterface) aVar);
        Parcel a = mo16314a(5, c);
        boolean a2 = C4419c.m18848a(a);
        a.recycle();
        return a2;
    }
}
