package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AdError;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5377e;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5523b;
import com.startapp.common.C5552e;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5504b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.android.publish.adsCommon.c */
/* compiled from: StartAppSDK */
public class C5349c {

    /* renamed from: a */
    private static ProgressDialog f17147a;

    /* renamed from: com.startapp.android.publish.adsCommon.c$a */
    /* compiled from: StartAppSDK */
    private static class C5353a extends WebViewClient {

        /* renamed from: a */
        protected String f17155a = "";

        /* renamed from: b */
        protected String f17156b;

        /* renamed from: c */
        protected boolean f17157c = false;

        /* renamed from: d */
        protected boolean f17158d = false;

        /* renamed from: e */
        protected long f17159e;

        /* renamed from: f */
        protected boolean f17160f = true;

        /* renamed from: g */
        protected Boolean f17161g = null;

        /* renamed from: h */
        protected String f17162h;

        /* renamed from: i */
        protected ProgressDialog f17163i;

        /* renamed from: j */
        protected Runnable f17164j;

        /* renamed from: k */
        protected boolean f17165k = false;

        /* renamed from: l */
        protected boolean f17166l = false;

        /* renamed from: m */
        private long f17167m;

        /* renamed from: n */
        private LinkedHashMap<String, Float> f17168n = new LinkedHashMap<>();

        /* renamed from: o */
        private long f17169o;

        /* renamed from: p */
        private Timer f17170p;

