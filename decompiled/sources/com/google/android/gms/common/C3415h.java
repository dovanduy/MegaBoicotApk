package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.facebook.ads.internal.p083j.C1746e;
import com.google.android.gms.common.C3520j.C3521a;
import com.google.android.gms.common.internal.C3464ay;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.common.util.C3568t;
import com.google.android.gms.common.util.C3569u;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.h */
public class C3415h {

    /* renamed from: a */
    private static boolean f9876a = false;
    @Deprecated

    /* renamed from: b */
    public static final int f9877b = 12451000;

    /* renamed from: c */
    static final AtomicBoolean f9878c = new AtomicBoolean();

    /* renamed from: d */
    private static boolean f9879d = false;

    /* renamed from: e */
    private static boolean f9880e = false;

    /* renamed from: f */
    private static boolean f9881f = false;

    /* renamed from: g */
    private static final AtomicBoolean f9882g = new AtomicBoolean();

    @Deprecated
    /* renamed from: b */
    public static boolean m12281b(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public static String m12277a(int i) {
        return ConnectionResult.m11580a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static int m12275a(Context context, int i) {
        try {
            context.getResources().getString(C3521a.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f9882g.get()) {
            int b = C3464ay.m12390b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != f9877b) {
                int i2 = f9877b;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m12276a(context, !C3557i.m12751b(context) && !C3557i.m12753d(context), i);
    }

    /* renamed from: a */
    private static int m12276a(Context context, boolean z, int i) {
        C3513t.m12635b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C3416i.m12290a(context);
            if (!C3416i.m12293a(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            } else if (z && (!C3416i.m12293a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (C3569u.m12782a(packageInfo2.versionCode) < C3569u.m12782a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            }
        } catch (NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m12280b(Context context, int i) throws C3413f, C3412e {
        int b = C3407d.m12253b().mo13408b(context, i);
        if (b != 0) {
            Intent a = C3407d.m12253b().mo13402a(context, b, C1746e.f5472a);
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a == null) {
                throw new C3412e(b);
            }
            throw new C3413f(b, "Google Play Services not available", a);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m12284c(Context context, int i) {
        return C3568t.m12780a(context, i);
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: a */
    public static boolean m12278a(Context context, int i, String str) {
        return C3568t.m12781a(context, i, str);
    }

    /* renamed from: b */
    public static boolean m12282b(Context context) {
        if (!f9881f) {
            try {
                PackageInfo b = C3404c.m12230a(context).mo13395b("com.google.android.gms", 64);
                C3416i.m12290a(context);
                if (b == null || C3416i.m12293a(b, false) || !C3416i.m12293a(b, true)) {
                    f9880e = false;
                } else {
                    f9880e = true;
                }
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f9881f = true;
            }
        }
        return f9880e || !C3557i.m12749a();
    }

    @Deprecated
    /* renamed from: c */
    public static void m12283c(Context context) {
        if (!f9878c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    /* renamed from: d */
    public static Resources m12285d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Context m12287e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: f */
    public static int m12288f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m12286d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m12279a(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: a */
    static boolean m12279a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C3563o.m12770i()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m12289g(context);
        } catch (NameNotFoundException unused2) {
            return false;
        }
    }

    @TargetApi(18)
    /* renamed from: g */
    public static boolean m12289g(Context context) {
        if (C3563o.m12767f()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
}
