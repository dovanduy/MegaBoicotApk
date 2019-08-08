package com.startapp.android.publish.adsCommon.p189i;

import android.os.Bundle;

/* renamed from: com.startapp.android.publish.adsCommon.i.b */
/* compiled from: StartAppSDK */
public class C5408b {

    /* renamed from: a */
    private final Bundle f17292a;

    public C5408b(Bundle bundle) {
        this.f17292a = bundle;
    }

    /* renamed from: a */
    public String mo19957a() {
        return this.f17292a.getString("install_referrer");
    }

    /* renamed from: b */
    public long mo19958b() {
        return this.f17292a.getLong("referrer_click_timestamp_seconds");
    }

    /* renamed from: c */
    public long mo19959c() {
        return this.f17292a.getLong("install_begin_timestamp_seconds");
    }
}
