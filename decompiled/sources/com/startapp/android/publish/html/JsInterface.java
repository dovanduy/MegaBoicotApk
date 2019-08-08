package com.startapp.android.publish.html;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5518g;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StartAppSDK */
public class JsInterface {
    private Runnable clickCallback;
    private Runnable closeCallback;
    private Runnable enableScrollCallback;
    protected boolean inAppBrowserEnabled;
    protected Context mContext;
    private C5363b params;
    private boolean processed;

    public JsInterface(Context context, Runnable runnable, C5363b bVar, boolean z) {
        this(context, runnable, bVar);
        this.inAppBrowserEnabled = z;
    }

    public JsInterface(Context context, Runnable runnable, C5363b bVar) {
        this.processed = false;
        this.inAppBrowserEnabled = true;
        this.closeCallback = null;
        this.clickCallback = null;
        this.enableScrollCallback = null;
        this.closeCallback = runnable;
        this.mContext = context;
        this.params = bVar;
    }

    public JsInterface(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, C5363b bVar, boolean z) {
        this(context, runnable, bVar, z);
        this.clickCallback = runnable2;
        this.enableScrollCallback = runnable3;
    }

    public JsInterface(Context context, Runnable runnable, Runnable runnable2, C5363b bVar) {
        this(context, runnable, bVar);
        this.clickCallback = runnable2;
    }

    @JavascriptInterface
    public void closeAd() {
        if (!this.processed) {
            this.processed = true;
            this.closeCallback.run();
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C5349c.m22876b(this.mContext, str, this.params);
        }
        Intent launchIntentForPackage = this.mContext.getPackageManager().getLaunchIntentForPackage(str2);
        if (str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    launchIntentForPackage.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException e) {
                C5518g.m23562a(6, "Couldn't parse intent details json!", (Throwable) e);
            }
        }
        try {
            this.mContext.startActivity(launchIntentForPackage);
        } catch (Exception e2) {
            C5378f.m23016a(this.mContext, C5376d.EXCEPTION, "JsInterface.openApp - Couldn't start activity", e2.getMessage(), C5349c.m22849a(str, (String) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find activity to handle url: [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(6, sb.toString());
        }
        if (this.clickCallback != null) {
            this.clickCallback.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.inAppBrowserEnabled || !C5307i.m22674a(256)) {
            C5349c.m22879c(this.mContext, str);
        } else {
            C5349c.m22877b(this.mContext, str, (String) null);
        }
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        if (this.enableScrollCallback != null) {
            this.enableScrollCallback.run();
        }
    }
}
