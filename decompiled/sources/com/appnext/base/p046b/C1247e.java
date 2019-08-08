package com.appnext.base.p046b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;

/* renamed from: com.appnext.base.b.e */
public final class C1247e {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: jm */
    private static Context f3970jm;

    private C1247e() {
    }

    public static void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context shouldn't be null");
        }
        f3970jm = context.getApplicationContext();
    }

    /* renamed from: ce */
    public static void m5272ce() {
        f3970jm = null;
    }

    public static Context getContext() {
        return f3970jm;
    }

    public static AssetManager getAssets() {
        return f3970jm.getAssets();
    }

    public static PackageManager getPackageManager() {
        return f3970jm.getPackageManager();
    }

    public static String getPackageName() {
        return f3970jm.getPackageName();
    }

    public static SharedPreferences getSharedPreferences(String str, int i) {
        return f3970jm.getSharedPreferences(str, i);
    }
}
