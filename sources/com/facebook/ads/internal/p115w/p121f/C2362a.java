package com.facebook.ads.internal.p115w.p121f;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.lang.reflect.Field;

/* renamed from: com.facebook.ads.internal.w.f.a */
public final class C2362a {

    /* renamed from: a */
    public static boolean f7435a;

    /* renamed from: b */
    private static String f7436b;

    /* renamed from: a */
    private static String m9135a() {
        try {
            return (String) Application.class.getMethod("getProcessName", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m9136a(Application application) {
        try {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m9137a(Context context) {
        if (f7436b != null) {
            return f7436b;
        }
        if (VERSION.SDK_INT >= 28) {
            return m9135a();
        }
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            return null;
        }
        f7436b = m9136a((Application) applicationContext);
        return f7436b;
    }

    /* renamed from: a */
    public static String m9138a(String str, Context context) {
        String packageName = context.getPackageName();
        String a = m9137a(context);
        if (TextUtils.isEmpty(a) || packageName.equals(a)) {
            return str;
        }
        if (a.contains(":")) {
            a = a.split(":")[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(a);
        return sb.toString();
    }
}
