package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.a */
/* compiled from: StartAppSDK */
public class C5313a implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean isActivityFullScreen;

    public C5313a(Activity activity) {
        m22693a(C5349c.m22868a(activity));
    }

    /* renamed from: a */
    public boolean mo19641a() {
        return this.isActivityFullScreen;
    }

    /* renamed from: a */
    private void m22693a(boolean z) {
        this.isActivityFullScreen = z;
    }
}
