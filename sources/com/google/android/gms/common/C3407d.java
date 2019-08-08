package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3455ap;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3557i;

/* renamed from: com.google.android.gms.common.d */
public class C3407d {

    /* renamed from: a */
    private static final C3407d f9848a = new C3407d();

    /* renamed from: b */
    public static final int f9849b = C3415h.f9877b;

    /* renamed from: b */
    public static C3407d m12253b() {
        return f9848a;
    }

    C3407d() {
    }

    /* renamed from: a */
    public int mo13397a(Context context) {
        return mo13408b(context, f9849b);
    }

    /* renamed from: b */
    public int mo13408b(Context context, int i) {
        int a = C3415h.m12275a(context, i);
        if (C3415h.m12286d(context, a)) {
            return 18;
        }
        return a;
    }

    /* renamed from: c */
    public void mo13417c(Context context, int i) throws C3413f, C3412e {
        C3415h.m12280b(context, i);
    }

    /* renamed from: a */
    public boolean mo13405a(int i) {
        return C3415h.m12281b(i);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo13415c(int i) {
        return mo13402a((Context) null, i, (String) null);
    }

    /* renamed from: a */
    public Intent mo13402a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !C3557i.m12751b(context)) {
                    return C3455ap.m12373a("com.google.android.gms", m12254b(context, str));
                }
                return C3455ap.m12371a();
            case 3:
                return C3455ap.m12372a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: a */
    public PendingIntent mo13400a(Context context, int i, int i2) {
        return mo13413a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo13413a(Context context, int i, int i2, String str) {
        Intent a = mo13402a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: c */
    public void mo13416c(Context context) {
        C3415h.m12283c(context);
    }

    /* renamed from: d */
    public int mo13418d(Context context) {
        return C3415h.m12288f(context);
    }

    /* renamed from: d */
    public boolean mo13419d(Context context, int i) {
        return C3415h.m12286d(context, i);
    }

    /* renamed from: a */
    public boolean mo13414a(Context context, String str) {
        return C3415h.m12279a(context, str);
    }

    /* renamed from: b */
    public String mo13409b(int i) {
        return C3415h.m12277a(i);
    }

    /* renamed from: b */
    private static String m12254b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f9849b);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C3404c.m12230a(context).mo13395b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}
