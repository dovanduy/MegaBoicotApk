package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ahi implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11050a;

    ahi(ahb ahb, Activity activity) {
        this.f11050a = activity;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11050a);
    }
}
