package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new C4724l();

    /* renamed from: a */
    private int f15309a;

    /* renamed from: b */
    private long f15310b;

    /* renamed from: c */
    private long f15311c;

    /* renamed from: d */
    private boolean f15312d;

    /* renamed from: e */
    private long f15313e;

    /* renamed from: f */
    private int f15314f;

    /* renamed from: g */
    private float f15315g;

    /* renamed from: h */
    private long f15316h;

    public LocationRequest() {
        this.f15309a = 102;
        this.f15310b = 3600000;
        this.f15311c = 600000;
        this.f15312d = false;
        this.f15313e = Long.MAX_VALUE;
        this.f15314f = Integer.MAX_VALUE;
        this.f15315g = 0.0f;
        this.f15316h = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f15309a = i;
        this.f15310b = j;
        this.f15311c = j2;
        this.f15312d = z;
        this.f15313e = j3;
        this.f15314f = i2;
        this.f15315g = f;
        this.f15316h = j4;
    }

    /* renamed from: c */
    private static void m20275c(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final long mo17010a() {
        long j = this.f15316h;
        return j < this.f15310b ? this.f15310b : j;
    }

    /* renamed from: a */
    public final LocationRequest mo17011a(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                this.f15309a = i;
                return this;
            default:
                StringBuilder sb = new StringBuilder(28);
                sb.append("invalid quality: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final LocationRequest mo17012a(long j) {
        m20275c(j);
        this.f15310b = j;
        if (!this.f15312d) {
            this.f15311c = (long) (((double) this.f15310b) / 6.0d);
        }
        return this;
    }

    /* renamed from: b */
    public final LocationRequest mo17013b(long j) {
        m20275c(j);
        this.f15312d = true;
        this.f15311c = j;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f15309a == locationRequest.f15309a && this.f15310b == locationRequest.f15310b && this.f15311c == locationRequest.f15311c && this.f15312d == locationRequest.f15312d && this.f15313e == locationRequest.f15313e && this.f15314f == locationRequest.f15314f && this.f15315g == locationRequest.f15315g && mo17010a() == locationRequest.mo17010a();
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15309a), Long.valueOf(this.f15310b), Float.valueOf(this.f15315g), Long.valueOf(this.f15316h));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        switch (this.f15309a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        sb.append(str);
        if (this.f15309a != 105) {
            sb.append(" requested=");
            sb.append(this.f15310b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f15311c);
        sb.append("ms");
        if (this.f15316h > this.f15310b) {
            sb.append(" maxWait=");
            sb.append(this.f15316h);
            sb.append("ms");
        }
        if (this.f15315g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f15315g);
            sb.append("m");
        }
        if (this.f15313e != Long.MAX_VALUE) {
            long elapsedRealtime = this.f15313e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f15314f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f15314f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15309a);
        C3511b.m12600a(parcel, 2, this.f15310b);
        C3511b.m12600a(parcel, 3, this.f15311c);
        C3511b.m12612a(parcel, 4, this.f15312d);
        C3511b.m12600a(parcel, 5, this.f15313e);
        C3511b.m12599a(parcel, 6, this.f15314f);
        C3511b.m12598a(parcel, 7, this.f15315g);
        C3511b.m12600a(parcel, 8, this.f15316h);
        C3511b.m12596a(parcel, a);
    }
}
