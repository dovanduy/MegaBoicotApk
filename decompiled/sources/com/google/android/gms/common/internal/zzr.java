package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@Deprecated
public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C3467ba();

    /* renamed from: a */
    private final int f10089a;

    zzr(int i) {
        this.f10089a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10089a);
        C3511b.m12596a(parcel, a);
    }
}
