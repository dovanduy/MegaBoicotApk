package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class abx extends abv {

    /* renamed from: a */
    private static final Class<?> f10471a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private abx() {
        super();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zq, com.google.android.gms.internal.ads.abt] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m13367a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m13368c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.abu
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.abt r0 = new com.google.android.gms.internal.ads.abt
            r0.<init>(r6)
            goto L_0x0019
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0019:
            com.google.android.gms.internal.ads.aed.m13768a(r3, r4, r0)
            return r0
        L_0x001d:
            java.lang.Class<?> r1 = f10471a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x003b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0036:
            com.google.android.gms.internal.ads.aed.m13768a(r3, r4, r1)
            r0 = r1
            return r0
        L_0x003b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.aea
            if (r1 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.abt r1 = new com.google.android.gms.internal.ads.abt
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.ads.aea r0 = (com.google.android.gms.internal.ads.aea) r0
            r1.addAll(r0)
            goto L_0x0036
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abx.m13367a(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: c */
    private static <E> List<E> m13368c(Object obj, long j) {
        return (List) aed.m13790f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo14033a(Object obj, long j) {
        return m13367a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo14034a(Object obj, Object obj2, long j) {
        List c = m13368c(obj2, j);
        List a = m13367a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        aed.m13768a(obj, j, (Object) c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14035b(Object obj, long j) {
        Object obj2;
        List list = (List) aed.m13790f(obj, j);
        if (list instanceof abu) {
            obj2 = ((abu) list).mo14028e();
        } else if (!f10471a.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        aed.m13768a(obj, j, obj2);
    }
}
