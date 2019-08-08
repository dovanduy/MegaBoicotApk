package com.facebook.ads.internal.p115w.p117b;

import java.util.UUID;

/* renamed from: com.facebook.ads.internal.w.b.o */
public class C2327o {

    /* renamed from: a */
    private static final String f7318a = "o";

    /* renamed from: b */
    private static volatile boolean f7319b = false;

    /* renamed from: c */
    private static double f7320c;

    /* renamed from: d */
    private static String f7321d;

    /* renamed from: a */
    public static void m9052a() {
        if (!f7319b) {
            synchronized (f7318a) {
                if (!f7319b) {
                    f7319b = true;
                    f7320c = ((double) System.currentTimeMillis()) / 1000.0d;
                    f7321d = UUID.randomUUID().toString();
                }
            }
        }
    }

    /* renamed from: b */
    public static double m9053b() {
        return f7320c;
    }

    /* renamed from: c */
    public static String m9054c() {
        return f7321d;
    }
}
