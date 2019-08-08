package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.location.y */
public final class C4694y implements Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        short s = 0;
        int i2 = 0;
        String str = null;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 3:
                    s = C3509a.m12572d(parcel2, a);
                    break;
                case 4:
                    d = C3509a.m12580l(parcel2, a);
                    break;
                case 5:
                    d2 = C3509a.m12580l(parcel2, a);
                    break;
                case 6:
                    f = C3509a.m12578j(parcel2, a);
                    break;
                case 7:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 8:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 9:
                    i3 = C3509a.m12573e(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzbh zzbh = new zzbh(str, i, s, d, d2, f, j, i2, i3);
        return zzbh;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
