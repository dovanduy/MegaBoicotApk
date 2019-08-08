package com.startapp.android.publish.adsCommon.p177a;

import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.a.f */
/* compiled from: StartAppSDK */
public class C5319f implements Serializable {
    private static final long serialVersionUID = 1;
    private String reason;
    private boolean shouldDisplayAd;

    public C5319f(boolean z, String str) {
        this.shouldDisplayAd = z;
        this.reason = str;
    }

    public C5319f(boolean z) {
        this(z, "");
    }

    /* renamed from: a */
    public boolean mo19660a() {
        return this.shouldDisplayAd;
    }

    /* renamed from: b */
    public String mo19661b() {
        return this.reason;
    }

    /* renamed from: c */
    public String mo19662c() {
        return this.reason != null ? this.reason.split(" ")[0] : "";
    }
}
