package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.a */
public abstract class C1585a implements Serializable {
    private static final long serialVersionUID = -5352540727250859603L;

    /* renamed from: a */
    private int f4855a = 200;

    /* renamed from: b */
    private String f4856b;

    /* renamed from: c */
    private String f4857c;

    /* renamed from: a */
    public static C1585a m6558a(boolean z, JSONObject jSONObject) {
        return z ? C1595f.m6626a(jSONObject) : C1608q.m6709a(jSONObject);
    }

    /* renamed from: a */
    public abstract String mo7113a();

    /* renamed from: a */
    public void mo7114a(int i) {
        this.f4855a = i;
    }

    /* renamed from: a */
    public void mo7115a(String str) {
        this.f4856b = str;
    }

    /* renamed from: b */
    public int mo7116b() {
        return this.f4855a;
    }

    /* renamed from: b */
    public void mo7117b(String str) {
        this.f4857c = str;
    }

    /* renamed from: c */
    public String mo7118c() {
        return this.f4856b;
    }

    /* renamed from: d */
    public String mo7119d() {
        return this.f4857c;
    }
}
