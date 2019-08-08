package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.ch */
final class C4803ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f15611a;

    /* renamed from: b */
    private final /* synthetic */ C4798cc f15612b;

    C4803ch(C4798cc ccVar, ConditionalUserProperty conditionalUserProperty) {
        this.f15612b = ccVar;
        this.f15611a = conditionalUserProperty;
    }

    public final void run() {
        this.f15612b.m20597e(this.f15611a);
    }
}
