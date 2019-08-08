package com.google.android.gms.internal.p148e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ff */
class C4589ff extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C4574ew f14972a;

    private C4589ff(C4574ew ewVar) {
        this.f14972a = ewVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C4588fe(this.f14972a, null);
    }

    public int size() {
        return this.f14972a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f14972a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f14972a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f14972a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f14972a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ C4589ff(C4574ew ewVar, C4575ex exVar) {
        this(ewVar);
    }
}
