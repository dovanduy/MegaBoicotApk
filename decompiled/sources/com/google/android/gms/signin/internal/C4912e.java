package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p145b.C4411b;
import com.google.android.gms.internal.p145b.C4412c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C4912e extends C4411b implements C4911d {
    public C4912e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13342a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                mo17800a((ConnectionResult) C4412c.m18836a(parcel, ConnectionResult.CREATOR), (zaa) C4412c.m18836a(parcel, zaa.CREATOR));
                break;
            case 4:
                mo17801a((Status) C4412c.m18836a(parcel, Status.CREATOR));
                break;
            case 6:
                mo17803b((Status) C4412c.m18836a(parcel, Status.CREATOR));
                break;
            case 7:
                mo17802a((Status) C4412c.m18836a(parcel, Status.CREATOR), (GoogleSignInAccount) C4412c.m18836a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                mo13183a((zaj) C4412c.m18836a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
