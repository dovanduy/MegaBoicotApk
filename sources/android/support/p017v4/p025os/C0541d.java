package android.support.p017v4.p025os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.d */
/* compiled from: TraceCompat */
public final class C0541d {
    /* renamed from: a */
    public static void m2067a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m2066a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
