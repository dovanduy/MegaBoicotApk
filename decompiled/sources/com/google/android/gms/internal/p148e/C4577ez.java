package com.google.android.gms.internal.p148e;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ez */
final class C4577ez extends C4589ff {

    /* renamed from: a */
    private final /* synthetic */ C4574ew f14957a;

    private C4577ez(C4574ew ewVar) {
        this.f14957a = ewVar;
        super(ewVar, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C4576ey(this.f14957a, null);
    }

    /* synthetic */ C4577ez(C4574ew ewVar, C4575ex exVar) {
        this(ewVar);
    }
}
