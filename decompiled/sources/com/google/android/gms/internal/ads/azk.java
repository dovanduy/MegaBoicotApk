package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class azk {

    /* renamed from: a */
    private final AtomicInteger f12446a;

    /* renamed from: b */
    private final Set<avm<?>> f12447b;

    /* renamed from: c */
    private final PriorityBlockingQueue<avm<?>> f12448c;

    /* renamed from: d */
    private final PriorityBlockingQueue<avm<?>> f12449d;

    /* renamed from: e */
    private final C4377zn f12450e;

    /* renamed from: f */
    private final aqp f12451f;

    /* renamed from: g */
    private final C3678b f12452g;

    /* renamed from: h */
    private final arj[] f12453h;

    /* renamed from: i */
    private aho f12454i;

    /* renamed from: j */
    private final List<bal> f12455j;

    public azk(C4377zn znVar, aqp aqp) {
        this(znVar, aqp, 4);
    }

    private azk(C4377zn znVar, aqp aqp, int i) {
        this(znVar, aqp, 4, new C3661amr(new Handler(Looper.getMainLooper())));
    }

    private azk(C4377zn znVar, aqp aqp, int i, C3678b bVar) {
        this.f12446a = new AtomicInteger();
        this.f12447b = new HashSet();
        this.f12448c = new PriorityBlockingQueue<>();
        this.f12449d = new PriorityBlockingQueue<>();
        this.f12455j = new ArrayList();
        this.f12450e = znVar;
        this.f12451f = aqp;
        this.f12453h = new arj[4];
        this.f12452g = bVar;
    }

    /* renamed from: a */
    public final <T> avm<T> mo15021a(avm<T> avm) {
        avm.mo14891a(this);
        synchronized (this.f12447b) {
            this.f12447b.add(avm);
        }
        avm.mo14889a(this.f12446a.incrementAndGet());
        avm.mo14899b("add-to-queue");
        (!avm.mo14907h() ? this.f12449d : this.f12448c).add(avm);
        return avm;
    }

    /* renamed from: a */
    public final void mo15022a() {
        arj[] arjArr;
        if (this.f12454i != null) {
            this.f12454i.mo14320a();
        }
        for (arj arj : this.f12453h) {
            if (arj != null) {
                arj.mo14681a();
            }
        }
        this.f12454i = new aho(this.f12448c, this.f12449d, this.f12450e, this.f12452g);
        this.f12454i.start();
        for (int i = 0; i < this.f12453h.length; i++) {
            arj arj2 = new arj(this.f12449d, this.f12451f, this.f12450e, this.f12452g);
            this.f12453h[i] = arj2;
            arj2.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final <T> void mo15023b(avm<T> avm) {
        synchronized (this.f12447b) {
            this.f12447b.remove(avm);
        }
        synchronized (this.f12455j) {
            for (bal a : this.f12455j) {
                a.mo15041a(avm);
            }
        }
    }
}
