package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.C4391b;
import com.google.android.gms.internal.auth-api.C4392c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C3225q extends C4391b implements C3224p {
    public C3225q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13027a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo13009a((GoogleSignInAccount) C4392c.m18817a(parcel, GoogleSignInAccount.CREATOR), (Status) C4392c.m18817a(parcel, Status.CREATOR));
                break;
            case 102:
                mo13010a((Status) C4392c.m18817a(parcel, Status.CREATOR));
                break;
            case 103:
                mo13011b((Status) C4392c.m18817a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
