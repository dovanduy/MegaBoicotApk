package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bm */
public final class C3042bm {
    /* renamed from: a */
    private static String m11005a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String str = obj == null ? "null" : obj instanceof Bundle ? m11005a((Bundle) obj) : obj.toString();
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Object[] m11006a(String str, zzjj zzjj, String str2, int i, zzjn zzjn) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzjj.f14526b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m11005a(zzjj.f14527c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzjj.f14528d));
        }
        if (hashSet.contains("keywords")) {
            if (zzjj.f14529e != null) {
                arrayList.add(zzjj.f14529e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzjj.f14530f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzjj.f14531g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzjj.f14532h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzjj.f14533i);
        }
        if (hashSet.contains("location")) {
            if (zzjj.f14535k != null) {
                arrayList.add(zzjj.f14535k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzjj.f14536l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m11005a(zzjj.f14537m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m11005a(zzjj.f14538n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzjj.f14539o != null) {
                arrayList.add(zzjj.f14539o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzjj.f14540p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzjj.f14541q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzjj.f14542r));
        }
        return arrayList.toArray();
    }
}
