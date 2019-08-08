package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.ads.internal.r */
public final class C3131r implements Creator<zzaq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 3:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 4:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 5:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    f = C3509a.m12578j(parcel, a);
                    break;
                case 7:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 8:
                    z4 = C3509a.m12571c(parcel, a);
                    break;
                case 9:
                    z5 = C3509a.m12571c(parcel, a);
                    break;
                case 10:
                    z6 = C3509a.m12571c(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzaq zzaq = new zzaq(z, z2, str, z3, f, i, z4, z5, z6);
        return zzaq;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}
