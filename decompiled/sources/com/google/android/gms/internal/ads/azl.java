package com.google.android.gms.internal.ads;

import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;

final class azl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12456a;

    /* renamed from: b */
    private final /* synthetic */ azg f12457b;

    azl(azg azg, String str) {
        this.f12457b = azg;
        this.f12456a = str;
    }

    public final void run() {
        this.f12457b.f12440a.loadData(this.f12456a, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME);
    }
}
