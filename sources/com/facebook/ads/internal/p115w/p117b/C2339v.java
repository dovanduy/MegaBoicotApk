package com.facebook.ads.internal.p115w.p117b;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.w.b.v */
public class C2339v {

    /* renamed from: a */
    public static C2340a f7348a;

    /* renamed from: com.facebook.ads.internal.w.b.v$a */
    public interface C2340a {
        /* renamed from: a */
        long mo8736a();
    }

    /* renamed from: a */
    public static long m9067a() {
        return f7348a != null ? f7348a.mo8736a() : System.currentTimeMillis();
    }

    /* renamed from: a */
    public static String m9068a(double d) {
        try {
            return String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(d)});
        } catch (Exception e) {
            Log.e(C2339v.class.getSimpleName(), "Can't format time.", e);
            return "1.234";
        }
    }

    /* renamed from: a */
    public static String m9069a(long j) {
        return Long.toString(j);
    }

    @Deprecated
    /* renamed from: b */
    public static String m9070b(long j) {
        return m9068a(((double) j) / 1000.0d);
    }
}
