package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.ads.mm */
public final class C3989mm implements Creator<zzang> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
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
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzang zzang = new zzang(str, i, i2, z, z2);
        return zzang;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzang[i];
    }
}
