package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.p140b.C3404c;

/* renamed from: com.google.android.gms.common.util.d */
public class C3552d {
    /* renamed from: a */
    public static boolean m12729a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m12730a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C3404c.m12230a(context).mo13390a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
