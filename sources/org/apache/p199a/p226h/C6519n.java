package org.apache.p199a.p226h;

import java.io.Serializable;
import org.apache.p199a.C6263ac;
import org.apache.p199a.C6569z;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.n */
/* compiled from: BasicStatusLine */
public class C6519n implements Serializable, Cloneable, C6263ac {

    /* renamed from: a */
    private final C6569z f21238a;

    /* renamed from: b */
    private final int f21239b;

    /* renamed from: c */
    private final String f21240c;

    public C6519n(C6569z zVar, int i, String str) {
        if (zVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Status code may not be negative.");
        } else {
            this.f21238a = zVar;
            this.f21239b = i;
            this.f21240c = str;
        }
    }

    /* renamed from: b */
    public int mo22430b() {
        return this.f21239b;
    }

    /* renamed from: a */
    public C6569z mo22429a() {
        return this.f21238a;
    }

    /* renamed from: c */
    public String mo22431c() {
        return this.f21240c;
    }

    public String toString() {
        return C6514i.f21226a.mo22944a((C6549b) null, (C6263ac) this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
