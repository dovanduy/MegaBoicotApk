package com.appnext.nativeads;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Pair;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1301a;
import com.appnext.core.C1309d;
import com.appnext.core.C1309d.C1316a;
import com.appnext.core.C1326f;
import com.appnext.core.C1331g;
import com.appnext.core.C1345p;
import com.appnext.core.p049a.C1305b;
import com.appnext.nativeads.NativeAdRequest.CachingPolicy;
import com.appnext.nativeads.NativeAdRequest.CreativeType;
import com.appnext.nativeads.NativeAdRequest.VideoLength;
import com.appnext.nativeads.NativeAdRequest.VideoQuality;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.nativeads.c */
public final class C1417c extends C1309d {

    /* renamed from: mS */
    private static C1417c f4357mS;

    /* renamed from: dJ */
    private final int f4358dJ = 50;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5556a(C1286Ad ad, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo5558a(String str, C1286Ad ad, T t) {
    }

    /* renamed from: cU */
    public static synchronized C1417c m5874cU() {
        C1417c cVar;
        synchronized (C1417c.class) {
            if (f4357mS == null) {
                f4357mS = new C1417c();
            }
            cVar = f4357mS;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo5554a(Context context, C1286Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        String str2;
        Object obj;
        Object obj2;
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
        sb.append(C1326f.m5675b(context, Boolean.parseBoolean(C1416b.m5865cT().get("didPrivacy"))));
        sb.append("&creative=");
        sb.append(ad != null ? Integer.valueOf(((NativeAdRequest) ((NativeAdObject) ad).getAdRequest()).getCreativeType().ordinal()) : CreativeType.ALL);
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
    public final void mo6454a(Context context, C1286Ad ad, String str, C1316a aVar, NativeAdRequest nativeAdRequest) {
        ((NativeAdObject) ad).setAdRequest(new NativeAdRequest(nativeAdRequest));
        super.mo6218a(context, ad, str, aVar, true);
    }

    /* renamed from: a */
    static String m5870a(NativeAdRequest nativeAdRequest, AppnextAd appnextAd) {
        String str = "";
        if (nativeAdRequest.getVideoQuality() == VideoQuality.HIGH && nativeAdRequest.getVideoLength() == VideoLength.LONG) {
            String videoUrlHigh30Sec = appnextAd.getVideoUrlHigh30Sec();
            if (videoUrlHigh30Sec.equals("")) {
                return appnextAd.getVideoUrl30Sec();
            }
            return videoUrlHigh30Sec;
        } else if (nativeAdRequest.getVideoQuality() == VideoQuality.LOW && nativeAdRequest.getVideoLength() == VideoLength.LONG) {
            String videoUrl30Sec = appnextAd.getVideoUrl30Sec();
            if (videoUrl30Sec.equals("")) {
                return appnextAd.getVideoUrlHigh30Sec();
            }
            return videoUrl30Sec;
        } else if (nativeAdRequest.getVideoQuality() == VideoQuality.HIGH && nativeAdRequest.getVideoLength() == VideoLength.SHORT) {
            String videoUrlHigh = appnextAd.getVideoUrlHigh();
            if (videoUrlHigh.equals("")) {
                return appnextAd.getVideoUrl();
            }
            return videoUrlHigh;
        } else if (nativeAdRequest.getVideoQuality() != VideoQuality.LOW || nativeAdRequest.getVideoLength() != VideoLength.SHORT) {
            return str;
        } else {
            String videoUrl = appnextAd.getVideoUrl();
            return videoUrl.equals("") ? appnextAd.getVideoUrlHigh() : videoUrl;
        }
    }

    /* renamed from: a */
    private void m5871a(Context context, C1286Ad ad) {
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
                public static int m5888a(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            int parseInt = Integer.parseInt(C1416b.m5865cT().get("num_saved_videos")) - 1;
            if (listFiles.length > parseInt) {
                for (int i = 0; i < listFiles.length - parseInt; i++) {
                    listFiles[i].delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: N */
    protected static String m5868N(String str) {
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
    /* renamed from: a */
    public final int mo5551a(Context context, C1331g gVar) {
        AppnextAd appnextAd = (AppnextAd) gVar;
        NativeAdData nativeAdData = new NativeAdData(appnextAd);
        int a = m5869a(context, nativeAdData);
        if (a != 0) {
            return a;
        }
        boolean z = true;
        if (nativeAdData.getCampaignGoal().equals(C1305b.f4126lT) && C1326f.m5694i(context, nativeAdData.getAdPackage())) {
            return 1;
        }
        if (nativeAdData.getCampaignGoal().equals(C1305b.f4127lU) && !C1326f.m5694i(context, nativeAdData.getAdPackage())) {
            return 2;
        }
        if (!m5873c(appnextAd)) {
            if (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("") && appnextAd.getVideoUrlHigh30Sec().equals("")) {
                z = false;
            }
            if (!z) {
                return 3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C1345p mo5562d(C1286Ad ad) {
        return C1416b.m5865cT();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ArrayList<AppnextAd> mo6453a(String str, NativeAdRequest nativeAdRequest, ArrayList<AppnextAd> arrayList) {
        ArrayList<AppnextAd> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            if (m5872a(appnextAd, nativeAdRequest) && !m5604b(appnextAd.getBannerID(), str)) {
                arrayList2.add(appnextAd);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo6452a(Context context, C1286Ad ad, ArrayList<AppnextAd> arrayList, NativeAdRequest nativeAdRequest) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            if (m5872a(appnextAd, nativeAdRequest) && !m5604b(appnextAd.getBannerID(), ad.getPlacementID())) {
                return appnextAd;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo6451a(Context context, C1286Ad ad, NativeAdRequest nativeAdRequest) {
        if (mo6230k(ad) == null) {
            return null;
        }
        ArrayList ads = mo6230k(ad).getAds();
        if (ads == null) {
            return null;
        }
        return mo6452a(context, ad, ads, nativeAdRequest);
    }

    /* renamed from: a */
    private boolean m5872a(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        if (nativeAdRequest.getCreativeType() == CreativeType.ALL) {
            return m5873c(appnextAd) || !m5870a(nativeAdRequest, appnextAd).equals("");
        }
        if (nativeAdRequest.getCreativeType() == CreativeType.STATIC_ONLY) {
            return m5873c(appnextAd);
        }
        return nativeAdRequest.getCreativeType() == CreativeType.VIDEO_ONLY && !m5870a(nativeAdRequest, appnextAd).equals("");
    }

    /* renamed from: a */
    private static int m5869a(Context context, NativeAdData nativeAdData) {
        if (nativeAdData.getCptList().equals("") || nativeAdData.getCptList().equals("[]")) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(nativeAdData.getCptList());
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

    /* renamed from: f */
    public final ArrayList<AppnextAd> mo6455f(C1286Ad ad) {
        return mo6230k(ad).getAds();
    }

    static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: c */
    static boolean m5873c(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5560a(C1286Ad ad) {
        return super.mo5560a(ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5559a(Context context, C1286Ad ad, ArrayList<?> arrayList) {
        return mo6452a(context, ad, arrayList, (NativeAdRequest) ((NativeAdObject) ad).getAdRequest()) != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5555a(Context context, C1286Ad ad, C1301a aVar) throws Exception {
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
                public static int m5888a(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            int parseInt = Integer.parseInt(C1416b.m5865cT().get("num_saved_videos")) - 1;
            if (listFiles.length > parseInt) {
                for (int i = 0; i < listFiles.length - parseInt; i++) {
                    listFiles[i].delete();
                }
            }
        } catch (Throwable unused) {
        }
        NativeAdObject nativeAdObject = (NativeAdObject) ad;
        NativeAdRequest nativeAdRequest = (NativeAdRequest) nativeAdObject.getAdRequest();
        if (nativeAdRequest.getVideoLength() == VideoLength.DEFAULT) {
            ((NativeAdRequest) nativeAdObject.getAdRequest()).setVideoLength(VideoLength.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_length"))));
        }
        if (nativeAdRequest.getVideoQuality() == VideoQuality.DEFAULT) {
            nativeAdRequest.setVideoQuality(VideoQuality.fromInt(Integer.parseInt(C1416b.m5865cT().get("default_video_quality"))));
        }
        AppnextAd a = m5874cU().mo6451a(context, ad, nativeAdRequest);
        if (a == null) {
            throw new Exception();
        }
        if (nativeAdRequest.getCachingPolicy() == CachingPolicy.ALL || nativeAdRequest.getCachingPolicy() == CachingPolicy.STATIC_ONLY) {
            if (!a.getImageURL().equals("")) {
                C1326f.m5671aL(a.getImageURL());
            }
            if (!a.getWideImageURL().equals("")) {
                C1326f.m5671aL(a.getWideImageURL());
            }
        }
        if (nativeAdRequest.getCreativeType() != CreativeType.STATIC_ONLY) {
            if (nativeAdRequest.getCachingPolicy() == CachingPolicy.ALL || nativeAdRequest.getCachingPolicy() == CachingPolicy.VIDEO_ONLY) {
                String a2 = m5870a(nativeAdRequest, a);
                if (!a2.equals("")) {
                    String N = m5868N(a2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(context.getFilesDir().getAbsolutePath());
                    sb2.append("/data/appnext/videos/");
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(N);
                    File file = new File(sb4.toString());
                    if (file.exists()) {
                        file.setLastModified(System.currentTimeMillis());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(file.getPath());
                        sb5.append(" exists");
                        return;
                    }
                    new File(sb3).mkdirs();
                    URL url = new URL(a2);
                    url.openConnection().connect();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), C1245d.f3947iP);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb3);
                    sb6.append(N);
                    sb6.append(C1245d.f3944iM);
                    FileOutputStream fileOutputStream = new FileOutputStream(sb6.toString());
                    byte[] bArr = new byte[C1245d.f3947iP];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    StringBuilder sb7 = new StringBuilder("downloaded ");
                    sb7.append(sb3);
                    sb7.append(N);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb3);
                    sb8.append(N);
                    sb8.append(C1245d.f3944iM);
                    File file2 = new File(sb8.toString());
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb3);
                    sb9.append(N);
                    file2.renameTo(new File(sb9.toString()));
                    file2.delete();
                }
            }
        }
    }
}
