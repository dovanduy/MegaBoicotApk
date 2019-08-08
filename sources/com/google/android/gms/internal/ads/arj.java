package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class arj extends Thread {

    /* renamed from: a */
    private final BlockingQueue<avm<?>> f11731a;

    /* renamed from: b */
    private final aqp f11732b;

    /* renamed from: c */
    private final C4377zn f11733c;

    /* renamed from: d */
    private final C3678b f11734d;

    /* renamed from: e */
    private volatile boolean f11735e = false;

    public arj(BlockingQueue<avm<?>> blockingQueue, aqp aqp, C4377zn znVar, C3678b bVar) {
        this.f11731a = blockingQueue;
        this.f11732b = aqp;
        this.f11733c = znVar;
        this.f11734d = bVar;
    }

    /* renamed from: b */
    private final void m14984b() throws InterruptedException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        avm avm = (avm) this.f11731a.take();
        try {
            avm.mo14899b("network-queue-take");
            avm.mo14906g();
            TrafficStats.setThreadStatsTag(avm.mo14903d());
            atl a = this.f11732b.mo14633a(avm);
            avm.mo14899b("network-http-complete");
            if (!a.f12197e || !avm.mo14911l()) {
                bbm a2 = avm.mo14892a(a);
                avm.mo14899b("network-parse-complete");
                if (avm.mo14907h() && a2.f12584b != null) {
                    this.f11733c.mo15602a(avm.mo14904e(), a2.f12584b);
                    avm.mo14899b("network-cache-written");
                }
                avm.mo14910k();
                this.f11734d.mo14523a(avm, a2);
                avm.mo14894a(a2);
                return;
            }
            avm.mo14901c("not-modified");
            avm.mo14912m();
        } catch (C3738df e) {
            e.mo15242a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f11734d.mo14525a(avm, e);
            avm.mo14912m();
        } catch (Exception e2) {
            C3761eb.m16553a(e2, "Unhandled exception %s", e2.toString());
            C3738df dfVar = new C3738df((Throwable) e2);
            dfVar.mo15242a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f11734d.mo14525a(avm, dfVar);
            avm.mo14912m();
        }
    }

    /* renamed from: a */
    public final void mo14681a() {
        this.f11735e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m14984b();
            } catch (InterruptedException unused) {
                if (this.f11735e) {
                    return;
                }
            }
        }
    }
}
