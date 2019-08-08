package android.support.p017v4.p025os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.b */
/* compiled from: IResultReceiver */
public interface C0537b extends IInterface {

    /* renamed from: android.support.v4.os.b$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0538a extends Binder implements C0537b {

        /* renamed from: android.support.v4.os.b$a$a */
        /* compiled from: IResultReceiver */
        private static class C0539a implements C0537b {

            /* renamed from: a */
            private IBinder f1309a;

            C0539a(IBinder iBinder) {
                this.f1309a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1309a;
            }

            /* renamed from: a */
            public void mo1835a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1309a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0538a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C0537b m2064a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0537b)) {
                return new C0539a(iBinder);
            }
            return (C0537b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo1835a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo1835a(int i, Bundle bundle) throws RemoteException;
}
