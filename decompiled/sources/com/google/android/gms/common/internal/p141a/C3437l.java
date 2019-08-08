package com.google.android.gms.common.internal.p141a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p145b.C4411b;

/* renamed from: com.google.android.gms.common.internal.a.l */
public abstract class C3437l extends C4411b implements C3436k {
    public C3437l() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13342a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo13479a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
