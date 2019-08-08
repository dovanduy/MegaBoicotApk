package com.google.android.gms.internal.p148e;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.fd */
final class C4587fd implements Comparable<C4587fd>, Entry<K, V> {

    /* renamed from: a */
    private final K f14965a;

    /* renamed from: b */
    private V f14966b;

    /* renamed from: c */
    private final /* synthetic */ C4574ew f14967c;

    C4587fd(C4574ew ewVar, Entry<K, V> entry) {
        this(ewVar, (Comparable) entry.getKey(), entry.getValue());
    }

    C4587fd(C4574ew ewVar, K k, V v) {
        this.f14967c = ewVar;
        this.f14965a = k;
        this.f14966b = v;
    }

    public final V getValue() {
        return this.f14966b;
    }

    public final V setValue(V v) {
        this.f14967c.m19744f();
        V v2 = this.f14966b;
        this.f14966b = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m19776a(this.f14965a, entry.getKey()) && m19776a(this.f14966b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f14965a == null ? 0 : this.f14965a.hashCode();
        if (this.f14966b != null) {
            i = this.f14966b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14965a);
        String valueOf2 = String.valueOf(this.f14966b);
        StringBuilder sb = new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m19776a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f14965a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C4587fd) obj).getKey());
    }
}
