package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C4869es();

    /* renamed from: a */
    public String f16021a;

    /* renamed from: b */
    public String f16022b;

    /* renamed from: c */
    public zzfv f16023c;

    /* renamed from: d */
    public long f16024d;

    /* renamed from: e */
    public boolean f16025e;

    /* renamed from: f */
    public String f16026f;

    /* renamed from: g */
    public zzag f16027g;

    /* renamed from: h */
    public long f16028h;

    /* renamed from: i */
    public zzag f16029i;

    /* renamed from: j */
    public long f16030j;

    /* renamed from: k */
    public zzag f16031k;

    zzo(zzo zzo) {
        C3513t.m12625a(zzo);
        this.f16021a = zzo.f16021a;
        this.f16022b = zzo.f16022b;
        this.f16023c = zzo.f16023c;
        this.f16024d = zzo.f16024d;
        this.f16025e = zzo.f16025e;
        this.f16026f = zzo.f16026f;
        this.f16027g = zzo.f16027g;
        this.f16028h = zzo.f16028h;
        this.f16029i = zzo.f16029i;
        this.f16030j = zzo.f16030j;
        this.f16031k = zzo.f16031k;
    }

    zzo(String str, String str2, zzfv zzfv, long j, boolean z, String str3, zzag zzag, long j2, zzag zzag2, long j3, zzag zzag3) {
        this.f16021a = str;
        this.f16022b = str2;
        this.f16023c = zzfv;
        this.f16024d = j;
        this.f16025e = z;
        this.f16026f = str3;
        this.f16027g = zzag;
        this.f16028h = j2;
        this.f16029i = zzag2;
        this.f16030j = j3;
        this.f16031k = zzag3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f16021a, false);
        C3511b.m12609a(parcel, 3, this.f16022b, false);
        C3511b.m12604a(parcel, 4, (Parcelable) this.f16023c, i, false);
        C3511b.m12600a(parcel, 5, this.f16024d);
        C3511b.m12612a(parcel, 6, this.f16025e);
        C3511b.m12609a(parcel, 7, this.f16026f, false);
        C3511b.m12604a(parcel, 8, (Parcelable) this.f16027g, i, false);
        C3511b.m12600a(parcel, 9, this.f16028h);
        C3511b.m12604a(parcel, 10, (Parcelable) this.f16029i, i, false);
        C3511b.m12600a(parcel, 11, this.f16030j);
        C3511b.m12604a(parcel, 12, (Parcelable) this.f16031k, i, false);
        C3511b.m12596a(parcel, a);
    }
}
