package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class amd implements Creator<zzhl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 3:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 4:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 5:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 6:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 7:
                    bundle = C3509a.m12585q(parcel2, a);
                    break;
                case 8:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 9:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzhl zzhl = new zzhl(str, j, str2, str3, str4, bundle, z, j2);
        return zzhl;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhl[i];
    }
}
