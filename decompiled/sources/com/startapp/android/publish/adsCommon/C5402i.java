package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.os.Handler;
import com.appnext.base.services.OperationJobService;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.android.publish.adsCommon.i */
/* compiled from: StartAppSDK */
public class C5402i {

    /* renamed from: a */
    private static final boolean f17276a = MetaData.getInstance().isSupportIABViewability();

    /* renamed from: b */
    private Handler f17277b = new Handler();

    /* renamed from: c */
    private long f17278c;

    /* renamed from: d */
    private Context f17279d;

    /* renamed from: e */
    private long f17280e = -1;

    /* renamed from: f */
    private long f17281f;

    /* renamed from: g */
    private boolean f17282g;

    /* renamed from: h */
    private boolean f17283h;

    /* renamed from: i */
    private String[] f17284i;

    /* renamed from: j */
    private C5363b f17285j;

    /* renamed from: k */
    private AtomicBoolean f17286k = new AtomicBoolean(false);

    /* renamed from: l */
    private C5404a f17287l;

    /* renamed from: com.startapp.android.publish.adsCommon.i$a */
    /* compiled from: StartAppSDK */
    public interface C5404a {
        void onSent();
    }

    public C5402i(Context context, String[] strArr, C5363b bVar, long j) {
        this.f17279d = context.getApplicationContext();
        this.f17284i = strArr;
        this.f17285j = bVar;
        this.f17278c = j;
    }

    /* renamed from: a */
    public void mo19949a(C5404a aVar) {
        this.f17287l = aVar;
    }

    /* renamed from: a */
    public void mo19948a() {
        C5518g.m23563a("ScheduledImpression", 4, OperationJobService.SCHEDULE);
        if (mo19953c()) {
            C5518g.m23563a("ScheduledImpression", 3, "Already sent impression. Must call cancel(true/false) to reschedule");
        } else if (f17276a) {
            m23066a(this.f17278c);
        } else {
            C5518g.m23563a("ScheduledImpression", 3, "Delay feature disabled, sending impression now!");
            mo19952b(true);
        }
    }

    /* renamed from: b */
    public void mo19951b() {
        if (this.f17282g && this.f17283h) {
            C5518g.m23563a("ScheduledImpression", 4, "pause");
            this.f17277b.removeCallbacksAndMessages(null);
            this.f17280e = System.currentTimeMillis();
            this.f17278c -= this.f17280e - this.f17281f;
            this.f17283h = false;
        }
    }

    /* renamed from: a */
    public void mo19950a(boolean z) {
        if (this.f17282g) {
            StringBuilder sb = new StringBuilder();
            sb.append("cancel(");
            sb.append(z);
            sb.append(")");
            C5518g.m23563a("ScheduledImpression", 4, sb.toString());
            mo19952b(z);
            m23067d();
        }
    }

    /* renamed from: c */
    public boolean mo19953c() {
        return this.f17286k.get();
    }

    /* renamed from: a */
    private void m23066a(long j) {
        if (!this.f17283h) {
            this.f17283h = true;
            if (!this.f17282g) {
                this.f17282g = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling timer to: ");
            sb.append(j);
            sb.append(" millis, Num urls = ");
            sb.append(this.f17284i.length);
            C5518g.m23563a("ScheduledImpression", 3, sb.toString());
            this.f17281f = System.currentTimeMillis();
            this.f17277b.postDelayed(new Runnable() {
                public void run() {
                    C5518g.m23563a("ScheduledImpression", 4, "Timer elapsed");
                    C5402i.this.mo19952b(true);
                }
            }, j);
            return;
        }
        C5518g.m23563a("ScheduledImpression", 3, "Already running");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19952b(boolean z) {
        if (!this.f17286k.compareAndSet(false, true)) {
            C5518g.m23563a("ScheduledImpression", 4, "Already sent");
        } else if (z) {
            C5518g.m23563a("ScheduledImpression", 3, "Sending impression");
            C5349c.m22862a(this.f17279d, this.f17284i, this.f17285j);
            if (this.f17287l != null) {
                this.f17287l.onSent();
            }
        } else {
            C5518g.m23563a("ScheduledImpression", 3, "Sending non-impression");
            C5349c.m22864a(this.f17279d, this.f17284i, this.f17285j.getAdTag(), NotDisplayedReason.AD_CLOSED_TOO_QUICKLY.toString());
        }
    }

    /* renamed from: d */
    private void m23067d() {
        C5518g.m23563a("ScheduledImpression", 4, "reset");
        this.f17282g = false;
        this.f17277b.removeCallbacksAndMessages(null);
        this.f17283h = false;
        this.f17280e = -1;
        this.f17281f = 0;
    }
}
