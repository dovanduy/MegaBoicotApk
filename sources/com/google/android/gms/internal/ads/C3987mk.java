package com.google.android.gms.internal.ads;

import android.util.Log;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.mk */
public class C3987mk {
    /* renamed from: a */
    private static String m17426a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(13 + String.valueOf(str).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m17427a(String str, Throwable th) {
        if (m17428a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: a */
    public static boolean m17428a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    /* renamed from: b */
    public static void m17429b(String str) {
        if (m17428a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m17430b(String str, Throwable th) {
        if (m17428a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m17431c(String str) {
        if (m17428a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m17432c(String str, Throwable th) {
        if (m17428a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m17433d(String str) {
        if (m17428a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: d */
    public static void m17434d(String str, Throwable th) {
        if (m17428a(5)) {
            if (th != null) {
                m17432c(m17426a(str), th);
                return;
            }
            m17435e(m17426a(str));
        }
    }

    /* renamed from: e */
    public static void m17435e(String str) {
        if (m17428a(5)) {
            Log.w("Ads", str);
        }
    }

    /* renamed from: f */
    public static void m17436f(String str) {
        m17434d(str, null);
    }
}
