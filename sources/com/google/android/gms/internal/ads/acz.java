package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class acz<E> extends C4380zq<E> {

    /* renamed from: a */
    private static final acz<Object> f10520a;

    /* renamed from: b */
    private final List<E> f10521b;

    static {
        acz<Object> acz = new acz<>();
        f10520a = acz;
        acz.mo14007b();
    }

    acz() {
        this(new ArrayList(10));
    }

    private acz(List<E> list) {
        this.f10521b = list;
    }

    /* renamed from: d */
    public static <E> acz<E> m13515d() {
        return f10520a;
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f10521b);
        return new acz(arrayList);
    }

    public final void add(int i, E e) {
        mo16229c();
        this.f10521b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f10521b.get(i);
    }

    public final E remove(int i) {
        mo16229c();
        E remove = this.f10521b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo16229c();
        E e2 = this.f10521b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f10521b.size();
    }
}
