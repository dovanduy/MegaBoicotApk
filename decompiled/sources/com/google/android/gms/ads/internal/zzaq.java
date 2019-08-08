package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.internal.ads.C3718cm;

@C3718cm
public final class zzaq extends AbstractSafeParcelable {
    public static final Creator<zzaq> CREATOR = new C3131r();

    /* renamed from: a */
    public final boolean f9153a;

    /* renamed from: b */
    public final boolean f9154b;

    /* renamed from: c */
    public final boolean f9155c;

    /* renamed from: d */
    public final float f9156d;

    /* renamed from: e */
    public final int f9157e;

    /* renamed from: f */
    public final boolean f9158f;

    /* renamed from: g */
    public final boolean f9159g;

    /* renamed from: h */
    public final boolean f9160h;

    /* renamed from: i */
    private final String f9161i;

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f9153a = z;
        this.f9154b = z2;
        this.f9161i = str;
        this.f9155c = z3;
        this.f9156d = f;
        this.f9157e = i;
        this.f9158f = z4;
        this.f9159g = z5;
        this.f9160h = z6;
    }

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 2, this.f9153a);
        C3511b.m12612a(parcel, 3, this.f9154b);
        C3511b.m12609a(parcel, 4, this.f9161i, false);
        C3511b.m12612a(parcel, 5, this.f9155c);
        C3511b.m12598a(parcel, 6, this.f9156d);
        C3511b.m12599a(parcel, 7, this.f9157e);
        C3511b.m12612a(parcel, 8, this.f9158f);
        C3511b.m12612a(parcel, 9, this.f9159g);
        C3511b.m12612a(parcel, 10, this.f9160h);
        C3511b.m12596a(parcel, a);
    }
}
