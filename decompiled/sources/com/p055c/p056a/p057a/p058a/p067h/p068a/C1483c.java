package com.p055c.p056a.p057a.p058a.p067h.p068a;

import com.p055c.p056a.p057a.p058a.p067h.p068a.C1480b.C1481a;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.c.a.a.a.h.a.c */
public class C1483c implements C1481a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f4477a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f4478b;

    /* renamed from: c */
    private final ArrayDeque<C1480b> f4479c = new ArrayDeque<>();

    /* renamed from: d */
    private C1480b f4480d = null;

    public C1483c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f4477a);
        this.f4478b = threadPoolExecutor;
    }

    /* renamed from: a */
    private void m6135a() {
        this.f4480d = (C1480b) this.f4479c.poll();
        if (this.f4480d != null) {
            this.f4480d.mo6591a(this.f4478b);
        }
    }

    /* renamed from: a */
    public void mo6593a(C1480b bVar) {
        this.f4480d = null;
        m6135a();
    }

    /* renamed from: b */
    public void mo6596b(C1480b bVar) {
        bVar.mo6589a((C1481a) this);
        this.f4479c.add(bVar);
        if (this.f4480d == null) {
            m6135a();
        }
    }
}
