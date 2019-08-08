package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3504r.C3505a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C4729a();

    /* renamed from: a */
    private final int f15345a;

    /* renamed from: b */
    private final String f15346b;

    /* renamed from: c */
    private final String f15347c;

    /* renamed from: d */
    private final String f15348d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f15345a = i;
        this.f15346b = str;
        this.f15347c = str2;
        this.f15348d = str3;
    }

    /* renamed from: a */
    public String mo17056a() {
        return this.f15346b;
    }

    /* renamed from: b */
    public String mo17057b() {
        return this.f15347c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C3504r.m12550a(this.f15346b, placeReport.f15346b) && C3504r.m12550a(this.f15347c, placeReport.f15347c) && C3504r.m12550a(this.f15348d, placeReport.f15348d);
    }

    public int hashCode() {
        return C3504r.m12548a(this.f15346b, this.f15347c, this.f15348d);
    }

    public String toString() {
        C3505a a = C3504r.m12549a((Object) this);
        a.mo13613a("placeId", this.f15346b);
        a.mo13613a("tag", this.f15347c);
        if (!"unknown".equals(this.f15348d)) {
            a.mo13613a("source", this.f15348d);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15345a);
        C3511b.m12609a(parcel, 2, mo17056a(), false);
        C3511b.m12609a(parcel, 3, mo17057b(), false);
        C3511b.m12609a(parcel, 4, this.f15348d, false);
        C3511b.m12596a(parcel, a);
    }
}
