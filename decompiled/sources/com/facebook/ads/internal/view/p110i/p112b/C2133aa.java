package com.facebook.ads.internal.view.p110i.p112b;

/* renamed from: com.facebook.ads.internal.view.i.b.aa */
public enum C2133aa {
    REWARDED_VIDEO_COMPLETE("com.facebook.ads.rewarded_video.completed"),
    REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD("com.facebook.ads.rewarded_video.completed.without.reward"),
    REWARDED_VIDEO_END_ACTIVITY("com.facebook.ads.rewarded_video.end_activity"),
    REWARDED_VIDEO_ERROR("com.facebook.ads.rewarded_video.error"),
    REWARDED_VIDEO_AD_CLICK("com.facebook.ads.rewarded_video.ad_click"),
    REWARDED_VIDEO_IMPRESSION("com.facebook.ads.rewarded_video.ad_impression"),
    REWARDED_VIDEO_CLOSED("com.facebook.ads.rewarded_video.closed"),
    REWARD_SERVER_SUCCESS("com.facebook.ads.rewarded_video.server_reward_success"),
    REWARD_SERVER_FAILED("com.facebook.ads.rewarded_video.server_reward_failed"),
    REWARDED_VIDEO_ACTIVITY_DESTROYED("com.facebook.ads.rewarded_video.activity_destroyed"),
    REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD("com.facebook.ads.rewarded_video.choose_your_own_ad");
    

    /* renamed from: l */
    private String f6810l;

    private C2133aa(String str) {
        this.f6810l = str;
    }

    /* renamed from: a */
    public String mo8442a() {
        return this.f6810l;
    }

    /* renamed from: a */
    public String mo8443a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6810l);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}
