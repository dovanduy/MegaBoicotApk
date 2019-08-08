package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C3187e implements Creator<CredentialRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = C3509a.m12571c(parcel, a);
                        break;
                    case 2:
                        strArr = C3509a.m12594z(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C3509a.m12564a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C3509a.m12564a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = C3509a.m12571c(parcel, a);
                        break;
                    case 6:
                        str = C3509a.m12583o(parcel, a);
                        break;
                    case 7:
                        str2 = C3509a.m12583o(parcel, a);
                        break;
                    case 8:
                        z3 = C3509a.m12571c(parcel, a);
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
        CredentialRequest credentialRequest = new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return credentialRequest;
    }
}
