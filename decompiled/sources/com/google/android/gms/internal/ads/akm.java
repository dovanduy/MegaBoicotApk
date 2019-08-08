package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class akm implements aku {

    /* renamed from: a */
    private final /* synthetic */ Activity f11287a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11288b;

    akm(akl akl, Activity activity, Bundle bundle) {
        this.f11287a = activity;
        this.f11288b = bundle;
    }

    /* renamed from: a */
    public final void mo14439a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f11287a, this.f11288b);
    }
}
