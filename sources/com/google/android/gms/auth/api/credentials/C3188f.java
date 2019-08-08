package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.credentials.f */
public final class C3188f implements Creator<HintRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) C3509a.m12564a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = C3509a.m12571c(parcel, a);
                        break;
                    case 3:
                        z2 = C3509a.m12571c(parcel, a);
                        break;
                    case 4:
                        strArr = C3509a.m12594z(parcel, a);
                        break;
                    case 5:
                        z3 = C3509a.m12571c(parcel, a);
                        break;
                    case 6:
                        str = C3509a.m12583o(parcel, a);
                        break;
                    case 7:
                        str2 = C3509a.m12583o(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                i = C3509a.m12573e(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        HintRequest hintRequest = new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return hintRequest;
    }
}
