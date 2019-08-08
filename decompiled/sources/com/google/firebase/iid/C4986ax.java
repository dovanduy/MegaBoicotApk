package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.ax */
public final class C4986ax implements C4985aw {

    /* renamed from: a */
    private final IBinder f16229a;

    C4986ax(IBinder iBinder) {
        this.f16229a = iBinder;
    }

    /* renamed from: a */
    public final void mo17935a(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f16229a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f16229a;
    }
}
