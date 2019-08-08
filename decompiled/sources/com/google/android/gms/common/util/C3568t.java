package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C3416i;
import com.google.android.gms.common.p140b.C3404c;

/* renamed from: com.google.android.gms.common.util.t */
public final class C3568t {
    /* renamed from: a */
    public static boolean m12780a(Context context, int i) {
        if (!m12781a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C3416i.m12290a(context).mo13433a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m12781a(Context context, int i, String str) {
        return C3404c.m12230a(context).mo13393a(i, str);
    }
}
