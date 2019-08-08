package com.p055c.p056a.p057a.p058a.p062c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p055c.p056a.p057a.p058a.p064e.C1463c;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.c.d */
public class C1451d {

    /* renamed from: a */
    private static C1451d f4421a = new C1451d();

    private C1451d() {
    }

    /* renamed from: a */
    public static C1451d m6006a() {
        return f4421a;
    }

    /* renamed from: a */
    public void mo6536a(WebView webView) {
        mo6540a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo6537a(WebView webView, float f) {
        mo6540a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo6538a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo6540a(webView, "publishVideoEvent", str, jSONObject);
            return;
        }
        mo6540a(webView, "publishVideoEvent", str);
    }

    /* renamed from: a */
    public void mo6539a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo6540a(webView, "startSession", str, jSONObject, jSONObject2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6540a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo6543a(sb, objArr);
            sb.append(")}");
            mo6541a(webView, sb);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The WebView is null for ");
        sb2.append(str);
        C1463c.m6064a(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6541a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo6542a(WebView webView, JSONObject jSONObject) {
        mo6540a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6543a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public boolean mo6544a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("javascript: ");
        sb.append(str);
        webView.loadUrl(sb.toString());
        return true;
    }

    /* renamed from: b */
    public void mo6545b(WebView webView) {
        mo6540a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo6546b(WebView webView, String str) {
        if (str != null) {
            mo6544a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", str));
        }
    }

    /* renamed from: c */
    public void mo6547c(WebView webView, String str) {
        mo6540a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: d */
    public void mo6548d(WebView webView, String str) {
        mo6540a(webView, "setState", str);
    }
}
