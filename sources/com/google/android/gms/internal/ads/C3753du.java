package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.du */
public abstract class C3753du extends aja implements C3752dt {
    public C3753du() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo15245a((zzaej) ajb.m14214a(parcel, zzaej.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
