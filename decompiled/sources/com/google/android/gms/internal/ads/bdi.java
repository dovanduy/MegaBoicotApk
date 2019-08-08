package com.google.android.gms.internal.ads;

import com.google.ads.C2764a.C2765a;
import com.google.ads.C2764a.C2766b;
import com.google.ads.mediation.C2774a;
import java.util.Date;
import java.util.HashSet;

@C3718cm
public final class bdi {
    /* renamed from: a */
    public static int m16366a(C2765a aVar) {
        switch (bdj.f12693a[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C2774a m16367a(zzjj zzjj, boolean z) {
        C2766b bVar;
        HashSet hashSet = zzjj.f14529e != null ? new HashSet(zzjj.f14529e) : null;
        Date date = new Date(zzjj.f14526b);
        switch (zzjj.f14528d) {
            case 1:
                bVar = C2766b.MALE;
                break;
            case 2:
                bVar = C2766b.FEMALE;
                break;
            default:
                bVar = C2766b.UNKNOWN;
                break;
        }
        C2774a aVar = new C2774a(date, bVar, hashSet, z, zzjj.f14535k);
        return aVar;
    }
}
