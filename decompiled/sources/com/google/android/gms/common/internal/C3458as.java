package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4418b;
import com.google.android.gms.internal.p146c.C4419c;
import com.google.android.gms.p137b.C3235a;

/* renamed from: com.google.android.gms.common.internal.as */
public abstract class C3458as extends C4418b implements C3457ar {
    public C3458as() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C3457ar m12379a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C3457ar) {
            return (C3457ar) queryLocalInterface;
        }
        return new C3459at(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13521a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C3235a a = mo13519a();
                parcel2.writeNoException();
                C4419c.m18845a(parcel2, (IInterface) a);
                break;
            case 2:
                int b = mo13520b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
