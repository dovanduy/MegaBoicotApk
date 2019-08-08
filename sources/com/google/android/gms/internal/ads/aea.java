package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class aea extends AbstractList<String> implements abu, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final abu f10596a;

    public aea(abu abu) {
        this.f10596a = abu;
    }

    /* renamed from: a */
    public final void mo14023a(C4386zw zwVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo14025b(int i) {
        return this.f10596a.mo14025b(i);
    }

    /* renamed from: d */
    public final List<?> mo14027d() {
        return this.f10596a.mo14027d();
    }

    /* renamed from: e */
    public final abu mo14028e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f10596a.get(i);
    }

    public final Iterator<String> iterator() {
        return new aec(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new aeb(this, i);
    }

    public final int size() {
        return this.f10596a.size();
    }
}
