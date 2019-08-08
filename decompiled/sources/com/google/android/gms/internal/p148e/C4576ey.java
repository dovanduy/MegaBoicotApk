package com.google.android.gms.internal.p148e;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.ey */
final class C4576ey implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f14954a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f14955b;

    /* renamed from: c */
    private final /* synthetic */ C4574ew f14956c;

    private C4576ey(C4574ew ewVar) {
        this.f14956c = ewVar;
        this.f14954a = this.f14956c.f14948b.size();
    }

    public final boolean hasNext() {
        return (this.f14954a > 0 && this.f14954a <= this.f14956c.f14948b.size()) || m19754a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m19754a() {
        if (this.f14955b == null) {
            this.f14955b = this.f14956c.f14952f.entrySet().iterator();
        }
        return this.f14955b;
    }

    public final /* synthetic */ Object next() {
        if (m19754a().hasNext()) {
            return (Entry) m19754a().next();
        }
        List b = this.f14956c.f14948b;
        int i = this.f14954a - 1;
        this.f14954a = i;
        return (Entry) b.get(i);
    }

    /* synthetic */ C4576ey(C4574ew ewVar, C4575ex exVar) {
        this(ewVar);
    }
}
