package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C4702ac();

    /* renamed from: a */
    private boolean f15359a;

    /* renamed from: b */
    private long f15360b;

    /* renamed from: c */
    private float f15361c;

    /* renamed from: d */
    private long f15362d;

    /* renamed from: e */
    private int f15363e;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f15359a = z;
        this.f15360b = j;
        this.f15361c = f;
        this.f15362d = j2;
        this.f15363e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f15359a == zzj.f15359a && this.f15360b == zzj.f15360b && Float.compare(this.f15361c, zzj.f15361c) == 0 && this.f15362d == zzj.f15362d && this.f15363e == zzj.f15363e;
    }

    public final int hashCode() {
        return C3504r.m12548a(Boolean.valueOf(this.f15359a), Long.valueOf(this.f15360b), Float.valueOf(this.f15361c), Long.valueOf(this.f15362d), Integer.valueOf(this.f15363e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f15359a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f15360b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f15361c);
        if (this.f15362d != Long.MAX_VALUE) {
            long elapsedRealtime = this.f15362d - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f15363e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f15363e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, this.f15359a);
        C3511b.m12600a(parcel, 2, this.f15360b);
        C3511b.m12598a(parcel, 3, this.f15361c);
        C3511b.m12600a(parcel, 4, this.f15362d);
        C3511b.m12599a(parcel, 5, this.f15363e);
        C3511b.m12596a(parcel, a);
    }
}
