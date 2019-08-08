package com.facebook.ads.internal.p115w.p117b;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.w.b.b */
public enum C2307b {
    APP_AD(0),
    LINK_AD(1),
    APP_AD_V2(2),
    LINK_AD_V2(3),
    APP_ENGAGEMENT_AD(4),
    AD_CHOICES(5),
    JS_TRIGGER(6),
    JS_TRIGGER_NO_AUTO_IMP_LOGGING(7),
    VIDEO_AD(8),
    INLINE_VIDEO_AD(9),
    BANNER_TO_INTERSTITIAL(10),
    NATIVE_CLOSE_BUTTON(11),
    UNIFIED_LOGGING(16),
    HTTP_LINKS(17);
    

    /* renamed from: o */
    public static final C2307b[] f7271o = null;

    /* renamed from: q */
    private static final String f7272q = null;

    /* renamed from: p */
    private final int f7274p;

    static {
        int i;
        f7271o = new C2307b[]{LINK_AD_V2, APP_ENGAGEMENT_AD, AD_CHOICES, JS_TRIGGER_NO_AUTO_IMP_LOGGING, NATIVE_CLOSE_BUTTON, UNIFIED_LOGGING, HTTP_LINKS};
        JSONArray jSONArray = new JSONArray();
        for (C2307b a : f7271o) {
            jSONArray.put(a.mo8713a());
        }
        f7272q = jSONArray.toString();
    }

    private C2307b(int i) {
        this.f7274p = i;
    }

    /* renamed from: b */
    public static String m9017b() {
        return f7272q;
    }

    /* renamed from: a */
    public int mo8713a() {
        return this.f7274p;
    }

    public String toString() {
        return String.valueOf(this.f7274p);
    }
}
