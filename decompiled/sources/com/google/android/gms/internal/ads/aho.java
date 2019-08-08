package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class aho extends Thread {

    /* renamed from: a */
    private static final boolean f11076a = C3761eb.f12916a;

    /* renamed from: b */
    private final BlockingQueue<avm<?>> f11077b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<avm<?>> f11078c;

    /* renamed from: d */
    private final C4377zn f11079d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3678b f11080e;

    /* renamed from: f */
    private volatile boolean f11081f = false;

    /* renamed from: g */
    private final ajq f11082g;

    public aho(BlockingQueue<avm<?>> blockingQueue, BlockingQueue<avm<?>> blockingQueue2, C4377zn znVar, C3678b bVar) {
        this.f11077b = blockingQueue;
        this.f11078c = blockingQueue2;
        this.f11079d = znVar;
        this.f11080e = bVar;
        this.f11082g = new ajq(this);
    }

    /* renamed from: b */
    private final void m14153b() throws InterruptedException {
        avm avm = (avm) this.f11077b.take();
        avm.mo14899b("cache-queue-take");
        avm.mo14906g();
        agn a = this.f11079d.mo15600a(avm.mo14904e());
        if (a == null) {
            avm.mo14899b("cache-miss");
            if (!this.f11082g.m14288b(avm)) {
                this.f11078c.put(avm);
            }
        } else if (a.mo14276a()) {
            avm.mo14899b("cache-hit-expired");
            avm.mo14890a(a);
            if (!this.f11082g.m14288b(avm)) {
                this.f11078c.put(avm);
            }
        } else {
            avm.mo14899b("cache-hit");
            bbm a2 = avm.mo14892a(new atl(a.f10982a, a.f10988g));
            avm.mo14899b("cache-hit-parsed");
            if (a.f10987f < System.currentTimeMillis()) {
                avm.mo14899b("cache-hit-refresh-needed");
                avm.mo14890a(a);
                a2.f12586d = true;
                if (!this.f11082g.m14288b(avm)) {
                    this.f11080e.mo14524a(avm, a2, new aip(this, avm));
                    return;
                }
            }
            this.f11080e.mo14523a(avm, a2);
        }
    }

    /* renamed from: a */
    public final void mo14320a() {
        this.f11081f = true;
        interrupt();
    }

    public final void run() {
        if (f11076a) {
            C3761eb.m16552a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f11079d.mo15601a();
        while (true) {
            try {
                m14153b();
            } catch (InterruptedException unused) {
                if (this.f11081f) {
                    return;
                }
            }
        }
    }
}
