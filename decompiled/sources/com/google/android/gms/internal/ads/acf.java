package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class acf<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final acf f10482b;

    /* renamed from: a */
    private boolean f10483a = true;

    static {
        acf acf = new acf();
        f10482b = acf;
        acf.f10483a = false;
    }

    private acf() {
    }

    private acf(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    private static int m13394a(Object obj) {
        if (obj instanceof byte[]) {
            return abg.m13326c((byte[]) obj);
        }
        if (!(obj instanceof abh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <K, V> acf<K, V> m13395a() {
        return f10482b;
    }

    /* renamed from: e */
    private final void m13396e() {
        if (!this.f10483a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo14045a(acf<K, V> acf) {
        m13396e();
        if (!acf.isEmpty()) {
            putAll(acf);
        }
    }

    /* renamed from: b */
    public final acf<K, V> mo14046b() {
        return isEmpty() ? new acf<>() : new acf<>(this);
    }

    /* renamed from: c */
    public final void mo14047c() {
        this.f10483a = false;
    }

    public final void clear() {
        m13396e();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo14049d() {
        return this.f10483a;
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m13394a(entry.getValue()) ^ m13394a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m13396e();
        abg.m13320a(k);
        abg.m13320a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m13396e();
        for (Object next : map.keySet()) {
            abg.m13320a(next);
            abg.m13320a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m13396e();
        return super.remove(obj);
    }
}
