package com.facebook.ads.internal.p080g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.ads.internal.p080g.C1714a.C1718c;
import com.facebook.ads.internal.p080g.C1720c.C1721a;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p115w.p117b.C2306a;
import com.facebook.ads.internal.p115w.p121f.C2362a;

/* renamed from: com.facebook.ads.internal.g.b */
public class C1719b {

    /* renamed from: a */
    public static String f5385a = "";

    /* renamed from: b */
    public static String f5386b = "";

    /* renamed from: c */
    public static boolean f5387c = false;

    /* renamed from: d */
    public static String f5388d = "";

    /* renamed from: a */
    public static void m7171a(Context context) {
        C1721a aVar;
        C1714a aVar2;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C2362a.m9138a("SDKIDFA", context), 0);
            if (sharedPreferences.contains("attributionId")) {
                f5385a = sharedPreferences.getString("attributionId", "");
            }
            if (sharedPreferences.contains("advertisingId")) {
                f5386b = sharedPreferences.getString("advertisingId", "");
                f5387c = sharedPreferences.getBoolean("limitAdTracking", f5387c);
                f5388d = C1718c.SHARED_PREFS.name();
            }
            try {
                aVar = C1720c.m7172a(context.getContentResolver());
            } catch (Exception e) {
                C1775b.m7365a(C1774a.m7362a(e, "Error retrieving attribution id from fb4a"));
                aVar = null;
            }
            if (!(aVar == null || aVar.f5389a == null)) {
                f5385a = aVar.f5389a;
            }
            if (C2306a.m9015a() && C2306a.m9016b("aid_override")) {
                f5385a = C2306a.m9014a("aid_override");
            }
            try {
                aVar2 = C1714a.m7163a(context, aVar);
            } catch (Exception e2) {
                C1775b.m7365a(C1774a.m7362a(e2, "Error retrieving advertising id from Google Play Services"));
                aVar2 = null;
            }
            if (aVar2 != null) {
                String a = aVar2.mo7483a();
                Boolean valueOf = Boolean.valueOf(aVar2.mo7484b());
                if (a != null) {
                    f5386b = a;
                    f5387c = valueOf.booleanValue();
                    f5388d = aVar2.mo7485c().name();
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putString("attributionId", f5385a);
            edit.putString("advertisingId", f5386b);
            edit.putBoolean("limitAdTracking", f5387c);
            edit.apply();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
