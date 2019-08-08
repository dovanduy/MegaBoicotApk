package com.facebook.ads.internal.p092s;

/* renamed from: com.facebook.ads.internal.s.g */
public enum C1807g {
    TEST("test"),
    BROWSER_SESSION("browser_session"),
    CLOSE("close"),
    SHOW_AD_CALLED("show_ad_called"),
    IMPRESSION("impression"),
    INVALIDATION("invalidation"),
    STORE("store"),
    OFF_TARGET_CLICK("off_target_click"),
    OPEN_LINK("open_link"),
    NATIVE_VIEW("native_view"),
    VIDEO("video"),
    USER_RETURN("user_return"),
    AD_REPORTING("x_out"),
    PREVIEW_IMPRESSION("preview_impression"),
    AD_SELECTION("ad_selection"),
    CLICK_GUARD("click_guard"),
    TWO_STEP("two_step_dialog"),
    TWO_STEP_CANCEL("two_step_cancel"),
    SWIPE_TO_CLICK("swipe_click"),
    CLOSE_BROWSE_VIEW("browse_view_closed"),
    WATCH_AND_X_MINIMIZED("watch_and_x_minimized");
    

    /* renamed from: v */
    private String f5721v;

    private C1807g(String str) {
        this.f5721v = str;
    }

    /* renamed from: a */
    public static C1807g m7560a(String str) {
        C1807g[] values;
        for (C1807g gVar : values()) {
            if (gVar.f5721v.equalsIgnoreCase(str)) {
                return gVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f5721v;
    }
}
