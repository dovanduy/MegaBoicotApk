package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public abstract class aui extends aja implements auh {
    public aui() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static auh m15356a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof auh ? (auh) queryLocalInterface : new auj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C3235a a = mo14753a();
                parcel2.writeNoException();
                ajb.m14215a(parcel2, (IInterface) a);
                break;
            case 2:
                Uri b = mo14754b();
                parcel2.writeNoException();
                ajb.m14220b(parcel2, b);
                break;
            case 3:
                double c = mo14755c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                break;
            default:
                return false;
        }
        return true;
    }
}
