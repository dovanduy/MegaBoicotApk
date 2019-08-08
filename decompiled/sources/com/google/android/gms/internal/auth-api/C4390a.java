package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.a */
public class C4390a implements IInterface {

    /* renamed from: a */
    private final IBinder f14583a;

    /* renamed from: b */
    private final String f14584b;

    protected C4390a(IBinder iBinder, String str) {
        this.f14583a = iBinder;
        this.f14584b = str;
    }

    public IBinder asBinder() {
        return this.f14583a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16280a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14584b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16281a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14583a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
