package com.facebook.ads.internal.adapters.p072b;

/* renamed from: com.facebook.ads.internal.adapters.b.p */
public enum C1607p {
    WEBVIEW_PRECACHE,
    PROXY_PRECACHE,
    FILE_PRECACHE;

    /* renamed from: a */
    public static C1607p m6708a(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return FILE_PRECACHE;
        }
    }
}
