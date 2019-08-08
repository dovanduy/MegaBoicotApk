package com.facebook.ads.internal.p070a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.ads.internal.p092s.C1802c;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.a.m */
public class C1575m {

    /* renamed from: a */
    private final C1802c f4834a;

    /* renamed from: b */
    private Application f4835b;

    /* renamed from: c */
    private C1576a f4836c;

    /* renamed from: d */
    private long f4837d = 0;

    /* renamed from: e */
    private String f4838e = null;

    /* renamed from: f */
    private C1562a f4839f = null;

    @TargetApi(14)
    /* renamed from: com.facebook.ads.internal.a.m$a */
    private static class C1576a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final WeakReference<Activity> f4840a;

        /* renamed from: b */
        private C1575m f4841b;

        public C1576a(Activity activity, C1575m mVar) {
            this.f4840a = new WeakReference<>(activity);
            this.f4841b = mVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f4841b != null) {
                Activity activity2 = (Activity) this.f4840a.get();
                if (activity2 == null || (activity2 != null && activity.equals(activity2))) {
                    this.f4841b.mo7072a();
                    this.f4841b = null;
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private C1575m(C1802c cVar, Activity activity, int i) {
        this.f4834a = cVar;
        this.f4835b = activity.getApplication();
        this.f4836c = new C1576a(activity, this);
    }

    /* renamed from: a */
    public static C1575m m6524a(C1802c cVar, Activity activity) {
        int i = VERSION.SDK_INT;
        if (activity == null || i < 14) {
            return null;
        }
        return new C1575m(cVar, activity, i);
    }

    /* renamed from: a */
    private void m6525a(String str, long j, long j2, C1562a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("leave_time", Long.toString(j));
        hashMap.put("back_time", Long.toString(j2));
        if (aVar != null) {
            hashMap.put("outcome", aVar.name());
        }
        this.f4834a.mo7700m(str, hashMap);
    }

    @TargetApi(14)
    /* renamed from: a */
    public void mo7072a() {
        m6525a(this.f4838e, this.f4837d, System.currentTimeMillis(), this.f4839f);
        if (this.f4835b != null && this.f4836c != null) {
            this.f4835b.unregisterActivityLifecycleCallbacks(this.f4836c);
            this.f4836c = null;
            this.f4835b = null;
        }
    }

    /* renamed from: a */
    public void mo7073a(C1562a aVar) {
        this.f4839f = aVar;
    }

    @TargetApi(14)
    /* renamed from: a */
    public void mo7074a(String str) {
        this.f4838e = str;
        if (this.f4836c == null || this.f4835b == null) {
            m6525a(str, -1, -1, C1562a.CANNOT_TRACK);
            return;
        }
        this.f4837d = System.currentTimeMillis();
        this.f4835b.registerActivityLifecycleCallbacks(this.f4836c);
    }
}
