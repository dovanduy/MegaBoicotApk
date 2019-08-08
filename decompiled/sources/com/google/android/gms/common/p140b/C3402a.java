package com.google.android.gms.common.p140b;

import android.content.Context;
import com.google.android.gms.common.util.C3563o;

/* renamed from: com.google.android.gms.common.b.a */
public class C3402a {

    /* renamed from: a */
    private static Context f9837a;

    /* renamed from: b */
    private static Boolean f9838b;

    /* renamed from: a */
    public static synchronized boolean m12220a(Context context) {
        synchronized (C3402a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f9837a == null || f9838b == null || f9837a != applicationContext) {
                f9838b = null;
                if (C3563o.m12773l()) {
                    f9838b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f9838b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        f9838b = Boolean.valueOf(false);
                    }
                }
                f9837a = applicationContext;
                boolean booleanValue = f9838b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f9838b.booleanValue();
            return booleanValue2;
        }
    }
}
