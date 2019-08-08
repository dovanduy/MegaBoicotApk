package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.b.j */
public class C1599j implements Serializable {
    private static final long serialVersionUID = -2102939945352398575L;

    /* renamed from: a */
    private final byte[] f4924a;

    /* renamed from: b */
    private final String f4925b;

    /* renamed from: c */
    private final List<String> f4926c;

    /* renamed from: d */
    private String f4927d;

    C1599j(byte[] bArr, String str, List<String> list) {
        this.f4924a = bArr;
        this.f4925b = str;
        this.f4926c = list;
    }

    /* renamed from: a */
    public String mo7180a() {
        return this.f4927d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7181a(String str) {
        this.f4927d = str;
    }

    /* renamed from: b */
    public byte[] mo7182b() {
        return this.f4924a;
    }

    /* renamed from: c */
    public String mo7183c() {
        return this.f4925b;
    }

    /* renamed from: d */
    public List<String> mo7184d() {
        return Collections.unmodifiableList(this.f4926c);
    }
}
