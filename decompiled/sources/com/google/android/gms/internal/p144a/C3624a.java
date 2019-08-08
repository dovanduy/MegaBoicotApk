package com.google.android.gms.internal.p144a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.a */
public class C3624a implements IInterface {

    /* renamed from: a */
    private final IBinder f10269a;

    /* renamed from: b */
    private final String f10270b;

    protected C3624a(IBinder iBinder, String str) {
        this.f10269a = iBinder;
        this.f10270b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13756a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f10269a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10269a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w_ */
    public final Parcel mo13758w_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10270b);
        return obtain;
    }
}
