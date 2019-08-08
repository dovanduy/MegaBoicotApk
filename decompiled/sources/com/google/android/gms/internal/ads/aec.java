package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class aec implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f10600a = this.f10601b.f10596a.iterator();

    /* renamed from: b */
    private final /* synthetic */ aea f10601b;

    aec(aea aea) {
        this.f10601b = aea;
    }

    public final boolean hasNext() {
        return this.f10600a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f10600a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
