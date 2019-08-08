package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a */
public class C4654a implements IInterface {

    /* renamed from: a */
    private final IBinder f15213a;

    /* renamed from: b */
    private final String f15214b;

    protected C4654a(IBinder iBinder, String str) {
        this.f15213a = iBinder;
        this.f15214b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo16905a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15214b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16906a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15213a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15213a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16908b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f15213a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
