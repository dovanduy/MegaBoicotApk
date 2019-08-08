package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class adk extends adq {

    /* renamed from: a */
    private final /* synthetic */ adh f10573a;

    private adk(adh adh) {
        this.f10573a = adh;
        super(adh, null);
    }

    /* synthetic */ adk(adh adh, adi adi) {
        this(adh);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new adj(this.f10573a, null);
    }
}
