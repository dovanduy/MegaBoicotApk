package com.appnext.core;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appnext.core.e */
public final class C1317e {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: kD */
    private static C1317e f4157kD = null;

    /* renamed from: ku */
    private static final long f4158ku = 8000;

    /* renamed from: kv */
    private static final long f4159kv = 15000;
    /* access modifiers changed from: private */
    public Context context;
    private Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: kA */
    private Intent f4160kA;
    /* access modifiers changed from: private */

    /* renamed from: kB */
    public final ArrayList<C1325b> f4161kB = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: kC */
    public int f4162kC = 0;
    /* access modifiers changed from: private */

    /* renamed from: kw */
    public WebView f4163kw;
    /* access modifiers changed from: private */

    /* renamed from: kx */
    public WebView f4164kx;
    /* access modifiers changed from: private */

    /* renamed from: ky */
    public C1324a f4165ky = new C1324a() {
        public final void onMarket(String str) {
            C1317e.this.f4162kC = 0;
            if (C1317e.this.f4161kB.size() != 0) {
                if (((C1325b) C1317e.this.f4161kB.get(0)).f4183ky != null) {
                    ((C1325b) C1317e.this.f4161kB.get(0)).f4183ky.onMarket(str);
                }
                try {
                    StringBuilder sb = new StringBuilder("https://admin.appnext.com/tools/navtac.html?bid=");
                    sb.append(((C1325b) C1317e.this.f4161kB.get(0)).f4181kK);
                    sb.append("&guid=");
                    sb.append(C1326f.m5695n("admin.appnext.com", "applink"));
                    sb.append("&url=");
                    sb.append(URLEncoder.encode(str, C2793C.UTF8_NAME));
                    String sb2 = sb.toString();
                    if (C1317e.this.f4164kx == null) {
                        C1317e.this.f4164kx = new WebView(C1317e.this.context);
                        C1317e.this.f4164kx.getSettings().setJavaScriptEnabled(true);
                        C1317e.this.f4164kx.getSettings().setDomStorageEnabled(true);
                        if (VERSION.SDK_INT >= 21) {
                            C1317e.this.f4164kx.getSettings().setMixedContentMode(0);
                        }
                        C1317e.this.f4164kx.setWebViewClient(new WebViewClient() {
                            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                if (str == null || str.contains("about:blank")) {
                                    return false;
                                }
                                webView.loadUrl(str);
                                return true;
                            }
                        });
                    }
                    C1317e.this.f4164kx.loadUrl("about:blank");
                    C1317e.this.f4164kx.loadUrl(sb2);
                    new StringBuilder("store url: ").append(sb2);
                    C1317e.this.m5645cC();
                    C1317e.this.m5644cB();
                } catch (UnsupportedEncodingException unused) {
                    C1317e.this.m5644cB();
                }
            }
        }

