package com.startapp.android.publish.adsCommon.p178b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.C5395h;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.android.publish.adsCommon.b.c */
/* compiled from: StartAppSDK */
public class C5348c {
    /* renamed from: a */
    public static boolean m22844a(Context context, C5286Ad ad) {
        boolean z = false;
        if (ad != null) {
            HashSet hashSet = new HashSet();
            if (ad instanceof C5364e) {
                return m22840a(context, m22843a(((C5364e) ad).mo19847f(), 0), 0, (Set<String>) hashSet, (List<C5345a>) new ArrayList<C5345a>()).booleanValue();
            }
            if (ad instanceof C5395h) {
                List a = m22842a(context, ((C5395h) ad).mo19940d(), 0, (Set<String>) hashSet, false);
                if (a == null || a.size() == 0) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<AdDetails> m22841a(Context context, List<AdDetails> list, int i, Set<String> set) {
        return m22842a(context, list, i, set, true);
    }

    /* renamed from: a */
    public static List<AdDetails> m22842a(Context context, List<AdDetails> list, int i, Set<String> set, boolean z) {
        Context context2 = context;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z2 = false;
        for (AdDetails adDetails : list) {
            C5345a aVar = new C5345a(adDetails.getTrackingUrl(), adDetails.getAppPresencePackage(), i2, adDetails.getMinAppVersion());
            boolean z3 = adDetails.getAppPresencePackage() != null && adDetails.getAppPresencePackage().startsWith("!");
            boolean a = C5509c.m23517a(context2, z3 ? adDetails.getAppPresencePackage().substring(1) : adDetails.getAppPresencePackage(), adDetails.getMinAppVersion());
            boolean z4 = C5344b.m22784a().mo19753E() && ((a && !z3) || (!a && z3));
            arrayList3.add(aVar);
            if (z4) {
                aVar.mo19795b(a);
                aVar.mo19793a(false);
                if (!z3) {
                    arrayList2.add(adDetails);
                    arrayList4.add(aVar);
                }
                set.add(adDetails.getPackageName());
                StringBuilder sb = new StringBuilder();
                sb.append("App Presence:[");
                sb.append(adDetails.getPackageName());
                sb.append("]");
                C5518g.m23563a("AppPresenceUtil", 3, sb.toString());
                z2 = true;
            } else {
                Set<String> set2 = set;
                arrayList.add(adDetails);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("App Not Presence:[");
            sb2.append(adDetails.getPackageName());
            sb2.append("]");
            C5518g.m23563a("AppPresenceUtil", 3, sb2.toString());
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i2 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            for (C5345a a2 : arrayList4.subList(0, min)) {
                a2.mo19793a(true);
            }
        }
        if (z2) {
            C5416l.m23124c(context);
            if (z) {
                new C5346b(context2, arrayList3).mo19799a();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C5345a> m22843a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a = C5307i.m22659a(str, "@tracking@", "@tracking@");
        if (a != null) {
            strArr = a.split(",");
        }
        String[] strArr2 = new String[0];
        String a2 = C5307i.m22659a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a2 != null) {
            strArr2 = a2.split(",");
        }
        String[] strArr3 = new String[0];
        String a3 = C5307i.m22659a(str, "@minAppVersion@", "@minAppVersion@");
        if (a3 != null) {
            strArr3 = a3.split(",");
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            arrayList.add(new C5345a(strArr.length > i2 ? strArr[i2] : null, strArr2[i2], i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        while (i2 < strArr.length) {
            arrayList.add(new C5345a(strArr[i2], "", i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Boolean m22840a(Context context, List<C5345a> list, int i, Set<String> set, List<C5345a> list2) {
        boolean z = false;
        for (C5345a aVar : list) {
            boolean startsWith = aVar.mo19794b().startsWith("!");
            boolean z2 = true;
            boolean a = C5509c.m23517a(context, startsWith ? aVar.mo19794b().substring(1) : aVar.mo19794b(), aVar.mo19798e());
            if ((!startsWith && a) || (startsWith && !a)) {
                C5518g.m23563a("AppPresenceUtil", 3, "in isAppPresent, skipAd is true");
                aVar.mo19795b(a);
                if (i != 0) {
                    z2 = false;
                }
                if (z2 && !startsWith) {
                    set.add(aVar.mo19794b());
                } else if (!z2 && aVar.mo19791a() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.mo19791a());
                    sb.append("&isShown=");
                    sb.append(aVar.mo19796c());
                    sb.append("&appPresence=");
                    sb.append(aVar.mo19797d());
                    aVar.mo19792a(sb.toString());
                }
                z = z2;
            }
            list2.add(aVar);
        }
        if (z) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                ((C5345a) list2.get(i2)).mo19793a(false);
            }
        }
        return Boolean.valueOf(z);
    }
}
