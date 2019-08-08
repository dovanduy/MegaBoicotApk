package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzad extends AbstractSafeParcelable {
    public static final Creator<zzad> CREATOR = new C4402c();

    /* renamed from: a */
    private final int f14596a = 1;

    /* renamed from: b */
    private final String f14597b;

    zzad(int i, String str) {
        this.f14597b = (String) C3513t.m12625a(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14596a);
        C3511b.m12609a(parcel, 2, this.f14597b, false);
        C3511b.m12596a(parcel, a);
    }
}
