package com.facebook.ads.internal.p115w.p116a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.w.a.b */
public class C2305b implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static Context f7253a;

    /* renamed from: b */
    private static WeakReference<Activity> f7254b = new WeakReference<>(null);

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.app.Activity m9012a() {
        /*
            java.lang.Class<com.facebook.ads.internal.w.a.b> r0 = com.facebook.ads.internal.p115w.p116a.C2305b.class
            monitor-enter(r0)
            java.lang.ref.WeakReference<android.app.Activity> r1 = f7254b     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0053 }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0053 }
            r4 = 28
            if (r3 >= r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r3 = 0
            goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            if (r3 == 0) goto L_0x001e
            android.app.Activity r2 = com.facebook.ads.internal.p115w.p116a.C2304a.m9011a()     // Catch:{ all -> 0x0053 }
        L_0x001e:
            android.content.Context r4 = f7253a     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004d
            if (r3 == 0) goto L_0x004d
            if (r1 == r2) goto L_0x004d
            android.content.Context r3 = f7253a     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "act_util"
            int r5 = com.facebook.ads.internal.p115w.p123h.C2373b.f7491Z     // Catch:{ all -> 0x0053 }
            java.lang.Exception r6 = new java.lang.Exception     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r7.<init>()     // Catch:{ all -> 0x0053 }
            java.lang.String r8 = "Activity discrepancies res: "
            r7.append(r8)     // Catch:{ all -> 0x0053 }
            r7.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r8 = ", ref: "
            r7.append(r8)     // Catch:{ all -> 0x0053 }
            r7.append(r2)     // Catch:{ all -> 0x0053 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0053 }
            r6.<init>(r7)     // Catch:{ all -> 0x0053 }
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r3, r4, r5, r6)     // Catch:{ all -> 0x0053 }
        L_0x004d:
            if (r1 == 0) goto L_0x0051
            monitor-exit(r0)
            return r1
        L_0x0051:
            monitor-exit(r0)
            return r2
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p115w.p116a.C2305b.m9012a():android.app.Activity");
    }

    /* renamed from: a */
    public static synchronized void m9013a(Context context) {
        synchronized (C2305b.class) {
            f7253a = context;
            if (f7253a instanceof Application) {
                ((Application) f7253a).registerActivityLifecycleCallbacks(new C2305b());
            } else {
                C2370a.m9149b(f7253a, "api", C2373b.f7513o, new Exception("AppContext is not Application."));
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        f7254b = new WeakReference<>(null);
    }

    public void onActivityResumed(Activity activity) {
        f7254b = new WeakReference<>(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
