package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C3025aw;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.ke */
public final class C3927ke extends C3925kc {
    /* renamed from: a */
    public final WebResourceResponse mo15535a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }

    /* renamed from: a */
    public final C4090qf mo15536a(C4089qe qeVar, boolean z) {
        return new C4116re(qeVar, z);
    }

    /* renamed from: c */
    public final CookieManager mo15550c(Context context) {
        if (m17197e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C3900je.m17430b("Failed to obtain CookieManager.", th);
            C3025aw.m10921i().mo15436a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: f */
    public final int mo15553f() {
        return 16974374;
    }
}
