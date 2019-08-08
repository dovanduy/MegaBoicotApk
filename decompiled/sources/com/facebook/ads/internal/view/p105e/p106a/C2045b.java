package com.facebook.ads.internal.view.p105e.p106a;

import com.facebook.ads.internal.adapters.p072b.C1601l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e.a.b */
public class C2045b {

    /* renamed from: a */
    private final int f6474a;

    /* renamed from: b */
    private final int f6475b;

    /* renamed from: c */
    private final C1601l f6476c;

    C2045b(int i, int i2, C1601l lVar) {
        this.f6474a = i;
        this.f6475b = i2;
        this.f6476c = lVar;
    }

    /* renamed from: a */
    public Map<String, String> mo8269a() {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6474a);
        sb.append("");
        hashMap.put("cardind", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6475b);
        sb2.append("");
        hashMap.put("cardcnt", sb2.toString());
        return hashMap;
    }

    /* renamed from: b */
    public int mo8270b() {
        return this.f6474a;
    }

    /* renamed from: c */
    public C1601l mo8271c() {
        return this.f6476c;
    }
}
