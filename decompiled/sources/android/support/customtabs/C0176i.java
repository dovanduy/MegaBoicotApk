package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.C0170g.C0171a;

/* renamed from: android.support.customtabs.i */
/* compiled from: IPostMessageService */
public interface C0176i extends IInterface {

    /* renamed from: android.support.customtabs.i$a */
    /* compiled from: IPostMessageService */
    public static abstract class C0177a extends Binder implements C0176i {
        public IBinder asBinder() {
            return this;
        }

        public C0177a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        C0170g a = C0171a.m327a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo331a(a, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        C0170g a2 = C0171a.m327a(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo332a(a2, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo331a(C0170g gVar, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo332a(C0170g gVar, String str, Bundle bundle) throws RemoteException;
}
