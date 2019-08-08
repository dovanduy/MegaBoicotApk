package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzv extends AbstractSafeParcelable {
    public static final Creator<zzv> CREATOR = new C4409j();

    /* renamed from: a */
    private final int f14605a = 1;

    /* renamed from: b */
    private final String f14606b;

    zzv(int i, String str) {
        this.f14606b = (String) C3513t.m12625a(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14605a);
        C3511b.m12609a(parcel, 2, this.f14606b, false);
        C3511b.m12596a(parcel, a);
    }
}
