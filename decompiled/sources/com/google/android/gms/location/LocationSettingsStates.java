package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsStates> CREATOR = new C4731r();

    /* renamed from: a */
    private final boolean f15329a;

    /* renamed from: b */
    private final boolean f15330b;

    /* renamed from: c */
    private final boolean f15331c;

    /* renamed from: d */
    private final boolean f15332d;

    /* renamed from: e */
    private final boolean f15333e;

    /* renamed from: f */
    private final boolean f15334f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f15329a = z;
        this.f15330b = z2;
        this.f15331c = z3;
        this.f15332d = z4;
        this.f15333e = z5;
        this.f15334f = z6;
    }

    /* renamed from: a */
    public final boolean mo17028a() {
        return this.f15329a;
    }

    /* renamed from: b */
    public final boolean mo17029b() {
        return this.f15332d;
    }

    /* renamed from: c */
    public final boolean mo17030c() {
        return this.f15330b;
    }

    /* renamed from: d */
    public final boolean mo17031d() {
        return this.f15333e;
    }

    /* renamed from: e */
    public final boolean mo17032e() {
        return this.f15331c;
    }

    /* renamed from: f */
    public final boolean mo17033f() {
        return this.f15334f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, mo17028a());
        C3511b.m12612a(parcel, 2, mo17030c());
        C3511b.m12612a(parcel, 3, mo17032e());
        C3511b.m12612a(parcel, 4, mo17029b());
        C3511b.m12612a(parcel, 5, mo17031d());
        C3511b.m12612a(parcel, 6, mo17033f());
        C3511b.m12596a(parcel, a);
    }
}
