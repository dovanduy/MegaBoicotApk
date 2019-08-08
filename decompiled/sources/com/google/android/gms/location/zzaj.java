package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new C4732s();

    /* renamed from: a */
    private final int f15352a;

    /* renamed from: b */
    private final int f15353b;

    /* renamed from: c */
    private final long f15354c;

    /* renamed from: d */
    private final long f15355d;

    zzaj(int i, int i2, long j, long j2) {
        this.f15352a = i;
        this.f15353b = i2;
        this.f15354c = j;
        this.f15355d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzaj zzaj = (zzaj) obj;
        return this.f15352a == zzaj.f15352a && this.f15353b == zzaj.f15353b && this.f15354c == zzaj.f15354c && this.f15355d == zzaj.f15355d;
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15353b), Integer.valueOf(this.f15352a), Long.valueOf(this.f15355d), Long.valueOf(this.f15354c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f15352a);
        sb.append(" Cell status: ");
        sb.append(this.f15353b);
        sb.append(" elapsed time NS: ");
        sb.append(this.f15355d);
        sb.append(" system time ms: ");
        sb.append(this.f15354c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15352a);
        C3511b.m12599a(parcel, 2, this.f15353b);
        C3511b.m12600a(parcel, 3, this.f15354c);
        C3511b.m12600a(parcel, 4, this.f15355d);
        C3511b.m12596a(parcel, a);
    }
}
