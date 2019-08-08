package com.p055c.p056a.p057a.p058a.p060b;

import com.p055c.p056a.p057a.p058a.p064e.C1465e;
import java.net.URL;

/* renamed from: com.c.a.a.a.b.h */
public final class C1443h {

    /* renamed from: a */
    private final String f4396a;

    /* renamed from: b */
    private final URL f4397b;

    /* renamed from: c */
    private final String f4398c;

    private C1443h(String str, URL url, String str2) {
        this.f4396a = str;
        this.f4397b = url;
        this.f4398c = str2;
    }

    /* renamed from: a */
    public static C1443h m5952a(String str, URL url, String str2) {
        C1465e.m6072a(str, "VendorKey is null or empty");
        C1465e.m6070a((Object) url, "ResourceURL is null");
        C1465e.m6072a(str2, "VerificationParameters is null or empty");
        return new C1443h(str, url, str2);
    }

    /* renamed from: a */
    public String mo6501a() {
        return this.f4396a;
    }

    /* renamed from: b */
    public URL mo6502b() {
        return this.f4397b;
    }

    /* renamed from: c */
    public String mo6503c() {
        return this.f4398c;
    }
}
