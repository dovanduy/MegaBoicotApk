package com.google.android.gms.internal.p148e;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.di */
final class C4533di<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f14884a;

    public C4533di(Iterator<Entry<K, Object>> it) {
        this.f14884a = it;
    }

    public final boolean hasNext() {
        return this.f14884a.hasNext();
    }

    public final void remove() {
        this.f14884a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f14884a.next();
        return entry.getValue() instanceof C4529de ? new C4532dh(entry) : entry;
    }
}
