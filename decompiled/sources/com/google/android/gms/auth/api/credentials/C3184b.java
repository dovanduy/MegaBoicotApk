package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
public final class C3184b implements Creator<Credential> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 2:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    uri = (Uri) C3509a.m12564a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = C3509a.m12570c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C3509a.m12583o(parcel, a);
                    break;
                case 6:
                    str4 = C3509a.m12583o(parcel, a);
                    break;
                case 9:
                    str5 = C3509a.m12583o(parcel, a);
                    break;
                case 10:
                    str6 = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }
}
