package com.startapp.android.p164b;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: com.startapp.android.b.c */
/* compiled from: StartAppSDK */
public class C5077c {

    /* renamed from: a */
    private static C5075a f16421a;

    /* renamed from: a */
    public static boolean m21885a(Context context) {
        if (f16421a == null) {
            f16421a = new C5075a(context.getApplicationContext());
        }
        return f16421a.mo18679a() || m21884a() || m21887b() || m21887b() || m21889c() || m21890d() || m21888b(context);
    }

    /* renamed from: a */
    private static boolean m21884a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: b */
    private static boolean m21887b() {
        for (String file : new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"}) {
            if (new File(file).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21889c() {
        /*
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.String r4 = "/system/xbin/which"
            r3[r0] = r4     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.String r4 = "su"
            r5 = 1
            r3[r5] = r4     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.io.InputStream r4 = r2.getInputStream()     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.lang.String r1 = r1.readLine()     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            if (r1 == 0) goto L_0x002b
            r0 = r5
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.destroy()
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            r1 = r2
            goto L_0x0037
        L_0x0034:
            r1 = r2
            goto L_0x003d
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.destroy()
        L_0x003c:
            throw r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.destroy()
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.p164b.C5077c.m21889c():boolean");
    }

    /* renamed from: d */
    private static boolean m21890d() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m21888b(Context context) {
        for (String a : new String[]{"com.noshufou.android.su", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}) {
            if (m21886a(context, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m21886a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
