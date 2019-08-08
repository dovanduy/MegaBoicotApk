package com.appnext.base.operations;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.AsyncTask;
import android.support.p017v4.p023d.C0398m;

public abstract class AppnextOperationJobService extends JobService {

    /* renamed from: hb */
    private final C0398m<JobParameters, C1264a> f4007hb = new C0398m<>();

    /* renamed from: hc */
    private C1264a f4008hc;

    /* renamed from: com.appnext.base.operations.AppnextOperationJobService$a */
    private static class C1264a extends AsyncTask<Void, Void, Integer> {

        /* renamed from: hd */
        private final AppnextOperationJobService f4009hd;

        /* renamed from: he */
        private final JobParameters f4010he;

        /* renamed from: a */
        protected static void m5353a(Integer num) {
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return Integer.valueOf(this.f4009hd.onRunJob(this.f4010he));
        }

        private C1264a(AppnextOperationJobService appnextOperationJobService, JobParameters jobParameters) {
            this.f4009hd = appnextOperationJobService;
            this.f4010he = jobParameters;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Integer mo5991a(Void... voidArr) {
            return Integer.valueOf(this.f4009hd.onRunJob(this.f4010he));
        }

        /* renamed from: bp */
        public final void mo5992bp() {
            this.f4009hd.jobFinished(this.f4010he, false);
        }
    }

    public abstract int onRunJob(JobParameters jobParameters);

    public boolean onStartJob(JobParameters jobParameters) {
        this.f4008hc = new C1264a(jobParameters);
        synchronized (this.f4007hb) {
            this.f4007hb.put(jobParameters, this.f4008hc);
        }
        this.f4008hc.execute(new Void[0]);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        synchronized (this.f4007hb) {
            C1264a aVar = (C1264a) this.f4007hb.remove(jobParameters);
            if (aVar == null) {
                return false;
            }
            aVar.cancel(true);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5987a(JobParameters jobParameters) {
        synchronized (this.f4007hb) {
            this.f4007hb.remove(jobParameters);
        }
        this.f4008hc.mo5992bp();
    }
}
