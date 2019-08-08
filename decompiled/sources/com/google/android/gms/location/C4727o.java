package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.o */
public final class C4727o implements Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = "";
        String str2 = "";
        String str3 = "";
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 5) {
                switch (a2) {
                    case 1:
                        str2 = C3509a.m12583o(parcel, a);
                        break;
                    case 2:
                        str3 = C3509a.m12583o(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                str = C3509a.m12583o(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
