package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.measurement.internal.C4764aw;
import com.google.android.gms.measurement.internal.C4868er;
import com.google.android.gms.measurement.internal.C4888m;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f16065a;

    /* renamed from: b */
    private final C4764aw f16066b;

    /* renamed from: c */
    private final Object f16067c = new Object();

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f16065a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f16065a == null) {
                    f16065a = new FirebaseAnalytics(C4764aw.m20471a(context, (C4888m) null));
                }
            }
        }
        return f16065a;
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!C4868er.m21094a()) {
            this.f16066b.mo17158r().mo17754i().mo17763a("setCurrentScreen must be called from the main thread");
        } else {
            this.f16066b.mo17256w().mo17350a(activity, str, str2);
        }
    }

    private FirebaseAnalytics(C4764aw awVar) {
        C3513t.m12625a(awVar);
        this.f16066b = awVar;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m21578a().mo17890c();
    }
}
