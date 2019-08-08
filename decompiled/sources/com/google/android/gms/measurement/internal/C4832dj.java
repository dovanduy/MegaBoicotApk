package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.dj */
final class C4832dj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4828df f15709a;

    C4832dj(C4828df dfVar) {
        this.f15709a = dfVar;
    }

    public final void run() {
        C4815ct ctVar = this.f15709a.f15700a;
        Context n = this.f15709a.f15700a.mo17154n();
        this.f15709a.f15700a.mo17161u();
        ctVar.m20702a(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
