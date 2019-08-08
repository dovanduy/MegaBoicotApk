package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.measurement.internal.C4839dq;

/* renamed from: com.google.android.gms.measurement.internal.dl */
public final class C4834dl<T extends Context & C4839dq> {

    /* renamed from: a */
    private final T f15711a;

    public C4834dl(T t) {
        C3513t.m12625a(t);
        this.f15711a = t;
    }

    /* renamed from: a */
    public final void mo17399a() {
        C4764aw a = C4764aw.m20471a((Context) this.f15711a, (C4888m) null);
        C4893r r = a.mo17158r();
        a.mo17161u();
        r.mo17759x().mo17763a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo17403b() {
        C4764aw a = C4764aw.m20471a((Context) this.f15711a, (C4888m) null);
        C4893r r = a.mo17158r();
        a.mo17161u();
        r.mo17759x().mo17763a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: a */
    public final int mo17397a(Intent intent, int i, int i2) {
        C4764aw a = C4764aw.m20471a((Context) this.f15711a, (C4888m) null);
        C4893r r = a.mo17158r();
        if (intent == null) {
            r.mo17754i().mo17763a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo17161u();
        r.mo17759x().mo17765a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m20758a((Runnable) new C4835dm(this, i2, r, intent));
        }
        return 2;
    }

    /* renamed from: a */
    private final void m20758a(Runnable runnable) {
        C4852ec a = C4852ec.m20854a((Context) this.f15711a);
        a.mo17157q().mo17219a((Runnable) new C4838dp(this, a, runnable));
    }

    /* renamed from: a */
    public final IBinder mo17398a(Intent intent) {
        if (intent == null) {
            m20759c().mo17761y_().mo17763a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C4766ay(C4852ec.m20854a((Context) this.f15711a));
        }
        m20759c().mo17754i().mo17764a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: b */
    public final boolean mo17404b(Intent intent) {
        if (intent == null) {
            m20759c().mo17761y_().mo17763a("onUnbind called with null intent");
            return true;
        }
        m20759c().mo17759x().mo17764a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo17402a(JobParameters jobParameters) {
        C4764aw a = C4764aw.m20471a((Context) this.f15711a, (C4888m) null);
        C4893r r = a.mo17158r();
        String string = jobParameters.getExtras().getString(C1245d.f3959jb);
        a.mo17161u();
        r.mo17759x().mo17764a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m20758a((Runnable) new C4837do(this, r, jobParameters));
        }
        return true;
    }

    /* renamed from: c */
    public final void mo17405c(Intent intent) {
        if (intent == null) {
            m20759c().mo17761y_().mo17763a("onRebind called with null intent");
            return;
        }
        m20759c().mo17759x().mo17764a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    private final C4893r m20759c() {
        return C4764aw.m20471a((Context) this.f15711a, (C4888m) null).mo17158r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo17401a(C4893r rVar, JobParameters jobParameters) {
        rVar.mo17759x().mo17763a("AppMeasurementJobService processed last upload request.");
        ((C4839dq) this.f15711a).mo17122a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo17400a(int i, C4893r rVar, Intent intent) {
        if (((C4839dq) this.f15711a).mo17124a(i)) {
            rVar.mo17759x().mo17764a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m20759c().mo17759x().mo17763a("Completed wakeful intent.");
            ((C4839dq) this.f15711a).mo17123a(intent);
        }
    }
}
