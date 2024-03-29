package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dm */
public final class C3745dm implements Creator<zzaef> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        long j = 0;
        long j2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        Bundle bundle = null;
        zzjj zzjj = null;
        zzjn zzjn = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzang zzang = null;
        Bundle bundle2 = null;
        List list = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzpl zzpl = null;
        List list3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzlu zzlu = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        List list4 = null;
        String str15 = null;
        List list5 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    bundle = C3509a.m12585q(parcel2, a);
                    break;
                case 3:
                    zzjj = (zzjj) C3509a.m12564a(parcel2, a, zzjj.CREATOR);
                    break;
                case 4:
                    zzjn = (zzjn) C3509a.m12564a(parcel2, a, zzjn.CREATOR);
                    break;
                case 5:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C3509a.m12564a(parcel2, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C3509a.m12564a(parcel2, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 9:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 10:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 11:
                    zzang = (zzang) C3509a.m12564a(parcel2, a, zzang.CREATOR);
                    break;
                case 12:
                    bundle2 = C3509a.m12585q(parcel2, a);
                    break;
                case 13:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 14:
                    list = C3509a.m12557B(parcel2, a);
                    break;
                case 15:
                    bundle3 = C3509a.m12585q(parcel2, a);
                    break;
                case 16:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 18:
                    i3 = C3509a.m12573e(parcel2, a);
                    break;
                case 19:
                    i4 = C3509a.m12573e(parcel2, a);
                    break;
                case 20:
                    f = C3509a.m12578j(parcel2, a);
                    break;
                case 21:
                    str5 = C3509a.m12583o(parcel2, a);
                    break;
                case 25:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 26:
                    str6 = C3509a.m12583o(parcel2, a);
                    break;
                case 27:
                    list2 = C3509a.m12557B(parcel2, a);
                    break;
                case 28:
                    str7 = C3509a.m12583o(parcel2, a);
                    break;
                case 29:
                    zzpl = (zzpl) C3509a.m12564a(parcel2, a, zzpl.CREATOR);
                    break;
                case 30:
                    list3 = C3509a.m12557B(parcel2, a);
                    break;
                case 31:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 33:
                    str8 = C3509a.m12583o(parcel2, a);
                    break;
                case 34:
                    f2 = C3509a.m12578j(parcel2, a);
                    break;
                case 35:
                    i5 = C3509a.m12573e(parcel2, a);
                    break;
                case 36:
                    i6 = C3509a.m12573e(parcel2, a);
                    break;
                case 37:
                    z3 = C3509a.m12571c(parcel2, a);
                    break;
                case 38:
                    z4 = C3509a.m12571c(parcel2, a);
                    break;
                case 39:
                    str9 = C3509a.m12583o(parcel2, a);
                    break;
                case 40:
                    z2 = C3509a.m12571c(parcel2, a);
                    break;
                case 41:
                    str10 = C3509a.m12583o(parcel2, a);
                    break;
                case 42:
                    z5 = C3509a.m12571c(parcel2, a);
                    break;
                case 43:
                    i7 = C3509a.m12573e(parcel2, a);
                    break;
                case 44:
                    bundle4 = C3509a.m12585q(parcel2, a);
                    break;
                case 45:
                    str11 = C3509a.m12583o(parcel2, a);
                    break;
                case 46:
                    zzlu = (zzlu) C3509a.m12564a(parcel2, a, zzlu.CREATOR);
                    break;
                case 47:
                    z6 = C3509a.m12571c(parcel2, a);
                    break;
                case 48:
                    bundle5 = C3509a.m12585q(parcel2, a);
                    break;
                case 49:
                    str12 = C3509a.m12583o(parcel2, a);
                    break;
                case 50:
                    str13 = C3509a.m12583o(parcel2, a);
                    break;
                case 51:
                    str14 = C3509a.m12583o(parcel2, a);
                    break;
                case 52:
                    z7 = C3509a.m12571c(parcel2, a);
                    break;
                case 53:
                    list4 = C3509a.m12556A(parcel2, a);
                    break;
                case 54:
                    str15 = C3509a.m12583o(parcel2, a);
                    break;
                case 55:
                    list5 = C3509a.m12557B(parcel2, a);
                    break;
                case 56:
                    i8 = C3509a.m12573e(parcel2, a);
                    break;
                case 57:
                    z8 = C3509a.m12571c(parcel2, a);
                    break;
                case 58:
                    z9 = C3509a.m12571c(parcel2, a);
                    break;
                case 59:
                    z10 = C3509a.m12571c(parcel2, a);
                    break;
                case 60:
                    arrayList = C3509a.m12557B(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzaef zzaef = new zzaef(i, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzang, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzpl, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzlu, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10, arrayList);
        return zzaef;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaef[i];
    }
}
