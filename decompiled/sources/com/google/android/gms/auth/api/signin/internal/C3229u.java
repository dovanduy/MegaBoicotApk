package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C3229u implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 == 2) {
                str = C3509a.m12583o(parcel, a);
            } else if (a2 != 5) {
                C3509a.m12568b(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C3509a.m12564a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
