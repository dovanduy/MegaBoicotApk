package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.b.i */
public class C1598i implements Serializable {
    private static final long serialVersionUID = -4041915335826065133L;

    /* renamed from: a */
    private final String f4922a;

    /* renamed from: b */
    private final String f4923b;

    C1598i(String str, String str2) {
        this.f4922a = m6648a(str);
        this.f4923b = m6648a(str2);
    }

    /* renamed from: a */
    private static String m6648a(String str) {
        return "null".equalsIgnoreCase(str) ? "" : str;
    }

    /* renamed from: a */
    public String mo7178a() {
        return this.f4922a;
    }

    /* renamed from: b */
    public String mo7179b() {
        return this.f4923b;
    }
}
