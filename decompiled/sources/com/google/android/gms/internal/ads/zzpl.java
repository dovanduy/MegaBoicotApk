package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.C2983b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzpl extends AbstractSafeParcelable {
    public static final Creator<zzpl> CREATOR = new atx();

    /* renamed from: a */
    public final int f14560a;

    /* renamed from: b */
    public final boolean f14561b;

    /* renamed from: c */
    public final int f14562c;

    /* renamed from: d */
    public final boolean f14563d;

    /* renamed from: e */
    public final int f14564e;

    /* renamed from: f */
    public final zzmu f14565f;

    public zzpl(int i, boolean z, int i2, boolean z2, int i3, zzmu zzmu) {
        this.f14560a = i;
        this.f14561b = z;
        this.f14562c = i2;
        this.f14563d = z2;
        this.f14564e = i3;
        this.f14565f = zzmu;
    }

    public zzpl(C2983b bVar) {
        boolean a = bVar.mo12329a();
        int b = bVar.mo12330b();
        boolean c = bVar.mo12331c();
        int d = bVar.mo12332d();
        zzmu zzmu = bVar.mo12333e() != null ? new zzmu(bVar.mo12333e()) : null;
        this(3, a, b, c, d, zzmu);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14560a);
        C3511b.m12612a(parcel, 2, this.f14561b);
        C3511b.m12599a(parcel, 3, this.f14562c);
        C3511b.m12612a(parcel, 4, this.f14563d);
        C3511b.m12599a(parcel, 5, this.f14564e);
        C3511b.m12604a(parcel, 6, (Parcelable) this.f14565f, i, false);
        C3511b.m12596a(parcel, a);
    }
}
