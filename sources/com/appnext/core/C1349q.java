package com.appnext.core;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.appnext.core.C1317e.C1324a;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.appnext.core.q */
public final class C1349q {

    /* renamed from: cB */
    private static final String f4251cB = "error_no_market";
    /* access modifiers changed from: private */
    public String banner = "";
    /* access modifiers changed from: private */
    public C1317e click;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public String guid = "";
    /* access modifiers changed from: private */

    /* renamed from: kp */
    public String f4252kp = "";
    /* access modifiers changed from: private */

    /* renamed from: lE */
    public C1332h f4253lE;
    /* access modifiers changed from: private */

    /* renamed from: lF */
    public C1358a f4254lF;
    /* access modifiers changed from: private */

    /* renamed from: lG */
    public C1324a f4255lG = new C1324a() {
        public final void onMarket(String str) {
            AppnextAd Z = C1349q.this.f4254lF.mo5459Z();
            C1286Ad Y = C1349q.this.f4254lF.mo5458Y();
            if (Y != null && Z != null && C1349q.this.context != null) {
                if (!C1326f.m5694i(C1349q.this.context, Z.getAdPackage())) {
                    try {
                        StringBuilder sb = new StringBuilder("market://details?id=");
                        sb.append(Z.getAdPackage());
                        if (!str.startsWith(sb.toString()) && !str.startsWith("http")) {
                            C1349q.this.mo6292b(C1326f.m5695n("admin.appnext.com", "applink"), Z.getBannerID(), Y.getPlacementID(), Y.getTID(), str, "SetROpenV1");
                        }
                    } catch (Throwable unused) {
                    }
                    if (C1349q.this.f4253lE == null) {
                        C1349q.this.f4253lE = new C1332h();
                    }
                    C1332h h = C1349q.this.f4253lE;
                    String adPackage = Z.getAdPackage();
                    String n = C1326f.m5695n("admin.appnext.com", "applink");
                    String bannerID = Z.getBannerID();
                    String placementID = Y.getPlacementID();
                    String tid = Y.getTID();
                    String vid = Y.getVID();
                    String auid = Y.getAUID();
                    h.f4215bf = adPackage;
                    h.f4216bg = str;
                    h.guid = n;
                    h.f4217bh = bannerID;
                    h.f4218bi = placementID;
                    h.f4220bk = null;
                    h.f4219bj = tid;
                    h.f4221do = vid;
                    h.f4222dp = auid;
                    C1349q.this.f4253lE.mo6272A(C1349q.this.context);
                    try {
                        C1349q.m5755d(C1349q.this, str);
                    } catch (Throwable unused2) {
                        C1349q.this.f4254lF.report("error_no_market");
                    }
                } else if (str.startsWith("market://")) {
                    try {
                        Intent launchIntentForPackage = C1349q.this.context.getPackageManager().getLaunchIntentForPackage(Z.getAdPackage());
                        launchIntentForPackage.addFlags(268435456);
                        C1349q.this.context.startActivity(launchIntentForPackage);
                    } catch (Throwable unused3) {
                        C1349q.this.f4254lF.report("error_no_market");
                    }
                } else {
                    try {
                        C1349q.m5755d(C1349q.this, str);
                    } catch (Throwable unused4) {
                        C1349q.this.f4254lF.report("error_no_market");
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|2|3|(5:5|6|7|8|16)(1:(1:10)(5:11|12|13|14|15))) */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x003a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0072 */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0050 A[SYNTHETIC, Splitter:B:5:0x0050] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x007e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void error(java.lang.String r8) {
            /*
                r7 = this;
                com.appnext.core.q r0 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x003a }
                java.lang.String r1 = "admin.appnext.com"
                java.lang.String r2 = "applink"
                java.lang.String r1 = com.appnext.core.C1326f.m5695n(r1, r2)     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q r2 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q$a r2 = r2.f4254lF     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.AppnextAd r2 = r2.mo5459Z()     // Catch:{ Throwable -> 0x003a }
                java.lang.String r2 = r2.getBannerID()     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q r3 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q$a r3 = r3.f4254lF     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.Ad r3 = r3.mo5458Y()     // Catch:{ Throwable -> 0x003a }
                java.lang.String r3 = r3.getPlacementID()     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q r4 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.q$a r4 = r4.f4254lF     // Catch:{ Throwable -> 0x003a }
                com.appnext.core.Ad r4 = r4.mo5458Y()     // Catch:{ Throwable -> 0x003a }
                java.lang.String r4 = r4.getTID()     // Catch:{ Throwable -> 0x003a }
                java.lang.String r6 = "SetDOpenV1"
                r5 = r8
                r0.mo6292b(r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x003a }
            L_0x003a:
                com.appnext.core.q r0 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0093 }
                com.appnext.core.q$a r0 = r0.f4254lF     // Catch:{ Throwable -> 0x0093 }
                com.appnext.core.p r0 = r0.mo5460aa()     // Catch:{ Throwable -> 0x0093 }
                java.lang.String r1 = "urlApp_protection"
                java.lang.String r0 = r0.get(r1)     // Catch:{ Throwable -> 0x0093 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Throwable -> 0x0093 }
                if (r0 == 0) goto L_0x007e
                com.appnext.core.q r8 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0072 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0072 }
                java.lang.String r1 = "market://details?id="
                r0.<init>(r1)     // Catch:{ Throwable -> 0x0072 }
                com.appnext.core.q r1 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0072 }
                com.appnext.core.q$a r1 = r1.f4254lF     // Catch:{ Throwable -> 0x0072 }
                com.appnext.core.AppnextAd r1 = r1.mo5459Z()     // Catch:{ Throwable -> 0x0072 }
                java.lang.String r1 = r1.getAdPackage()     // Catch:{ Throwable -> 0x0072 }
                r0.append(r1)     // Catch:{ Throwable -> 0x0072 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0072 }
                com.appnext.core.C1349q.m5755d(r8, r0)     // Catch:{ Throwable -> 0x0072 }
                goto L_0x0093
            L_0x0072:
                com.appnext.core.q r8 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0093 }
                com.appnext.core.q$a r8 = r8.f4254lF     // Catch:{ Throwable -> 0x0093 }
                java.lang.String r0 = "error_no_market"
                r8.report(r0)     // Catch:{ Throwable -> 0x0093 }
                goto L_0x0093
            L_0x007e:
                if (r8 != 0) goto L_0x0081
                return
            L_0x0081:
                com.appnext.core.q r0 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0087 }
                com.appnext.core.C1349q.m5755d(r0, r8)     // Catch:{ Throwable -> 0x0087 }
                goto L_0x0093
            L_0x0087:
                com.appnext.core.q r8 = com.appnext.core.C1349q.this     // Catch:{ Throwable -> 0x0093 }
                com.appnext.core.q$a r8 = r8.f4254lF     // Catch:{ Throwable -> 0x0093 }
                java.lang.String r0 = "error_no_market"
                r8.report(r0)     // Catch:{ Throwable -> 0x0093 }
                return
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1349q.C13573.error(java.lang.String):void");
        }
    };

    /* renamed from: com.appnext.core.q$a */
    public interface C1358a {
        /* renamed from: Y */
        C1286Ad mo5458Y();

        /* renamed from: Z */
        AppnextAd mo5459Z();

        /* renamed from: aa */
        C1345p mo5460aa();

        void report(String str);
    }

    public C1349q(Context context2, C1358a aVar) {
        this.context = context2;
        this.click = C1317e.m5650r(context2);
        this.f4254lF = aVar;
    }

    /* renamed from: b */
    public final void mo6292b(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.click != null) {
            C13235 r2 = new Runnable(str, str2, str3, str4, str5, str6) {
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
            new Thread(r2).start();
        }
    }

    /* renamed from: a */
    public final void mo6290a(final AppnextAd appnextAd, final String str, final C1324a aVar) {
        if (this.click != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("&device=");
                        sb.append(C1326f.m5684cE());
                        sb.append("&ox=0");
                        C1349q.this.click.mo6239a(sb.toString(), appnextAd.getBannerID(), new C1324a() {
                            public final void onMarket(String str) {
                                C1349q.this.f4252kp = str;
                                C1349q.this.guid = C1326f.m5695n("admin.appnext.com", "applink");
                                C1349q.this.banner = appnextAd.getBannerID();
                                if (aVar != null) {
                                    aVar.onMarket(str);
                                }
                            }

                            public final void error(String str) {
                                C1349q.this.f4252kp = "";
                                C1349q.this.guid = "";
                                C1349q.this.banner = "";
                                if (aVar != null) {
                                    aVar.error(str);
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo6291a(AppnextAd appnextAd, String str, String str2, C1324a aVar) {
        final String str3 = str;
        final C1324a aVar2 = aVar;
        final AppnextAd appnextAd2 = appnextAd;
        final String str4 = str2;
        C13522 r1 = new Runnable() {
            public final void run() {
                if (!C1349q.this.mo6293cM()) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C1324a b = C1349q.this.f4255lG;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append("&device=");
                            sb.append(C1326f.m5684cE());
                            b.error(sb.toString());
                            if (aVar2 != null) {
                                C1324a aVar = aVar2;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3);
                                sb2.append("&device=");
                                sb2.append(C1326f.m5684cE());
                                aVar.error(sb2.toString());
                            }
                        }
                    });
                } else if (appnextAd2 != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            if (C1349q.this.f4252kp.equals("") || !C1349q.this.f4252kp.contains(appnextAd2.getAdPackage())) {
                                new StringBuilder("click url ").append(str3);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append("&device=");
                                sb.append(C1326f.m5684cE());
                                String sb2 = sb.toString();
                                String webview = appnextAd2.getWebview();
                                char c = 65535;
                                switch (webview.hashCode()) {
                                    case 48:
                                        if (webview.equals("0")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 49:
                                        if (webview.equals("1")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 50:
                                        if (webview.equals("2")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        try {
                                            C1349q.this.f4255lG.onMarket(sb2);
                                            if (aVar2 != null) {
                                                aVar2.onMarket(sb2);
                                            }
                                            return;
                                        } catch (Throwable unused) {
                                            return;
                                        }
                                    case 1:
                                        Intent intent = new Intent(C1349q.this.context, ResultActivity.class);
                                        intent.putExtra("url", sb2);
                                        intent.putExtra("title", appnextAd2.getAdTitle());
                                        intent.addFlags(268435456);
                                        C1349q.this.context.startActivity(intent);
                                        if (aVar2 != null) {
                                            aVar2.onMarket(sb2);
                                            return;
                                        }
                                        break;
                                    default:
                                        if (C1349q.this.click != null) {
                                            C1349q.this.click.mo6240a(sb2, appnextAd2.getBannerID(), new C1324a() {
                                                public final void onMarket(String str) {
                                                    C1349q.this.f4255lG.onMarket(str);
                                                    if (aVar2 != null) {
                                                        aVar2.onMarket(str);
                                                    }
                                                }

                                                public final void error(String str) {
                                                    C1349q.this.f4255lG.error(str);
                                                    if (aVar2 != null) {
                                                        aVar2.error(str);
                                                    }
                                                }
                                            }, 1000 * Long.parseLong(C1349q.this.f4254lF.mo5460aa().get("resolve_timeout")));
                                            break;
                                        } else {
                                            return;
                                        }
                                }
                                return;
                            }
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        StringBuilder sb = new StringBuilder("https://admin.appnext.com/AdminService.asmx/SetRL?guid=");
                                        sb.append(C1349q.this.guid);
                                        sb.append("&bid=");
                                        sb.append(C1349q.this.banner);
                                        sb.append("&pid=");
                                        sb.append(str4);
                                        C1326f.m5659a(sb.toString(), null);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }).start();
                            C1349q.this.f4255lG.onMarket(C1349q.this.f4252kp);
                            if (aVar2 != null) {
                                aVar2.onMarket(C1349q.this.f4252kp);
                            }
                            C1349q.this.f4252kp = "";
                        }
                    });
                }
            }
        };
        new Thread(r1).start();
    }

    private void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    /* renamed from: e */
    public final void mo6295e(AppnextAd appnextAd) {
        try {
            if (this.click != null) {
                this.click.mo6242e(appnextAd);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cM */
    public final boolean mo6293cM() {
        try {
            if (this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                C1326f.m5659a("http://www.appnext.com/myid.html", null);
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (!activeNetworkInfo.isConnected()) {
                    }
                }
                throw new IOException();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void destroy() {
        try {
            if (this.f4253lE != null) {
                this.f4253lE.mo5410d(this.context);
            }
            this.f4253lE = null;
        } catch (Throwable unused) {
        }
        this.context = null;
        if (this.click != null) {
            this.click = null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m5755d(C1349q qVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        qVar.context.startActivity(intent);
    }
}
