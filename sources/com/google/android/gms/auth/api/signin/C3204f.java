package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C3204f implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 3:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 4:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 5:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 6:
                    uri = (Uri) C3509a.m12564a(parcel2, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C3509a.m12583o(parcel2, a);
                    break;
                case 8:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 9:
                    str6 = C3509a.m12583o(parcel2, a);
                    break;
                case 10:
                    list = C3509a.m12570c(parcel2, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C3509a.m12583o(parcel2, a);
                    break;
                case 12:
                    str8 = C3509a.m12583o(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }
}
