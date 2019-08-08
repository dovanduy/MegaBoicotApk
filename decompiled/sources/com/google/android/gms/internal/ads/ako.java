package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ako implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11290a;

    ako(akl akl, Activity activity) {
        this.f11290a = activity;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f11290a);
    }
}
