package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C3557i {

    /* renamed from: a */
    private static Boolean f10184a;

    /* renamed from: b */
    private static Boolean f10185b;

    /* renamed from: c */
    private static Boolean f10186c;

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m12750a(Context context) {
        if (f10184a == null) {
            f10184a = Boolean.valueOf(C3563o.m12769h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f10184a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: b */
    public static boolean m12751b(Context context) {
        return m12750a(context) && (!C3563o.m12772k() || (m12752c(context) && !C3563o.m12773l()));
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m12752c(Context context) {
        if (f10185b == null) {
            f10185b = Boolean.valueOf(C3563o.m12770i() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f10185b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m12753d(Context context) {
        if (f10186c == null) {
            f10186c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f10186c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m12749a() {
        return "user".equals(Build.TYPE);
    }
}
