package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationResult> CREATOR = new C4725m();

    /* renamed from: a */
    static final List<Location> f15317a = Collections.emptyList();

    /* renamed from: b */
    private final List<Location> f15318b;

    LocationResult(List<Location> list) {
        this.f15318b = list;
    }

    /* renamed from: a */
    public final List<Location> mo17018a() {
        return this.f15318b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f15318b.size() != this.f15318b.size()) {
            return false;
        }
        Iterator it = this.f15318b.iterator();
        for (Location time : locationResult.f15318b) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f15318b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15318b);
        StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, mo17018a(), false);
        C3511b.m12596a(parcel, a);
    }
}
