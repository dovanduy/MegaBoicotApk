package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class are implements Creator<zzmu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 3:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 4:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzmu(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmu[i];
    }
}
