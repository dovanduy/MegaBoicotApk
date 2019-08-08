package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C4866ep();

    /* renamed from: a */
    public final String f16003a;

    /* renamed from: b */
    public final String f16004b;

    /* renamed from: c */
    public final String f16005c;

    /* renamed from: d */
    public final String f16006d;

    /* renamed from: e */
    public final long f16007e;

    /* renamed from: f */
    public final long f16008f;

    /* renamed from: g */
    public final String f16009g;

    /* renamed from: h */
    public final boolean f16010h;

    /* renamed from: i */
    public final boolean f16011i;

    /* renamed from: j */
    public final long f16012j;

    /* renamed from: k */
    public final String f16013k;

    /* renamed from: l */
    public final long f16014l;

    /* renamed from: m */
    public final long f16015m;

    /* renamed from: n */
    public final int f16016n;

    /* renamed from: o */
    public final boolean f16017o;

    /* renamed from: p */
    public final boolean f16018p;

    /* renamed from: q */
    public final boolean f16019q;

    /* renamed from: r */
    public final String f16020r;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        C3513t.m12627a(str);
        this.f16003a = str;
        this.f16004b = TextUtils.isEmpty(str2) ? null : str2;
        this.f16005c = str3;
        this.f16012j = j;
        this.f16006d = str4;
        this.f16007e = j2;
        this.f16008f = j3;
        this.f16009g = str5;
        this.f16010h = z;
        this.f16011i = z2;
        this.f16013k = str6;
        this.f16014l = j4;
        this.f16015m = j5;
        this.f16016n = i;
        this.f16017o = z3;
        this.f16018p = z4;
        this.f16019q = z5;
        this.f16020r = str7;
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.f16003a = str;
        this.f16004b = str2;
        this.f16005c = str3;
        this.f16012j = j3;
        this.f16006d = str4;
        this.f16007e = j;
        this.f16008f = j2;
        this.f16009g = str5;
        this.f16010h = z;
        this.f16011i = z2;
        this.f16013k = str6;
        this.f16014l = j4;
        this.f16015m = j5;
        this.f16016n = i;
        this.f16017o = z3;
        this.f16018p = z4;
        this.f16019q = z5;
        this.f16020r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f16003a, false);
        C3511b.m12609a(parcel, 3, this.f16004b, false);
        C3511b.m12609a(parcel, 4, this.f16005c, false);
        C3511b.m12609a(parcel, 5, this.f16006d, false);
        C3511b.m12600a(parcel, 6, this.f16007e);
        C3511b.m12600a(parcel, 7, this.f16008f);
        C3511b.m12609a(parcel, 8, this.f16009g, false);
        C3511b.m12612a(parcel, 9, this.f16010h);
        C3511b.m12612a(parcel, 10, this.f16011i);
        C3511b.m12600a(parcel, 11, this.f16012j);
        C3511b.m12609a(parcel, 12, this.f16013k, false);
        C3511b.m12600a(parcel, 13, this.f16014l);
        C3511b.m12600a(parcel, 14, this.f16015m);
        C3511b.m12599a(parcel, 15, this.f16016n);
        C3511b.m12612a(parcel, 16, this.f16017o);
        C3511b.m12612a(parcel, 17, this.f16018p);
        C3511b.m12612a(parcel, 18, this.f16019q);
        C3511b.m12609a(parcel, 19, this.f16020r, false);
        C3511b.m12596a(parcel, a);
    }
}
