package com.google.android.gms.internal.p146c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.c.a */
public class C4417a implements IInterface {

    /* renamed from: a */
    private final IBinder f14612a;

    /* renamed from: b */
    private final String f14613b;

    protected C4417a(IBinder iBinder, String str) {
        this.f14612a = iBinder;
        this.f14613b = str;
    }

    public IBinder asBinder() {
        return this.f14612a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo16317c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14613b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16314a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14612a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16316b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14612a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
