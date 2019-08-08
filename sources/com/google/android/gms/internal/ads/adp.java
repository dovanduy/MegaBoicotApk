package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class adp implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f10579a;

    /* renamed from: b */
    private boolean f10580b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f10581c;

    /* renamed from: d */
    private final /* synthetic */ adh f10582d;

    private adp(adh adh) {
        this.f10582d = adh;
        this.f10579a = -1;
    }

    /* synthetic */ adp(adh adh, adi adi) {
        this(adh);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m13691a() {
        if (this.f10581c == null) {
            this.f10581c = this.f10582d.f10565c.entrySet().iterator();
        }
        return this.f10581c;
    }

    public final boolean hasNext() {
        if (this.f10579a + 1 >= this.f10582d.f10564b.size()) {
            return !this.f10582d.f10565c.isEmpty() && m13691a().hasNext();
        }
        return true;
    }

    public final /* synthetic */ Object next() {
        this.f10580b = true;
        int i = this.f10579a + 1;
        this.f10579a = i;
        return (Entry) (i < this.f10582d.f10564b.size() ? this.f10582d.f10564b.get(this.f10579a) : m13691a().next());
    }

    public final void remove() {
        if (!this.f10580b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f10580b = false;
        this.f10582d.m13677f();
        if (this.f10579a < this.f10582d.f10564b.size()) {
            adh adh = this.f10582d;
            int i = this.f10579a;
            this.f10579a = i - 1;
            adh.m13674c(i);
            return;
        }
        m13691a().remove();
    }
}
