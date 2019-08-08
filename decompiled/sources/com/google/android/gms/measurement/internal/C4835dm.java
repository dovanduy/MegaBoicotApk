package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.dm */
final /* synthetic */ class C4835dm implements Runnable {

    /* renamed from: a */
    private final C4834dl f15712a;

    /* renamed from: b */
    private final int f15713b;

    /* renamed from: c */
    private final C4893r f15714c;

    /* renamed from: d */
    private final Intent f15715d;

    C4835dm(C4834dl dlVar, int i, C4893r rVar, Intent intent) {
        this.f15712a = dlVar;
        this.f15713b = i;
        this.f15714c = rVar;
        this.f15715d = intent;
    }

    public final void run() {
        this.f15712a.mo17400a(this.f15713b, this.f15714c, this.f15715d);
    }
}
