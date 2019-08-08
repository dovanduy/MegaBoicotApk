package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class akq implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11292a;

    akq(akl akl, Activity activity) {
        this.f11292a = activity;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f11292a);
    }
}
