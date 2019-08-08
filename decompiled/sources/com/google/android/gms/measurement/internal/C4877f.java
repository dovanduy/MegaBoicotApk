package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.measurement.internal.f */
public final class C4877f implements Creator<zzad> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 2) {
                C3509a.m12568b(parcel, a);
            } else {
                bundle = C3509a.m12585q(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzad(bundle);
    }
}
