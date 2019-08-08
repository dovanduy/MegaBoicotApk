package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.bg */
final class C3685bg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f12727a;

    /* renamed from: b */
    private final /* synthetic */ int f12728b;

    /* renamed from: c */
    private final /* synthetic */ C4019np f12729c;

    /* renamed from: d */
    private final /* synthetic */ List f12730d;

    C3685bg(AtomicInteger atomicInteger, int i, C4019np npVar, List list) {
        this.f12727a = atomicInteger;
        this.f12728b = i;
        this.f12729c = npVar;
        this.f12730d = list;
    }

    public final void run() {
        if (this.f12727a.incrementAndGet() >= this.f12728b) {
            try {
                this.f12729c.mo15686b(C3676ay.m15683b(this.f12730d));
            } catch (InterruptedException | ExecutionException e) {
                C3900je.m17432c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
