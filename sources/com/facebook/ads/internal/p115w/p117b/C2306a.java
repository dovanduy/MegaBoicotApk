package com.facebook.ads.internal.p115w.p117b;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.w.b.a */
public class C2306a {

    /* renamed from: a */
    private static boolean f7255a = false;

    /* renamed from: b */
    private static boolean f7256b = false;

    /* renamed from: a */
    public static synchronized String m9014a(String str) {
        synchronized (C2306a.class) {
            if (!m9015a()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fb.e2e.");
            sb.append(str);
            String property = System.getProperty(sb.toString());
            return property;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m9015a() {
        boolean z;
        synchronized (C2306a.class) {
            if (!f7256b) {
                f7255a = "true".equals(System.getProperty("fb.running_e2e"));
                f7256b = true;
            }
            z = f7255a;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized boolean m9016b(String str) {
        boolean z;
        synchronized (C2306a.class) {
            z = !TextUtils.isEmpty(m9014a(str));
        }
        return z;
    }
}
