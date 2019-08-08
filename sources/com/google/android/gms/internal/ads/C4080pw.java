package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3050bu;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.common.util.C3563o;

@TargetApi(11)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pw */
public final class C4080pw extends WebChromeClient {

    /* renamed from: a */
    private final C4089qe f13806a;

    public C4080pw(C4089qe qeVar) {
        this.f13806a = qeVar;
    }

    /* renamed from: a */
    private static Context m17666a(WebView webView) {
        if (!(webView instanceof C4089qe)) {
            return webView.getContext();
        }
        C4089qe qeVar = (C4089qe) webView;
        Activity d = qeVar.mo15801d();
        return d != null ? d : qeVar.getContext();
    }

    /* renamed from: a */
    private final boolean m17667a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        try {
            if (!(this.f13806a == null || this.f13806a.mo15919v() == null || this.f13806a.mo15919v().mo15925a() == null)) {
                C3050bu a = this.f13806a.mo15919v().mo15925a();
                if (a != null && !a.mo12587b()) {
                    StringBuilder sb = new StringBuilder(11 + String.valueOf(str).length() + String.valueOf(str3).length());
                    sb.append("window.");
                    sb.append(str);
                    sb.append("('");
                    sb.append(str3);
                    sb.append("')");
                    a.mo12586a(sb.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                create = builder.setView(linearLayout).setPositiveButton(17039370, new C4087qc(jsPromptResult, editText)).setNegativeButton(17039360, new C4086qb(jsPromptResult)).setOnCancelListener(new C4085qa(jsPromptResult)).create();
            } else {
                create = builder.setMessage(str3).setPositiveButton(17039370, new C4083pz(jsResult)).setNegativeButton(17039360, new C4082py(jsResult)).setOnCancelListener(new C4081px(jsResult)).create();
            }
            create.show();
            return true;
        } catch (BadTokenException e) {
            C3900je.m17432c("Fail to display Dialog.", e);
            return true;
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof C4089qe)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            C3107c r = ((C4089qe) webView).mo15909r();
            if (r == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                r.mo12660a();
                return;
            }
        }
        C3900je.m17435e(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(19 + String.valueOf(message).length() + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C4088qd.f13814a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C3900je.m17431c(sb2);
                break;
            case 2:
                C3900je.m17435e(sb2);
                break;
            case 5:
                C3900je.m17429b(sb2);
                break;
            default:
                C3900je.m17433d(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f13806a.mo15920w() != null) {
            webView2.setWebViewClient(this.f13806a.mo15920w());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        long j5 = 0;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), C1245d.f3948iQ);
            } else if (j2 <= Math.min(C1245d.f3948iQ - j, j4)) {
                j5 = j + j2;
            }
            j5 = j;
        } else if (j2 <= j4 && j2 <= C1245d.f3948iQ) {
            j5 = j2;
        }
        quotaUpdater.updateQuota(j5);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        boolean z;
        if (callback != null) {
            C3025aw.m10917e();
            if (!C3909jn.m17147a(this.f13806a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                C3025aw.m10917e();
                if (!C3909jn.m17147a(this.f13806a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C3107c r = this.f13806a.mo15909r();
        if (r == null) {
            C3900je.m17435e("Could not get ad overlay when hiding custom view.");
        } else {
            r.mo12667b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m17667a(m17666a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m17667a(m17666a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m17667a(m17666a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m17667a(m17666a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C3563o.m12770i()) {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11778aC)).booleanValue()) {
                if (this.f13806a == null || this.f13806a.mo15919v() == null || this.f13806a.mo15919v().mo15953m() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f13806a.mo15919v().mo15953m().mo15370a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        C3107c r = this.f13806a.mo15909r();
        if (r == null) {
            C3900je.m17435e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        r.mo12664a(view, customViewCallback);
        r.mo12661a(i);
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
