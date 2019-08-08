package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.eb */
public class C3761eb {

    /* renamed from: a */
    public static boolean f12916a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static String f12917b = "Volley";

    /* renamed from: com.google.android.gms.internal.ads.eb$a */
    static class C3762a {

        /* renamed from: a */
        public static final boolean f12918a = C3761eb.f12916a;

        /* renamed from: b */
        private final List<C3789fb> f12919b = new ArrayList();

        /* renamed from: c */
        private boolean f12920c = false;

        C3762a() {
        }

        /* renamed from: a */
        public final synchronized void mo15260a(String str) {
            long j;
            this.f12920c = true;
            if (this.f12919b.size() == 0) {
                j = 0;
            } else {
                j = ((C3789fb) this.f12919b.get(this.f12919b.size() - 1)).f13045c - ((C3789fb) this.f12919b.get(0)).f13045c;
            }
            if (j > 0) {
                long j2 = ((C3789fb) this.f12919b.get(0)).f13045c;
                C3761eb.m16554b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C3789fb fbVar : this.f12919b) {
                    long j3 = fbVar.f13045c;
                    C3761eb.m16554b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(fbVar.f13044b), fbVar.f13043a);
                    j2 = j3;
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo15261a(String str, long j) {
            if (this.f12920c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            List<C3789fb> list = this.f12919b;
            C3789fb fbVar = new C3789fb(str, j, SystemClock.elapsedRealtime());
            list.add(fbVar);
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f12920c) {
                mo15260a("Request on the loose");
                C3761eb.m16555c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m16552a(String str, Object... objArr) {
        if (f12916a) {
            Log.v(f12917b, m16556d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m16553a(Throwable th, String str, Object... objArr) {
        Log.e(f12917b, m16556d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m16554b(String str, Object... objArr) {
        Log.d(f12917b, m16556d(str, objArr));
    }

    /* renamed from: c */
    public static void m16555c(String str, Object... objArr) {
        Log.e(f12917b, m16556d(str, objArr));
    }

    /* renamed from: d */
    private static String m16556d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (!stackTrace[i].getClass().equals(C3761eb.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
