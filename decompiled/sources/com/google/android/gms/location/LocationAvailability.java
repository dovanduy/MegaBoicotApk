package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new C4723k();
    @Deprecated

    /* renamed from: a */
    private int f15304a;
    @Deprecated

    /* renamed from: b */
    private int f15305b;

    /* renamed from: c */
    private long f15306c;

    /* renamed from: d */
    private int f15307d;

    /* renamed from: e */
    private zzaj[] f15308e;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f15307d = i;
        this.f15304a = i2;
        this.f15305b = i3;
        this.f15306c = j;
        this.f15308e = zzajArr;
    }

    /* renamed from: a */
    public final boolean mo17005a() {
        return this.f15307d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.f15304a == locationAvailability.f15304a && this.f15305b == locationAvailability.f15305b && this.f15306c == locationAvailability.f15306c && this.f15307d == locationAvailability.f15307d && Arrays.equals(this.f15308e, locationAvailability.f15308e);
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15307d), Integer.valueOf(this.f15304a), Integer.valueOf(this.f15305b), Long.valueOf(this.f15306c), this.f15308e);
    }

    public final String toString() {
        boolean a = mo17005a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15304a);
        C3511b.m12599a(parcel, 2, this.f15305b);
        C3511b.m12600a(parcel, 3, this.f15306c);
        C3511b.m12599a(parcel, 4, this.f15307d);
        C3511b.m12614a(parcel, 5, (T[]) this.f15308e, i, false);
        C3511b.m12596a(parcel, a);
    }
}
