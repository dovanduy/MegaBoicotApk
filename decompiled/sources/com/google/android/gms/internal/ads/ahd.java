package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ahd implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11044a;

    ahd(ahb ahb, Activity activity) {
        this.f11044a = activity;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f11044a);
    }
}
