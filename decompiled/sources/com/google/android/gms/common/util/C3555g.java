package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.C3513t;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.util.g */
public final class C3555g {

    /* renamed from: a */
    private static final String[] f10177a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static DropBoxManager f10178b = null;

    /* renamed from: c */
    private static boolean f10179c = false;

    /* renamed from: d */
    private static int f10180d = -1;
    @GuardedBy("CrashUtils.class")

    /* renamed from: e */
    private static int f10181e;
    @GuardedBy("CrashUtils.class")

    /* renamed from: f */
    private static int f10182f;

    /* renamed from: a */
    public static boolean m12743a(Context context, Throwable th) {
        return m12744a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m12744a(Context context, Throwable th, int i) {
        try {
            C3513t.m12625a(context);
            C3513t.m12625a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
