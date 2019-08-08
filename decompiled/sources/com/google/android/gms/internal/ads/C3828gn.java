package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.ads.gn */
public final class C3828gn implements Creator<zzahk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        zzjj zzjj = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    zzjj = (zzjj) C3509a.m12564a(parcel, a, zzjj.CREATOR);
                    break;
                case 3:
                    str = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzahk(zzjj, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahk[i];
    }
}
