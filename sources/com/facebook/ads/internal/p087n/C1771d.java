package com.facebook.ads.internal.p087n;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.p080g.C1719b;
import com.facebook.ads.internal.p085l.C1757a;
import com.facebook.ads.internal.p085l.C1761b;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1855a.C1857a;
import com.facebook.ads.internal.p115w.p117b.C2307b;
import com.facebook.ads.internal.p115w.p117b.C2315f;
import com.facebook.ads.internal.p115w.p117b.C2315f.C2316a;
import com.facebook.ads.internal.p115w.p117b.C2320h;
import com.facebook.ads.internal.p115w.p117b.C2321i;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2327o;
import com.facebook.ads.internal.p115w.p117b.C2337u;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.n.d */
public class C1771d {

    /* renamed from: a */
    private static final AtomicBoolean f5558a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicInteger f5559b = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f5560c;

    /* renamed from: d */
    private static final C2316a f5561d = C2315f.m9035a();

    /* renamed from: e */
    private static String f5562e;

    /* renamed from: f */
    private final Context f5563f;

    /* renamed from: g */
    private final C1761b f5564g;

    public C1771d(Context context, boolean z) {
        this.f5563f = context;
        this.f5564g = new C1761b(context);
        m7352a(context, z);
    }

    /* renamed from: a */
    private static String m7348a(Context context, String str, String str2) {
        Class cls = Class.forName(str);
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Class.forName(str2)});
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(new Object[]{context, null}), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* renamed from: a */
    public static String m7349a(C1761b bVar, Context context, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(m7354b(context, z));
        sb.append(" [FBAN/AudienceNetworkForAndroid;FBSN/");
        sb.append("Android");
        sb.append(";FBSV/");
        sb.append(C1761b.f5515a);
        sb.append(";FBAB/");
        sb.append(bVar.mo7585f());
        sb.append(";FBAV/");
        sb.append(bVar.mo7586g());
        sb.append(";FBBV/");
        sb.append(bVar.mo7587h());
        sb.append(";FBVS/");
        sb.append("5.1.0");
        sb.append(";FBLC/");
        sb.append(Locale.getDefault().toString());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m7351a(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C1855a.m7794a((C1857a) new C1857a() {
                /* renamed from: a */
                public Map<String, String> mo7623a() {
                    HashMap hashMap = new HashMap();
                    if (!C1719b.f5387c) {
                        hashMap.put("X-FB-Pool-Routing-Token", new C1771d(applicationContext, true).mo7619a());
                    }
                    return hashMap;
                }
            });
        }
    }

    /* renamed from: a */
    private static void m7352a(final Context context, boolean z) {
        if (f5559b.compareAndSet(0, 1)) {
            try {
                C2327o.m9052a();
                final SharedPreferences sharedPreferences = context.getSharedPreferences(C2362a.m9138a("FBAdPrefs", context), 0);
                C1761b bVar = new C1761b(context);
                StringBuilder sb = new StringBuilder();
                sb.append("AFP;");
                sb.append(bVar.mo7586g());
                final String sb2 = sb.toString();
                f5560c = sharedPreferences.getString(sb2, null);
                FutureTask futureTask = new FutureTask(new Callable<Boolean>() {
                    /* renamed from: a */
                    public Boolean call() {
                        C1771d.f5560c = C1771d.m7353b(context, context.getPackageName());
                        sharedPreferences.edit().putString(sb2, C1771d.f5560c).apply();
                        C1771d.f5559b.set(2);
                        return Boolean.valueOf(true);
                    }
                });
                Executors.newSingleThreadExecutor().submit(futureTask);
                if (z) {
                    futureTask.get();
                }
            } catch (Exception unused) {
                f5559b.set(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m7353b(Context context, String str) {
        try {
            return C2321i.m9041a(new File(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
        } catch (Exception e) {
            if (f5558a.compareAndSet(false, true)) {
                C2370a.m9149b(context.getApplicationContext(), "generic", C2373b.f7466A, e);
            }
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:31|30|32|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0046 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m7354b(android.content.Context r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "Unknown"
            return r2
        L_0x0005:
            if (r3 == 0) goto L_0x000e
            java.lang.String r2 = "http.agent"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            return r2
        L_0x000e:
            java.lang.String r3 = f5562e
            if (r3 == 0) goto L_0x0015
            java.lang.String r2 = f5562e
            return r2
        L_0x0015:
            java.lang.Class<com.facebook.ads.internal.n.d> r3 = com.facebook.ads.internal.p087n.C1771d.class
            monitor-enter(r3)
            java.lang.String r0 = f5562e     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r2 = f5562e     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0020:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0060 }
            r1 = 17
            if (r0 < r1) goto L_0x0030
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r2)     // Catch:{ Exception -> 0x0030 }
            f5562e = r0     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = f5562e     // Catch:{ Exception -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            return r0
        L_0x0030:
            java.lang.String r0 = "android.webkit.WebSettings"
            java.lang.String r1 = "android.webkit.WebView"
            java.lang.String r0 = m7348a(r2, r0, r1)     // Catch:{ Exception -> 0x003b }
            f5562e = r0     // Catch:{ Exception -> 0x003b }
            goto L_0x005c
        L_0x003b:
            java.lang.String r0 = "android.webkit.WebSettingsClassic"
            java.lang.String r1 = "android.webkit.WebViewClassic"
            java.lang.String r0 = m7348a(r2, r0, r1)     // Catch:{ Exception -> 0x0046 }
            f5562e = r0     // Catch:{ Exception -> 0x0046 }
            goto L_0x005c
        L_0x0046:
            android.webkit.WebView r0 = new android.webkit.WebView     // Catch:{ all -> 0x0060 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0060 }
            r0.<init>(r2)     // Catch:{ all -> 0x0060 }
            android.webkit.WebSettings r2 = r0.getSettings()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = r2.getUserAgentString()     // Catch:{ all -> 0x0060 }
            f5562e = r2     // Catch:{ all -> 0x0060 }
            r0.destroy()     // Catch:{ all -> 0x0060 }
        L_0x005c:
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = f5562e
            return r2
        L_0x0060:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p087n.C1771d.m7354b(android.content.Context, boolean):java.lang.String");
    }

    /* renamed from: b */
    public static Map<String, String> m7355b(Context context) {
        try {
            return new C1771d(context, false).mo7620b();
        } catch (Throwable th) {
            C2370a.m9147a(th);
            return new HashMap();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a A[SYNTHETIC, Splitter:B:39:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[Catch:{ IOException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4 A[Catch:{ IOException -> 0x00a7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo7619a() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f5563f
            r1 = 1
            m7352a(r0, r1)
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x008a, all -> 0x0084 }
            r1.<init>()     // Catch:{ IOException -> 0x008a, all -> 0x0084 }
            android.util.Base64OutputStream r2 = new android.util.Base64OutputStream     // Catch:{ IOException -> 0x007f, all -> 0x007a }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x007f, all -> 0x007a }
            java.util.zip.DeflaterOutputStream r4 = new java.util.zip.DeflaterOutputStream     // Catch:{ IOException -> 0x0076, all -> 0x0072 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0076, all -> 0x0072 }
            java.util.Map r0 = r8.mo7620b()     // Catch:{ IOException -> 0x0070 }
            java.lang.String r5 = com.facebook.ads.internal.p080g.C1719b.f5386b     // Catch:{ IOException -> 0x0070 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x0070 }
            if (r5 == 0) goto L_0x002d
            android.content.Context r5 = r8.f5563f     // Catch:{ IOException -> 0x0070 }
            com.facebook.ads.internal.p080g.C1719b.m7171a(r5)     // Catch:{ IOException -> 0x0070 }
            android.content.Context r5 = r8.f5563f     // Catch:{ IOException -> 0x0070 }
            m7351a(r5)     // Catch:{ IOException -> 0x0070 }
        L_0x002d:
            java.lang.String r5 = "IDFA"
            java.lang.String r6 = com.facebook.ads.internal.p080g.C1719b.f5386b     // Catch:{ IOException -> 0x0070 }
            r0.put(r5, r6)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r5 = "USER_AGENT"
            com.facebook.ads.internal.l.b r6 = r8.f5564g     // Catch:{ IOException -> 0x0070 }
            android.content.Context r7 = r8.f5563f     // Catch:{ IOException -> 0x0070 }
            java.lang.String r3 = m7349a(r6, r7, r3)     // Catch:{ IOException -> 0x0070 }
            r0.put(r5, r3)     // Catch:{ IOException -> 0x0070 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x0070 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0070 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x0070 }
            r4.write(r0)     // Catch:{ IOException -> 0x0070 }
            r4.close()     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0070 }
            java.lang.String r3 = "\n"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replaceAll(r3, r5)     // Catch:{ IOException -> 0x0070 }
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ IOException -> 0x006f }
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ IOException -> 0x006f }
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            return r0
        L_0x0070:
            r0 = move-exception
            goto L_0x008f
        L_0x0072:
            r3 = move-exception
            r4 = r0
            r0 = r3
            goto L_0x0098
        L_0x0076:
            r3 = move-exception
            r4 = r0
            r0 = r3
            goto L_0x008f
        L_0x007a:
            r2 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L_0x0098
        L_0x007f:
            r2 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L_0x008f
        L_0x0084:
            r1 = move-exception
            r2 = r0
            r4 = r2
            r0 = r1
            r1 = r4
            goto L_0x0098
        L_0x008a:
            r1 = move-exception
            r2 = r0
            r4 = r2
            r0 = r1
            r1 = r4
        L_0x008f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "Failed to build user token"
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0097 }
            throw r3     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
        L_0x0098:
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x009d:
            if (r2 == 0) goto L_0x00a2
            r2.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            r1.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p087n.C1771d.mo7619a():java.lang.String");
    }

    /* renamed from: b */
    public Map<String, String> mo7620b() {
        m7352a(this.f5563f, false);
        C1757a.m7290a(this.f5563f);
        HashMap hashMap = new HashMap();
        hashMap.put("SDK", "android");
        hashMap.put("SDK_VERSION", "5.1.0");
        hashMap.put("LOCALE", Locale.getDefault().toString());
        float f = C2342x.f7369b;
        int i = this.f5563f.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f5563f.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (((float) i) / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (((float) i2) / f)));
        hashMap.put("ATTRIBUTION_ID", C1719b.f5385a);
        hashMap.put("ID_SOURCE", C1719b.f5388d);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", C1761b.f5515a);
        hashMap.put("BUNDLE", this.f5564g.mo7585f());
        hashMap.put("APPNAME", this.f5564g.mo7583d());
        hashMap.put("APPVERS", this.f5564g.mo7586g());
        hashMap.put("APPBUILD", String.valueOf(this.f5564g.mo7587h()));
        hashMap.put("CARRIER", this.f5564g.mo7582c());
        hashMap.put("MAKE", this.f5564g.mo7580a());
        hashMap.put("MODEL", this.f5564g.mo7581b());
        hashMap.put("ROOTED", String.valueOf(f5561d.f7293d));
        hashMap.put("INSTALLER", this.f5564g.mo7584e());
        hashMap.put("SDK_CAPABILITY", C2307b.m9017b());
        hashMap.put("NETWORK_TYPE", String.valueOf(C2337u.m9066a(this.f5563f).f7347g));
        hashMap.put("SESSION_TIME", C2339v.m9068a(C2327o.m9053b()));
        hashMap.put("SESSION_ID", C2327o.m9054c());
        if (f5560c != null) {
            hashMap.put("AFP", f5560c);
        }
        String a = C2315f.m9036a(this.f5563f);
        if (a != null) {
            hashMap.put("ASHAS", a);
        }
        hashMap.put("UNITY", String.valueOf(C2320h.m9039a(this.f5563f)));
        String mediationService = AdInternalSettings.getMediationService();
        if (mediationService != null) {
            hashMap.put("MEDIATION_SERVICE", mediationService);
        }
        hashMap.put("ACCESSIBILITY_ENABLED", String.valueOf(this.f5564g.mo7588i()));
        if (this.f5564g.mo7589j() != -1) {
            hashMap.put("APP_MIN_SDK_VERSION", String.valueOf(this.f5564g.mo7589j()));
        }
        hashMap.put("VALPARAMS", C1769b.m7342a(this.f5563f));
        hashMap.put("ANALOG", C2323k.m9046a(C1757a.m7289a()));
        hashMap.put("PROCESS", C1770c.m7345a(this.f5563f));
        return hashMap;
    }
}
