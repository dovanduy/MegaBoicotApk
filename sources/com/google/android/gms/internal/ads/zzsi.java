package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzsi extends AbstractSafeParcelable {
    public static final Creator<zzsi> CREATOR = new awr();

    /* renamed from: a */
    public final boolean f14569a;

    /* renamed from: b */
    public final String f14570b;

    /* renamed from: c */
    public final int f14571c;

    /* renamed from: d */
    public final byte[] f14572d;

    /* renamed from: e */
    public final String[] f14573e;

    /* renamed from: f */
    public final String[] f14574f;

    /* renamed from: g */
    public final boolean f14575g;

    /* renamed from: h */
    public final long f14576h;

    zzsi(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f14569a = z;
        this.f14570b = str;
        this.f14571c = i;
        this.f14572d = bArr;
        this.f14573e = strArr;
        this.f14574f = strArr2;
        this.f14575g = z2;
        this.f14576h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, this.f14569a);
        C3511b.m12609a(parcel, 2, this.f14570b, false);
        C3511b.m12599a(parcel, 3, this.f14571c);
        C3511b.m12613a(parcel, 4, this.f14572d, false);
        C3511b.m12615a(parcel, 5, this.f14573e, false);
        C3511b.m12615a(parcel, 6, this.f14574f, false);
        C3511b.m12612a(parcel, 7, this.f14575g);
        C3511b.m12600a(parcel, 8, this.f14576h);
        C3511b.m12596a(parcel, a);
    }
}
