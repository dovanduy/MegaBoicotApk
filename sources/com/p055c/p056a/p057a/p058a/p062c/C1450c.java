package com.p055c.p056a.p057a.p058a.p062c;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.c.a.a.a.c.c */
public class C1450c {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C1450c f4419a = new C1450c();

    /* renamed from: b */
    private Context f4420b;

    private C1450c() {
    }

    /* renamed from: a */
    public static C1450c m6003a() {
        return f4419a;
    }

    /* renamed from: a */
    public void mo6534a(Context context) {
        this.f4420b = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: b */
    public Context mo6535b() {
        return this.f4420b;
    }
}
