package com.startapp.android.publish.adsCommon.p182f;

/* renamed from: com.startapp.android.publish.adsCommon.f.d */
/* compiled from: StartAppSDK */
public enum C5376d {
    FAILED_SMART_REDIRECT("failed_smart_redirect"),
    EXCEPTION("exception"),
    PERIODIC("periodic"),
    GENERAL("general"),
    WRONG_PACKAGE_REACHED("wrong_package_reached"),
    VIDEO_MEDIA_PLAYER_ERROR("video_media_player_error"),
    FAILED_EXTRACTING_DPARAMS("failed_extracting_dparams"),
    FAILED_SMART_REDIRECT_HOP_INFO("failed_smart_redirect_hop_info"),
    SUCCESS_SMART_REDIRECT_HOP_INFO("success_smart_redirect_hop_info"),
    USER_CONSENT("user_consent"),
    METADATA_NULL("metadata_object_is_null"),
    NON_IMPRESSION_NO_DPARAM("non_impression_without_dparams"),
    STOP_RELOAD_IN_CACHE("stop_reload_in_cache"),
    NO_APPID("app_id_wasnt_set"),
    NO_ADVERTISING_ID("advertising_id_retrieving_failed");
    
    private String value;

    private C5376d(String str) {
        this.value = str;
    }

    /* renamed from: a */
    public String mo19890a() {
        return this.value;
    }
}