        public C5353a(long j, long j2, boolean z, Boolean bool, ProgressDialog progressDialog, String str, String str2, String str3, Runnable runnable) {
            this.f17159e = j;
            this.f17167m = j2;
            this.f17160f = z;
            this.f17161g = bool;
            this.f17163i = progressDialog;
            this.f17155a = str;
            this.f17162h = str2;
            this.f17156b = str3;
            this.f17164j = runnable;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyWebViewClientSmartRedirect::onPageStarted - [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(2, sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!this.f17158d) {
                this.f17169o = System.currentTimeMillis();
                this.f17168n.put(str, Float.valueOf(-1.0f));
                m22890a(webView.getContext());
                this.f17158d = true;
            }
            this.f17166l = false;
            m22893b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyWebViewClientSmartRedirect::shouldOverrideUrlLoading - [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(2, sb.toString());
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((float) (currentTimeMillis - this.f17169o)) / 1000.0f);
                this.f17169o = currentTimeMillis;
                this.f17168n.put(this.f17155a, valueOf);
                this.f17168n.put(str, Float.valueOf(-1.0f));
                this.f17155a = str;
                String lowerCase = str.toLowerCase();
                if (!C5349c.m22878b(lowerCase) && !C5349c.m22881c(lowerCase)) {
                    return false;
                }
                if (!this.f17165k) {
                    this.f17157c = true;
                    C5349c.m22851a(webView.getContext());
                    m22893b();
                    Context context = webView.getContext();
                    if (C5349c.m22881c(lowerCase)) {
                        str = webView.getUrl();
                    }
                    C5349c.m22879c(context, str);
                    if (this.f17162h == null || this.f17162h.equals("") || this.f17155a.toLowerCase().contains(this.f17162h.toLowerCase())) {
                        boolean z = MetaData.getInstance().getAnalyticsConfig().mo19876g() && C5414k.m23092a(webView.getContext(), "firstSucceededSmartRedirect", Boolean.valueOf(true)).booleanValue();
                        float f = this.f17161g == null ? MetaData.getInstance().getAnalyticsConfig().mo19875f() : this.f17161g.booleanValue() ? 100.0f : 0.0f;
                        if (z || Math.random() * 100.0d < ((double) f)) {
                            C5377e eVar = new C5377e(C5376d.SUCCESS_SMART_REDIRECT_HOP_INFO);
                            eVar.mo19892a(mo19805a());
                            C5378f.m23018a(webView.getContext(), eVar, this.f17156b);
                            C5414k.m23099b(webView.getContext(), "firstSucceededSmartRedirect", Boolean.valueOf(false));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected: ");
                        sb2.append(this.f17162h);
                        sb2.append(" Link: ");
                        sb2.append(this.f17155a);
                        C5378f.m23016a(webView.getContext(), C5376d.WRONG_PACKAGE_REACHED, "Wrong package name reached", sb2.toString(), this.f17156b);
                    }
                    if (this.f17164j != null) {
                        this.f17164j.run();
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }

        public void onPageFinished(WebView webView, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyWebViewClientSmartRedirect::onPageFinished - [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(2, sb.toString());
            if (!this.f17157c && !this.f17165k && this.f17155a.equals(str) && str != null && !C5349c.m22878b(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
                this.f17166l = true;
                try {
                    m22892a(str);
                } catch (Exception unused) {
                }
                m22894b(webView.getContext());
            }
            super.onPageFinished(webView, str);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyWebViewClientSmartRedirect::onReceivedError - [");
            sb.append(str);
            sb.append("], [");
            sb.append(str2);
            sb.append("]");
            C5518g.m23561a(2, sb.toString());
            m22893b();
            if (str2 != null && !C5349c.m22878b(str2) && C5349c.m22884d(str2)) {
                C5378f.m23016a(webView.getContext(), C5376d.FAILED_SMART_REDIRECT, Integer.toString(i), str2, this.f17156b);
            }
            super.onReceivedError(webView, i, str, str2);
        }

        /* renamed from: a */
        private void m22890a(final Context context) {
            C5554g.m23701a((Runnable) new Runnable() {
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0070 A[Catch:{ Exception -> 0x0078 }] */
                /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r5 = this;
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this
                        boolean r0 = r0.f17157c
                        if (r0 != 0) goto L_0x008a
                        com.startapp.android.publish.adsCommon.f.e r0 = new com.startapp.android.publish.adsCommon.f.e     // Catch:{ Exception -> 0x0030 }
                        com.startapp.android.publish.adsCommon.f.d r1 = com.startapp.android.publish.adsCommon.p182f.C5376d.FAILED_SMART_REDIRECT_HOP_INFO     // Catch:{ Exception -> 0x0030 }
                        r0.<init>(r1)     // Catch:{ Exception -> 0x0030 }
                        com.startapp.android.publish.adsCommon.c$a r1 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0030 }
                        org.json.JSONArray r1 = r1.mo19805a()     // Catch:{ Exception -> 0x0030 }
                        r0.mo19892a(r1)     // Catch:{ Exception -> 0x0030 }
                        com.startapp.android.publish.adsCommon.c$a r1 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0030 }
                        boolean r1 = r1.f17166l     // Catch:{ Exception -> 0x0030 }
                        if (r1 == 0) goto L_0x0022
                        java.lang.String r1 = "Page Finished"
                        r0.mo19893d(r1)     // Catch:{ Exception -> 0x0030 }
                        goto L_0x0027
                    L_0x0022:
                        java.lang.String r1 = "Timeout"
                        r0.mo19893d(r1)     // Catch:{ Exception -> 0x0030 }
                    L_0x0027:
                        android.content.Context r1 = r4     // Catch:{ Exception -> 0x0030 }
                        com.startapp.android.publish.adsCommon.c$a r2 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0030 }
                        java.lang.String r2 = r2.f17156b     // Catch:{ Exception -> 0x0030 }
                        com.startapp.android.publish.adsCommon.p182f.C5378f.m23018a(r1, r0, r2)     // Catch:{ Exception -> 0x0030 }
                    L_0x0030:
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        r1 = 1
                        r0.f17165k = r1     // Catch:{ Exception -> 0x0078 }
                        android.content.Context r0 = r4     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.C5349c.m22851a(r0)     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        r0.m22893b()     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        boolean r0 = r0.f17160f     // Catch:{ Exception -> 0x0078 }
                        if (r0 == 0) goto L_0x005d
                        com.startapp.android.publish.common.metaData.MetaData r0 = com.startapp.android.publish.common.metaData.MetaData.getInstance()     // Catch:{ Exception -> 0x0078 }
                        boolean r0 = r0.isInAppBrowser()     // Catch:{ Exception -> 0x0078 }
                        if (r0 == 0) goto L_0x005d
                        android.content.Context r0 = r4     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r1 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.String r1 = r1.f17155a     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r2 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.String r2 = r2.f17156b     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.C5349c.m22877b(r0, r1, r2)     // Catch:{ Exception -> 0x0078 }
                        goto L_0x006a
                    L_0x005d:
                        android.content.Context r0 = r4     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r1 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.String r1 = r1.f17155a     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.c$a r2 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.String r2 = r2.f17156b     // Catch:{ Exception -> 0x0078 }
                        com.startapp.android.publish.adsCommon.C5349c.m22855a(r0, r1, r2)     // Catch:{ Exception -> 0x0078 }
                    L_0x006a:
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.Runnable r0 = r0.f17164j     // Catch:{ Exception -> 0x0078 }
                        if (r0 == 0) goto L_0x008a
                        com.startapp.android.publish.adsCommon.c$a r0 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this     // Catch:{ Exception -> 0x0078 }
                        java.lang.Runnable r0 = r0.f17164j     // Catch:{ Exception -> 0x0078 }
                        r0.run()     // Catch:{ Exception -> 0x0078 }
                        goto L_0x008a
                    L_0x0078:
                        r0 = move-exception
                        android.content.Context r1 = r4
                        com.startapp.android.publish.adsCommon.f.d r2 = com.startapp.android.publish.adsCommon.p182f.C5376d.EXCEPTION
                        java.lang.String r3 = "AdsCommonUtils.startTimeout - error after time elapsed"
                        java.lang.String r0 = r0.getMessage()
                        com.startapp.android.publish.adsCommon.c$a r4 = com.startapp.android.publish.adsCommon.C5349c.C5353a.this
                        java.lang.String r4 = r4.f17156b
                        com.startapp.android.publish.adsCommon.p182f.C5378f.m23016a(r1, r2, r3, r0, r4)
                    L_0x008a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.C5349c.C5353a.C53541.run():void");
                }
            }, this.f17159e);
        }

        /* renamed from: b */
        private void m22894b(final Context context) {
            m22893b();
            try {
                this.f17170p = new Timer();
                this.f17170p.schedule(new TimerTask() {
                    public void run() {
                        if (!C5353a.this.f17165k && !C5353a.this.f17157c) {
                            try {
                                C5353a.this.f17157c = true;
                                C5349c.m22851a(context);
                                if (!C5353a.this.f17160f || !MetaData.getInstance().isInAppBrowser()) {
                                    C5349c.m22855a(context, C5353a.this.f17155a, C5353a.this.f17156b);
                                } else {
                                    C5349c.m22877b(context, C5353a.this.f17155a, C5353a.this.f17156b);
                                }
                                if (C5353a.this.f17164j != null) {
                                    C5353a.this.f17164j.run();
                                }
                            } catch (Exception e) {
                                C5378f.m23016a(context, C5376d.EXCEPTION, "AdsCommonUtils.startLoadedTimer - error after time elapsed", e.getMessage(), C5353a.this.f17156b);
                            }
                        }
                    }
                }, this.f17167m);
            } catch (Exception e) {
                this.f17170p = null;
                C5518g.m23564a("AdsCommonUtils", 6, "startLoadedTimer", e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m22893b() {
            if (this.f17170p != null) {
                this.f17170p.cancel();
                this.f17170p = null;
            }
        }

        /* renamed from: a */
        private void m22892a(String str) {
            if (((Float) this.f17168n.get(str)).floatValue() < 0.0f) {
                this.f17168n.put(str, Float.valueOf(((float) (System.currentTimeMillis() - this.f17169o)) / 1000.0f));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public JSONArray mo19805a() {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f17168n.keySet()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    m22892a(str);
                    jSONObject.put(C1245d.f3955iX, ((Float) this.f17168n.get(str)).toString());
                    jSONObject.put("url", str);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("error puting url into json [");
                    sb.append(str);
                    sb.append("]");
                    C5518g.m23561a(6, sb.toString());
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: a */
    public static AdType m22846a(AdPreferences adPreferences, String str) {
        Object a = C5307i.m22655a(adPreferences.getClass(), str, (Object) adPreferences);
        if (a == null || !(a instanceof AdType)) {
            return null;
        }
        return (AdType) a;
    }

    /* renamed from: a */
    public static void m22865a(AdPreferences adPreferences, String str, AdType adType) {
        C5307i.m22671a(adPreferences.getClass(), str, (Object) adPreferences, (Object) adType);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String, code=java.lang.Object, for r4v0, types: [java.lang.Object, java.lang.String] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22848a(android.content.Context r3, java.lang.Object r4) {
        /*
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ NotFoundException -> 0x000f }
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()     // Catch:{ NotFoundException -> 0x000f }
            int r1 = r1.labelRes     // Catch:{ NotFoundException -> 0x000f }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ NotFoundException -> 0x000f }
            return r0
        L_0x000f:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0020 }
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 == 0) goto L_0x0027
            java.lang.CharSequence r4 = r0.getApplicationLabel(r3)
        L_0x0027:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.C5349c.m22848a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m22868a(Activity activity) {
        boolean z = activity.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        if ((activity.getWindow().getAttributes().flags & C1245d.f3947iP) != 0) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public static int m22845a(String str) {
        String[] split = str.split("&");
        return Integer.parseInt(split[split.length - 1].split("=")[1]);
    }

    /* renamed from: a */
    public static void m22864a(Context context, String[] strArr, String str, String str2) {
        m22863a(context, strArr, str, 0, str2);
    }

    /* renamed from: a */
    public static void m22863a(Context context, String[] strArr, String str, int i, String str2) {
        C5363b nonImpressionReason = new C5363b(str).setOffset(i).setNonImpressionReason(str2);
        if (strArr == null || strArr.length == 0) {
            C5378f.m23016a(context, C5376d.NON_IMPRESSION_NO_DPARAM, str2, nonImpressionReason.getProfileId(), "");
            return;
        }
        for (String str3 : strArr) {
            if (str3 != null && !str3.equalsIgnoreCase("")) {
                StringBuilder sb = new StringBuilder();
                sb.append("Sending Impression: [");
                sb.append(str3);
                sb.append("]");
                C5518g.m23561a(3, sb.toString());
                m22854a(context, str3, nonImpressionReason, false);
            }
        }
    }

    /* renamed from: a */
    public static void m22853a(Context context, String str, C5363b bVar) {
        if (str != null && !str.equalsIgnoreCase("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Sending Impression: [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(3, sb.toString());
            if (bVar != null) {
                bVar.setLocation(context);
            }
            m22854a(context, str, bVar, true);
        }
    }

    /* renamed from: a */
    public static void m22862a(Context context, String[] strArr, C5363b bVar) {
        if (strArr != null) {
            for (String a : strArr) {
                m22853a(context, a, bVar);
            }
        }
    }

    /* renamed from: a */
    public static List<String> m22850a(List<String> list, String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 5;
            List subList = list.subList(i, Math.min(i2, list.size()));
            StringBuilder sb = new StringBuilder();
            sb.append(AdsConstants.f17009f);
            sb.append("?");
            sb.append(TextUtils.join("&", subList));
            sb.append("&isShown=");
            sb.append(str);
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("&appPresence=");
                sb2.append(str2);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            sb.append(str3);
            arrayList.add(sb.toString());
            i = i2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("newUrlList size = ");
        sb3.append(arrayList.size());
        C5518g.m23561a(3, sb3.toString());
        return arrayList;
    }

    /* renamed from: a */
    public static final void m22857a(Context context, String str, String str2, C5363b bVar, boolean z, boolean z2) {
        String str3;
        String str4;
        if (!TextUtils.isEmpty(str2)) {
            m22876b(context, str2, bVar);
        }
        C5427m.m23145a().mo19992b();
        String str5 = null;
        if (!z2) {
            try {
                str5 = m22849a(str, str2);
            } catch (Exception e) {
                C5376d dVar = C5376d.FAILED_EXTRACTING_DPARAMS;
                StringBuilder sb = new StringBuilder();
                sb.append("Util.clickWithoutSmartRedirect(): Couldn't extract dparams with clickUrl ");
                sb.append(str);
                sb.append(" and tacking click url ");
                sb.append(str2);
                C5378f.m23016a(context, dVar, sb.toString(), e.getMessage(), null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot start activity to handle url: [");
                sb2.append(str);
                sb2.append("]");
                C5518g.m23561a(6, sb2.toString());
            }
        }
        String str6 = "InAppBrowser";
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(m22888f(str2) ? C5503a.m23472a(str5) : "");
            str4 = sb3.toString();
            try {
                if (!MetaData.getInstance().isInAppBrowser() || !z) {
                    str3 = "externalBrowser";
                    try {
                        if (!TextUtils.isEmpty(str2) || !m22887f(context)) {
                            m22879c(context, str4);
                            return;
                        }
                        m22874b(context);
                        m22879c(context, m22889g(str4));
                        C5518g.m23561a(6, "forceExternal - click without - External");
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("forceExternal - click without - trackingClickUrl : ");
                        sb4.append(str2);
                        C5518g.m23561a(6, sb4.toString());
                    } catch (Exception e2) {
                        e = e2;
                        C5376d dVar2 = C5376d.EXCEPTION;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Util.clickWithoutSmartRedirect - Couldn't start activity for ");
                        sb5.append(str3);
                        C5378f.m23016a(context, dVar2, sb5.toString(), e.getMessage(), str5);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Cannot start activity to handle url: [");
                        sb6.append(str4);
                        sb6.append("]");
                        C5518g.m23561a(6, sb6.toString());
                    }
                } else {
                    m22877b(context, str4, str5);
                }
            } catch (Exception e3) {
                e = e3;
                str3 = str6;
                C5376d dVar22 = C5376d.EXCEPTION;
                StringBuilder sb52 = new StringBuilder();
                sb52.append("Util.clickWithoutSmartRedirect - Couldn't start activity for ");
                sb52.append(str3);
                C5378f.m23016a(context, dVar22, sb52.toString(), e.getMessage(), str5);
                StringBuilder sb62 = new StringBuilder();
                sb62.append("Cannot start activity to handle url: [");
                sb62.append(str4);
                sb62.append("]");
                C5518g.m23561a(6, sb62.toString());
            }
        } catch (Exception e4) {
            e = e4;
            str4 = str;
            str3 = str6;
            C5376d dVar222 = C5376d.EXCEPTION;
            StringBuilder sb522 = new StringBuilder();
            sb522.append("Util.clickWithoutSmartRedirect - Couldn't start activity for ");
            sb522.append(str3);
            C5378f.m23016a(context, dVar222, sb522.toString(), e.getMessage(), str5);
            StringBuilder sb622 = new StringBuilder();
            sb622.append("Cannot start activity to handle url: [");
            sb622.append(str4);
            sb622.append("]");
            C5518g.m23561a(6, sb622.toString());
        }
    }

    /* renamed from: f */
    private static boolean m22888f(String str) {
        return C5344b.m22784a().mo19752D() || TextUtils.isEmpty(str);
    }

    /* renamed from: g */
    private static String m22889g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&cki=1");
        return sb.toString();
    }

    /* renamed from: b */
    private static void m22874b(Context context) {
        C5414k.m23102b(context, "shared_prefs_CookieFeatureTS", Long.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append("forceExternal - write to sp - TS : ");
        sb.append(SimpleDateFormat.getDateInstance().format(new Date()));
        C5518g.m23561a(6, sb.toString());
    }

    /* renamed from: a */
    public static final void m22859a(Context context, String str, String str2, String str3, C5363b bVar, long j, long j2, boolean z, Boolean bool, boolean z2) {
        m22860a(context, str, str2, str3, bVar, j, j2, z, bool, z2, null);
    }

    /* renamed from: a */
    public static final void m22860a(Context context, String str, String str2, String str3, C5363b bVar, long j, long j2, boolean z, Boolean bool, boolean z2, Runnable runnable) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        if (C5344b.m22784a().mo19751C()) {
            C5427m.m23145a().mo19992b();
            String str6 = null;
            if (!z2) {
                try {
                    str6 = m22849a(str4, str5);
                } catch (Exception e) {
                    C5376d dVar = C5376d.FAILED_EXTRACTING_DPARAMS;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Util.clickWithSmartRedirect(): Couldn't extract dparams with clickUrl ");
                    sb.append(str4);
                    sb.append(" and tacking click url ");
                    sb.append(str5);
                    C5378f.m23016a(context2, dVar, sb.toString(), e.getMessage(), null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot start activity to handle url: [");
                    sb2.append(str4);
                    sb2.append("]");
                    C5518g.m23561a(6, sb2.toString());
                }
            }
            if (str5 != null && !str5.equals("")) {
                m22876b(context2, str5, bVar);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(m22888f(str5) ? C5503a.m23472a(str6) : "");
            m22858a(context2, sb3.toString(), str3, str6, j, j2, z, bool, runnable);
            return;
        }
        m22857a(context2, str4, str5, bVar, z, z2);
    }

    /* renamed from: b */
    public static void m22876b(Context context, String str, C5363b bVar) {
        m22854a(context, str, bVar, true);
    }

    /* renamed from: a */
    public static void m22854a(final Context context, final String str, final C5363b bVar, final boolean z) {
        if (!str.equals("")) {
            C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
                public void run() {
                    try {
                        if (z) {
                            Context context = context;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(C5503a.m23472a(C5349c.m22885e(str)));
                            sb.append(bVar.getQueryString());
                            C5415a.m23108a(context, sb.toString(), null);
                            return;
                        }
                        Context context2 = context;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(bVar.getQueryString());
                        C5415a.m23108a(context2, sb2.toString(), null);
                    } catch (C5552e e) {
                        C5378f.m23016a(context, C5376d.EXCEPTION, "Util.sendTrackingMessage - Error sending tracking message", e.getMessage(), C5349c.m22885e(str));
                        C5518g.m23562a(6, "Error sending tracking message", (Throwable) e);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m22875b(final Context context, final String str) {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                try {
                    C5415a.m23108a(context, str, null);
                } catch (C5552e e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, "Util.sendTrackingMessage - Error sending tracking message", e.getMessage(), "");
                    C5518g.m23562a(6, "Error sending tracking message", (Throwable) e);
                }
            }
        });
    }

    /* renamed from: a */
    private static final void m22858a(Context context, String str, String str2, String str3, long j, long j2, boolean z, Boolean bool, Runnable runnable) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C5523b.m23588a(context).mo20506a(new Intent("com.startapp.android.OnClickCallback"));
        if (m22878b(str)) {
            if (str5 != null && !str5.equals("") && !str.toLowerCase().contains(str2.toLowerCase())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected: ");
                sb.append(str5);
                sb.append(" Link: ");
                sb.append(str4);
                C5378f.m23016a(context2, C5376d.WRONG_PACKAGE_REACHED, "Wrong package name reached", sb.toString(), str6);
            }
            m22855a(context2, str4, str6);
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        if (context2 instanceof Activity) {
            C5307i.m22662a((Activity) context2, true);
        }
        try {
            final WebView webView = new WebView(context2);
            if (f17147a == null) {
                if (VERSION.SDK_INT >= 22) {
                    f17147a = new ProgressDialog(context2, 16974545);
                } else {
                    f17147a = new ProgressDialog(context2);
                }
                f17147a.setTitle(null);
                f17147a.setMessage("Loading....");
                f17147a.setIndeterminate(false);
                f17147a.setCancelable(false);
                f17147a.setOnCancelListener(new OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        webView.stopLoading();
                    }
                });
                if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                    f17147a.show();
                } else if (!(context2 instanceof Activity) && m22880c(context) && f17147a.getWindow() != null) {
                    if (VERSION.SDK_INT >= 26) {
                        f17147a.getWindow().setType(2038);
                    } else {
                        f17147a.getWindow().setType(AdError.INTERNAL_ERROR_2003);
                    }
                    f17147a.show();
                }
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
            C5353a aVar = r2;
            String str7 = str6;
            WebView webView2 = webView;
            C5353a aVar2 = new C5353a(j, j2, z, bool, f17147a, str4, str5, str7, runnable);
            webView2.setWebViewClient(aVar);
            webView2.loadUrl(str4);
        } catch (Exception e) {
            Context context3 = context;
            String str8 = str3;
            C5378f.m23016a(context3, C5376d.EXCEPTION, "Util.smartRedirect - Webview failed", e.getMessage(), str8);
            m22855a(context3, str4, str8);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: c */
    private static boolean m22880c(Context context) {
        if (VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return C5509c.m23516a(context, "android.permission.SYSTEM_ALERT_WINDOW");
    }

    /* renamed from: b */
    public static boolean m22878b(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    /* renamed from: c */
    public static boolean m22881c(String str) {
        return str.startsWith("intent://");
    }

    /* renamed from: d */
    public static boolean m22884d(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: a */
    public static final void m22851a(Context context) {
        if (context != null && (context instanceof Activity)) {
            C5307i.m22662a((Activity) context, false);
        }
        m22882d(context);
    }

    /* renamed from: d */
    private static void m22882d(Context context) {
        if (f17147a != null) {
            synchronized (f17147a) {
                if (f17147a != null && f17147a.isShowing()) {
                    try {
                        f17147a.cancel();
                    } catch (Exception e) {
                        C5518g.m23562a(6, "Error while cancelling progress", (Throwable) e);
                        C5378f.m23016a(context, C5376d.EXCEPTION, "AdsCommonUtils.cancelProgress - progress.cancel() failed", e.getMessage(), "");
                    }
                    f17147a = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m22879c(Context context, String str) {
        m22855a(context, str, (String) null);
    }

    /* renamed from: a */
    public static void m22855a(Context context, String str, String str2) {
        m22861a(context, str, str2, m22884d(str));
    }

    /* renamed from: a */
    public static void m22861a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            int i = 76021760;
            if (C5344b.m22784a().mo19755G() || !(context instanceof Activity)) {
                i = 344457216;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(i);
            boolean a = m22869a(context, intent);
            if (!a) {
                try {
                    if (VERSION.SDK_INT >= 18 && MetaData.getInstance().getChromeCustomeTabsExternal() && m22886e(context)) {
                        m22883d(context, str);
                    }
                } catch (Exception unused) {
                    m22856a(context, str, str2, i);
                }
            }
            if (z && !a) {
                m22852a(context, intent, i);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static void m22852a(Context context, Intent intent, int i) {
        String[] strArr = {"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
        try {
            List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i);
            if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                for (String str : strArr) {
                    if (C5509c.m23517a(context, str, 0)) {
                        intent.setPackage(str);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "AdsCommonUtils.chooseDefaultBrowser", e.getMessage(), "");
        }
    }

    /* renamed from: a */
    private static void m22856a(Context context, String str, String str2, int i) {
        try {
            Intent parseUri = Intent.parseUri(str, i);
            m22869a(context, parseUri);
            if (!(context instanceof Activity)) {
                parseUri.addFlags(268435456);
            }
            context.startActivity(parseUri);
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Util.openUrlExternally - Couldn't start activity", e.getMessage(), str2);
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find activity to handle url: [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(6, sb.toString());
        }
    }

    /* renamed from: b */
    public static void m22877b(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Util.OpenAsInAppBrowser - Couldn't start activity", "Parameter clickUrl is null", str2);
            C5518g.m23561a(6, "Cannot start activity, because url is null");
        } else if (m22878b(str) || !C5307i.m22674a(256)) {
            m22855a(context, str, str2);
        } else {
            try {
                if (VERSION.SDK_INT >= 18 && MetaData.getInstance().getChromeCustomeTabsInternal() && m22886e(context)) {
                    m22883d(context, str);
                    return;
                }
            } catch (Exception e) {
                C5378f.m23016a(context, C5376d.EXCEPTION, "Util.OpenAsInAppBrowser - Couldn't openUrlChromeTabs", e.getMessage(), str2);
            }
            Intent intent = new Intent(context, OverlayActivity.class);
            if (VERSION.SDK_INT >= 21) {
                intent.addFlags(524288);
            }
            if (VERSION.SDK_INT >= 11) {
                intent.addFlags(32768);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", Placement.INAPP_BROWSER.getIndex());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
            } catch (Exception e2) {
                C5378f.m23016a(context, C5376d.EXCEPTION, "Util.OpenAsInAppBrowser - Couldn't start activity", e2.getMessage(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find activity to handle url: [");
                sb.append(str);
                sb.append("]");
                C5518g.m23561a(6, sb.toString());
            }
        }
    }

    /* renamed from: d */
    private static void m22883d(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: e */
    private static boolean m22886e(Context context) {
        return C5414k.m23092a(context, "chromeTabs", Boolean.valueOf(false)).booleanValue();
    }

    /* renamed from: a */
    public static void m22866a(String str, String str2, String str3, Context context, C5363b bVar) {
        m22854a(context, str3, bVar, true);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
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
            context.startActivity(launchIntentForPackage);
        } catch (Exception e2) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Util.handleCPEClick - Couldn't start activity", e2.getMessage(), m22849a(str3, (String) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find activity to handle url: [");
            sb.append(str3);
            sb.append("]");
            C5518g.m23561a(6, sb.toString());
        }
    }

    /* renamed from: e */
    public static String m22885e(String str) {
        return m22849a(str, (String) null);
    }

    /* renamed from: a */
    public static String m22849a(String str, String str2) {
        String str3 = "";
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
                return str3;
            }
        }
        String[] split = str.split("[?&]d=");
        return split.length >= 2 ? split[1].split("[?&]")[0] : str3;
    }

    /* renamed from: a */
    public static boolean m22869a(Context context, Intent intent) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.packageName.equalsIgnoreCase(Constants.f17536a)) {
                intent.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m22847a() {
        StringBuilder sb = new StringBuilder();
        sb.append("&position=");
        sb.append(m22873b());
        return sb.toString();
    }

    /* renamed from: b */
    public static String m22873b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i = 0;
        while (i < 8) {
            if (stackTrace[i].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i].getMethodName().compareTo("onBackPressed") != 0) {
                i++;
            } else if (!C5427m.m23145a().mo20011f() && !C5427m.m23170p()) {
                return "interstitial";
            } else {
                C5427m.m23145a().mo20020m();
                return "back";
            }
        }
        return "interstitial";
    }

    /* renamed from: a */
    public static String[] m22871a(C5382g gVar) {
        if (gVar instanceof C5364e) {
            return ((C5364e) gVar).mo19853l();
        }
        if (gVar instanceof C5395h) {
            return m22872a(((C5395h) gVar).mo19940d());
        }
        return new String[0];
    }

    /* renamed from: a */
    public static String[] m22872a(List<AdDetails> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AdDetails trackingUrl : list) {
                arrayList.add(trackingUrl.getTrackingUrl());
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: a */
    public static boolean m22870a(Context context, Placement placement) {
        StringBuilder sb = new StringBuilder();
        sb.append("forceExternal - check -placement is : ");
        sb.append(placement);
        C5518g.m23563a("AdsCommonUtils", 6, sb.toString());
        if (placement.equals(Placement.INAPP_SPLASH) || !C5344b.m22784a().mo19761M()) {
            return false;
        }
        return m22887f(context);
    }

    /* renamed from: f */
    private static boolean m22887f(Context context) {
        if (C5504b.m23480a().mo20472a(context).mo20478b() || !m22867a(C5414k.m23095a(context, "shared_prefs_CookieFeatureTS", Long.valueOf(0)).longValue(), System.currentTimeMillis())) {
            return false;
        }
        C5518g.m23563a("AdsCommonUtils", 6, "forceExternal - check - true ");
        return true;
    }

    /* renamed from: a */
    private static boolean m22867a(long j, long j2) {
        return j == 0 || j + (86400000 * ((long) C5344b.m22784a().mo19760L())) <= j2;
    }
}