        public final void error(String str) {
            C1317e.this.f4162kC = 0;
            if (C1317e.this.f4161kB.size() != 0) {
                if (((C1325b) C1317e.this.f4161kB.get(0)).f4183ky != null) {
                    ((C1325b) C1317e.this.f4161kB.get(0)).f4183ky.error(str);
                }
                C1317e.this.m5644cB();
            }
        }
    };

    /* renamed from: kz */
    private Runnable f4166kz = new Runnable() {
        public final void run() {
            if (!(C1317e.this.f4165ky == null || C1317e.this.f4163kw == null)) {
                C1317e.this.f4165ky.error(C1317e.this.f4163kw.getUrl());
                C1317e.this.f4163kw.stopLoading();
            }
            C1317e.this.m5644cB();
        }
    };

    /* renamed from: com.appnext.core.e$a */
    public interface C1324a {
        void error(String str);

        void onMarket(String str);
    }

    /* renamed from: com.appnext.core.e$b */
    private class C1325b {

        /* renamed from: bU */
        String f4179bU;

        /* renamed from: kK */
        String f4181kK;

        /* renamed from: kL */
        long f4182kL;

        /* renamed from: ky */
        C1324a f4183ky;

        C1325b(String str, String str2, C1324a aVar, long j) {
            this.f4179bU = str;
            this.f4183ky = aVar;
            this.f4181kK = str2;
            this.f4182kL = j;
        }
    }

    public static void destroy() {
    }

    /* renamed from: r */
    public static C1317e m5650r(Context context2) {
        if (f4157kD == null) {
            f4157kD = new C1317e(context2);
        }
        return f4157kD;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private C1317e(Context context2) {
        this.context = context2.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        super.finalize();
    }

    /* renamed from: a */
    public final void mo6239a(String str, String str2, C1324a aVar) {
        mo6240a(str, str2, aVar, f4158ku);
    }

    /* renamed from: a */
    public final void mo6240a(String str, String str2, C1324a aVar, long j) {
        if (this.context != null) {
            if (str != null) {
                Iterator it = this.f4161kB.iterator();
                while (it.hasNext()) {
                    if (((C1325b) it.next()).f4179bU.equals(str)) {
                        return;
                    }
                }
                if (str.endsWith("&ox=0")) {
                    ArrayList<C1325b> arrayList = this.f4161kB;
                    C1325b bVar = new C1325b(str, str2, aVar, j);
                    arrayList.add(bVar);
                    new StringBuilder("--ck-- in ").append(str);
                } else {
                    this.f4162kC = 0;
                    if (this.f4161kB.size() > 0 && !((C1325b) this.f4161kB.get(0)).f4179bU.endsWith("&ox=0")) {
                        new StringBuilder("--ck-- out ").append(((C1325b) this.f4161kB.get(0)).f4179bU);
                        ((C1325b) this.f4161kB.get(0)).f4183ky = null;
                        this.f4161kB.remove(0);
                        new StringBuilder("--ck-- size ").append(this.f4161kB.size());
                    }
                    ArrayList<C1325b> arrayList2 = this.f4161kB;
                    C1325b bVar2 = new C1325b(str, str2, aVar, j);
                    arrayList2.add(0, bVar2);
                    new StringBuilder("--ck-- in ").append(str);
                }
            }
            if (this.f4161kB.size() > 0 && this.f4162kC != 1) {
                this.f4162kC = 1;
                m5639a((C1325b) this.f4161kB.get(0));
            }
        }
    }

    private void setState(int i) {
        this.f4162kC = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: cC */
    public void m5645cC() {
        if (this.handler != null) {
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    private void m5639a(C1325b bVar) {
        try {
            m5645cC();
            if (this.f4163kw == null) {
                this.f4163kw = new WebView(this.context);
                this.f4163kw.getSettings().setJavaScriptEnabled(true);
                this.f4163kw.getSettings().setDomStorageEnabled(true);
                if (VERSION.SDK_INT >= 21) {
                    this.f4163kw.getSettings().setMixedContentMode(0);
                }
                this.f4163kw.setWebViewClient(new WebViewClient() {
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        String str2;
                        if (str == null) {
                            return false;
                        }
                        new StringBuilder("redirect url: ").append(str);
                        if (str.startsWith("https://play.google.com/store/apps/")) {
                            str = str.replace("https://play.google.com/store/apps/", "market://");
                        }
                        if (str.contains("about:blank")) {
                            return false;
                        }
                        if (str.startsWith("http://") || str.startsWith("https://")) {
                            if (C1317e.this.hasNewResolver(C1317e.m5641aH(str).setComponent(null))) {
                                C1317e.this.m5645cC();
                                if (C1317e.this.f4165ky != null) {
                                    C1317e.this.f4165ky.onMarket(str);
                                }
                                return true;
                            }
                            webView.loadUrl(str);
                            return true;
                        } else if (str.startsWith("intent://")) {
                            try {
                                Intent parseUri = Intent.parseUri(str, 1);
                                if (C1317e.this.context.getPackageManager().resolveActivity(parseUri, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                                    C1317e.this.m5645cC();
                                    if (C1317e.this.f4165ky != null) {
                                        C1317e.this.f4165ky.onMarket(parseUri.getData().toString());
                                    }
                                    return true;
                                }
                                if (parseUri.getExtras() != null && parseUri.getExtras().containsKey("browser_fallback_url") && !parseUri.getExtras().getString("browser_fallback_url").equals("")) {
                                    str2 = parseUri.getExtras().getString("browser_fallback_url");
                                } else if (!parseUri.getExtras().containsKey("market_referrer") || parseUri.getExtras().getString("market_referrer").equals("")) {
                                    C1317e.this.m5645cC();
                                    if (C1317e.this.f4165ky != null) {
                                        C1317e.this.f4165ky.error(str);
                                    }
                                    return true;
                                } else {
                                    StringBuilder sb = new StringBuilder("market://details?id=");
                                    sb.append(parseUri.getPackage());
                                    sb.append("&referrer=");
                                    sb.append(parseUri.getExtras().getString("market_referrer"));
                                    str2 = sb.toString();
                                }
                                C1317e.this.m5645cC();
                                if (C1317e.this.f4165ky != null) {
                                    C1317e.this.f4165ky.onMarket(str2);
                                }
                                return true;
                            } catch (Throwable unused) {
                                return false;
                            }
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            try {
                                if (C1317e.this.context.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
                                    C1317e.this.m5645cC();
                                    if (C1317e.this.f4165ky != null) {
                                        C1317e.this.f4165ky.onMarket(str);
                                    }
                                    return true;
                                }
                                webView.loadUrl(str);
                                return false;
                            } catch (Throwable unused2) {
                                return false;
                            }
                        }
                    }
                });
            }
            this.f4163kw.stopLoading();
            this.f4163kw.loadUrl("about:blank");
            this.f4160kA = new Intent(m5641aH(bVar.f4179bU)).setComponent(null);
            if (VERSION.SDK_INT >= 15) {
                Intent selector = this.f4160kA.getSelector();
                if (selector != null) {
                    selector.setComponent(null);
                }
            }
            this.f4163kw.loadUrl(bVar.f4179bU);
            new StringBuilder("appurl: ").append(bVar.f4179bU);
            this.handler.postDelayed(this.f4166kz, bVar.f4179bU.endsWith("&ox=0") ? f4159kv : bVar.f4182kL);
        } catch (Throwable unused) {
            if (this.f4165ky != null) {
                this.f4165ky.error(bVar.f4179bU);
            }
            m5644cB();
        }
    }

    /* renamed from: e */
    public final void mo6242e(final AppnextAd appnextAd) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C1326f.m5659a(appnextAd.getImpressionURL(), null);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    public final void mo6241a(String str, String str2, String str3, String str4, String str5, String str6) {
        final String str7 = str;
        final String str8 = str2;
        final String str9 = str3;
        final String str10 = str4;
        final String str11 = str5;
        final String str12 = str6;
        C13235 r1 = new Runnable() {
            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("guid", str7);
                    hashMap.put("bannerId", str8);
                    hashMap.put(AudienceNetworkActivity.PLACEMENT_ID, str9);
                    hashMap.put("vid", str10);
                    hashMap.put("url", str11);
                    StringBuilder sb = new StringBuilder("https://admin.appnext.com/AdminService.asmx/");
                    sb.append(str12);
                    C1326f.m5659a(sb.toString(), hashMap);
                } catch (Throwable unused) {
                }
            }
        };
        new Thread(r1).start();
    }

    /* renamed from: a */
    private static List m5638a(Context context2, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
        }
        return arrayList;
    }

    public final boolean hasNewResolver(Intent intent) {
        if (this.f4160kA == null) {
            return intent != null;
        }
        if (intent == null) {
            return false;
        }
        List<ComponentName> a = m5638a(this.context, intent);
        HashSet hashSet = new HashSet();
        hashSet.addAll(m5638a(this.context, this.f4160kA));
        for (ComponentName contains : a) {
            if (!hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: aH */
    public static Intent m5641aH(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: cB */
    public void m5644cB() {
        this.f4162kC = 0;
        if (this.f4161kB.size() != 0) {
            new StringBuilder("--ck-- out ").append(((C1325b) this.f4161kB.get(0)).f4179bU);
            ((C1325b) this.f4161kB.get(0)).f4183ky = null;
            this.f4161kB.remove(0);
            new StringBuilder("--ck-- size ").append(this.f4161kB.size());
            mo6239a(null, null, null);
        }
    }
}
