package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.common.internal.at */
public final class C3459at extends C4417a implements C3457ar {
    C3459at(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final C3235a mo13519a() throws RemoteException {
        Parcel a = mo16314a(1, mo16317c());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo13520b() throws RemoteException {
        Parcel a = mo16314a(2, mo16317c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
