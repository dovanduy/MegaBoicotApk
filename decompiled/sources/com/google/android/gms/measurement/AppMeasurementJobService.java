package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4834dl;
import com.google.android.gms.measurement.internal.C4839dq;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C4839dq {

    /* renamed from: a */
    private C4834dl<AppMeasurementJobService> f15366a;

    /* renamed from: a */
    private final C4834dl<AppMeasurementJobService> m20321a() {
        if (this.f15366a == null) {
            this.f15366a = new C4834dl<>(this);
        }
        return this.f15366a;
    }

    /* renamed from: a */
    public final void mo17123a(Intent intent) {
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        m20321a().mo17399a();
    }

    public final void onDestroy() {
        m20321a().mo17403b();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m20321a().mo17402a(jobParameters);
    }

    public final boolean onUnbind(Intent intent) {
        return m20321a().mo17404b(intent);
    }

    public final void onRebind(Intent intent) {
        m20321a().mo17405c(intent);
    }

    /* renamed from: a */
    public final boolean mo17124a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo17122a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
