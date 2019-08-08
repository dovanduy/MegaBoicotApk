package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzb extends AbstractSafeParcelable {
    public static final Creator<zzb> CREATOR = new C3451al();

    /* renamed from: a */
    Bundle f10087a;

    /* renamed from: b */
    Feature[] f10088b;

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f10087a = bundle;
        this.f10088b = featureArr;
    }

    public zzb() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12601a(parcel, 1, this.f10087a, false);
        C3511b.m12614a(parcel, 2, (T[]) this.f10088b, i, false);
        C3511b.m12596a(parcel, a);
    }
}
