package com.google.android.gms.internal.p148e;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.e.fq */
final class C4600fq implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f14985a = this.f14986b.f14981a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C4598fo f14986b;

    C4600fq(C4598fo foVar) {
        this.f14986b = foVar;
    }

    public final boolean hasNext() {
        return this.f14985a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f14985a.next();
    }
}
