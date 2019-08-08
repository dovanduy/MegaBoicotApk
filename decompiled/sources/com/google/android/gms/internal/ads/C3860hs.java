package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hs */
public final class C3860hs implements Creator<zzaiq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 4:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 5:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    list = C3509a.m12557B(parcel, a);
                    break;
                case 7:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                case 8:
                    z4 = C3509a.m12571c(parcel, a);
                    break;
                case 9:
                    list2 = C3509a.m12557B(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzaiq zzaiq = new zzaiq(str, str2, z, z2, list, z3, z4, list2);
        return zzaiq;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaiq[i];
    }
}
