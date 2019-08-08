package com.appnext.ads.fullscreen;

import com.appnext.core.C1345p;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.f */
public final class C1103f extends C1345p {

    /* renamed from: eo */
    private static C1103f f3666eo;

    /* renamed from: bU */
    private String f3667bU = "http://cdn.appnext.com/tools/sdk/confign/rewarded/rewarded_config.txt";

    /* renamed from: bm */
    private HashMap<String, String> f3668bm = null;

    /* renamed from: ah */
    public static synchronized C1103f m5002ah() {
        C1103f fVar;
        synchronized (C1103f.class) {
            if (f3666eo == null) {
                f3666eo = new C1103f();
            }
            fVar = f3666eo;
        }
        return fVar;
    }

    private C1103f() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f3667bU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final HashMap<String, String> mo5571z() {
        return this.f3668bm;
    }

    public final void setUrl(String str) {
        this.f3667bU = str;
    }

    /* renamed from: b */
    public final void mo5568b(HashMap<String, String> hashMap) {
        this.f3668bm = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final HashMap<String, String> mo5567A() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "false");
        hashMap.put("show_close", "false");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", "0");
        hashMap.put("default_mode", "normal");
        hashMap.put("postpone_vta_sec", "0");
        hashMap.put("postpone_impression_sec", "0");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("fq_control", "false");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("pre_title_string1", "Which Ad");
        hashMap.put("pre_title_string2", "Would you like to watch?");
        hashMap.put("pre_cta_string", "Play this ad");
        hashMap.put("ads_caching_time_minutes", "0");
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", "0");
        hashMap.put("clickType_b", "0");
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
