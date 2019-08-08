package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzae extends AbstractSafeParcelable {
    public static final Creator<zzae> CREATOR = new C4727o();

    /* renamed from: a */
    private final String f15349a;

    /* renamed from: b */
    private final String f15350b;

    /* renamed from: c */
    private final String f15351c;

    zzae(String str, String str2, String str3) {
        this.f15351c = str;
        this.f15349a = str2;
        this.f15350b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, this.f15349a, false);
        C3511b.m12609a(parcel, 2, this.f15350b, false);
        C3511b.m12609a(parcel, 5, this.f15351c, false);
        C3511b.m12596a(parcel, a);
    }
}
