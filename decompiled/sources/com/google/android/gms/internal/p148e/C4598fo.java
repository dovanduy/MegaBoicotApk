package com.google.android.gms.internal.p148e;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.fo */
public final class C4598fo extends AbstractList<String> implements C4536dl, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4536dl f14981a;

    public C4598fo(C4536dl dlVar) {
        this.f14981a = dlVar;
    }

    /* renamed from: e */
    public final C4536dl mo16650e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo16648b(int i) {
        return this.f14981a.mo16648b(i);
    }

    public final int size() {
        return this.f14981a.size();
    }

    /* renamed from: a */
    public final void mo16647a(C4469bj bjVar) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C4599fp(this, i);
    }

    public final Iterator<String> iterator() {
        return new C4600fq(this);
    }

    /* renamed from: d */
    public final List<?> mo16649d() {
        return this.f14981a.mo16649d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f14981a.get(i);
    }
}
