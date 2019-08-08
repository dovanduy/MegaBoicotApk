package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.C4390a;
import com.google.android.gms.internal.auth-api.C4392c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public final class C3227s extends C4390a implements C3226r {
    C3227s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo13028a(C3224p pVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = mo16280a();
        C4392c.m18818a(a, (IInterface) pVar);
        C4392c.m18819a(a, (Parcelable) googleSignInOptions);
        mo16281a(103, a);
    }
}
