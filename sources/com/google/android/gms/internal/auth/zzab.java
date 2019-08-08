package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzab extends AbstractSafeParcelable {
    public static final Creator<zzab> CREATOR = new C4401b();

    /* renamed from: a */
    private final int f14593a = 1;

    /* renamed from: b */
    private final String f14594b;

    /* renamed from: c */
    private final int f14595c;

    zzab(int i, String str, int i2) {
        this.f14594b = (String) C3513t.m12625a(str);
        this.f14595c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14593a);
        C3511b.m12609a(parcel, 2, this.f14594b, false);
        C3511b.m12599a(parcel, 3, this.f14595c);
        C3511b.m12596a(parcel, a);
    }
}
