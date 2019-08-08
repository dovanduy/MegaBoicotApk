package com.appnext.ads.fullscreen;

import com.appnext.core.C1345p;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.c */
public final class C1085c extends C1345p {

    /* renamed from: dM */
    private static C1085c f3623dM;

    /* renamed from: bU */
    private String f3624bU = "http://cdn.appnext.com/tools/sdk/confign/fullscreen/fullscreen_config.txt";

    /* renamed from: bm */
    private HashMap<String, String> f3625bm = null;

    /* renamed from: af */
    public static synchronized C1085c m4984af() {
        C1085c cVar;
        synchronized (C1085c.class) {
            if (f3623dM == null) {
                f3623dM = new C1085c();
            }
            cVar = f3623dM;
        }
        return cVar;
    }

    private C1085c() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f3624bU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final HashMap<String, String> mo5571z() {
        return this.f3625bm;
    }

    public final void setUrl(String str) {
        this.f3624bU = str;
    }

    /* renamed from: b */
    public final void mo5568b(HashMap<String, String> hashMap) {
        this.f3625bm = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final HashMap<String, String> mo5567A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "true");
        hashMap.put("show_close_time", "2000");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("fq_control", "false");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", "0");
        hashMap.put("clickType_b", "0");
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
