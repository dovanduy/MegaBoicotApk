package com.google.android.gms.common.util;

import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p023d.C0378b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.util.f */
public final class C3554f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m12734a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m12735a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m12736a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return m12734a();
            case 1:
                return m12735a(tArr[0]);
            default:
                return Collections.unmodifiableList(Arrays.asList(tArr));
        }
    }

    /* renamed from: a */
    private static <T> Set<T> m12739a(int i, boolean z) {
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            return new C0378b(i);
        }
        return new HashSet(i, f);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m12740a(T t, T t2, T t3) {
        Set a = m12739a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m12742b(T... tArr) {
        switch (tArr.length) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(tArr[0]);
            case 2:
                T t = tArr[0];
                T t2 = tArr[1];
                Set a = m12739a(2, false);
                a.add(t);
                a.add(t2);
                return Collections.unmodifiableSet(a);
            case 3:
                return m12740a(tArr[0], tArr[1], tArr[2]);
            case 4:
                T t3 = tArr[0];
                T t4 = tArr[1];
                T t5 = tArr[2];
                T t6 = tArr[3];
                Set a2 = m12739a(4, false);
                a2.add(t3);
                a2.add(t4);
                a2.add(t5);
                a2.add(t6);
                return Collections.unmodifiableSet(a2);
            default:
                Set a3 = m12739a(tArr.length, false);
                Collections.addAll(a3, tArr);
                return Collections.unmodifiableSet(a3);
        }
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m12741b(int i, boolean z) {
        if (i <= 256) {
            return new C0376a(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m12737a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m12741b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m12738a(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        switch (kArr.length) {
            case 0:
                return Collections.emptyMap();
            case 1:
                return Collections.singletonMap(kArr[0], vArr[0]);
            default:
                Map b = m12741b(kArr.length, false);
                for (int i = 0; i < kArr.length; i++) {
                    b.put(kArr[i], vArr[i]);
                }
                return Collections.unmodifiableMap(b);
        }
    }
}
