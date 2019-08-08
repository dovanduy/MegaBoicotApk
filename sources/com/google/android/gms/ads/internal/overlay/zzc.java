package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.internal.ads.C3718cm;

@C3718cm
public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new C3106b();

    /* renamed from: a */
    public final String f9122a;

    /* renamed from: b */
    public final String f9123b;

    /* renamed from: c */
    public final String f9124c;

    /* renamed from: d */
    public final String f9125d;

    /* renamed from: e */
    public final String f9126e;

    /* renamed from: f */
    public final Intent f9127f;

    /* renamed from: g */
    private final String f9128g;

    /* renamed from: h */
    private final String f9129h;

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f9128g = str;
        this.f9122a = str2;
        this.f9123b = str3;
        this.f9124c = str4;
        this.f9125d = str5;
        this.f9126e = str6;
        this.f9129h = str7;
        this.f9127f = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f9128g, false);
        C3511b.m12609a(parcel, 3, this.f9122a, false);
        C3511b.m12609a(parcel, 4, this.f9123b, false);
        C3511b.m12609a(parcel, 5, this.f9124c, false);
        C3511b.m12609a(parcel, 6, this.f9125d, false);
        C3511b.m12609a(parcel, 7, this.f9126e, false);
        C3511b.m12609a(parcel, 8, this.f9129h, false);
        C3511b.m12604a(parcel, 9, (Parcelable) this.f9127f, i, false);
        C3511b.m12596a(parcel, a);
    }
}
