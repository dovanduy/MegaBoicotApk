package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class aof implements Creator<zzjn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        zzjn[] zzjnArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 4:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 5:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 7:
                    i4 = C3509a.m12573e(parcel, a);
                    break;
                case 8:
                    zzjnArr = (zzjn[]) C3509a.m12569b(parcel, a, zzjn.CREATOR);
                    break;
                case 9:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 10:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                case 11:
                    z4 = C3509a.m12571c(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzjn zzjn = new zzjn(str, i, i2, z, i3, i4, zzjnArr, z2, z3, z4);
        return zzjn;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjn[i];
    }
}
