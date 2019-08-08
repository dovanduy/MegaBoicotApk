package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.exoplayer2.C2793C;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.jw */
public class C3918jw extends C3917jv {
    /* renamed from: a */
    public C4090qf mo15536a(C4089qe qeVar, boolean z) {
        return new C4114rc(qeVar, z);
    }

    /* renamed from: a */
    public final Set<String> mo15539a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo15542a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    /* renamed from: a */
    public boolean mo15543a(Context context, WebSettings webSettings) {
        super.mo15543a(context, webSettings);
        return ((Boolean) C3966lq.m17350a(context, new C3919jx(this, context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo15545a(Window window) {
        window.setFlags(C2793C.DEFAULT_MUXED_BUFFER_SIZE, C2793C.DEFAULT_MUXED_BUFFER_SIZE);
        return true;
    }

    /* renamed from: b */
    public final boolean mo15548b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    /* renamed from: c */
    public final boolean mo15551c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
