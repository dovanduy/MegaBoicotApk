package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.cl */
final class C4807cl implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C4798cc f15626a;

    private C4807cl(C4798cc ccVar) {
        this.f15626a = ccVar;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f15626a.mo17158r().mo17759x().mo17763a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    if (bundle == null) {
                        Bundle a = this.f15626a.mo17156p().mo17484a(data);
                        this.f15626a.mo17156p();
                        String str = C4862el.m20966a(intent) ? "gs" : "auto";
                        if (a != null) {
                            this.f15626a.mo17318a(str, "_cmp", a);
                        }
                    }
                    String queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                            this.f15626a.mo17158r().mo17758w().mo17763a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f15626a.mo17158r().mo17758w().mo17764a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f15626a.mo17321a("auto", "_ldl", (Object) queryParameter, true);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.f15626a.mo17158r().mo17761y_().mo17764a("Throwable caught in onActivityCreated", e);
        }
        this.f15626a.mo17149i().mo17349a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f15626a.mo17149i().mo17354c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f15626a.mo17149i().mo17352b(activity);
        C4840dr k = this.f15626a.mo17151k();
        k.mo17157q().mo17219a((Runnable) new C4845dw(k, k.mo17153m().mo13695b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f15626a.mo17149i().mo17348a(activity);
        C4840dr k = this.f15626a.mo17151k();
        k.mo17157q().mo17219a((Runnable) new C4844dv(k, k.mo17153m().mo13695b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f15626a.mo17149i().mo17353b(activity, bundle);
    }

    /* synthetic */ C4807cl(C4798cc ccVar, C4799cd cdVar) {
        this(ccVar);
    }
}
