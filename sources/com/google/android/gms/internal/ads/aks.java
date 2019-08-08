package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class aks implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11293a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11294b;

    aks(akl akl, Activity activity, Bundle bundle) {
        this.f11293a = activity;
        this.f11294b = bundle;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f11293a, this.f11294b);
    }
}
