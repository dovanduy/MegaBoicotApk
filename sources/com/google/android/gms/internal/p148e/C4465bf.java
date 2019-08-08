package com.google.android.gms.internal.p148e;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.bf */
abstract class C4465bf<E> extends AbstractList<E> implements C4525da<E> {

    /* renamed from: a */
    private boolean f14693a = true;

    C4465bf() {
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

    public boolean add(E e) {
        mo16373c();
        return super.add(e);
    }

    public void add(int i, E e) {
        mo16373c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo16373c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo16373c();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo16373c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo16367a() {
        return this.f14693a;
    }

    /* renamed from: b */
    public final void mo16372b() {
        this.f14693a = false;
    }

    public E remove(int i) {
        mo16373c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo16373c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo16373c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo16373c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo16373c();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16373c() {
        if (!this.f14693a) {
            throw new UnsupportedOperationException();
        }
    }
}
