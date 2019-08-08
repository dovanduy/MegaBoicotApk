package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.cg */
final class C4802cg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f15609a;

    /* renamed from: b */
    private final /* synthetic */ C4798cc f15610b;

    C4802cg(C4798cc ccVar, ConditionalUserProperty conditionalUserProperty) {
        this.f15610b = ccVar;
        this.f15609a = conditionalUserProperty;
    }

    public final void run() {
        this.f15610b.m20596d(this.f15609a);
    }
}
