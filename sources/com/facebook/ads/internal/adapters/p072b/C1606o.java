package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.b.o */
public class C1606o implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final String f4962a;

    /* renamed from: b */
    private final C1602m f4963b;

    /* renamed from: c */
    private final C1591e f4964c;

    /* renamed from: d */
    private final C1598i f4965d;

    /* renamed from: e */
    private final C1586b f4966e;

    /* renamed from: f */
    private final C1588d f4967f;

    /* renamed from: g */
    private final String f4968g;

    private C1606o(String str, String str2, C1602m mVar, C1591e eVar, C1598i iVar, C1586b bVar, C1588d dVar) {
        this.f4968g = str;
        this.f4962a = str2;
        this.f4963b = mVar;
        this.f4964c = eVar;
        this.f4965d = iVar;
        this.f4966e = bVar;
        this.f4967f = dVar;
    }

    /* renamed from: a */
    public static C1606o m6699a(C1600k kVar) {
        C1601l lVar = (C1601l) kVar.mo7190d().get(0);
        C1606o oVar = new C1606o(kVar.mo7191e(), kVar.mo7189c(), kVar.mo7185a(), lVar.mo7196a(), lVar.mo7197b(), kVar.mo7188b(), lVar.mo7198c());
        return oVar;
    }

    /* renamed from: a */
    public static C1606o m6700a(C1608q qVar) {
        C1606o oVar = new C1606o(qVar.mo7230e(), qVar.mo7113a(), qVar.mo7231f(), qVar.mo7232g(), qVar.mo7233h(), qVar.mo7234i(), qVar.mo7235j());
        return oVar;
    }

    /* renamed from: a */
    public String mo7221a() {
        return this.f4968g;
    }

    /* renamed from: b */
    public C1602m mo7222b() {
        return this.f4963b;
    }

    /* renamed from: c */
    public C1591e mo7223c() {
        return this.f4964c;
    }

    /* renamed from: d */
    public C1598i mo7224d() {
        return this.f4965d;
    }

    /* renamed from: e */
    public C1586b mo7225e() {
        return this.f4966e;
    }

    /* renamed from: f */
    public C1588d mo7226f() {
        return this.f4967f;
    }

    /* renamed from: g */
    public String mo7227g() {
        return this.f4962a;
    }
}
