package com.appnext.banners;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Pair;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1301a;
import com.appnext.core.C1309d;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1326f;
import com.appnext.core.C1331g;
import com.appnext.core.C1345p;
import com.appnext.core.p049a.C1305b;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.banners.b */
final class C1200b extends C1309d {

    /* renamed from: fS */
    private static C1200b f3825fS;

    /* renamed from: dJ */
    private final int f3826dJ = 50;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo5558a(String str, C1286Ad ad, T t) {
    }

    /* renamed from: aH */
    public static synchronized C1200b m5130aH() {
        C1200b bVar;
        synchronized (C1200b.class) {
            if (f3825fS == null) {
                f3825fS = new C1200b();
            }
            bVar = f3825fS;
        }
        return bVar;
    }

    private C1200b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo5554a(Context context, C1286Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("http://global.appnext.com");
        sb.append("/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&auid=");
        sb.append(ad != null ? ad.getAUID() : "1000");
        sb.append("&type=json&id=");
        sb.append(str);
        sb.append("&cnt=50");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.4.5.472");
        sb.append("&cat=");
        sb.append(ad != null ? ad.getCategories() : "");
        sb.append("&pbk=");
        if (ad != null) {
            str2 = ad.getPostback();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("&did=");
        sb.append(C1326f.m5675b(context, Boolean.parseBoolean(C1202d.m5145aI().get("didPrivacy"))));
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
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(m5606q(context));
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo5851a(Context context, C1286Ad ad, String str, C1316a aVar, BannerAdRequest bannerAdRequest) {
        ((BannerAd) ad).setAdRequest(new BannerAdRequest(bannerAdRequest));
        super.mo6217a(context, ad, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5555a(Context context, C1286Ad ad, C1301a aVar) throws Exception {
        AppnextAd a = mo5848a(context, ad, ((BannerAdRequest) ((BannerAd) ad).getAdRequest()).getCreativeType());
        if (a == null) {
            throw new Exception(AppnextError.NO_ADS);
        }
        C1326f.m5671aL(a.getImageURL());
        if (ad instanceof MediumRectangleAd) {
            C1326f.m5671aL(a.getWideImageURL());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5551a(Context context, C1331g gVar) {
        BannerAdData bannerAdData = new BannerAdData((AppnextAd) gVar);
        int a = m5128a(context, bannerAdData);
        if (a != 0) {
            return a;
        }
        if (!bannerAdData.getCampaignGoal().equals(C1305b.f4126lT) || !C1326f.m5694i(context, bannerAdData.getAdPackage())) {
            return (!bannerAdData.getCampaignGoal().equals(C1305b.f4127lU) || C1326f.m5694i(context, bannerAdData.getAdPackage())) ? 0 : 1;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5556a(C1286Ad ad, String str, String str2) {
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C1345p mo5562d(C1286Ad ad) {
        return C1202d.m5145aI();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5559a(Context context, C1286Ad ad, ArrayList<?> arrayList) {
        return mo5849a(context, ad, arrayList, ((BannerAdRequest) ((BannerAd) ad).getAdRequest()).getCreativeType()) != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (hasVideo(r8) == false) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appnext.core.AppnextAd mo5850a(android.content.Context r6, com.appnext.core.C1286Ad r7, java.util.ArrayList<?> r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
        /*
            r5 = this;
            java.util.Iterator r6 = r8.iterator()
        L_0x0004:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x007e
            java.lang.Object r8 = r6.next()
            com.appnext.core.AppnextAd r8 = (com.appnext.core.AppnextAd) r8
            boolean r0 = r7 instanceof com.appnext.banners.MediumRectangleAd
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0063
            r0 = -1
            int r3 = r9.hashCode()
            r4 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            if (r3 == r4) goto L_0x003f
            r4 = 96673(0x179a1, float:1.35468E-40)
            if (r3 == r4) goto L_0x0035
            r4 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r3 == r4) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            java.lang.String r3 = "video"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0048
        L_0x0035:
            java.lang.String r3 = "all"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0048
            r0 = r2
            goto L_0x0048
        L_0x003f:
            java.lang.String r3 = "static"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0048
            r0 = r1
        L_0x0048:
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0052;
                case 2: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            r1 = r2
            goto L_0x0063
        L_0x004d:
            boolean r1 = hasVideo(r8)
            goto L_0x0063
        L_0x0052:
            boolean r1 = m5131c(r8)
            goto L_0x0063
        L_0x0057:
            boolean r0 = m5131c(r8)
            if (r0 != 0) goto L_0x0063
            boolean r0 = hasVideo(r8)
            if (r0 == 0) goto L_0x004b
        L_0x0063:
            if (r1 == 0) goto L_0x0004
            java.lang.String r0 = r8.getBannerID()
            java.lang.String r1 = r7.getPlacementID()
            boolean r0 = m5604b(r0, r1)
            if (r0 != 0) goto L_0x0004
            java.lang.String r0 = r8.getBannerID()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x0004
            return r8
        L_0x007e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.C1200b.mo5850a(android.content.Context, com.appnext.core.Ad, java.util.ArrayList, java.lang.String, java.util.ArrayList):com.appnext.core.AppnextAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5849a(Context context, C1286Ad ad, ArrayList<?> arrayList, String str) {
        return mo5850a(context, ad, arrayList, str, new ArrayList<>());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5848a(Context context, C1286Ad ad, String str) {
        if (mo6230k(ad) == null) {
            return null;
        }
        ArrayList ads = mo6230k(ad).getAds();
        if (ads == null) {
            return null;
        }
        return mo5849a(context, ad, ads, str);
    }

    /* renamed from: a */
    private static boolean m5129a(C1286Ad ad, AppnextAd appnextAd, String str) {
        if (!(ad instanceof MediumRectangleAd)) {
            return true;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -892481938) {
            if (hashCode != 96673) {
                if (hashCode == 112202875 && str.equals("video")) {
                    c = 2;
                }
            } else if (str.equals(BannerAdRequest.TYPE_ALL)) {
                c = 0;
            }
        } else if (str.equals("static")) {
            c = 1;
        }
        switch (c) {
            case 0:
                if (m5131c(appnextAd) || hasVideo(appnextAd)) {
                    return true;
                }
                return false;
            case 1:
                return m5131c(appnextAd);
            case 2:
                return hasVideo(appnextAd);
            default:
                return false;
        }
    }

    /* renamed from: f */
    public final ArrayList<AppnextAd> mo5852f(C1286Ad ad) {
        return mo6230k(ad).getAds();
    }

    /* renamed from: a */
    private static int m5128a(Context context, BannerAdData bannerAdData) {
        if (bannerAdData.getCptList().equals("") || bannerAdData.getCptList().equals("[]")) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(bannerAdData.getCptList());
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

    static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: c */
    static boolean m5131c(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }
}
