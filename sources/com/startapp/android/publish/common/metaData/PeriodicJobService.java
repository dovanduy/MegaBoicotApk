package com.startapp.android.publish.common.metaData;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.startapp.common.p194b.C5527a;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;

@TargetApi(21)
/* compiled from: StartAppSDK */
public class PeriodicJobService extends JobService {

    /* renamed from: a */
    private static final String f17460a = "PeriodicJobService";

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        C5527a.m23595a((Context) this);
        boolean a = C5527a.m23606a(jobParameters, (C5535b) new C5535b() {
            /* renamed from: a */
            public void mo20155a(C5534a aVar) {
                PeriodicJobService.this.jobFinished(jobParameters, false);
            }
        });
        String str = f17460a;
        StringBuilder sb = new StringBuilder();
        sb.append("onStartJob: RunnerManager.runJob");
        sb.append(a);
        C5527a.m23600a(3, str, sb.toString(), (Throwable) null);
        return a;
    }
}
