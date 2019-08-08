package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3369i;
import com.google.android.gms.location.C4708ai;
import com.google.android.gms.location.C4717f;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.n */
final class C4683n extends C4708ai {

    /* renamed from: a */
    private final C3369i<C4717f> f15235a;

    /* renamed from: a */
    public final void mo16936a(LocationAvailability locationAvailability) {
        this.f15235a.mo13349a(new C4685p(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo16937a(LocationResult locationResult) {
        this.f15235a.mo13349a(new C4684o(this, locationResult));
    }
}
