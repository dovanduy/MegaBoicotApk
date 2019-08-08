package com.facebook.ads.internal.p094u;

import com.facebook.ads.internal.protocol.C1784c;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.u.a */
public class C1840a {

    /* renamed from: a */
    private static Map<String, Long> f5855a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<String, Long> f5856b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<String, String> f5857c = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m7739a(long j, C1842b bVar) {
        f5855a.put(m7744d(bVar), Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m7740a(String str, C1842b bVar) {
        f5857c.put(m7744d(bVar), str);
    }

    /* renamed from: a */
    public static boolean m7741a(C1842b bVar) {
        String d = m7744d(bVar);
        boolean z = false;
        if (!f5856b.containsKey(d)) {
            return false;
        }
        long longValue = ((Long) f5856b.get(d)).longValue();
        C1784c c = bVar.mo7813c();
        long j = -1000;
        if (!f5855a.containsKey(d)) {
            switch (c) {
                case BANNER:
                    j = 15000;
                    break;
            }
        } else {
            j = ((Long) f5855a.get(d)).longValue();
        }
        if (System.currentTimeMillis() - longValue < j) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static void m7742b(C1842b bVar) {
        f5856b.put(m7744d(bVar), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static String m7743c(C1842b bVar) {
        return (String) f5857c.get(m7744d(bVar));
    }

    /* renamed from: d */
    private static String m7744d(C1842b bVar) {
        Locale locale = Locale.US;
        String str = "%s:%s:%s:%d:%d:%d";
        Object[] objArr = new Object[6];
        int i = 0;
        objArr[0] = bVar.mo7812b();
        objArr[1] = bVar.mo7813c();
        objArr[2] = bVar.mo7811a();
        objArr[3] = Integer.valueOf(bVar.mo7814d() == null ? 0 : bVar.mo7814d().mo8725a());
        if (bVar.mo7814d() != null) {
            i = bVar.mo7814d().mo8726b();
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = Integer.valueOf(bVar.mo7815e());
        return String.format(locale, str, objArr);
    }
}
