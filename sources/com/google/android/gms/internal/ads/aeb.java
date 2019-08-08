package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class aeb implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f10597a = this.f10599c.f10596a.listIterator(this.f10598b);

    /* renamed from: b */
    private final /* synthetic */ int f10598b;

    /* renamed from: c */
    private final /* synthetic */ aea f10599c;

    aeb(aea aea, int i) {
        this.f10599c = aea;
        this.f10598b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f10597a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f10597a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f10597a.next();
    }

    public final int nextIndex() {
        return this.f10597a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f10597a.previous();
    }

    public final int previousIndex() {
        return this.f10597a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
