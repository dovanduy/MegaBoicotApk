package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new C4703ad();

    /* renamed from: a */
    private final List<zzbh> f15301a;

    /* renamed from: b */
    private final int f15302b;

    /* renamed from: c */
    private final String f15303c;

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f15301a = list;
        this.f15302b = i;
        this.f15303c = str;
    }

    /* renamed from: a */
    public int mo17002a() {
        return this.f15302b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f15301a);
        int i = this.f15302b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String str = "tag=";
        String valueOf = String.valueOf(this.f15303c);
        sb.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, this.f15301a, false);
        C3511b.m12599a(parcel, 2, mo17002a());
        C3511b.m12609a(parcel, 3, this.f15303c, false);
        C3511b.m12596a(parcel, a);
    }
}
