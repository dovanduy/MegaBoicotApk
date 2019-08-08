package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C3025aw;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.rd */
public class C4115rd extends C4090qf {
    public C4115rd(C4089qe qeVar, boolean z) {
        super(qeVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo15989a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof C4089qe)) {
            C3900je.m17435e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        C4089qe qeVar = (C4089qe) webView;
        if (this.f13821a != null) {
            this.f13821a.mo15369a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo15924a(str, map);
        }
        if (qeVar.mo15919v() != null) {
            qeVar.mo15919v().mo15954n();
        }
        ark<String> ark = qeVar.mo15917t().mo15997d() ? aru.f11759K : qeVar.mo15923z() ? aru.f11758J : aru.f11757I;
        String str2 = (String) aoq.m14620f().mo14695a(ark);
        C3025aw.m10917e();
        return C3909jn.m17157c(qeVar.getContext(), qeVar.mo15807k().f14505a, str2);
    }
}
