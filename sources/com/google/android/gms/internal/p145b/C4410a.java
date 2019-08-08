package com.google.android.gms.internal.p145b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.b.a */
public class C4410a implements IInterface {

    /* renamed from: a */
    private final IBinder f14607a;

    /* renamed from: b */
    private final String f14608b;

    protected C4410a(IBinder iBinder, String str) {
        this.f14607a = iBinder;
        this.f14608b = str;
    }

    public IBinder asBinder() {
        return this.f14607a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16307a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14608b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16308a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14607a.transact(i, parcel, parcel, 0);
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
    public final void mo16310b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14607a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16311c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f14607a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
