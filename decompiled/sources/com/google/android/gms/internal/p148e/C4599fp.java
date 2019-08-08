package com.google.android.gms.internal.p148e;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.e.fp */
final class C4599fp implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f14982a = this.f14984c.f14981a.listIterator(this.f14983b);

    /* renamed from: b */
    private final /* synthetic */ int f14983b;

    /* renamed from: c */
    private final /* synthetic */ C4598fo f14984c;

    C4599fp(C4598fo foVar, int i) {
        this.f14984c = foVar;
        this.f14983b = i;
    }

    public final boolean hasNext() {
        return this.f14982a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f14982a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f14982a.nextIndex();
    }

    public final int previousIndex() {
        return this.f14982a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f14982a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f14982a.next();
    }
}
