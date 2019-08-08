package com.appnext.ads.fullscreen;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Pair;
import com.appnext.ads.C1066a;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1309d;
import com.appnext.core.C1326f;
import com.appnext.core.C1331g;
import com.appnext.core.C1345p;
import com.appnext.core.p049a.C1305b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.ads.fullscreen.b */
public final class C1083b extends C1309d {

    /* renamed from: dI */
    private static C1083b f3619dI;

    /* renamed from: dJ */
    private final int f3620dJ = 30;

    /* renamed from: dK */
    private HashMap<C1286Ad, String> f3621dK = new HashMap<>();

    /* renamed from: ac */
    public static synchronized C1083b m4964ac() {
        C1083b bVar;
        synchronized (C1083b.class) {
            if (f3619dI == null) {
                f3619dI = new C1083b();
            }
            bVar = f3619dI;
        }
        return bVar;
    }

    private C1083b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo5554a(Context context, C1286Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        Object obj;
        Object obj2;
        C1326f.m5665a(ad != null ? ad.getTID() : "301", ad != null ? ad.getVID() : "2.4.5.472", ad != null ? ad.getAUID() : "700", str, ad != null ? ((Video) ad).getSessionId() : "", C1066a.f3550co, "sdk", "", "");
        StringBuilder sb = new StringBuilder();
        sb.append("http://global.appnext.com");
        sb.append("/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&auid=");
        sb.append(ad != null ? ad.getAUID() : "700");
        sb.append("&type=json&id=");
        sb.append(str);
        sb.append("&cnt=30");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.4.5.472");
        sb.append("&cat=");
        sb.append(ad != null ? ad.getCategories() : "");
        sb.append("&pbk=");
        sb.append(ad != null ? ad.getPostback() : "");
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
        sb.append(C1326f.m5675b(context, Boolean.parseBoolean(mo5562d(ad).get("didPrivacy"))));
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5551a(Context context, C1331g gVar) {
        AppnextAd appnextAd = (AppnextAd) gVar;
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        int i = (!fullscreenAd.getCampaignGoal().equals(C1305b.f4126lT) || !C1326f.m5694i(context, fullscreenAd.getAdPackage())) ? (!fullscreenAd.getCampaignGoal().equals(C1305b.f4127lU) || C1326f.m5694i(context, fullscreenAd.getAdPackage())) ? 0 : 2 : 1;
        int b = m4965b(context, appnextAd);
        if (i == 0 && b == 0) {
            return 0;
        }
        return i != 0 ? i : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5560a(C1286Ad ad) {
        return super.mo5560a(ad) && m4967h(ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5559a(Context context, C1286Ad ad, ArrayList<?> arrayList) {
        return mo5553a(context, ad, arrayList, "") != null;
    }

    /* renamed from: a */
    private void m4963a(Context context, C1286Ad ad, AppnextAd appnextAd) throws Exception {
        String str;
        if (!appnextAd.getImageURL().equals("")) {
            C1326f.m5671aL(appnextAd.getImageURL());
        }
        if (!appnextAd.getWideImageURL().equals("")) {
            C1326f.m5671aL(appnextAd.getWideImageURL());
        }
        Video video = (Video) ad;
        String videoUrl = getVideoUrl(appnextAd, video.getVideoLength());
        String N = m4960N(videoUrl);
        if (Video.getCacheVideo()) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            sb.append("/data/appnext/videos/");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getAbsolutePath());
            sb2.append("/data/appnext/videos/");
            sb2.append("tmp/vid");
            sb2.append(video.rnd);
            sb2.append("/");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(N);
        File file = new File(sb3.toString());
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(file.getPath());
            sb4.append(" exists");
            this.f3621dK.put(ad, file.getAbsolutePath());
        } else if (!Video.isStreamingModeEnabled()) {
            new File(str).mkdirs();
            URL url = new URL(videoUrl);
            url.openConnection().connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), C1245d.f3947iP);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(N);
            sb5.append(C1245d.f3944iM);
            FileOutputStream fileOutputStream = new FileOutputStream(sb5.toString());
            byte[] bArr = new byte[C1245d.f3947iP];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    StringBuilder sb6 = new StringBuilder("downloaded ");
                    sb6.append(str);
                    sb6.append(N);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(N);
                    sb7.append(C1245d.f3944iM);
                    File file2 = new File(sb7.toString());
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append(N);
                    file2.renameTo(new File(sb8.toString()));
                    file2.delete();
                    this.f3621dK.put(ad, file.getAbsolutePath());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m4962a(Context context, C1286Ad ad) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            sb.append("/data/appnext/videos/");
            File[] listFiles = new File(sb.toString()).listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                }

                /* renamed from: a */
                public static int m4983a(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            r4 = Video.getCacheVideo() ? ad instanceof FullScreenVideo ? Integer.parseInt(C1085c.m4984af().get("num_saved_videos")) - 1 : Integer.parseInt(C1103f.m5002ah().get("num_saved_videos")) - 1 : 0;
            if (listFiles.length > r4) {
                for (int i = 0; i < listFiles.length - r4; i++) {
                    listFiles[i].delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5556a(C1286Ad ad, String str, String str2) {
        if (ad != null) {
            String tid = ad.getTID();
            String vid = ad.getVID();
            C1326f.m5665a(tid, vid, ad.getAUID(), str2, str, C1066a.f3549cn, "sdk", "", "");
        } else {
            C1326f.m5665a("300", "2.4.5.472", "700", str2, str, C1066a.f3549cn, "sdk", "", "");
        }
        new StringBuilder("error ").append(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo5558a(String str, C1286Ad ad, T t) {
        C1326f.m5665a(ad.getTID(), ad.getVID(), ad.getAUID(), str, ((Video) ad).getSessionId(), C1066a.f3548cm, "sdk", "", "");
    }

    protected static String getVideoUrl(AppnextAd appnextAd, String str) {
        String str2;
        if (str.equals("30")) {
            str2 = appnextAd.getVideoUrlHigh30Sec();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh();
            }
        } else {
            str2 = appnextAd.getVideoUrlHigh();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh30Sec();
            }
        }
        StringBuilder sb = new StringBuilder("returning video url for: ");
        sb.append(appnextAd.getBannerID());
        sb.append(" with len: ");
        sb.append(str);
        sb.append(" url: ");
        sb.append(str2);
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5557a(String str, C1286Ad ad) {
        super.mo5557a(str, ad);
        if (this.f3621dK.containsKey(ad)) {
            this.f3621dK.remove(ad);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo5565g(C1286Ad ad) {
        try {
            if (!mo6223b(ad) || mo6230k(ad).mo6191cv().longValue() + mo6228j(ad) + 300000 < System.currentTimeMillis() || !m4967h(ad)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C1345p mo5562d(C1286Ad ad) {
        return ad instanceof RewardedVideo ? C1103f.m5002ah() : C1085c.m4984af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo5563e(C1286Ad ad) {
        try {
            return mo5560a(ad) && m4967h(ad);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    private boolean m4967h(C1286Ad ad) {
        if (Video.isStreamingModeEnabled()) {
            return true;
        }
        if (!this.f3621dK.containsKey(ad)) {
            return false;
        }
        return new File((String) this.f3621dK.get(ad)).exists();
    }

    /* renamed from: b */
    private static boolean m4966b(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AppnextAd mo5561b(Context context, C1286Ad ad) {
        return mo5552a(context, ad, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5552a(Context context, C1286Ad ad, String str) {
        if (mo6230k(ad) == null) {
            return null;
        }
        ArrayList ads = mo6230k(ad).getAds();
        if (ads == null) {
            return null;
        }
        return mo5553a(context, ad, ads, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo5553a(Context context, C1286Ad ad, ArrayList<AppnextAd> arrayList, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            if (m4966b(appnextAd) && !m5604b(appnextAd.getBannerID(), ad.getPlacementID()) && !appnextAd.getBannerID().equals(str)) {
                return appnextAd;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final ArrayList<AppnextAd> mo5564f(C1286Ad ad) {
        return mo6230k(ad).getAds();
    }

    /* renamed from: a */
    private static int m4961a(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCampaignGoal().equals(C1305b.f4126lT) || !C1326f.m5694i(context, fullscreenAd.getAdPackage())) {
            return (!fullscreenAd.getCampaignGoal().equals(C1305b.f4127lU) || C1326f.m5694i(context, fullscreenAd.getAdPackage())) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m4965b(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (fullscreenAd.getCptList().equals("") || fullscreenAd.getCptList().equals("[]")) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(fullscreenAd.getCptList());
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

    /* renamed from: N */
    protected static String m4960N(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(substring.substring(0, substring.lastIndexOf(46)));
            sb.append("_");
            sb.append(queryParameter);
            sb.append(substring.substring(substring.lastIndexOf(46)));
            return sb.toString();
        } catch (Throwable unused) {
            return substring;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5555a(android.content.Context r4, com.appnext.core.C1286Ad r5, com.appnext.core.C1301a r6) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0068 }
            r6.<init>()     // Catch:{ Throwable -> 0x0068 }
            java.io.File r0 = r4.getFilesDir()     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x0068 }
            r6.append(r0)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r0 = "/data/appnext/videos/"
            r6.append(r0)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0068 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0068 }
            r0.<init>(r6)     // Catch:{ Throwable -> 0x0068 }
            java.io.File[] r6 = r0.listFiles()     // Catch:{ Throwable -> 0x0068 }
            com.appnext.ads.fullscreen.b$1 r0 = new com.appnext.ads.fullscreen.b$1     // Catch:{ Throwable -> 0x0068 }
            r0.<init>()     // Catch:{ Throwable -> 0x0068 }
            java.util.Arrays.sort(r6, r0)     // Catch:{ Throwable -> 0x0068 }
            boolean r0 = com.appnext.ads.fullscreen.Video.getCacheVideo()     // Catch:{ Throwable -> 0x0068 }
            r1 = 0
            if (r0 == 0) goto L_0x0057
            boolean r0 = r5 instanceof com.appnext.ads.fullscreen.FullScreenVideo     // Catch:{ Throwable -> 0x0068 }
            if (r0 == 0) goto L_0x0046
            com.appnext.ads.fullscreen.c r0 = com.appnext.ads.fullscreen.C1085c.m4984af()     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r2 = "num_saved_videos"
            java.lang.String r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0068 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0068 }
            int r0 = r0 + -1
            goto L_0x0058
        L_0x0046:
            com.appnext.ads.fullscreen.f r0 = com.appnext.ads.fullscreen.C1103f.m5002ah()     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r2 = "num_saved_videos"
            java.lang.String r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0068 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0068 }
            int r0 = r0 + -1
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            int r2 = r6.length     // Catch:{ Throwable -> 0x0068 }
            if (r2 > r0) goto L_0x005c
            goto L_0x0068
        L_0x005c:
            int r2 = r6.length     // Catch:{ Throwable -> 0x0068 }
            int r2 = r2 - r0
            if (r1 >= r2) goto L_0x0068
            r2 = r6[r1]     // Catch:{ Throwable -> 0x0068 }
            r2.delete()     // Catch:{ Throwable -> 0x0068 }
            int r1 = r1 + 1
            goto L_0x005c
        L_0x0068:
            r6 = 0
            com.appnext.core.AppnextAd r0 = r3.mo5561b(r4, r5)     // Catch:{ Throwable -> 0x00b0 }
            if (r0 != 0) goto L_0x0079
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r6 = "No video ads"
            r4.<init>(r6)     // Catch:{ Throwable -> 0x0077 }
            throw r4     // Catch:{ Throwable -> 0x0077 }
        L_0x0077:
            r4 = move-exception
            goto L_0x00b2
        L_0x0079:
            r3.m4963a(r4, r5, r0)     // Catch:{ Throwable -> 0x0077 }
            boolean r6 = r5 instanceof com.appnext.ads.fullscreen.RewardedVideo     // Catch:{ Throwable -> 0x0077 }
            if (r6 == 0) goto L_0x00af
            r6 = r5
            com.appnext.ads.fullscreen.RewardedVideo r6 = (com.appnext.ads.fullscreen.RewardedVideo) r6     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r6 = r6.getMode()     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r1 = "default"
            boolean r1 = r6.equals(r1)     // Catch:{ Throwable -> 0x0077 }
            if (r1 == 0) goto L_0x0099
            com.appnext.ads.fullscreen.f r6 = com.appnext.ads.fullscreen.C1103f.m5002ah()     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r1 = "default_mode"
            java.lang.String r6 = r6.get(r1)     // Catch:{ Throwable -> 0x0077 }
        L_0x0099:
            java.lang.String r1 = "multi"
            boolean r6 = r6.equals(r1)     // Catch:{ Throwable -> 0x0077 }
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = r0.getBannerID()     // Catch:{ Throwable -> 0x0077 }
            com.appnext.core.AppnextAd r6 = r3.mo5552a(r4, r5, r6)     // Catch:{ Throwable -> 0x0077 }
            if (r6 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r3.m4963a(r4, r5, r6)     // Catch:{ Throwable -> 0x00b0 }
        L_0x00af:
            return
        L_0x00b0:
            r4 = move-exception
            r0 = r6
        L_0x00b2:
            if (r0 == 0) goto L_0x00bb
            java.lang.String r6 = r0.getBannerID()
            r3.mo5557a(r6, r5)
        L_0x00bb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.C1083b.mo5555a(android.content.Context, com.appnext.core.Ad, com.appnext.core.a):void");
    }
}
