package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ahh implements ahj {

    /* renamed from: a */
    private final /* synthetic */ Activity f11048a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11049b;

    ahh(ahb ahb, Activity activity, Bundle bundle) {
        this.f11048a = activity;
        this.f11049b = bundle;
    }

    /* renamed from: a */
    public final void mo14300a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f11048a, this.f11049b);
    }
}
