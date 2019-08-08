package com.google.android.gms.internal.p148e;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.af */
public class C4438af {

    /* renamed from: a */
    private static volatile UserManager f14652a;

    /* renamed from: b */
    private static volatile boolean f14653b = (!m18876a());

    private C4438af() {
    }

    /* renamed from: a */
    public static boolean m18876a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m18877a(Context context) {
        return !m18876a() || m18878b(context);
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m18878b(Context context) {
        boolean z = f14653b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager c = m18879c(context);
                if (c == null) {
                    f14653b = true;
                    return true;
                }
                try {
                    if (!c.isUserUnlocked()) {
                        if (c.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            f14653b = z2;
                        }
                    }
                    z2 = true;
                    f14653b = z2;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    f14652a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                f14652a = null;
            }
        }
        return z;
    }

    @TargetApi(24)
    /* renamed from: c */
    private static UserManager m18879c(Context context) {
        UserManager userManager = f14652a;
        if (userManager == null) {
            synchronized (C4438af.class) {
                userManager = f14652a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    f14652a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
