package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p145b.C4410a;
import com.google.android.gms.internal.p145b.C4412c;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.common.internal.ad */
public final class C3443ad extends C4410a implements C3503q {
    C3443ad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: a */
    public final C3235a mo13486a(C3235a aVar, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel a = mo16307a();
        C4412c.m18837a(a, (IInterface) aVar);
        C4412c.m18838a(a, (Parcelable) signInButtonConfig);
        Parcel a2 = mo16308a(2, a);
        C3235a a3 = C3236a.m11572a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
