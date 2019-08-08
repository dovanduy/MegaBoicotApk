package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.do */
final /* synthetic */ class C4837do implements Runnable {

    /* renamed from: a */
    private final C4834dl f15717a;

    /* renamed from: b */
    private final C4893r f15718b;

    /* renamed from: c */
    private final JobParameters f15719c;

    C4837do(C4834dl dlVar, C4893r rVar, JobParameters jobParameters) {
        this.f15717a = dlVar;
        this.f15718b = rVar;
        this.f15719c = jobParameters;
    }

    public final void run() {
        this.f15717a.mo17401a(this.f15718b, this.f15719c);
    }
}
