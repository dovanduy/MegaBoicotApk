package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class arc implements Creator<zzmq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 15) {
                C3509a.m12568b(parcel, a);
            } else {
                str = C3509a.m12583o(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzmq(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmq[i];
    }
}
