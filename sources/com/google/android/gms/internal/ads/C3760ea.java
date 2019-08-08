package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ea */
public final class C3760ea implements Creator<zzaey> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Bundle bundle = null;
        zzang zzang = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    bundle = C3509a.m12585q(parcel, a);
                    break;
                case 2:
                    zzang = (zzang) C3509a.m12564a(parcel, a, zzang.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C3509a.m12564a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 5:
                    list = C3509a.m12557B(parcel, a);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C3509a.m12564a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 8:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 9:
                    str3 = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzaey zzaey = new zzaey(bundle, zzang, applicationInfo, str, list, packageInfo, str2, z, str3);
        return zzaey;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaey[i];
    }
}
