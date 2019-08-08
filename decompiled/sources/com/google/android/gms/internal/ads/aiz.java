package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class aiz implements IInterface {

    /* renamed from: a */
    private final IBinder f11172a;

    /* renamed from: b */
    private final String f11173b;

    protected aiz(IBinder iBinder, String str) {
        this.f11172a = iBinder;
        this.f11173b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14352a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f11172a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11172a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14354b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11172a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v_ */
    public final Parcel mo14355v_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11173b);
        return obtain;
    }
}
