package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.ads.el */
public final class C3772el implements Creator<zzafj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 2) {
                C3509a.m12568b(parcel, a);
            } else {
                str = C3509a.m12583o(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzafj(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafj[i];
    }
}
