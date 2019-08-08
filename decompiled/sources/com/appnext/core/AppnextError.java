package com.appnext.core;

public class AppnextError {
    public static final String CONNECTION_ERROR = "Connection Error";
    public static final String INTERNAL_ERROR = "Internal error";
    public static final String NO_ADS = "No Ads";
    public static final String NO_MARKET = "No market installed on the device";
    public static final String NULL_CONTEXT = "Null context";
    public static final String SLOW_CONNECTION = "Too Slow Connection";
    public static final String TIMEOUT = "Timeout";

    /* renamed from: kM */
    private String f4112kM = "";

    public AppnextError(String str) {
        this.f4112kM = str;
    }

    public String getErrorMessage() {
        return this.f4112kM;
    }
}
