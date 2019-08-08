package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzlu extends AbstractSafeParcelable {
    public static final Creator<zzlu> CREATOR = new aqk();

    /* renamed from: a */
    public final int f14555a;

    public zzlu(int i) {
        this.f14555a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 2, this.f14555a);
        C3511b.m12596a(parcel, a);
    }
}
