package com.startapp.android.publish.adsCommon.p183g.p184a;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C2793C;
import com.startapp.android.publish.adsCommon.p183g.p187d.C5393a;
import com.startapp.android.publish.adsCommon.p183g.p187d.C5394b;
import com.startapp.common.p193a.C5518g;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.startapp.android.publish.adsCommon.g.a.e */
/* compiled from: StartAppSDK */
public class C5388e extends WebViewClient {
    private static final String MRAID_JS = "mraid.js";
    private static final String MRAID_PREFIX = "mraid://";
    private static final String TAG = "MraidWebViewClient";
    private C5385b controller;
    private boolean isMraidInjected = false;

    public C5388e(C5385b bVar) {
        this.controller = bVar;
    }

    /* access modifiers changed from: protected */
    public boolean isMraidUrl(String str) {
        return str != null && str.startsWith(MRAID_PREFIX);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("shouldOverrideUrlLoading: ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        if (isMraidUrl(str)) {
            return invokeMraidMethod(str);
        }
        return this.controller.open(str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("shouldInterceptRequest: ");
        sb.append(str);
        C5518g.m23563a(str2, 3, sb.toString());
        if (this.isMraidInjected || !matchesInjectionUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        this.isMraidInjected = true;
        return createMraidInjectionResponse();
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onReceivedError: ");
        sb.append(str);
        C5518g.m23563a(str3, 6, sb.toString());
        super.onReceivedError(webView, i, str, str2);
    }

    public boolean matchesInjectionUrl(String str) {
        try {
            return MRAID_JS.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
        } catch (Exception e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("matchesInjectionUrl Exception: ");
            sb.append(e.getMessage());
            C5518g.m23563a(str2, 6, sb.toString());
            return false;
        }
    }

    @TargetApi(11)
    private WebResourceResponse createMraidInjectionResponse() {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(C5393a.m23045a());
        return new WebResourceResponse("text/javascript", C2793C.UTF8_NAME, new ByteArrayInputStream(sb.toString().getBytes()));
    }

    public boolean invokeMraidMethod(String str) {
        String str2;
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("invokeMraidMethod ");
        sb.append(str);
        C5518g.m23563a(str3, 3, sb.toString());
        String[] strArr = {"close", "resize"};
        String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            Map a = C5394b.m23050a(str);
            String str4 = (String) a.get("command");
            if (Arrays.asList(strArr).contains(str4)) {
                C5385b.class.getDeclaredMethod(str4, new Class[0]).invoke(this.controller, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str4)) {
                Method declaredMethod = C5385b.class.getDeclaredMethod(str4, new Class[]{String.class});
                char c = 65535;
                int hashCode = str4.hashCode();
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768) {
                        if (str4.equals("useCustomClose")) {
                            c = 1;
                        }
                    }
                } else if (str4.equals("createCalendarEvent")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        str2 = "eventJSON";
                        break;
                    case 1:
                        str2 = "useCustomClose";
                        break;
                    default:
                        str2 = "url";
                        break;
                }
                String str5 = (String) a.get(str2);
                declaredMethod.invoke(this.controller, new Object[]{str5});
            } else if (Arrays.asList(strArr3).contains(str4)) {
                C5385b.class.getDeclaredMethod(str4, new Class[]{Map.class}).invoke(this.controller, new Object[]{a});
            }
            String str6 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("successfully invoked ");
            sb2.append(str);
            C5518g.m23563a(str6, 3, sb2.toString());
            return true;
        } catch (Exception e) {
            String str7 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("failed to invoke ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(e.getMessage());
            C5518g.m23563a(str7, 6, sb3.toString());
            return false;
        }
    }
}
