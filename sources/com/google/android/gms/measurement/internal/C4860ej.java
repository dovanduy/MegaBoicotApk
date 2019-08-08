package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.measurement.internal.ej */
public final class C4860ej implements Creator<zzfv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 3:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 4:
                    l = C3509a.m12576h(parcel2, a);
                    break;
                case 5:
                    f = C3509a.m12579k(parcel2, a);
                    break;
                case 6:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 7:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 8:
                    d = C3509a.m12581m(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzfv zzfv = new zzfv(i, str, j, l, f, str2, str3, d);
        return zzfv;
    }
}
