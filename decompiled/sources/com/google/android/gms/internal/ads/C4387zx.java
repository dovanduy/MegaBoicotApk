package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.zx */
final class C4387zx implements Iterator {

    /* renamed from: a */
    private int f14368a = 0;

    /* renamed from: b */
    private final int f14369b = this.f14370c.mo13769a();

    /* renamed from: c */
    private final /* synthetic */ C4386zw f14370c;

    C4387zx(C4386zw zwVar) {
        this.f14370c = zwVar;
    }

    /* renamed from: a */
    private final byte m18779a() {
        try {
            C4386zw zwVar = this.f14370c;
            int i = this.f14368a;
            this.f14368a = i + 1;
            return zwVar.mo13768a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f14368a < this.f14369b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m18779a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
