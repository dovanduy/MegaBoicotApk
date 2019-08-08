package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.dh */
final class C4830dh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f15705a;

    /* renamed from: b */
    private final /* synthetic */ C4828df f15706b;

    C4830dh(C4828df dfVar, ComponentName componentName) {
        this.f15706b = dfVar;
        this.f15705a = componentName;
    }

    public final void run() {
        this.f15706b.f15700a.m20702a(this.f15705a);
    }
}
