package com.google.android.gms.internal.p148e;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.e.bk */
final class C4470bk extends C4472bm {

    /* renamed from: a */
    private int f14703a = 0;

    /* renamed from: b */
    private final int f14704b = this.f14705c.mo16389a();

    /* renamed from: c */
    private final /* synthetic */ C4469bj f14705c;

    C4470bk(C4469bj bjVar) {
        this.f14705c = bjVar;
    }

    public final boolean hasNext() {
        return this.f14703a < this.f14704b;
    }

    /* renamed from: a */
    public final byte mo16402a() {
        int i = this.f14703a;
        if (i >= this.f14704b) {
            throw new NoSuchElementException();
        }
        this.f14703a = i + 1;
        return this.f14705c.mo16394b(i);
    }
}
