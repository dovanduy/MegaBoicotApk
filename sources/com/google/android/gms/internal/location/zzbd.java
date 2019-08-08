package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Creator<zzbd> CREATOR = new C4692w();

    /* renamed from: a */
    static final List<ClientIdentity> f15245a = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f15246b;

    /* renamed from: c */
    private List<ClientIdentity> f15247c;

    /* renamed from: d */
    private String f15248d;

    /* renamed from: e */
    private boolean f15249e;

    /* renamed from: f */
    private boolean f15250f;

    /* renamed from: g */
    private boolean f15251g;

    /* renamed from: h */
    private String f15252h;

    /* renamed from: i */
    private boolean f15253i = true;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f15246b = locationRequest;
        this.f15247c = list;
        this.f15248d = str;
        this.f15249e = z;
        this.f15250f = z2;
        this.f15251g = z3;
        this.f15252h = str2;
    }

    @Deprecated
    /* renamed from: a */
    public static zzbd m20253a(LocationRequest locationRequest) {
        zzbd zzbd = new zzbd(locationRequest, f15245a, null, false, false, false, null);
        return zzbd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C3504r.m12550a(this.f15246b, zzbd.f15246b) && C3504r.m12550a(this.f15247c, zzbd.f15247c) && C3504r.m12550a(this.f15248d, zzbd.f15248d) && this.f15249e == zzbd.f15249e && this.f15250f == zzbd.f15250f && this.f15251g == zzbd.f15251g && C3504r.m12550a(this.f15252h, zzbd.f15252h);
    }

    public final int hashCode() {
        return this.f15246b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15246b);
        if (this.f15248d != null) {
            sb.append(" tag=");
            sb.append(this.f15248d);
        }
        if (this.f15252h != null) {
            sb.append(" moduleId=");
            sb.append(this.f15252h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f15249e);
        sb.append(" clients=");
        sb.append(this.f15247c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f15250f);
        if (this.f15251g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) this.f15246b, i, false);
        C3511b.m12621c(parcel, 5, this.f15247c, false);
        C3511b.m12609a(parcel, 6, this.f15248d, false);
        C3511b.m12612a(parcel, 7, this.f15249e);
        C3511b.m12612a(parcel, 8, this.f15250f);
        C3511b.m12612a(parcel, 9, this.f15251g);
        C3511b.m12609a(parcel, 10, this.f15252h, false);
        C3511b.m12596a(parcel, a);
    }
}
