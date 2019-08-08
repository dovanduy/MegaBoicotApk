package com.appnext.banners;

import com.appnext.core.C1345p;
import java.util.HashMap;

/* renamed from: com.appnext.banners.d */
public final class C1202d extends C1345p {

    /* renamed from: fT */
    private static C1202d f3827fT;

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return "http://cdn.appnext.com/tools/sdk/confign/banner/banner_config.txt";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final HashMap<String, String> mo5571z() {
        return null;
    }

    /* renamed from: aI */
    public static synchronized C1202d m5145aI() {
        C1202d dVar;
        synchronized (C1202d.class) {
            if (f3827fT == null) {
                f3827fT = new C1202d();
            }
            dVar = f3827fT;
        }
        return dVar;
    }

    private C1202d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final HashMap<String, String> mo5567A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("fq_control", "true");
        hashMap.put("urlApp_protection", "true");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("pview", "true");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("BANNER_cpiActiveFlow", "d");
        hashMap.put("BANNER_cpcActiveFlow", "b");
        hashMap.put("LARGE_BANNER_cpiActiveFlow", "d");
        hashMap.put("LARGE_BANNER_cpcActiveFlow", "b");
        hashMap.put("MEDIUM_RECTANGLE_cpiActiveFlow", "d");
        hashMap.put("MEDIUM_RECTANGLE_cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("impOne", "true");
        hashMap.put("_arFlag", "true");
        hashMap.put("banner_ar", "10");
        hashMap.put("large_banner_ar", "10");
        hashMap.put("medium_rectangle_ar", "10");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
