package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4834dl;
import com.google.android.gms.measurement.internal.C4839dq;

public final class AppMeasurementService extends Service implements C4839dq {

    /* renamed from: a */
    private C4834dl<AppMeasurementService> f15368a;

    /* renamed from: a */
    private final C4834dl<AppMeasurementService> m20327a() {
        if (this.f15368a == null) {
            this.f15368a = new C4834dl<>(this);
        }
        return this.f15368a;
    }

    public final void onCreate() {
        super.onCreate();
        m20327a().mo17399a();
    }

    public final void onDestroy() {
        m20327a().mo17403b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m20327a().mo17397a(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        return m20327a().mo17398a(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return m20327a().mo17404b(intent);
    }

    public final void onRebind(Intent intent) {
        m20327a().mo17405c(intent);
    }

    /* renamed from: a */
    public final boolean mo17124a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo17122a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo17123a(Intent intent) {
        AppMeasurementReceiver.m1234a(intent);
    }
}
