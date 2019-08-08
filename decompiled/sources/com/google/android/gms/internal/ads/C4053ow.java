package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C4053ow {

    /* renamed from: a */
    private final long f13696a = TimeUnit.MILLISECONDS.toNanos(((Long) aoq.m14620f().mo14695a(aru.f12055x)).longValue());

    /* renamed from: b */
    private long f13697b;

    /* renamed from: c */
    private boolean f13698c = true;

    C4053ow() {
    }

    /* renamed from: a */
    public final void mo15772a() {
        this.f13698c = true;
    }

    /* renamed from: a */
    public final void mo15773a(SurfaceTexture surfaceTexture, C4043om omVar) {
        if (omVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f13698c || Math.abs(timestamp - this.f13697b) >= this.f13696a) {
                this.f13698c = false;
                this.f13697b = timestamp;
                C3909jn.f13411a.post(new C4054ox(this, omVar));
            }
        }
    }
}
