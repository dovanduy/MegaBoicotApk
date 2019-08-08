package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzafj extends AbstractSafeParcelable {
    public static final Creator<zzafj> CREATOR = new C3772el();

    /* renamed from: a */
    String f14492a;

    public zzafj(String str) {
        this.f14492a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14492a, false);
        C3511b.m12596a(parcel, a);
    }
}
