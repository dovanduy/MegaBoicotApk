package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3472c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.ae */
final class C3282ae extends C3299av {

    /* renamed from: a */
    private final /* synthetic */ C3472c f9534a;

    C3282ae(C3280ac acVar, C3297at atVar, C3472c cVar) {
        this.f9534a = cVar;
        super(atVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13182a() {
        this.f9534a.mo13180a(new ConnectionResult(16, null));
    }
}
