package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zq */
abstract class C4380zq<E> extends AbstractList<E> implements abj<E> {

    /* renamed from: a */
    private boolean f14356a = true;

    C4380zq() {
    }

    /* renamed from: a */
    public boolean mo14006a() {
        return this.f14356a;
    }

    public void add(int i, E e) {
        mo16229c();
        super.add(i, e);
    }

    public boolean add(E e) {
        mo16229c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo16229c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo16229c();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo14007b() {
        this.f14356a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16229c() {
        if (!this.f14356a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo16229c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo16229c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo16229c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo16229c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo16229c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo16229c();
        return super.set(i, e);
    }
}
