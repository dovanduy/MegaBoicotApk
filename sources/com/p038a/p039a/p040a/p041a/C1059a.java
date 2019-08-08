package com.p038a.p039a.p040a.p041a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.a.a.a.a.a */
/* compiled from: StartAppSDK */
public interface C1059a extends IInterface {

    /* renamed from: com.a.a.a.a.a$a */
    /* compiled from: StartAppSDK */
    public static abstract class C1060a extends Binder implements C1059a {

        /* renamed from: com.a.a.a.a.a$a$a */
        /* compiled from: StartAppSDK */
        private static class C1061a implements C1059a {

            /* renamed from: a */
            private IBinder f3510a;

            C1061a(IBinder iBinder) {
                this.f3510a = iBinder;
            }

            public IBinder asBinder() {
                return this.f3510a;
            }

            /* renamed from: a */
            public Bundle mo5405a(Bundle bundle) {
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
                    this.f3510a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C1059a m4918a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1059a)) {
                return new C1061a(iBinder);
            }
            return (C1059a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
            if (i == 1) {
                parcel.enforceInterface(str);
                Bundle a = mo5405a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    Bundle mo5405a(Bundle bundle);
}
