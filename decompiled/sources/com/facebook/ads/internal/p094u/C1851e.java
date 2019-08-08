package com.facebook.ads.internal.p094u;

import com.facebook.ads.internal.p086m.C1764c;

/* renamed from: com.facebook.ads.internal.u.e */
class C1851e {

    /* renamed from: a */
    private final C1852a f5892a;

    /* renamed from: b */
    private final C1764c f5893b;

    /* renamed from: c */
    private final String f5894c;

    /* renamed from: d */
    private final String f5895d;

    /* renamed from: e */
    private final String f5896e;

    /* renamed from: com.facebook.ads.internal.u.e$a */
    enum C1852a {
        UNKNOWN,
        ERROR,
        ADS
    }

    C1851e(C1852a aVar) {
        this(aVar, null, null, null, null);
    }

    C1851e(C1852a aVar, C1764c cVar, String str, String str2, String str3) {
        this.f5892a = aVar;
        this.f5893b = cVar;
        this.f5894c = str;
        this.f5895d = str2;
        this.f5896e = str3;
    }

    /* renamed from: a */
    public C1764c mo7829a() {
        return this.f5893b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1852a mo7830b() {
        return this.f5892a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo7831c() {
        return this.f5894c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo7832d() {
        return this.f5895d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo7833e() {
        return this.f5896e;
    }
}
