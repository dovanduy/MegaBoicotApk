package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.internal.ads.s */
public abstract class C4138s extends aja implements C4111r {
    public C4138s() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public static C4111r m18029a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof C4111r ? (C4111r) queryLocalInterface : new C4165t(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo12663a((Bundle) ajb.m14214a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo12672f();
                break;
            case 3:
                mo12673g();
                break;
            case 4:
                mo12674h();
                break;
            case 5:
                mo12675i();
                break;
            case 6:
                Bundle bundle = (Bundle) ajb.m14214a(parcel, Bundle.CREATOR);
                mo12668b(bundle);
                parcel2.writeNoException();
                ajb.m14220b(parcel2, bundle);
                break;
            case 7:
                mo12676j();
                break;
            case 8:
                mo12677k();
                break;
            case 9:
                mo12678l();
                break;
            case 10:
                mo12670d();
                break;
            case 11:
                boolean e = mo12671e();
                parcel2.writeNoException();
                ajb.m14217a(parcel2, e);
                break;
            case 12:
                mo12662a(parcel.readInt(), parcel.readInt(), (Intent) ajb.m14214a(parcel, Intent.CREATOR));
                break;
            case 13:
                mo12665a(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
