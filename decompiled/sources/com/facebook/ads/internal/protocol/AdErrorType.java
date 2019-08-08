package com.facebook.ads.internal.protocol;

import com.facebook.ads.AdError;

public enum AdErrorType {
    UNKNOWN_ERROR(-1, "unknown error", false),
    NETWORK_ERROR(AdError.NETWORK_ERROR_CODE, "Network Error", true),
    NO_FILL(AdError.NO_FILL_ERROR_CODE, "No Fill", true),
    LOAD_TOO_FREQUENTLY(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "Ad was re-loaded too frequently", true),
    DISABLED_APP(1005, "App is disabled from making ad requests", true),
    SERVER_ERROR(2000, "Server Error", true),
    INTERNAL_ERROR(AdError.INTERNAL_ERROR_CODE, "Internal Error", true),
    CACHE_FAILURE_ERROR(AdError.CACHE_ERROR_CODE, "Pre Caching failure", true),
    START_BEFORE_INIT(2005, "initAd must be called before startAd", true),
    REMOTE_ADS_SERVICE_ERROR(AdError.REMOTE_ADS_SERVICE_ERROR, "Ads Service process error", true),
    INTERSTITIAL_AD_TIMEOUT(AdError.INTERSTITIAL_AD_TIMEOUT, "Timeout loading Interstitial Ad", true),
    BROKEN_MEDIA_ERROR(AdError.BROKEN_MEDIA_ERROR_CODE, "Failed to load Media for Native Ad", true),
    AD_REQUEST_FAILED(1111, "Facebook Ads SDK request for ads failed", false),
    AD_REQUEST_TIMEOUT(1112, "Facebook Ads SDK request for ads timed out", false),
    PARSER_FAILURE(1201, "Failed to parse Facebook Ads SDK delivery response", false),
    UNKNOWN_RESPONSE(1202, "Unknown Facebook Ads SDK delivery response type", false),
    ERROR_MESSAGE(1203, "Facebook Ads SDK delivery response Error message", true),
    NO_AD_PLACEMENT(1302, "Facebook Ads SDK returned no ad placements", false),
    MEDIATION_ERROR(AdError.MEDIATION_ERROR_CODE, "Mediation Error", true),
    BID_IMPRESSION_MISMATCH(4001, "Bid payload does not match placement", true),
    BID_PAYLOAD_ERROR(4002, "Invalid bid payload", false),
    NO_ADAPTER_ON_LOAD(5001, "Adapter is null onLoad Ad", false),
    NO_ADAPTER_ON_START(5002, "Adapter is null onStart Ad", false),
    INTERSTITIAL_CONTROLLER_IS_NULL(5003, "Interstitial Controller is null show Ad", false),
    WEB_VIEW_FAILED_TO_LOAD(5004, "WebView failed to load", false),
    NO_MEDIAVIEW_IN_NATIVEAD(AdError.MEDIAVIEW_MISSING_ERROR_CODE, "MediaView is missing in NativeAd", true),
    NO_ICONVIEW_IN_NATIVEBANNERAD(AdError.ICONVIEW_MISSING_ERROR_CODE, "IconView is missing in NativeBannerAd", true),
    UNSUPPORTED_AD_ASSET_NATIVEAD(AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE, "unsupported type of ad assets", true),
    AD_ALREADY_STARTED(AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE, "Ad already started", true),
    LOAD_CALLED_WHILE_SHOWING_AD(AdError.LOAD_CALLED_WHILE_SHOWING_AD, "Ad cannot be loaded while being displayed", true),
    CLEAR_TEXT_SUPPORT_NOT_ALLOWED(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "In order to use cache in Facebook Audience Network SDK you should whitelist 127.0.0.1 in your Network Security Configuration:\n<domain-config cleartextTrafficPermitted=\"true\">\n    <domain includeSubdomains=\"true\">127.0.0.1</domain>\n</domain-config>\nSee more: https://developers.facebook.com/docs/audience-network/android-network-security-config", true),
    INCORRECT_STATE_ERROR(AdError.INCORRECT_STATE_ERROR, "You can't call %s for ad in state %s", true),
    MISSING_DEPENDENCIES_ERROR(AdError.MISSING_DEPENDENCIES_ERROR, "Facebook Audience Network SDK doesn't have all required classes. Please, check LogCat output for tag %s. See more: https://developers.facebook.com/docs/audience-network/android/ ", true),
    IMAGE_CACHE_ERROR(8001, "Failed to cache image", false);
    

    /* renamed from: a */
    private final int f5592a;

    /* renamed from: b */
    private final String f5593b;

    /* renamed from: c */
    private final boolean f5594c;

    private AdErrorType(int i, String str, boolean z) {
        this.f5592a = i;
        this.f5593b = str;
        this.f5594c = z;
    }

    public static AdErrorType adErrorTypeFromCode(int i) {
        return adErrorTypeFromCode(i, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i, AdErrorType adErrorType) {
        AdErrorType[] values;
        for (AdErrorType adErrorType2 : values()) {
            if (adErrorType2.getErrorCode() == i) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.f5593b;
    }

    public int getErrorCode() {
        return this.f5592a;
    }

    public boolean isPublicError() {
        return this.f5594c;
    }
}
