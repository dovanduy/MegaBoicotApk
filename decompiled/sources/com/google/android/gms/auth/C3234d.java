package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.d */
public final class C3234d implements Creator<TokenData> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Long l = null;
        List list = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    l = C3509a.m12576h(parcel, a);
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
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        TokenData tokenData = new TokenData(i, str, l, z, z2, list, str2);
        return tokenData;
    }
}
