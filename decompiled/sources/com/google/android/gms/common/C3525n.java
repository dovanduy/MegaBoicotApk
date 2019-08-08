package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.n */
public final class C3525n implements Creator<Feature> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 2:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 3:
                    j = C3509a.m12575g(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new Feature(str, i, j);
    }
}
