package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.internal.ah */
public final class C3447ah implements Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    account = (Account) C3509a.m12564a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C3509a.m12564a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }
}
