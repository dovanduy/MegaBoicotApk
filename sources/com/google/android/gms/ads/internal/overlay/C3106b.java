package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.ads.internal.overlay.b */
public final class C3106b implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
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
                    str3 = C3509a.m12583o(parcel, a);
                    break;
                case 5:
                    str4 = C3509a.m12583o(parcel, a);
                    break;
                case 6:
                    str5 = C3509a.m12583o(parcel, a);
                    break;
                case 7:
                    str6 = C3509a.m12583o(parcel, a);
                    break;
                case 8:
                    str7 = C3509a.m12583o(parcel, a);
                    break;
                case 9:
                    intent = (Intent) C3509a.m12564a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzc zzc = new zzc(str, str2, str3, str4, str5, str6, str7, intent);
        return zzc;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
