package com.facebook.ads.internal.view.p100b;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.view.b.d */
public class C1960d {

    /* renamed from: a */
    private final C1962f f6159a;

    /* renamed from: b */
    private boolean f6160b = true;

    public C1960d(C1962f fVar) {
        this.f6159a = fVar;
    }

    /* renamed from: a */
    private static long m8092a(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1;
        }
        try {
            Long valueOf = Long.valueOf(Long.parseLong(substring));
            if (valueOf.longValue() < 0) {
                return -1;
            }
            return valueOf.longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public void mo8036a() {
        if (this.f6160b) {
            if (this.f6159a.canGoBack() || this.f6159a.canGoForward()) {
                this.f6160b = false;
            } else {
                this.f6159a.mo8043a("void((function() {try {  if (!window.performance || !window.performance.timing || !document ||       !document.body || document.body.scrollHeight <= 0 ||       !document.body.children || document.body.children.length < 1) {    return;  }  var nvtiming__an_t = window.performance.timing;  if (nvtiming__an_t.responseEnd > 0) {    console.log('ANNavResponseEnd:'+nvtiming__an_t.responseEnd);  }  if (nvtiming__an_t.domContentLoadedEventStart > 0) {    console.log('ANNavDomContentLoaded:' + nvtiming__an_t.domContentLoadedEventStart);  }  if (nvtiming__an_t.loadEventEnd > 0) {    console.log('ANNavLoadEventEnd:' + nvtiming__an_t.loadEventEnd);  }} catch(err) {  console.log('an_navigation_timing_error:' + err.message);}})());");
            }
        }
    }

    /* renamed from: a */
    public void mo8037a(String str) {
        if (this.f6160b) {
            if (str.startsWith("ANNavResponseEnd:")) {
                this.f6159a.mo8042a(m8092a(str, "ANNavResponseEnd:"));
            } else if (str.startsWith("ANNavDomContentLoaded:")) {
                this.f6159a.mo8045b(m8092a(str, "ANNavDomContentLoaded:"));
            } else {
                if (str.startsWith("ANNavLoadEventEnd:")) {
                    this.f6159a.mo8046c(m8092a(str, "ANNavLoadEventEnd:"));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8038a(boolean z) {
        this.f6160b = z;
    }
}
