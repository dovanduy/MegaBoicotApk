package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class ahb implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f11039a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f11040b;

    /* renamed from: c */
    private boolean f11041c = false;

    public ahb(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f11040b = new WeakReference<>(activityLifecycleCallbacks);
        this.f11039a = application;
    }

    /* renamed from: a */
    private final void m14108a(ahj ahj) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f11040b.get();
            if (activityLifecycleCallbacks != null) {
                ahj.mo14300a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f11041c) {
                this.f11039a.unregisterActivityLifecycleCallbacks(this);
                this.f11041c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m14108a(new ahc(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m14108a(new ahi(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m14108a(new ahf(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m14108a(new ahe(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m14108a(new ahh(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m14108a(new ahd(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m14108a(new ahg(this, activity));
    }
}
