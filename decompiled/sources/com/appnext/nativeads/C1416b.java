package com.appnext.nativeads;

import com.appnext.core.C1345p;
import java.util.HashMap;

/* renamed from: com.appnext.nativeads.b */
public final class C1416b extends C1345p {

    /* renamed from: mO */
    private static C1416b f4355mO;

    /* renamed from: bU */
    private String f4356bU = "http://cdn.appnext.com/tools/sdk/confign/nativeads_new/native_ads_config.json";

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final HashMap<String, String> mo5571z() {
        return null;
    }

    /* renamed from: cT */
    public static synchronized C1416b m5865cT() {
        C1416b bVar;
        synchronized (C1416b.class) {
            if (f4355mO == null) {
                f4355mO = new C1416b();
            }
            bVar = f4355mO;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f4356bU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final HashMap<String, String> mo5567A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("resolve_timeout", "8");
        hashMap.put("urlApp_protection", "true");
        hashMap.put("fq_control", "false");
        hashMap.put("pview", "true");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("default_caching_policy", "3");
        hashMap.put("default_video_quality", "2");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("default_video_length", "2");
        hashMap.put("min_internet_connection_video", "3G");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("cpiActiveFlow", "d");
        hashMap.put("cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("min_imp_precentage", "50");
        hashMap.put("repeat_viewable_criteria", "true");
        hashMap.put("min_vta_precentage", "50");
        hashMap.put("repeat_vta_viewable_criteria", "true");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
