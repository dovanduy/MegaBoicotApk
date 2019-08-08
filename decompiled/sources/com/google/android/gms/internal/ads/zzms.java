package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzms extends zzjn {
    public zzms(zzjn zzjn) {
        super(zzjn.f14543a, zzjn.f14544b, zzjn.f14545c, zzjn.f14546d, zzjn.f14547e, zzjn.f14548f, zzjn.f14549g, zzjn.f14550h, zzjn.f14551i, zzjn.f14552j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14543a, false);
        C3511b.m12599a(parcel, 3, this.f14544b);
        C3511b.m12599a(parcel, 6, this.f14547e);
        C3511b.m12596a(parcel, a);
    }
}
