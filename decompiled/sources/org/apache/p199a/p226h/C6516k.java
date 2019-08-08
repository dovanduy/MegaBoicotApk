package org.apache.p199a.p226h;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6376f;

/* renamed from: org.apache.a.h.k */
/* compiled from: BasicListHeaderIterator */
public class C6516k implements C6376f {

    /* renamed from: a */
    protected final List f21229a;

    /* renamed from: b */
    protected int f21230b;

    /* renamed from: c */
    protected int f21231c;

    /* renamed from: d */
    protected String f21232d;

    public C6516k(List list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Header list must not be null.");
        }
        this.f21229a = list;
        this.f21232d = str;
        this.f21230b = mo22957a(-1);
        this.f21231c = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22957a(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f21229a.size() - 1;
        boolean z = false;
        while (!z && i < size) {
            i++;
            z = mo22958b(i);
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo22958b(int i) {
        if (this.f21232d == null) {
            return true;
        }
        return this.f21232d.equalsIgnoreCase(((C6301c) this.f21229a.get(i)).mo22465c());
    }

    public boolean hasNext() {
        return this.f21230b >= 0;
    }

    /* renamed from: a */
    public C6301c mo22657a() throws NoSuchElementException {
        int i = this.f21230b;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f21231c = i;
        this.f21230b = mo22957a(i);
        return (C6301c) this.f21229a.get(i);
    }

    public final Object next() throws NoSuchElementException {
        return mo22657a();
    }

    public void remove() throws UnsupportedOperationException {
        if (this.f21231c < 0) {
            throw new IllegalStateException("No header to remove.");
        }
        this.f21229a.remove(this.f21231c);
        this.f21231c = -1;
        this.f21230b--;
    }
}
