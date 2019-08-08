package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzatt extends AbstractSafeParcelable {
    public static final Creator<zzatt> CREATOR = new C4168tc();

    /* renamed from: a */
    private final int f14510a;

    /* renamed from: b */
    private final String f14511b;

    /* renamed from: c */
    private final String f14512c;

    zzatt(int i, String str, String str2) {
        this.f14510a = i;
        this.f14511b = str;
        this.f14512c = str2;
    }

    public zzatt(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14510a);
        C3511b.m12609a(parcel, 2, this.f14511b, false);
        C3511b.m12609a(parcel, 3, this.f14512c, false);
        C3511b.m12596a(parcel, a);
    }
}
