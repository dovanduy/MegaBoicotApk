package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C4881g implements Creator<zzag> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        zzad zzad = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    zzad = (zzad) C3509a.m12564a(parcel, a, zzad.CREATOR);
                    break;
                case 4:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 5:
                    j = C3509a.m12575g(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzag zzag = new zzag(str, zzad, str2, j);
        return zzag;
    }
}
