package com.startapp.common.p197d;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.common.d.a */
/* compiled from: StartAppSDK */
public class C5550a {

    /* renamed from: a */
    private static CookieManager f17626a;

    /* renamed from: a */
    public static void m23687a(Context context) {
        f17626a = new CookieManager(new C5551b(context), CookiePolicy.ACCEPT_ALL);
    }

    /* renamed from: b */
    public static void m23689b(Context context) {
        if (VERSION.SDK_INT >= 9) {
            m23687a(context);
        }
    }

    /* renamed from: a */
    public static void m23688a(HttpURLConnection httpURLConnection, String str) {
        if (VERSION.SDK_INT >= 9) {
            CookieManager a = m23686a();
            if (a != null) {
                Map map = a.get(URI.create(str), httpURLConnection.getRequestProperties());
                if (map != null && map.size() > 0 && ((List) map.get("Cookie")).size() > 0) {
                    httpURLConnection.addRequestProperty("Cookie", TextUtils.join("=", (Iterable) map.get("Cookie")));
                }
            }
        }
    }

    /* renamed from: b */
    public static void m23690b(HttpURLConnection httpURLConnection, String str) {
        if (VERSION.SDK_INT >= 9) {
            CookieManager a = m23686a();
            if (a != null) {
                a.put(URI.create(str), httpURLConnection.getHeaderFields());
            }
        }
    }

    /* renamed from: a */
    public static CookieManager m23686a() {
        return f17626a;
    }
}
