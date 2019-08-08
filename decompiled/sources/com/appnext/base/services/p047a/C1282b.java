package com.appnext.base.services.p047a;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1242a;
import com.appnext.base.p046b.C1244c;
import com.appnext.base.services.OperationJobService;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.List;

/* renamed from: com.appnext.base.services.a.b */
public final class C1282b extends C1283c {

    /* renamed from: it */
    private static final int f4085it = 900000;

    /* renamed from: iu */
    private JobScheduler f4086iu;
    private Context mContext;

    public C1282b(Context context) {
        try {
            this.mContext = context.getApplicationContext();
            this.f4086iu = (JobScheduler) this.mContext.getSystemService("jobscheduler");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo6044b(C1231c cVar) {
        try {
            this.f4086iu.cancel(cVar.mo5910bg().hashCode());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final void mo6046h(List<C1231c> list) {
        try {
            this.f4086iu.cancelAll();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6042a(C1231c cVar, long j, long j2) {
        m5532a(cVar, j, j2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6045b(C1231c cVar, long j, long j2) {
        m5532a(cVar, j, 86400000, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6043a(C1231c cVar, long j, Bundle bundle) {
        m5532a(cVar, j, 0, bundle);
    }

    /* renamed from: a */
    private void m5532a(C1231c cVar, long j, long j2, Bundle bundle) {
        try {
            Builder requiredNetworkType = new Builder(cVar.mo5910bg().hashCode(), new ComponentName(this.mContext, OperationJobService.class)).setPersisted(true).setRequiredNetworkType(1);
            PersistableBundle f = C1244c.m5269f(cVar);
            if (bundle != null) {
                PersistableBundle a = C1242a.m5252a(bundle);
                if (a != null) {
                    f.putPersistableBundle(C1283c.f4087iv, a);
                }
            }
            if (j2 > 0 && j2 < 900000) {
                j2 = 900000;
            }
            if (j > System.currentTimeMillis()) {
                requiredNetworkType.setMinimumLatency(Math.max(j - System.currentTimeMillis(), ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS));
                f.putString(OperationJobService.SCHEDULE, "true");
            } else if (j2 > 0 && (VERSION.SDK_INT < 24 || j2 >= 900000)) {
                requiredNetworkType.setPeriodic(j2);
            }
            requiredNetworkType.setExtras(f);
            this.f4086iu.schedule(requiredNetworkType.build());
        } catch (Throwable unused) {
        }
    }
}
