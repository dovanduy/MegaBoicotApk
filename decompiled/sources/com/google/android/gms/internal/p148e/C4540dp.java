package com.google.android.gms.internal.p148e;

import java.util.List;

/* renamed from: com.google.android.gms.internal.e.dp */
final class C4540dp extends C4537dm {
    private C4540dp() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo16653a(Object obj, long j) {
        C4525da c = m19496c(obj, j);
        if (c.mo16367a()) {
            return c;
        }
        int size = c.size();
        C4525da a = c.mo16382a(size == 0 ? 10 : size << 1);
        C4601fr.m19851a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16655b(Object obj, long j) {
        m19496c(obj, j).mo16372b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo16654a(Object obj, Object obj2, long j) {
        C4525da c = m19496c(obj, j);
        C4525da c2 = m19496c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo16367a()) {
                c = c.mo16382a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C4601fr.m19851a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> C4525da<E> m19496c(Object obj, long j) {
        return (C4525da) C4601fr.m19874f(obj, j);
    }
}
