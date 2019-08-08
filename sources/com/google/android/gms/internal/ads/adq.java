package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class adq extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ adh f10583a;

    private adq(adh adh) {
        this.f10583a = adh;
    }

    /* synthetic */ adq(adh adh, adi adi) {
        this(adh);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f10583a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f10583a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f10583a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new adp(this.f10583a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f10583a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f10583a.size();
    }
}
