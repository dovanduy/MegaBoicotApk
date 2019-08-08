package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C3025aw;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@TargetApi(8)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.jt */
public class C3915jt {
    private C3915jt() {
    }

    /* renamed from: a */
    public static boolean m17195a(C4089qe qeVar) {
        if (qeVar == null) {
            return false;
        }
        qeVar.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m17196b(C4089qe qeVar) {
        if (qeVar == null) {
            return false;
        }
        qeVar.onResume();
        return true;
    }

    /* renamed from: e */
    public static boolean m17197e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo15533a() {
        return 0;
    }

    /* renamed from: a */
    public Drawable mo15534a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public WebResourceResponse mo15535a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: a */
    public C4090qf mo15536a(C4089qe qeVar, boolean z) {
        return new C4090qf(qeVar, z);
    }

    /* renamed from: a */
    public String mo15537a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo15538a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public Set<String> mo15539a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo15540a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo15541a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo15542a(Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo15543a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo15544a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo15545a(Window window) {
        return false;
    }

    /* renamed from: b */
    public int mo15546b() {
        return 1;
    }

    /* renamed from: b */
    public void mo15547b(Context context) {
    }

    /* renamed from: b */
    public boolean mo15548b(View view) {
        return false;
    }

    /* renamed from: c */
    public int mo15549c() {
        return 5;
    }

    /* renamed from: c */
    public CookieManager mo15550c(Context context) {
        if (m17197e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C3900je.m17430b("Failed to obtain CookieManager.", th);
            C3025aw.m10921i().mo15436a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo15551c(View view) {
        return false;
    }

    /* renamed from: d */
    public LayoutParams mo15552d() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public int mo15553f() {
        return 0;
    }
}
