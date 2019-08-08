package com.google.android.gms.internal.p148e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.e.ab */
public class C4434ab implements IInterface {

    /* renamed from: a */
    private final IBinder f14636a;

    /* renamed from: b */
    private final String f14637b;

    protected C4434ab(IBinder iBinder, String str) {
        this.f14636a = iBinder;
        this.f14637b = str;
    }

    public IBinder asBinder() {
        return this.f14636a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16331a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14637b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16332a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14636a.transact(i, parcel, parcel, 0);
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
    public final void mo16334b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14636a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
