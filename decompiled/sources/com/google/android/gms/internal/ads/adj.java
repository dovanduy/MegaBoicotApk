package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class adj implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f10570a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f10571b;

    /* renamed from: c */
    private final /* synthetic */ adh f10572c;

    private adj(adh adh) {
        this.f10572c = adh;
        this.f10570a = this.f10572c.f10564b.size();
    }

    /* synthetic */ adj(adh adh, adi adi) {
        this(adh);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m13687a() {
        if (this.f10571b == null) {
            this.f10571b = this.f10572c.f10568f.entrySet().iterator();
        }
        return this.f10571b;
    }

    public final boolean hasNext() {
        return (this.f10570a > 0 && this.f10570a <= this.f10572c.f10564b.size()) || m13687a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m13687a().hasNext()) {
            obj = m13687a().next();
        } else {
            List b = this.f10572c.f10564b;
            int i = this.f10570a - 1;
            this.f10570a = i;
            obj = b.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
