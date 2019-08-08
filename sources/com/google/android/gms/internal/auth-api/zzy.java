package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzy extends AbstractSafeParcelable {
    public static final Creator<zzy> CREATOR = new C4399j();

    /* renamed from: a */
    private final Credential f14589a;

    public zzy(Credential credential) {
        this.f14589a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) this.f14589a, i, false);
        C3511b.m12596a(parcel, a);
    }
}
