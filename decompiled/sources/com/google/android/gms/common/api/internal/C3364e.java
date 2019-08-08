package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C3520j.C3521a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3464ay;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.C3516w;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.e */
public final class C3364e {

    /* renamed from: a */
    private static final Object f9776a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C3364e f9777b;

    /* renamed from: c */
    private final String f9778c;

    /* renamed from: d */
    private final Status f9779d;

    /* renamed from: e */
    private final boolean f9780e;

    /* renamed from: f */
    private final boolean f9781f;

    C3364e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C3521a.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f9781f = !z;
        } else {
            this.f9781f = false;
        }
        this.f9780e = z;
        String a = C3464ay.m12389a(context);
        if (a == null) {
            a = new C3516w(context).mo13617a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f9779d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f9778c = null;
            return;
        }
        this.f9778c = a;
        this.f9779d = Status.f9455a;
    }

    /* renamed from: a */
    public static Status m12104a(Context context) {
        Status status;
        C3513t.m12626a(context, (Object) "Context must not be null.");
        synchronized (f9776a) {
            if (f9777b == null) {
                f9777b = new C3364e(context);
            }
            status = f9777b.f9779d;
        }
        return status;
    }

    /* renamed from: a */
    public static String m12106a() {
        return m12105a("getGoogleAppId").f9778c;
    }

    /* renamed from: b */
    public static boolean m12107b() {
        return m12105a("isMeasurementExplicitlyDisabled").f9781f;
    }

    /* renamed from: a */
    private static C3364e m12105a(String str) {
        C3364e eVar;
        synchronized (f9776a) {
            if (f9777b == null) {
                StringBuilder sb = new StringBuilder(34 + String.valueOf(str).length());
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            eVar = f9777b;
        }
        return eVar;
    }
}
