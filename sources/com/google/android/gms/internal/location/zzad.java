package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzad extends AbstractSafeParcelable implements C3391k {
    public static final Creator<zzad> CREATOR = new C4673d();

    /* renamed from: a */
    private static final zzad f15243a = new zzad(Status.f9455a);

    /* renamed from: b */
    private final Status f15244b;

    public zzad(Status status) {
        this.f15244b = status;
    }

    /* renamed from: b */
    public final Status mo12984b() {
        return this.f15244b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) mo12984b(), i, false);
        C3511b.m12596a(parcel, a);
    }
}
