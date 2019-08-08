package com.appnext.ads.interstitial;

import com.appnext.core.C1345p;
import java.util.HashMap;

/* renamed from: com.appnext.ads.interstitial.c */
public final class C1155c extends C1345p {

    /* renamed from: ff */
    private static C1155c f3756ff;

    /* renamed from: bU */
    private String f3757bU = "http://cdn.appnext.com/tools/sdk/confign/interstitial/interstitial_config.txt";

    /* renamed from: bm */
    private HashMap<String, String> f3758bm = null;

    /* renamed from: aA */
    public static synchronized C1155c m5113aA() {
        C1155c cVar;
        synchronized (C1155c.class) {
            if (f3756ff == null) {
                f3756ff = new C1155c();
            }
            cVar = f3756ff;
        }
        return cVar;
    }

    private C1155c() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f3757bU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final HashMap<String, String> mo5571z() {
        return this.f3758bm;
    }

    public final void setUrl(String str) {
        this.f3757bU = str;
    }

    /* renamed from: b */
    public final void mo5568b(HashMap<String, String> hashMap) {
        this.f3758bm = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final HashMap<String, String> mo5567A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creative", Interstitial.TYPE_MANAGED);
        hashMap.put("auto_play", "true");
        hashMap.put("mute", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection", "2g");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("can_close", "false");
        hashMap.put("video_length", "15");
        hashMap.put("button_text", "");
        hashMap.put("button_color", "");
        hashMap.put("skip_title", "");
        hashMap.put("remove_poster_on_auto_play", "true");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("show_rating", "true");
        hashMap.put("show_desc", "true");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("fq_control", "false");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_A", "0");
        hashMap.put("didPrivacy", "false");
        hashMap.put("S1", "[{\"id\":\"multi\",\"p\":50},{\"id\":\"single\",\"p\":50}]");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
