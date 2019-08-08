package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzahk extends AbstractSafeParcelable {
    public static final Creator<zzahk> CREATOR = new C3828gn();

    /* renamed from: a */
    public final zzjj f14493a;

    /* renamed from: b */
    public final String f14494b;

    public zzahk(zzjj zzjj, String str) {
        this.f14493a = zzjj;
        this.f14494b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f14493a, i, false);
        C3511b.m12609a(parcel, 3, this.f14494b, false);
        C3511b.m12596a(parcel, a);
    }
}
