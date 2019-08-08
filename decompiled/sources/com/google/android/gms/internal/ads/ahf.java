package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ahf implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11046a;

    ahf(ahb ahb, Activity activity) {
        this.f11046a = activity;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f11046a);
    }
}
