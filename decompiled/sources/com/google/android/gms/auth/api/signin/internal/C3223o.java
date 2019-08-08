package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.C4391b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public abstract class C3223o extends C4391b implements C3222n {
    public C3223o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13027a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo13025a();
                break;
            case 2:
                mo13026b();
                break;
            default:
                return false;
        }
        return true;
    }
}
