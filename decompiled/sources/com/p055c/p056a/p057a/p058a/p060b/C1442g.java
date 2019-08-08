package com.p055c.p056a.p057a.p058a.p060b;

import com.p055c.p056a.p057a.p058a.p064e.C1465e;

/* renamed from: com.c.a.a.a.b.g */
public class C1442g {

    /* renamed from: a */
    private final String f4394a;

    /* renamed from: b */
    private final String f4395b;

    private C1442g(String str, String str2) {
        this.f4394a = str;
        this.f4395b = str2;
    }

    /* renamed from: a */
    public static C1442g m5949a(String str, String str2) {
        C1465e.m6072a(str, "Name is null or empty");
        C1465e.m6072a(str2, "Version is null or empty");
        return new C1442g(str, str2);
    }

    /* renamed from: a */
    public String mo6499a() {
        return this.f4394a;
    }

    /* renamed from: b */
    public String mo6500b() {
        return this.f4395b;
    }
}
