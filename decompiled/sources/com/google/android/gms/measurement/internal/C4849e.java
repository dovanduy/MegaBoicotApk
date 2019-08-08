package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C4849e implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f15742a = this.f15743b.f15990a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzad f15743b;

    C4849e(zzad zzad) {
        this.f15743b = zzad;
    }

    public final boolean hasNext() {
        return this.f15742a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return (String) this.f15742a.next();
    }
}
