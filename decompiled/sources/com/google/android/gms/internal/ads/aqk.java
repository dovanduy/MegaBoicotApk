package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

public final class aqk implements Creator<zzlu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 2) {
                C3509a.m12568b(parcel, a);
            } else {
                i = C3509a.m12573e(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzlu(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlu[i];
    }
}
