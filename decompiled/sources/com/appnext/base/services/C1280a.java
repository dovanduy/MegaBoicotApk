package com.appnext.base.services;

import com.appnext.base.operations.C1268c;

/* renamed from: com.appnext.base.services.a */
public final class C1280a {

    /* renamed from: ip */
    private static volatile C1280a f4082ip;

    /* renamed from: gD */
    private String f4083gD;

    private C1280a() {
    }

    /* renamed from: cb */
    public static C1280a m5525cb() {
        if (f4082ip == null) {
            synchronized (C1268c.class) {
                if (f4082ip == null) {
                    f4082ip = new C1280a();
                }
            }
        }
        return f4082ip;
    }

    public final synchronized void setKey(String str) {
        this.f4083gD = str;
    }

    public final synchronized String getKey() {
        return this.f4083gD;
    }
}
