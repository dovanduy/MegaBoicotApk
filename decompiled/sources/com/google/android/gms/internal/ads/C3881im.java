package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.im */
final class C3881im {

    /* renamed from: a */
    private long f13313a = -1;

    /* renamed from: b */
    private long f13314b = -1;

    /* renamed from: a */
    public final long mo15422a() {
        return this.f13314b;
    }

    /* renamed from: b */
    public final void mo15423b() {
        this.f13314b = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo15424c() {
        this.f13313a = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final Bundle mo15425d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f13313a);
        bundle.putLong("tclose", this.f13314b);
        return bundle;
    }
}
