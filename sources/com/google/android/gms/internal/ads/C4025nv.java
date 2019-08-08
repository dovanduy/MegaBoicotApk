package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.nv */
public class C4025nv<T> implements C4021nr<T> {

    /* renamed from: a */
    private final Object f13630a = new Object();

    /* renamed from: b */
    private int f13631b = 0;

    /* renamed from: c */
    private final BlockingQueue<C4026nw> f13632c = new LinkedBlockingQueue();

    /* renamed from: d */
    private T f13633d;

    /* renamed from: a */
    public final void mo15693a() {
        synchronized (this.f13630a) {
            if (this.f13631b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f13631b = -1;
            for (C4026nw nwVar : this.f13632c) {
                nwVar.f13635b.mo14412a();
            }
            this.f13632c.clear();
        }
    }

    /* renamed from: a */
    public final void mo15691a(C4024nu<T> nuVar, C4022ns nsVar) {
        synchronized (this.f13630a) {
            if (this.f13631b == 1) {
                nuVar.mo14411a(this.f13633d);
            } else if (this.f13631b == -1) {
                nsVar.mo14412a();
            } else if (this.f13631b == 0) {
                this.f13632c.add(new C4026nw(this, nuVar, nsVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo15692a(T t) {
        synchronized (this.f13630a) {
            if (this.f13631b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f13633d = t;
            this.f13631b = 1;
            for (C4026nw nwVar : this.f13632c) {
                nwVar.f13634a.mo14411a(t);
            }
            this.f13632c.clear();
        }
    }

    /* renamed from: b */
    public final int mo15694b() {
        return this.f13631b;
    }
}
