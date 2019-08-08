package com.facebook.ads.internal.p084k;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.b */
public class C1753b {

    /* renamed from: a */
    private final String f5491a;

    /* renamed from: b */
    private final Map<String, String> f5492b;

    /* renamed from: c */
    private final String f5493c;

    public C1753b(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public C1753b(String str, Map<String, String> map, boolean z) {
        this.f5491a = str;
        this.f5492b = map;
        this.f5493c = z ? "1" : "0";
    }

    /* renamed from: a */
    public Map<String, String> mo7570a() {
        HashMap hashMap = new HashMap();
        hashMap.put("stacktrace", this.f5491a);
        hashMap.put("caught_exception", this.f5493c);
        hashMap.putAll(this.f5492b);
        return hashMap;
    }
}
