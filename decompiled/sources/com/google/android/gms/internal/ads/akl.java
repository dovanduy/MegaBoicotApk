package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class akl implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f11284a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f11285b;

    /* renamed from: c */
    private boolean f11286c = false;

    public akl(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f11285b = new WeakReference<>(activityLifecycleCallbacks);
        this.f11284a = application;
    }

    /* renamed from: a */
    private final void m14327a(aku aku) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f11285b.get();
            if (activityLifecycleCallbacks != null) {
                aku.mo14439a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f11286c) {
                this.f11284a.unregisterActivityLifecycleCallbacks(this);
                this.f11286c = true;
            }
        } catch (Exception e) {
            C3900je.m17430b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m14327a(new akm(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m14327a(new akt(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m14327a(new akp(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m14327a(new ako(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m14327a(new aks(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m14327a(new akn(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m14327a(new akq(this, activity));
    }
}
