package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.internal.ads.zzang;

/* renamed from: com.google.android.gms.ads.internal.overlay.l */
public final class C3116l implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzang zzang = null;
        String str4 = null;
        zzaq zzaq = null;
        IBinder iBinder6 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    zzc = (zzc) C3509a.m12564a(parcel2, a, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = C3509a.m12584p(parcel2, a);
                    break;
                case 4:
                    iBinder2 = C3509a.m12584p(parcel2, a);
                    break;
                case 5:
                    iBinder3 = C3509a.m12584p(parcel2, a);
                    break;
                case 6:
                    iBinder4 = C3509a.m12584p(parcel2, a);
                    break;
                case 7:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 8:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 9:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 10:
                    iBinder5 = C3509a.m12584p(parcel2, a);
                    break;
                case 11:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 12:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 13:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 14:
                    zzang = (zzang) C3509a.m12564a(parcel2, a, zzang.CREATOR);
                    break;
                case 16:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 17:
                    zzaq = (zzaq) C3509a.m12564a(parcel2, a, zzaq.CREATOR);
                    break;
                case 18:
                    iBinder6 = C3509a.m12584p(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzang, str4, zzaq, iBinder6);
        return adOverlayInfoParcel;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
