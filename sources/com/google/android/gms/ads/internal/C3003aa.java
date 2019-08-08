package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.aa */
final class C3003aa extends TimerTask {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f8741a;

    /* renamed from: b */
    private final /* synthetic */ Timer f8742b;

    /* renamed from: c */
    private final /* synthetic */ C3002a f8743c;

    C3003aa(C3002a aVar, CountDownLatch countDownLatch, Timer timer) {
        this.f8743c = aVar;
        this.f8741a = countDownLatch;
        this.f8742b = timer;
    }

    public final void run() {
        if (((long) ((Integer) aoq.m14620f().mo14695a(aru.f11923cp)).intValue()) != this.f8741a.getCount()) {
            C3900je.m17429b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f8741a.getCount() == 0) {
                this.f8742b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f8743c.f8733e.f8858c.getPackageName()).concat("_adsTrace_");
        try {
            C3900je.m17429b("Starting method tracing");
            this.f8741a.countDown();
            long a = C3025aw.m10924l().mo13694a();
            StringBuilder sb = new StringBuilder(20 + String.valueOf(concat).length());
            sb.append(concat);
            sb.append(a);
            Debug.startMethodTracing(sb.toString(), ((Integer) aoq.m14620f().mo14695a(aru.f11924cq)).intValue());
        } catch (Exception e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
