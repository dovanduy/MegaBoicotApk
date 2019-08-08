package com.google.android.gms.internal.p148e;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.fe */
final class C4588fe implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f14968a;

    /* renamed from: b */
    private boolean f14969b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f14970c;

    /* renamed from: d */
    private final /* synthetic */ C4574ew f14971d;

    private C4588fe(C4574ew ewVar) {
        this.f14971d = ewVar;
        this.f14968a = -1;
    }

    public final boolean hasNext() {
        if (this.f14968a + 1 < this.f14971d.f14948b.size() || (!this.f14971d.f14949c.isEmpty() && m19777a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (!this.f14969b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f14969b = false;
        this.f14971d.m19744f();
        if (this.f14968a < this.f14971d.f14948b.size()) {
            C4574ew ewVar = this.f14971d;
            int i = this.f14968a;
            this.f14968a = i - 1;
            ewVar.m19741c(i);
            return;
        }
        m19777a().remove();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m19777a() {
        if (this.f14970c == null) {
            this.f14970c = this.f14971d.f14949c.entrySet().iterator();
        }
        return this.f14970c;
    }

    public final /* synthetic */ Object next() {
        this.f14969b = true;
        int i = this.f14968a + 1;
        this.f14968a = i;
        if (i < this.f14971d.f14948b.size()) {
            return (Entry) this.f14971d.f14948b.get(this.f14968a);
        }
        return (Entry) m19777a().next();
    }

    /* synthetic */ C4588fe(C4574ew ewVar, C4575ex exVar) {
        this(ewVar);
    }
}
