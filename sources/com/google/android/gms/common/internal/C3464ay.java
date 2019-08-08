package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p140b.C3404c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.ay */
public final class C3464ay {

    /* renamed from: a */
    private static Object f9984a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f9985b;

    /* renamed from: c */
    private static String f9986c;

    /* renamed from: d */
    private static int f9987d;

    /* renamed from: a */
    public static String m12389a(Context context) {
        m12391c(context);
        return f9986c;
    }

    /* renamed from: b */
    public static int m12390b(Context context) {
        m12391c(context);
        return f9987d;
    }

    /* renamed from: c */
    private static void m12391c(Context context) {
        synchronized (f9984a) {
            if (!f9985b) {
                f9985b = true;
                try {
                    Bundle bundle = C3404c.m12230a(context).mo13390a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f9986c = bundle.getString("com.google.app.id");
                        f9987d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
