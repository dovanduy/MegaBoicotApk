package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzag extends AbstractSafeParcelable {
    public static final Creator<zzag> CREATOR = new C4881g();

    /* renamed from: a */
    public final String f15991a;

    /* renamed from: b */
    public final zzad f15992b;

    /* renamed from: c */
    public final String f15993c;

    /* renamed from: d */
    public final long f15994d;

    public zzag(String str, zzad zzad, String str2, long j) {
        this.f15991a = str;
        this.f15992b = zzad;
        this.f15993c = str2;
        this.f15994d = j;
    }

    zzag(zzag zzag, long j) {
        C3513t.m12625a(zzag);
        this.f15991a = zzag.f15991a;
        this.f15992b = zzag.f15992b;
        this.f15993c = zzag.f15993c;
        this.f15994d = j;
    }

    public final String toString() {
        String str = this.f15993c;
        String str2 = this.f15991a;
        String valueOf = String.valueOf(this.f15992b);
        StringBuilder sb = new StringBuilder(21 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f15991a, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f15992b, i, false);
        C3511b.m12609a(parcel, 4, this.f15993c, false);
        C3511b.m12600a(parcel, 5, this.f15994d);
        C3511b.m12596a(parcel, a);
    }
}
