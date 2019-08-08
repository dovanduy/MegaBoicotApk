package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.internal.al */
public final class C3451al implements Creator<zzb> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    bundle = C3509a.m12585q(parcel, a);
                    break;
                case 2:
                    featureArr = (Feature[]) C3509a.m12569b(parcel, a, Feature.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzb(bundle, featureArr);
    }
}
