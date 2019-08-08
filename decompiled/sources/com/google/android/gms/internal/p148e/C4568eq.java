package com.google.android.gms.internal.p148e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.e.eq */
final class C4568eq<E> extends C4465bf<E> {

    /* renamed from: a */
    private static final C4568eq<Object> f14937a;

    /* renamed from: b */
    private final List<E> f14938b;

    /* renamed from: d */
    public static <E> C4568eq<E> m19621d() {
        return f14937a;
    }

    C4568eq() {
        this(new ArrayList(10));
    }

    private C4568eq(List<E> list) {
        this.f14938b = list;
    }

    public final void add(int i, E e) {
        mo16373c();
        this.f14938b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f14938b.get(i);
    }

    public final E remove(int i) {
        mo16373c();
        E remove = this.f14938b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo16373c();
        E e2 = this.f14938b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f14938b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f14938b);
        return new C4568eq(arrayList);
    }

    static {
        C4568eq<Object> eqVar = new C4568eq<>();
        f14937a = eqVar;
        eqVar.mo16372b();
    }
}
