package com.facebook.ads.internal.p115w.p117b;

import java.util.Random;

/* renamed from: com.facebook.ads.internal.w.b.q */
public class C2330q {
    /* renamed from: a */
    public static String m9055a(int i) {
        if (i > 0 && new Random().nextFloat() < 1.0f / ((float) i)) {
            return C2332s.m9059a(Thread.currentThread().getStackTrace());
        }
        return null;
    }
}
