package com.google.android.gms.common.p140b;

import android.content.Context;

/* renamed from: com.google.android.gms.common.b.c */
public class C3404c {

    /* renamed from: b */
    private static C3404c f9840b = new C3404c();

    /* renamed from: a */
    private C3403b f9841a = null;

    /* renamed from: b */
    private final synchronized C3403b m12231b(Context context) {
        if (this.f9841a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f9841a = new C3403b(context);
        }
        return this.f9841a;
    }

    /* renamed from: a */
    public static C3403b m12230a(Context context) {
        return f9840b.m12231b(context);
    }
}
