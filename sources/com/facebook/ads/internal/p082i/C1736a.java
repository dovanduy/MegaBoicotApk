package com.facebook.ads.internal.p082i;

import android.content.Context;

/* renamed from: com.facebook.ads.internal.i.a */
public final class C1736a {

    /* renamed from: a */
    private static Context f5428a;

    /* renamed from: a */
    public static Context m7215a() {
        return f5428a;
    }

    /* renamed from: a */
    public static void m7216a(Context context) {
        if (context != null) {
            f5428a = context.getApplicationContext();
        }
    }
}
