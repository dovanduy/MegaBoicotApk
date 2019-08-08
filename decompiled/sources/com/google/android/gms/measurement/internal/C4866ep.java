package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.measurement.internal.ep */
public final class C4866ep implements Creator<zzk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j5 = -2147483648L;
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
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 5:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 6:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 7:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 8:
                    str5 = C3509a.m12583o(parcel2, a);
                    break;
                case 9:
                    z3 = C3509a.m12571c(parcel2, a);
                    break;
                case 10:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 11:
                    j5 = C3509a.m12575g(parcel2, a);
                    break;
                case 12:
                    str6 = C3509a.m12583o(parcel2, a);
                    break;
                case 13:
                    j3 = C3509a.m12575g(parcel2, a);
                    break;
                case 14:
                    j4 = C3509a.m12575g(parcel2, a);
                    break;
                case 15:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 16:
                    z4 = C3509a.m12571c(parcel2, a);
                    break;
                case 17:
                    z5 = C3509a.m12571c(parcel2, a);
                    break;
                case 18:
                    z2 = C3509a.m12571c(parcel2, a);
                    break;
                case 19:
                    str7 = C3509a.m12583o(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzk zzk = new zzk(str, str2, str3, str4, j, j2, str5, z3, z, j5, str6, j3, j4, i, z4, z5, z2, str7);
        return zzk;
    }
}
