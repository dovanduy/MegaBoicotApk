package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ei */
final class C4560ei<T> implements C4571et<T> {

    /* renamed from: a */
    private final C4554ec f14928a;

    /* renamed from: b */
    private final C4595fl<?, ?> f14929b;

    /* renamed from: c */
    private final boolean f14930c;

    /* renamed from: d */
    private final C4501ci<?> f14931d;

    private C4560ei(C4595fl<?, ?> flVar, C4501ci<?> ciVar, C4554ec ecVar) {
        this.f14929b = flVar;
        this.f14930c = ciVar.mo16576a(ecVar);
        this.f14931d = ciVar;
        this.f14928a = ecVar;
    }

    /* renamed from: a */
    static <T> C4560ei<T> m19601a(C4595fl<?, ?> flVar, C4501ci<?> ciVar, C4554ec ecVar) {
        return new C4560ei<>(flVar, ciVar, ecVar);
    }

    /* renamed from: a */
    public final T mo16685a() {
        return this.f14928a.mo16614k().mo16621e();
    }

    /* renamed from: a */
    public final boolean mo16688a(T t, T t2) {
        if (!this.f14929b.mo16755b(t).equals(this.f14929b.mo16755b(t2))) {
            return false;
        }
        if (this.f14930c) {
            return this.f14931d.mo16570a((Object) t).equals(this.f14931d.mo16570a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo16684a(T t) {
        int hashCode = this.f14929b.mo16755b(t).hashCode();
        return this.f14930c ? (hashCode * 53) + this.f14931d.mo16570a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo16690b(T t, T t2) {
        C4573ev.m19694a(this.f14929b, t, t2);
        if (this.f14930c) {
            C4573ev.m19692a(this.f14931d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo16687a(T t, C4621gg ggVar) throws IOException {
        Iterator e = this.f14931d.mo16570a((Object) t).mo16584e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            C4506cn cnVar = (C4506cn) entry.getKey();
            if (cnVar.mo16595c() != C4620gf.MESSAGE || cnVar.mo16596d() || cnVar.mo16597e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C4532dh) {
                ggVar.mo16528a(cnVar.mo16591a(), (Object) ((C4532dh) entry).mo16637a().mo16646c());
            } else {
                ggVar.mo16528a(cnVar.mo16591a(), entry.getValue());
            }
        }
        C4595fl<?, ?> flVar = this.f14929b;
        flVar.mo16757b(flVar.mo16755b(t), ggVar);
    }

    /* renamed from: a */
    public final void mo16686a(T t, C4570es esVar, C4499ch chVar) throws IOException {
        boolean z;
        C4595fl<?, ?> flVar = this.f14929b;
        C4501ci<?> ciVar = this.f14931d;
        Object c = flVar.mo16759c(t);
        C4504cl b = ciVar.mo16577b(t);
        do {
            try {
                if (esVar.mo16440a() == Integer.MAX_VALUE) {
                    flVar.mo16758b((Object) t, c);
                    return;
                }
                int b2 = esVar.mo16445b();
                if (b2 == 11) {
                    Object obj = null;
                    int i = 0;
                    C4469bj bjVar = null;
                    while (esVar.mo16440a() != Integer.MAX_VALUE) {
                        int b3 = esVar.mo16445b();
                        if (b3 == 16) {
                            i = esVar.mo16473o();
                            obj = ciVar.mo16571a(chVar, this.f14928a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                ciVar.mo16574a(esVar, obj, chVar, b);
                            } else {
                                bjVar = esVar.mo16471n();
                            }
                        } else if (!esVar.mo16450c()) {
                            break;
                        }
                    }
                    if (esVar.mo16445b() != 12) {
                        throw C4526db.m19461d();
                    } else if (bjVar != null) {
                        if (obj != null) {
                            ciVar.mo16573a(bjVar, obj, chVar, b);
                        } else {
                            flVar.mo16749a(c, i, bjVar);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = ciVar.mo16571a(chVar, this.f14928a, b2 >>> 3);
                    if (a != null) {
                        ciVar.mo16574a(esVar, a, chVar, b);
                    } else {
                        z = flVar.mo16754a(c, esVar);
                        continue;
                    }
                } else {
                    z = esVar.mo16450c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                flVar.mo16758b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo16691c(T t) {
        this.f14929b.mo16761d(t);
        this.f14931d.mo16578c(t);
    }

    /* renamed from: d */
    public final boolean mo16692d(T t) {
        return this.f14931d.mo16570a((Object) t).mo16587g();
    }

    /* renamed from: b */
    public final int mo16689b(T t) {
        C4595fl<?, ?> flVar = this.f14929b;
        int e = 0 + flVar.mo16762e(flVar.mo16755b(t));
        return this.f14930c ? e + this.f14931d.mo16570a((Object) t).mo16590i() : e;
    }
}
