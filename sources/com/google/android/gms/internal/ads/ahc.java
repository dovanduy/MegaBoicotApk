package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ahc implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11042a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11043b;

    ahc(ahb ahb, Activity activity, Bundle bundle) {
        this.f11042a = activity;
        this.f11043b = bundle;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f11042a, this.f11043b);
    }
}
