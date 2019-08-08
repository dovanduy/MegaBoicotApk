package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
/* compiled from: FacebookWebFallbackDialog */
public class C2525j extends C2485af {

    /* renamed from: a */
    private static final String f7911a = "com.facebook.internal.j";

    /* renamed from: b */
    private boolean f7912b;

    /* renamed from: a */
    public static C2525j m9613a(Context context, String str, String str2) {
        C2485af.m9504a(context);
        return new C2525j(context, str, str2);
    }

    private C2525j(Context context, String str, String str2) {
        super(context, str);
        mo8930b(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo8926a(String str) {
        Bundle c = C2479ad.m9465c(Uri.parse(str).getQuery());
        String string = c.getString("bridge_args");
        c.remove("bridge_args");
        if (!C2479ad.m9456a(string)) {
            try {
                c.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C2503c.m9567a(new JSONObject(string)));
            } catch (JSONException e) {
                C2479ad.m9448a(f7911a, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = c.getString("method_results");
        c.remove("method_results");
        if (!C2479ad.m9456a(string2)) {
            if (C2479ad.m9456a(string2)) {
                string2 = "{}";
            }
            try {
                c.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C2503c.m9567a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C2479ad.m9448a(f7911a, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        c.remove("version");
        c.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C2566x.m9736a());
        return c;
    }

    public void cancel() {
        WebView d = mo8934d();
        if (!mo8932c() || mo8931b() || d == null || !d.isShown()) {
            super.cancel();
        } else if (!this.f7912b) {
            this.f7912b = true;
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            d.loadUrl(sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    C2525j.super.cancel();
                }
            }, 1500);
        }
    }
}
