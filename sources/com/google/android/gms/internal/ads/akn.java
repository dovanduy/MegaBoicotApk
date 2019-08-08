package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class akn implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11289a;

    akn(akl akl, Activity activity) {
        this.f11289a = activity;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f11289a);
    }
}
