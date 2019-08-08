package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
/* renamed from: com.google.android.gms.internal.ads.jv */
public class C3917jv extends C3915jt {
    public C3917jv() {
        super();
    }

    /* renamed from: a */
    public final int mo15533a() {
        return 6;
    }

    /* renamed from: a */
    public boolean mo15542a(Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    /* renamed from: b */
    public final int mo15546b() {
        return 7;
    }
}
