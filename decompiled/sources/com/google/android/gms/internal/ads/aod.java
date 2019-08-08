package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

public final class aod implements Creator<zzjj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        Bundle bundle = null;
        List list = null;
        String str = null;
        zzmq zzmq = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 3:
                    bundle = C3509a.m12585q(parcel2, a);
                    break;
                case 4:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 5:
                    list = C3509a.m12557B(parcel2, a);
                    break;
                case 6:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 7:
                    i3 = C3509a.m12573e(parcel2, a);
                    break;
                case 8:
                    z2 = C3509a.m12571c(parcel2, a);
                    break;
                case 9:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 10:
                    zzmq = (zzmq) C3509a.m12564a(parcel2, a, zzmq.CREATOR);
                    break;
                case 11:
                    location = (Location) C3509a.m12564a(parcel2, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 13:
                    bundle2 = C3509a.m12585q(parcel2, a);
                    break;
                case 14:
                    bundle3 = C3509a.m12585q(parcel2, a);
                    break;
                case 15:
                    list2 = C3509a.m12557B(parcel2, a);
                    break;
                case 16:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 17:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 18:
                    z3 = C3509a.m12571c(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzjj zzjj = new zzjj(i, j, bundle, i2, list, z, i3, z2, str, zzmq, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        return zzjj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjj[i];
    }
}
