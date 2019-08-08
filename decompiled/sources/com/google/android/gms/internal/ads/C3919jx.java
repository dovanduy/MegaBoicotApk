package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jx */
final class C3919jx implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ Context f13427a;

    /* renamed from: b */
    private final /* synthetic */ WebSettings f13428b;

    C3919jx(C3918jw jwVar, Context context, WebSettings webSettings) {
        this.f13427a = context;
        this.f13428b = webSettings;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (this.f13427a.getCacheDir() != null) {
            this.f13428b.setAppCachePath(this.f13427a.getCacheDir().getAbsolutePath());
            this.f13428b.setAppCacheMaxSize(0);
            this.f13428b.setAppCacheEnabled(true);
        }
        this.f13428b.setDatabasePath(this.f13427a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f13428b.setDatabaseEnabled(true);
        this.f13428b.setDomStorageEnabled(true);
        this.f13428b.setDisplayZoomControls(false);
        this.f13428b.setBuiltInZoomControls(true);
        this.f13428b.setSupportZoom(true);
        this.f13428b.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
