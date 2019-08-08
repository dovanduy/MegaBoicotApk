package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class ado implements Comparable<ado>, Entry<K, V> {

    /* renamed from: a */
    private final K f10576a;

    /* renamed from: b */
    private V f10577b;

    /* renamed from: c */
    private final /* synthetic */ adh f10578c;

    ado(adh adh, K k, V v) {
        this.f10578c = adh;
        this.f10576a = k;
        this.f10577b = v;
    }

    ado(adh adh, Entry<K, V> entry) {
        this(adh, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m13690a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((ado) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m13690a(this.f10576a, entry.getKey()) && m13690a(this.f10577b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f10576a;
    }

    public final V getValue() {
        return this.f10577b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f10576a == null ? 0 : this.f10576a.hashCode();
        if (this.f10577b != null) {
            i = this.f10577b.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f10578c.m13677f();
        V v2 = this.f10577b;
        this.f10577b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10576a);
        String valueOf2 = String.valueOf(this.f10577b);
        StringBuilder sb = new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
