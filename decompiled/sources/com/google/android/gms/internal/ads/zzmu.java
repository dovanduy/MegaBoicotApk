package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.C3140j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzmu extends AbstractSafeParcelable {
    public static final Creator<zzmu> CREATOR = new are();

    /* renamed from: a */
    public final boolean f14557a;

    /* renamed from: b */
    public final boolean f14558b;

    /* renamed from: c */
    public final boolean f14559c;

    public zzmu(C3140j jVar) {
        this(jVar.mo12709a(), jVar.mo12710b(), jVar.mo12711c());
    }

    public zzmu(boolean z, boolean z2, boolean z3) {
        this.f14557a = z;
        this.f14558b = z2;
        this.f14559c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 2, this.f14557a);
        C3511b.m12612a(parcel, 3, this.f14558b);
        C3511b.m12612a(parcel, 4, this.f14559c);
        C3511b.m12596a(parcel, a);
    }
}
