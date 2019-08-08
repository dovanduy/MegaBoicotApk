package com.google.android.gms.internal.ads;

import java.util.List;

final class aby extends abv {
    private aby() {
        super();
    }

    /* renamed from: c */
    private static <E> abj<E> m13372c(Object obj, long j) {
        return (abj) aed.m13790f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo14033a(Object obj, long j) {
        abj c = m13372c(obj, j);
        if (c.mo14006a()) {
            return c;
        }
        int size = c.size();
        abj a = c.mo13924a(size == 0 ? 10 : size << 1);
        aed.m13768a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo14034a(Object obj, Object obj2, long j) {
        abj c = m13372c(obj, j);
        abj c2 = m13372c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo14006a()) {
                c = c.mo13924a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        aed.m13768a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14035b(Object obj, long j) {
        m13372c(obj, j).mo14007b();
    }
}
