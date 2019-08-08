package com.google.android.gms.internal.ads;

import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;

final class azm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12458a;

    /* renamed from: b */
    private final /* synthetic */ azg f12459b;

    azm(azg azg, String str) {
        this.f12459b = azg;
        this.f12458a = str;
    }

    public final void run() {
        this.f12459b.f12440a.loadData(this.f12458a, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME);
    }
}
