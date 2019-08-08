package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR = new C4728p();

    /* renamed from: a */
    private final List<LocationRequest> f15319a;

    /* renamed from: b */
    private final boolean f15320b;

    /* renamed from: c */
    private final boolean f15321c;

    /* renamed from: d */
    private zzae f15322d;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C4697a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f15323a = new ArrayList<>();

        /* renamed from: b */
        private boolean f15324b = false;

        /* renamed from: c */
        private boolean f15325c = false;

        /* renamed from: d */
        private zzae f15326d = null;

        /* renamed from: a */
        public final C4697a mo17024a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f15323a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest mo17025a() {
            return new LocationSettingsRequest(this.f15323a, this.f15324b, this.f15325c, null);
        }
    }

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f15319a = list;
        this.f15320b = z;
        this.f15321c = z2;
        this.f15322d = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, Collections.unmodifiableList(this.f15319a), false);
        C3511b.m12612a(parcel, 2, this.f15320b);
        C3511b.m12612a(parcel, 3, this.f15321c);
        C3511b.m12604a(parcel, 5, (Parcelable) this.f15322d, i, false);
        C3511b.m12596a(parcel, a);
    }
}
