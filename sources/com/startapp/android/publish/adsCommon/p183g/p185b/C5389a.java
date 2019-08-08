package com.startapp.android.publish.adsCommon.p183g.p185b;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.android.publish.adsCommon.p183g.p184a.C5386c;

/* renamed from: com.startapp.android.publish.adsCommon.g.b.a */
/* compiled from: StartAppSDK */
public final class C5389a {
    /* renamed from: a */
    public static void m23036a(Context context, WebView webView, C5390b bVar) {
        if (bVar == null) {
            bVar = new C5390b(context);
        }
        C5386c.m23030a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", bVar.mo19932a());
        C5386c.m23030a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", bVar.mo19934b());
        C5386c.m23030a(webView, "mraid.SUPPORTED_FEATURES.SMS", bVar.mo19935c());
        C5386c.m23030a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", bVar.mo19936d());
        C5386c.m23030a(webView, "mraid.SUPPORTED_FEATURES.TEL", bVar.mo19937e());
    }
}
