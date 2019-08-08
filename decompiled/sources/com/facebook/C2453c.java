package com.facebook;

/* renamed from: com.facebook.c */
/* compiled from: AccessTokenSource */
public enum C2453c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    

    /* renamed from: j */
    private final boolean f7768j;

    private C2453c(boolean z) {
        this.f7768j = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8877a() {
        return this.f7768j;
    }
}
