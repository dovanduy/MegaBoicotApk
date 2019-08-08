package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ahg implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11047a;

    ahg(ahb ahb, Activity activity) {
        this.f11047a = activity;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f11047a);
    }
}
