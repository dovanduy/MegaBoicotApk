package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.signin.j */
public final class C3231j implements Creator<SignInAccount> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = "";
        String str2 = "";
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 4) {
                switch (a2) {
                    case 7:
                        googleSignInAccount = (GoogleSignInAccount) C3509a.m12564a(parcel, a, GoogleSignInAccount.CREATOR);
                        break;
                    case 8:
                        str2 = C3509a.m12583o(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                str = C3509a.m12583o(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
