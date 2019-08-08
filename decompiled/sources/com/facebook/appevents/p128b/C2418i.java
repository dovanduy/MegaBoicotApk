package com.facebook.appevents.p128b;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C2757u;
import com.facebook.appevents.C2436g;
import com.facebook.appevents.C2436g.C2439a;
import com.facebook.internal.C2563u;
import java.util.Locale;

/* renamed from: com.facebook.appevents.b.i */
/* compiled from: SessionLogger */
class C2418i {

    /* renamed from: a */
    private static final String f7670a = C2418i.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f7671b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C2418i() {
    }

    /* renamed from: a */
    public static void m9277a(Context context, String str, C2419j jVar, String str2) {
        String jVar2 = jVar != null ? jVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", jVar2);
        C2416g gVar = new C2416g(str, str2, null);
        gVar.mo8854a("fb_mobile_activate_app", bundle);
        if (C2436g.m9317a() != C2439a.EXPLICIT_ONLY) {
            gVar.mo8857b();
        }
    }

    /* renamed from: a */
    public static void m9276a(Context context, String str, C2417h hVar, String str2) {
        Long valueOf = Long.valueOf(hVar.mo8830f() - hVar.mo8827c().longValue());
        if (valueOf.longValue() < 0) {
            valueOf = Long.valueOf(0);
            m9275a();
        }
        Long valueOf2 = Long.valueOf(hVar.mo8832h());
        if (valueOf2.longValue() < 0) {
            m9275a();
            valueOf2 = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", hVar.mo8828d());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m9274a(valueOf.longValue()))}));
        C2419j i = hVar.mo8833i();
        bundle.putString("fb_mobile_launch_source", i != null ? i.toString() : "Unclassified");
        bundle.putLong("_logTime", hVar.mo8827c().longValue() / 1000);
        new C2416g(str, str2, null).mo8853a("fb_mobile_deactivate_app", (double) (valueOf2.longValue() / 1000), bundle);
    }

    /* renamed from: a */
    private static void m9275a() {
        C2563u.m9721a(C2757u.APP_EVENTS, f7670a, "Clock skew detected");
    }

    /* renamed from: a */
    private static int m9274a(long j) {
        int i = 0;
        while (i < f7671b.length && f7671b[i] < j) {
            i++;
        }
        return i;
    }
}
