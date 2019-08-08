package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.h */
public final class C3206h implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    arrayList = C3509a.m12570c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C3509a.m12564a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 5:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                case 7:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 8:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 9:
                    arrayList2 = C3509a.m12570c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }
}
