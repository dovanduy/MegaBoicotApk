package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzang extends AbstractSafeParcelable {
    public static final Creator<zzang> CREATOR = new C3989mm();

    /* renamed from: a */
    public String f14505a;

    /* renamed from: b */
    public int f14506b;

    /* renamed from: c */
    public int f14507c;

    /* renamed from: d */
    public boolean f14508d;

    /* renamed from: e */
    public boolean f14509e;

    public zzang(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzang(int i, int i2, boolean z, boolean z2) {
        this((int) C3415h.f9877b, i2, true, false, z2);
    }

    private zzang(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(36 + String.valueOf(str).length());
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i, i2, z, z3);
    }

    zzang(String str, int i, int i2, boolean z, boolean z2) {
        this.f14505a = str;
        this.f14506b = i;
        this.f14507c = i2;
        this.f14508d = z;
        this.f14509e = z2;
    }

    /* renamed from: a */
    public static zzang m18792a() {
        return new zzang(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14505a, false);
        C3511b.m12599a(parcel, 3, this.f14506b);
        C3511b.m12599a(parcel, 4, this.f14507c);
        C3511b.m12612a(parcel, 5, this.f14508d);
        C3511b.m12612a(parcel, 6, this.f14509e);
        C3511b.m12596a(parcel, a);
    }
}
