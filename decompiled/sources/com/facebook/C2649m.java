package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.GraphRequest.C1503b;
import com.facebook.appevents.C2436g;
import com.facebook.appevents.p128b.C2409c;
import com.facebook.appevents.p128b.C2409c.C2411a;
import com.facebook.internal.C2476aa;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2499b;
import com.facebook.internal.C2561t;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: com.facebook.m */
/* compiled from: FacebookSdk */
public final class C2649m {

    /* renamed from: a */
    private static final String f8234a = C2649m.class.getCanonicalName();

    /* renamed from: b */
    private static final HashSet<C2757u> f8235b = new HashSet<>(Arrays.asList(new C2757u[]{C2757u.DEVELOPER_ERRORS}));

    /* renamed from: c */
    private static Executor f8236c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f8237d = null;

    /* renamed from: e */
    private static volatile String f8238e = null;

    /* renamed from: f */
    private static volatile String f8239f = null;

    /* renamed from: g */
    private static volatile Boolean f8240g = null;

    /* renamed from: h */
    private static volatile String f8241h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f8242i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f8243j = false;

    /* renamed from: k */
    private static boolean f8244k = false;

    /* renamed from: l */
    private static C2561t<File> f8245l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f8246m = null;

    /* renamed from: n */
    private static int f8247n = 64206;

    /* renamed from: o */
    private static final Object f8248o = new Object();

    /* renamed from: p */
    private static String f8249p = C2476aa.m9413d();

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f8250q = new LinkedBlockingQueue(10);

    /* renamed from: r */
    private static final ThreadFactory f8251r = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f8253a = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("FacebookSdk #");
            sb.append(this.f8253a.incrementAndGet());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: s */
    private static Boolean f8252s = Boolean.valueOf(false);

    /* renamed from: com.facebook.m$a */
    /* compiled from: FacebookSdk */
    public interface C2654a {
        /* renamed from: a */
        void mo9337a();
    }

    /* renamed from: h */
    public static String m10135h() {
        return "4.34.0";
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized void m10121a(Context context) {
        synchronized (C2649m.class) {
            m10122a(context, (C2654a) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m10122a(final android.content.Context r3, final com.facebook.C2649m.C2654a r4) {
        /*
            java.lang.Class<com.facebook.m> r0 = com.facebook.C2649m.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f8252s     // Catch:{ all -> 0x0081 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo9337a()     // Catch:{ all -> 0x0081 }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C2484ae.m9489a(r3, r1)     // Catch:{ all -> 0x0081 }
            r1 = 0
            com.facebook.internal.C2484ae.m9494b(r3, r1)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2484ae.m9488a(r3, r1)     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x0081 }
            f8246m = r1     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = f8246m     // Catch:{ all -> 0x0081 }
            m10129c(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = f8237d     // Catch:{ all -> 0x0081 }
            boolean r1 = com.facebook.internal.C2479ad.m9456a(r1)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0039
            com.facebook.j r3 = new com.facebook.j     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>(r4)     // Catch:{ all -> 0x0081 }
            throw r3     // Catch:{ all -> 0x0081 }
        L_0x0039:
            android.content.Context r1 = f8246m     // Catch:{ all -> 0x0081 }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0050
            java.lang.Boolean r1 = f8240g     // Catch:{ all -> 0x0081 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0050
            android.content.Context r1 = f8246m     // Catch:{ all -> 0x0081 }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = f8237d     // Catch:{ all -> 0x0081 }
            com.facebook.appevents.p128b.C2402a.m9234a(r1, r2)     // Catch:{ all -> 0x0081 }
        L_0x0050:
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0081 }
            f8252s = r1     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2529l.m9636a()     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2566x.m9754b()     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = f8246m     // Catch:{ all -> 0x0081 }
            com.facebook.internal.BoltsMeasurementEventListener.m9402a(r1)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.t r1 = new com.facebook.internal.t     // Catch:{ all -> 0x0081 }
            com.facebook.m$2 r2 = new com.facebook.m$2     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            r1.<init>(r2)     // Catch:{ all -> 0x0081 }
            f8245l = r1     // Catch:{ all -> 0x0081 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0081 }
            com.facebook.m$3 r2 = new com.facebook.m$3     // Catch:{ all -> 0x0081 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0081 }
            r1.<init>(r2)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Executor r3 = m10131d()     // Catch:{ all -> 0x0081 }
            r3.execute(r1)     // Catch:{ all -> 0x0081 }
            monitor-exit(r0)
            return
        L_0x0081:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2649m.m10122a(android.content.Context, com.facebook.m$a):void");
    }

    /* renamed from: a */
    public static synchronized boolean m10124a() {
        boolean booleanValue;
        synchronized (C2649m.class) {
            booleanValue = f8252s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static boolean m10125a(C2757u uVar) {
        boolean z;
        synchronized (f8235b) {
            z = m10127b() && f8235b.contains(uVar);
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m10127b() {
        return f8243j;
    }

    /* renamed from: c */
    public static boolean m10130c() {
        return f8244k;
    }

    /* renamed from: d */
    public static Executor m10131d() {
        synchronized (f8248o) {
            if (f8236c == null) {
                f8236c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f8236c;
    }

    /* renamed from: e */
    public static String m10132e() {
        return f8241h;
    }

    /* renamed from: f */
    public static Context m10133f() {
        C2484ae.m9487a();
        return f8246m;
    }

    /* renamed from: g */
    public static String m10134g() {
        Log.d(f8234a, String.format("getGraphApiVersion: %s", new Object[]{f8249p}));
        return f8249p;
    }

    /* renamed from: a */
    public static void m10123a(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        m10131d().execute(new Runnable() {
            public void run() {
                C2649m.m10126b(applicationContext, str);
            }
        });
    }

    /* renamed from: b */
    static void m10126b(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C2499b a = C2499b.m9554a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j = sharedPreferences.getLong(sb2, 0);
            GraphRequest a2 = GraphRequest.m6207a((AccessToken) null, String.format("%s/activities", new Object[]{str}), C2409c.m9251a(C2411a.MOBILE_INSTALL_EVENT, a, C2436g.m9326b(context), m10128b(context), context), (C1503b) null);
            if (j == 0) {
                a2.mo6686i();
                Editor edit = sharedPreferences.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new C2579j("An error occurred while publishing install.", (Throwable) e);
        } catch (Exception e2) {
            C2479ad.m9447a("Facebook-publish", e2);
        }
    }

    /* renamed from: b */
    public static boolean m10128b(Context context) {
        C2484ae.m9487a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: i */
    public static long m10136i() {
        C2484ae.m9487a();
        return f8242i.get();
    }

    /* renamed from: c */
    static void m10129c(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (f8237d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                f8237d = str.substring(2);
                            } else {
                                f8237d = str;
                            }
                        } else if (obj instanceof Integer) {
                            throw new C2579j("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f8238e == null) {
                        f8238e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f8239f == null) {
                        f8239f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f8247n == 64206) {
                        f8247n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f8240g == null) {
                        f8240g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoLogAppEventsEnabled", true));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: j */
    public static String m10137j() {
        C2484ae.m9487a();
        return f8237d;
    }

    /* renamed from: k */
    public static String m10138k() {
        C2484ae.m9487a();
        return f8239f;
    }

    /* renamed from: l */
    public static boolean m10139l() {
        C2484ae.m9487a();
        return f8240g.booleanValue();
    }

    /* renamed from: m */
    public static File m10140m() {
        C2484ae.m9487a();
        return (File) f8245l.mo9069a();
    }

    /* renamed from: n */
    public static int m10141n() {
        C2484ae.m9487a();
        return f8247n;
    }
}
