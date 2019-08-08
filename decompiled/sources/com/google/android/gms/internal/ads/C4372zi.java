package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zi */
final class C4372zi extends C4369zf {

    /* renamed from: a */
    private final C4370zg f14282a = new C4370zg();

    C4372zi() {
    }

    /* renamed from: a */
    public final void mo16223a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f14282a.mo16224a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
