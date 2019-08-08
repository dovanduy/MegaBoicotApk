package com.google.android.gms.internal.ads;

final class azn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12460a;

    /* renamed from: b */
    private final /* synthetic */ azg f12461b;

    azn(azg azg, String str) {
        this.f12461b = azg;
        this.f12460a = str;
    }

    public final void run() {
        this.f12461b.f12440a.loadUrl(this.f12460a);
    }
}
