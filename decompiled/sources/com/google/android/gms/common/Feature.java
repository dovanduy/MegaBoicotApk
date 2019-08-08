package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C3525n();

    /* renamed from: a */
    private final String f9439a;
    @Deprecated

    /* renamed from: b */
    private final int f9440b;

    /* renamed from: c */
    private final long f9441c;

    public Feature(String str, int i, long j) {
        this.f9439a = str;
        this.f9440b = i;
        this.f9441c = j;
    }

    /* renamed from: a */
    public String mo13050a() {
        return this.f9439a;
    }

    /* renamed from: b */
    public long mo13051b() {
        return this.f9441c == -1 ? (long) this.f9440b : this.f9441c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, mo13050a(), false);
        C3511b.m12599a(parcel, 2, this.f9440b);
        C3511b.m12600a(parcel, 3, mo13051b());
        C3511b.m12596a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (((mo13050a() == null || !mo13050a().equals(feature.mo13050a())) && (mo13050a() != null || feature.mo13050a() != null)) || mo13051b() != feature.mo13051b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3504r.m12548a(mo13050a(), Long.valueOf(mo13051b()));
    }

    public String toString() {
        return C3504r.m12549a((Object) this).mo13613a("name", mo13050a()).mo13613a("version", Long.valueOf(mo13051b())).toString();
    }
}
