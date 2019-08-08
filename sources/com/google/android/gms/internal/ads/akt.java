package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class akt implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11295a;

    akt(akl akl, Activity activity) {
        this.f11295a = activity;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11295a);
    }
}
