package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class akp implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11291a;

    akp(akl akl, Activity activity) {
        this.f11291a = activity;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f11291a);
    }
}
