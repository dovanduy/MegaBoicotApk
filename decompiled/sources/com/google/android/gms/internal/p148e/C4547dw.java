package com.google.android.gms.internal.p148e;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.e.dw */
public final class C4547dw<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C4547dw f14905b;

    /* renamed from: a */
    private boolean f14906a = true;

    private C4547dw() {
    }

    private C4547dw(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> C4547dw<K, V> m19516a() {
        return f14905b;
    }

    /* renamed from: a */
    public final void mo16662a(C4547dw<K, V> dwVar) {
        m19517e();
        if (!dwVar.isEmpty()) {
            putAll(dwVar);
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m19517e();
        super.clear();
    }

    public final V put(K k, V v) {
        m19517e();
        C4520cw.m19446a(k);
        C4520cw.m19446a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m19517e();
        for (Object next : map.keySet()) {
            C4520cw.m19446a(next);
            C4520cw.m19446a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m19517e();
        return super.remove(obj);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4547dw.equals(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static int m19515a(Object obj) {
        if (obj instanceof byte[]) {
            return C4520cw.m19452c((byte[]) obj);
        }
        if (!(obj instanceof C4521cx)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m19515a(entry.getValue()) ^ m19515a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final C4547dw<K, V> mo16663b() {
        return isEmpty() ? new C4547dw<>() : new C4547dw<>(this);
    }

    /* renamed from: c */
    public final void mo16664c() {
        this.f14906a = false;
    }

    /* renamed from: d */
    public final boolean mo16666d() {
        return this.f14906a;
    }

    /* renamed from: e */
    private final void m19517e() {
        if (!this.f14906a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C4547dw dwVar = new C4547dw();
        f14905b = dwVar;
        dwVar.f14906a = false;
    }
}
