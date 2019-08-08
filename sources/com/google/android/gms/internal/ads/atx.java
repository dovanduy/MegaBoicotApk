package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class atx implements Creator<zzpl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        zzmu zzmu = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 3:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 4:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 5:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 6:
                    zzmu = (zzmu) C3509a.m12564a(parcel, a, zzmu.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzpl zzpl = new zzpl(i, z, i2, z2, i3, zzmu);
        return zzpl;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
