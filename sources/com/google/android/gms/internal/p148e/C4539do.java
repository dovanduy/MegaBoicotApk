package com.google.android.gms.internal.p148e;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.e.do */
final class C4539do extends C4537dm {

    /* renamed from: a */
    private static final Class<?> f14894a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C4539do() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo16653a(Object obj, long j) {
        return m19491a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16655b(Object obj, long j) {
        Object obj2;
        List list = (List) C4601fr.m19874f(obj, j);
        if (list instanceof C4536dl) {
            obj2 = ((C4536dl) list).mo16650e();
        } else if (!f14894a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C4566eo) || !(list instanceof C4525da)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C4525da daVar = (C4525da) list;
                if (daVar.mo16367a()) {
                    daVar.mo16372b();
                }
                return;
            }
        } else {
            return;
        }
        C4601fr.m19851a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.e.dk, com.google.android.gms.internal.e.bf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m19491a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m19492c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4536dl
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.e.dk r0 = new com.google.android.gms.internal.e.dk
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4566eo
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4525da
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.e.da r0 = (com.google.android.gms.internal.p148e.C4525da) r0
            com.google.android.gms.internal.e.da r6 = r0.mo16382a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f14894a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4598fo
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.e.dk r1 = new com.google.android.gms.internal.e.dk
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.e.fo r0 = (com.google.android.gms.internal.p148e.C4598fo) r0
            r1.addAll(r0)
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4566eo
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4525da
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.e.da r1 = (com.google.android.gms.internal.p148e.C4525da) r1
            boolean r2 = r1.mo16367a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.e.da r0 = r1.mo16382a(r0)
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4539do.m19491a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo16654a(Object obj, Object obj2, long j) {
        List c = m19492c(obj2, j);
        List a = m19491a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C4601fr.m19851a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m19492c(Object obj, long j) {
        return (List) C4601fr.m19874f(obj, j);
    }
}
