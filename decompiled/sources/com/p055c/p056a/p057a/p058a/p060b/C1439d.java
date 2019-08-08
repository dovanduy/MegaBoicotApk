package com.p055c.p056a.p057a.p058a.p060b;

import android.webkit.WebView;
import com.p055c.p056a.p057a.p058a.p064e.C1465e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.c.a.a.a.b.d */
public final class C1439d {

    /* renamed from: a */
    private final C1442g f4379a;

    /* renamed from: b */
    private final WebView f4380b;

    /* renamed from: c */
    private final List<C1443h> f4381c = new ArrayList();

    /* renamed from: d */
    private final String f4382d;

    /* renamed from: e */
    private final String f4383e;

    /* renamed from: f */
    private final C1440e f4384f;

    private C1439d(C1442g gVar, WebView webView, String str, List<C1443h> list, String str2) {
        C1440e eVar;
        this.f4379a = gVar;
        this.f4380b = webView;
        this.f4382d = str;
        if (list != null) {
            this.f4381c.addAll(list);
            eVar = C1440e.NATIVE;
        } else {
            eVar = C1440e.HTML;
        }
        this.f4384f = eVar;
        this.f4383e = str2;
    }

    /* renamed from: a */
    public static C1439d m5941a(C1442g gVar, WebView webView, String str) {
        C1465e.m6070a((Object) gVar, "Partner is null");
        C1465e.m6070a((Object) webView, "WebView is null");
        if (str != null) {
            C1465e.m6071a(str, 256, "CustomReferenceData is greater than 256 characters");
        }
        C1439d dVar = new C1439d(gVar, webView, null, null, str);
        return dVar;
    }

    /* renamed from: a */
    public static C1439d m5942a(C1442g gVar, String str, List<C1443h> list, String str2) {
        C1465e.m6070a((Object) gVar, "Partner is null");
        C1465e.m6070a((Object) str, "OMID JS script content is null");
        C1465e.m6070a((Object) list, "VerificationScriptResources is null");
        if (str2 != null) {
            C1465e.m6071a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        C1439d dVar = new C1439d(gVar, null, str, list, str2);
        return dVar;
    }

    /* renamed from: a */
    public C1442g mo6491a() {
        return this.f4379a;
    }

    /* renamed from: b */
    public List<C1443h> mo6492b() {
        return Collections.unmodifiableList(this.f4381c);
    }

    /* renamed from: c */
    public WebView mo6493c() {
        return this.f4380b;
    }

    /* renamed from: d */
    public String mo6494d() {
        return this.f4383e;
    }

    /* renamed from: e */
    public String mo6495e() {
        return this.f4382d;
    }

    /* renamed from: f */
    public C1440e mo6496f() {
        return this.f4384f;
    }
}
