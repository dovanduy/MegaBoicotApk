package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class abr<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f10461a;

    public abr(Iterator<Entry<K, Object>> it) {
        this.f10461a = it;
    }

    public final boolean hasNext() {
        return this.f10461a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f10461a.next();
        return entry.getValue() instanceof abn ? new abp(entry) : entry;
    }

    public final void remove() {
        this.f10461a.remove();
    }
}
