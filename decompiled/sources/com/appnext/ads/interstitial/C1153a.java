package com.appnext.ads.interstitial;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Pair;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1301a;
import com.appnext.core.C1307b;
import com.appnext.core.C1309d;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1326f;
import com.appnext.core.C1331g;
import com.appnext.core.C1345p;
import com.appnext.core.p049a.C1305b;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.AppnextWebView.C1376c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.ads.interstitial.a */
public final class C1153a extends C1309d {

    /* renamed from: dJ */
    private static final int f3753dJ = 30;

    /* renamed from: fd */
    private static C1153a f3754fd;

    /* renamed from: eN */
    private String f3755eN;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo5558a(String str, C1286Ad ad, T t) {
    }

    /* renamed from: ax */
    public static synchronized C1153a m5095ax() {
        C1153a aVar;
        synchronized (C1153a.class) {
            if (f3754fd == null) {
                f3754fd = new C1153a();
            }
            aVar = f3754fd;
        }
        return aVar;
    }

    private C1153a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo5554a(Context context, C1286Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        String str2;
        String str3;
        Object obj;
        Object obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("http://global.appnext.com");
        sb.append("/offerWallApi.aspx?ext=t&pimp=1&type=json&igroup=sdk&m=1&osid=100&auid=");
        sb.append(ad != null ? ad.getAUID() : "600");
        sb.append("&id=");
        sb.append(str);
        sb.append("&cnt=30");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.4.5.472");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&cat=");
        if (ad == null) {
            str2 = "";
        } else {
            str2 = ad.getCategories();
        }
        sb.append(str2);
        sb.append("&pbk=");
        if (ad == null) {
            str3 = "";
        } else {
            str3 = ad.getPostback();
        }
        sb.append(str3);
        sb.append("&vidmin=");
        if (ad == null) {
            obj = "";
        } else {
            obj = Integer.valueOf(ad.getMinVideoLength());
        }
        sb.append(obj);
        sb.append("&vidmax=");
        if (ad == null) {
            obj2 = "";
        } else {
            obj2 = Integer.valueOf(ad.getMaxVideoLength());
        }
        sb.append(obj2);
        sb.append("&did=");
        sb.append(C1326f.m5675b(context, Boolean.parseBoolean(C1155c.m5113aA().get("didPrivacy"))));
        sb.append("&devn=");
        sb.append(C1326f.m5684cE());
        sb.append("&dosv=");
        sb.append(VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(C1326f.m5672aM(C1326f.m5699v(context)));
        sb.append("&lang=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&dcc=");
        sb.append(C1326f.m5700w(context));
        sb.append("&dds=0");
        sb.append(this.f3755eN.equals("static") ? "&creative=0" : "");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(m5606q(context));
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo5720a(Context context, C1286Ad ad, String str, C1316a aVar, String str2) {
        this.f3755eN = str2;
        super.mo6217a(context, ad, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5555a(Context context, C1286Ad ad, C1301a aVar) throws Exception {
        AppnextWebView.m5797B(context).mo6321a(((Interstitial) ad).getPageUrl(), (C1376c) null);
        if (aVar != null && aVar.getAds() != null && aVar.getAds().size() > 0) {
            C1326f.m5671aL(((AppnextAd) aVar.getAds().get(0)).getImageURL());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5551a(Context context, C1331g gVar) {
        AppnextAd appnextAd = (AppnextAd) gVar;
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        int i = (!interstitialAd.getCampaignGoal().equals(C1305b.f4126lT) || !C1326f.m5694i(context, interstitialAd.getAdPackage())) ? (!interstitialAd.getCampaignGoal().equals(C1305b.f4127lU) || C1326f.m5694i(context, interstitialAd.getAdPackage())) ? 0 : 2 : 1;
        int b = m5096b(context, appnextAd);
        if (i == 0 && b == 0) {
            return 0;
        }
        return i != 0 ? i : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5556a(C1286Ad ad, String str, String str2) {
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5559a(Context context, C1286Ad ad, ArrayList<?> arrayList) {
        return mo5719a(context, arrayList, ((Interstitial) ad).getCreativeType(), ad) != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C1345p mo5562d(C1286Ad ad) {
        return C1155c.m5113aA();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo5723e(C1286Ad ad) {
        return mo6223b(ad) && mo6230k(ad).getAds() != null && mo6230k(ad).getAds().size() > 0 && mo6230k(ad).mo6191cv().longValue() + 300000 > System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ArrayList<AppnextAd> mo5721b(Context context, C1286Ad ad, String str) {
        if (mo6230k(ad) == null) {
            return null;
        }
        ArrayList<AppnextAd> ads = mo6230k(ad).getAds();
        if (ads == null) {
            return null;
        }
        AppnextAd a = mo5719a(context, ads, str, ad);
        if (a == null) {
            return null;
        }
        ads.remove(a);
        ads.add(0, a);
        return ads;
    }

    /* renamed from: a */
    private static ArrayList<AppnextAd> m5093a(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        arrayList.remove(appnextAd);
        arrayList.add(0, appnextAd);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo5722d(ArrayList<AppnextAd> arrayList) {
        return super.mo5722d(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5557a(String str, C1286Ad ad) {
        super.mo5557a(str, ad);
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: c */
    private static boolean m5097c(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5719a(Context context, ArrayList<AppnextAd> arrayList, String str, C1286Ad ad) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            if (m5094a(appnextAd, str, ad)) {
                return appnextAd;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5094a(com.appnext.core.AppnextAd r5, java.lang.String r6, com.appnext.core.C1286Ad r7) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 835260319(0x31c90f9f, float:5.851646E-9)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "managed"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "static"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 2
            goto L_0x0035
        L_0x0034:
            r6 = -1
        L_0x0035:
            switch(r6) {
                case 0: goto L_0x0063;
                case 1: goto L_0x004e;
                case 2: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x007e
        L_0x0039:
            boolean r6 = m5097c(r5)
            if (r6 == 0) goto L_0x007e
            java.lang.String r5 = r5.getBannerID()
            java.lang.String r6 = r7.getPlacementID()
            boolean r5 = m5604b(r5, r6)
            if (r5 != 0) goto L_0x007e
            return r3
        L_0x004e:
            boolean r6 = hasVideo(r5)
            if (r6 == 0) goto L_0x007e
            java.lang.String r5 = r5.getBannerID()
            java.lang.String r6 = r7.getPlacementID()
            boolean r5 = m5604b(r5, r6)
            if (r5 != 0) goto L_0x007e
            return r3
        L_0x0063:
            boolean r6 = m5097c(r5)
            if (r6 != 0) goto L_0x006f
            boolean r6 = hasVideo(r5)
            if (r6 == 0) goto L_0x007e
        L_0x006f:
            java.lang.String r5 = r5.getBannerID()
            java.lang.String r6 = r7.getPlacementID()
            boolean r5 = m5604b(r5, r6)
            if (r5 != 0) goto L_0x007e
            return r3
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.C1153a.m5094a(com.appnext.core.AppnextAd, java.lang.String, com.appnext.core.Ad):boolean");
    }

    /* renamed from: a */
    private static int m5092a(Context context, AppnextAd appnextAd) {
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        if (!interstitialAd.getCampaignGoal().equals(C1305b.f4126lT) || !C1326f.m5694i(context, interstitialAd.getAdPackage())) {
            return (!interstitialAd.getCampaignGoal().equals(C1305b.f4127lU) || C1326f.m5694i(context, interstitialAd.getAdPackage())) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m5096b(Context context, AppnextAd appnextAd) {
        InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
        if (interstitialAd.getCptList().equals("") || interstitialAd.getCptList().equals("[]")) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(interstitialAd.getCptList());
            for (int i = 0; i < jSONArray.length(); i++) {
                if (C1326f.m5694i(context, jSONArray.getString(i))) {
                    return 0;
                }
            }
            return 3;
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo5724i(C1286Ad ad) {
        if (ad != null && mo6228j(ad) == 0) {
            mo6226cw().remove(new C1307b(ad));
        }
    }
}
