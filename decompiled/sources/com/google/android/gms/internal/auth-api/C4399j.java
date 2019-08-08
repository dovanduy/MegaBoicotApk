package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.auth-api.j */
public final class C4399j implements Creator<zzy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 1) {
                C3509a.m12568b(parcel, a);
            } else {
                credential = (Credential) C3509a.m12564a(parcel, a, Credential.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzy(credential);
    }
}
