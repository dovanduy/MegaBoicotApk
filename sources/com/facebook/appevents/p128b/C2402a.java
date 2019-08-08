package com.facebook.appevents.p128b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2649m;
import com.facebook.C2757u;
import com.facebook.ads.AdError;
import com.facebook.appevents.C2436g;
import com.facebook.appevents.p126a.C2396b;
import com.facebook.appevents.p128b.C2419j.C2421a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import com.facebook.internal.C2563u;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.appevents.b.a */
/* compiled from: ActivityLifecycleTracker */
public class C2402a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7632a = C2402a.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f7633b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f7634c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f7635d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f7636e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C2417h f7637f;

    /* renamed from: g */
    private static AtomicBoolean f7638g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f7639h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f7640i;

    /* renamed from: j */
    private static final C2396b f7641j = new C2396b();

    /* renamed from: a */
    public static void m9234a(Application application, String str) {
        if (f7638g.compareAndSet(false, true)) {
            f7639h = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityCreated");
                    C2408b.m9250b();
                    C2402a.m9233a(activity);
                }

                public void onActivityStarted(Activity activity) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityStarted");
                }

                public void onActivityResumed(Activity activity) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityResumed");
                    C2408b.m9250b();
                    C2402a.m9236b(activity);
                }

                public void onActivityPaused(Activity activity) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityPaused");
                    C2408b.m9250b();
                    C2402a.m9240d(activity);
                }

                public void onActivityStopped(Activity activity) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityStopped");
                    C2436g.m9327c();
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivitySaveInstanceState");
                }

                public void onActivityDestroyed(Activity activity) {
                    C2563u.m9721a(C2757u.APP_EVENTS, C2402a.f7632a, "onActivityDestroyed");
                }
            });
        }
    }

    /* renamed from: a */
    public static UUID m9231a() {
        if (f7637f != null) {
            return f7637f.mo8831g();
        }
        return null;
    }

    /* renamed from: a */
    public static void m9233a(Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2479ad.m9466c((Context) activity);
        final C2419j a = C2421a.m9281a(activity);
        C24042 r0 = new Runnable() {
            public void run() {
                if (C2402a.f7637f == null) {
                    C2417h a = C2417h.m9262a();
                    if (a != null) {
                        C2418i.m9276a(applicationContext, c, a, C2402a.f7639h);
                    }
                    C2402a.f7637f = new C2417h(Long.valueOf(currentTimeMillis), null);
                    C2402a.f7637f.mo8825a(a);
                    C2418i.m9277a(applicationContext, c, a, C2402a.f7639h);
                }
            }
        };
        f7633b.execute(r0);
    }

    /* renamed from: b */
    public static void m9236b(Activity activity) {
        f7636e.incrementAndGet();
        m9247k();
        final long currentTimeMillis = System.currentTimeMillis();
        f7640i = currentTimeMillis;
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2479ad.m9466c((Context) activity);
        f7641j.mo8802a(activity);
        f7633b.execute(new Runnable() {
            public void run() {
                if (C2402a.f7637f == null) {
                    C2402a.f7637f = new C2417h(Long.valueOf(currentTimeMillis), null);
                    C2418i.m9277a(applicationContext, c, (C2419j) null, C2402a.f7639h);
                } else if (C2402a.f7637f.mo8827c() != null) {
                    long longValue = currentTimeMillis - C2402a.f7637f.mo8827c().longValue();
                    if (longValue > ((long) (C2402a.m9246j() * AdError.NETWORK_ERROR_CODE))) {
                        C2418i.m9276a(applicationContext, c, C2402a.f7637f, C2402a.f7639h);
                        C2418i.m9277a(applicationContext, c, (C2419j) null, C2402a.f7639h);
                        C2402a.f7637f = new C2417h(Long.valueOf(currentTimeMillis), null);
                    } else if (longValue > 1000) {
                        C2402a.f7637f.mo8829e();
                    }
                }
                C2402a.f7637f.mo8826a(Long.valueOf(currentTimeMillis));
                C2402a.f7637f.mo8834j();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m9240d(Activity activity) {
        if (f7636e.decrementAndGet() < 0) {
            f7636e.set(0);
            Log.w(f7632a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m9247k();
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2479ad.m9466c((Context) activity);
        f7641j.mo8803b(activity);
        f7633b.execute(new Runnable() {
            public void run() {
                if (C2402a.f7637f == null) {
                    C2402a.f7637f = new C2417h(Long.valueOf(currentTimeMillis), null);
                }
                C2402a.f7637f.mo8826a(Long.valueOf(currentTimeMillis));
                if (C2402a.f7636e.get() <= 0) {
                    C24071 r0 = new Runnable() {
                        public void run() {
                            if (C2402a.f7636e.get() <= 0) {
                                C2418i.m9276a(applicationContext, c, C2402a.f7637f, C2402a.f7639h);
                                C2417h.m9263b();
                                C2402a.f7637f = null;
                            }
                            synchronized (C2402a.f7635d) {
                                C2402a.f7634c = null;
                            }
                        }
                    };
                    synchronized (C2402a.f7635d) {
                        C2402a.f7634c = C2402a.f7633b.schedule(r0, (long) C2402a.m9246j(), TimeUnit.SECONDS);
                    }
                }
                long i = C2402a.f7640i;
                long j = 0;
                if (i > 0) {
                    j = (currentTimeMillis - i) / 1000;
                }
                C2412d.m9254a(c, j);
                C2402a.f7637f.mo8834j();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m9246j() {
        C2527k a = C2529l.m9632a(C2649m.m10137j());
        if (a == null) {
            return C2414e.m9259a();
        }
        return a.mo8999e();
    }

    /* renamed from: k */
    private static void m9247k() {
        synchronized (f7635d) {
            if (f7634c != null) {
                f7634c.cancel(false);
            }
            f7634c = null;
        }
    }
}
