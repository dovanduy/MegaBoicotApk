package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4418b;
import com.google.android.gms.internal.p146c.C4419c;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C3498o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C3499a extends C4418b implements C3498o {
        public C3499a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo13521a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    mo13523a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C4419c.m18844a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo13522a(parcel.readInt(), (Bundle) C4419c.m18844a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    mo13524a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C4419c.m18844a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo13522a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13523a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13524a(int i, IBinder iBinder, zzb zzb) throws RemoteException;
}
