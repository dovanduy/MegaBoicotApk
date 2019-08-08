package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.measurement.internal.es */
public final class C4869es implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzfv zzfv = null;
        String str3 = null;
        zzag zzag = null;
        zzag zzag2 = null;
        zzag zzag3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 3:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 4:
                    zzfv = (zzfv) C3509a.m12564a(parcel2, a, zzfv.CREATOR);
                    break;
                case 5:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 6:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 7:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 8:
                    zzag = (zzag) C3509a.m12564a(parcel2, a, zzag.CREATOR);
                    break;
                case 9:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 10:
                    zzag2 = (zzag) C3509a.m12564a(parcel2, a, zzag.CREATOR);
                    break;
                case 11:
                    j3 = C3509a.m12575g(parcel2, a);
                    break;
                case 12:
                    zzag3 = (zzag) C3509a.m12564a(parcel2, a, zzag.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzo zzo = new zzo(str, str2, zzfv, j, z, str3, zzag, j2, zzag2, j3, zzag3);
        return zzo;
    }
}
