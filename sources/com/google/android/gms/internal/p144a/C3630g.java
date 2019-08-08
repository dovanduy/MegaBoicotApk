package com.google.android.gms.internal.p144a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.g */
public final class C3630g extends C3624a implements C3628e {
    C3630g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo13761a() throws RemoteException {
        Parcel a = mo13756a(1, mo13758w_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo13762a(boolean z) throws RemoteException {
        Parcel w_ = mo13758w_();
        C3626c.m12915a(w_, true);
        Parcel a = mo13756a(2, w_);
        boolean a2 = C3626c.m12916a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo13763b() throws RemoteException {
        Parcel a = mo13756a(6, mo13758w_());
        boolean a2 = C3626c.m12916a(a);
        a.recycle();
        return a2;
    }
}
