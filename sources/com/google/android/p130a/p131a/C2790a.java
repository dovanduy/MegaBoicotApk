package com.google.android.p130a.p131a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a.a */
/* compiled from: IGetInstallReferrerService */
public interface C2790a extends IInterface {

    /* renamed from: com.google.android.a.a.a$a */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C2791a extends Binder implements C2790a {

        /* renamed from: com.google.android.a.a.a$a$a */
        /* compiled from: IGetInstallReferrerService */
        private static class C2792a implements C2790a {

            /* renamed from: a */
            private IBinder f8625a;

            C2792a(IBinder iBinder) {
                this.f8625a = iBinder;
            }

            public IBinder asBinder() {
                return this.f8625a;
            }

            /* renamed from: a */
            public Bundle mo9680a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8625a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C2790a m10570a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2790a)) {
                return new C2792a(iBinder);
            }
            return (C2790a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                Bundle a = mo9680a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bundle mo9680a(Bundle bundle) throws RemoteException;
}
