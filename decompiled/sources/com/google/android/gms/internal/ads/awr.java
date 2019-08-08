package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class awr implements Creator<zzsi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 2:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 3:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 4:
                    bArr = C3509a.m12586r(parcel2, a);
                    break;
                case 5:
                    strArr = C3509a.m12594z(parcel2, a);
                    break;
                case 6:
                    strArr2 = C3509a.m12594z(parcel2, a);
                    break;
                case 7:
                    z2 = C3509a.m12571c(parcel2, a);
                    break;
                case 8:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzsi zzsi = new zzsi(z, str, i, bArr, strArr, strArr2, z2, j);
        return zzsi;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsi[i];
    }
}
