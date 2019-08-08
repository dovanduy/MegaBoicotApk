package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C3391k {
    public static final Creator<LocationSettingsResult> CREATOR = new C4730q();

    /* renamed from: a */
    private final Status f15327a;

    /* renamed from: b */
    private final LocationSettingsStates f15328b;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f15327a = status;
        this.f15328b = locationSettingsStates;
    }

    /* renamed from: a */
    public final LocationSettingsStates mo17026a() {
        return this.f15328b;
    }

    /* renamed from: b */
    public final Status mo12984b() {
        return this.f15327a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) mo12984b(), i, false);
        C3511b.m12604a(parcel, 2, (Parcelable) mo17026a(), i, false);
        C3511b.m12596a(parcel, a);
    }
}
