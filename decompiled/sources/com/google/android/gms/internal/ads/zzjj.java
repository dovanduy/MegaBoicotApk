package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

@C3718cm
public final class zzjj extends AbstractSafeParcelable {
    public static final Creator<zzjj> CREATOR = new aod();

    /* renamed from: a */
    public final int f14525a;

    /* renamed from: b */
    public final long f14526b;

    /* renamed from: c */
    public final Bundle f14527c;

    /* renamed from: d */
    public final int f14528d;

    /* renamed from: e */
    public final List<String> f14529e;

    /* renamed from: f */
    public final boolean f14530f;

    /* renamed from: g */
    public final int f14531g;

    /* renamed from: h */
    public final boolean f14532h;

    /* renamed from: i */
    public final String f14533i;

    /* renamed from: j */
    public final zzmq f14534j;

    /* renamed from: k */
    public final Location f14535k;

    /* renamed from: l */
    public final String f14536l;

    /* renamed from: m */
    public final Bundle f14537m;

    /* renamed from: n */
    public final Bundle f14538n;

    /* renamed from: o */
    public final List<String> f14539o;

    /* renamed from: p */
    public final String f14540p;

    /* renamed from: q */
    public final String f14541q;

    /* renamed from: r */
    public final boolean f14542r;

    public zzjj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzmq zzmq, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f14525a = i;
        this.f14526b = j;
        this.f14527c = bundle == null ? new Bundle() : bundle;
        this.f14528d = i2;
        this.f14529e = list;
        this.f14530f = z;
        this.f14531g = i3;
        this.f14532h = z2;
        this.f14533i = str;
        this.f14534j = zzmq;
        this.f14535k = location;
        this.f14536l = str2;
        this.f14537m = bundle2 == null ? new Bundle() : bundle2;
        this.f14538n = bundle3;
        this.f14539o = list2;
        this.f14540p = str3;
        this.f14541q = str4;
        this.f14542r = z3;
    }

    /* renamed from: a */
    public final zzjj mo16264a() {
        Bundle bundle = this.f14537m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f14527c;
            this.f14537m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.f14527c);
        }
        Bundle bundle2 = bundle;
        int i = this.f14525a;
        long j = this.f14526b;
        int i2 = this.f14528d;
        List<String> list = this.f14529e;
        boolean z = this.f14530f;
        int i3 = this.f14531g;
        boolean z2 = this.f14532h;
        String str = this.f14533i;
        zzmq zzmq = this.f14534j;
        Location location = this.f14535k;
        String str2 = this.f14536l;
        String str3 = str2;
        zzmq zzmq2 = zzmq;
        Location location2 = location;
        String str4 = str3;
        zzjj zzjj = new zzjj(i, j, bundle2, i2, list, z, i3, z2, str, zzmq2, location2, str4, this.f14537m, this.f14538n, this.f14539o, this.f14540p, this.f14541q, this.f14542r);
        return zzjj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjj = (zzjj) obj;
        return this.f14525a == zzjj.f14525a && this.f14526b == zzjj.f14526b && C3504r.m12550a(this.f14527c, zzjj.f14527c) && this.f14528d == zzjj.f14528d && C3504r.m12550a(this.f14529e, zzjj.f14529e) && this.f14530f == zzjj.f14530f && this.f14531g == zzjj.f14531g && this.f14532h == zzjj.f14532h && C3504r.m12550a(this.f14533i, zzjj.f14533i) && C3504r.m12550a(this.f14534j, zzjj.f14534j) && C3504r.m12550a(this.f14535k, zzjj.f14535k) && C3504r.m12550a(this.f14536l, zzjj.f14536l) && C3504r.m12550a(this.f14537m, zzjj.f14537m) && C3504r.m12550a(this.f14538n, zzjj.f14538n) && C3504r.m12550a(this.f14539o, zzjj.f14539o) && C3504r.m12550a(this.f14540p, zzjj.f14540p) && C3504r.m12550a(this.f14541q, zzjj.f14541q) && this.f14542r == zzjj.f14542r;
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f14525a), Long.valueOf(this.f14526b), this.f14527c, Integer.valueOf(this.f14528d), this.f14529e, Boolean.valueOf(this.f14530f), Integer.valueOf(this.f14531g), Boolean.valueOf(this.f14532h), this.f14533i, this.f14534j, this.f14535k, this.f14536l, this.f14537m, this.f14538n, this.f14539o, this.f14540p, this.f14541q, Boolean.valueOf(this.f14542r));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14525a);
        C3511b.m12600a(parcel, 2, this.f14526b);
        C3511b.m12601a(parcel, 3, this.f14527c, false);
        C3511b.m12599a(parcel, 4, this.f14528d);
        C3511b.m12619b(parcel, 5, this.f14529e, false);
        C3511b.m12612a(parcel, 6, this.f14530f);
        C3511b.m12599a(parcel, 7, this.f14531g);
        C3511b.m12612a(parcel, 8, this.f14532h);
        C3511b.m12609a(parcel, 9, this.f14533i, false);
        C3511b.m12604a(parcel, 10, (Parcelable) this.f14534j, i, false);
        C3511b.m12604a(parcel, 11, (Parcelable) this.f14535k, i, false);
        C3511b.m12609a(parcel, 12, this.f14536l, false);
        C3511b.m12601a(parcel, 13, this.f14537m, false);
        C3511b.m12601a(parcel, 14, this.f14538n, false);
        C3511b.m12619b(parcel, 15, this.f14539o, false);
        C3511b.m12609a(parcel, 16, this.f14540p, false);
        C3511b.m12609a(parcel, 17, this.f14541q, false);
        C3511b.m12612a(parcel, 18, this.f14542r);
        C3511b.m12596a(parcel, a);
    }
}
