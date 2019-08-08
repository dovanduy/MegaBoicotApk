package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zah extends AbstractSafeParcelable {
    public static final Creator<zah> CREATOR = new C4915h();

    /* renamed from: a */
    private final int f16056a;

    /* renamed from: b */
    private final ResolveAccountRequest f16057b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f16056a = i;
        this.f16057b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f16056a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f16057b, i, false);
        C3511b.m12596a(parcel, a);
    }
}
