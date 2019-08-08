package org.apache.p199a.p226h;

import java.io.Serializable;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6567x;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.b */
/* compiled from: BasicHeader */
public class C6507b implements Serializable, Cloneable, C6301c {

    /* renamed from: a */
    private final String f21206a;

    /* renamed from: b */
    private final String f21207b;

    public C6507b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f21206a = str;
        this.f21207b = str2;
    }

    /* renamed from: c */
    public String mo22465c() {
        return this.f21206a;
    }

    /* renamed from: d */
    public String mo22466d() {
        return this.f21207b;
    }

    public String toString() {
        return C6514i.f21226a.mo22945a((C6549b) null, (C6301c) this).toString();
    }

    /* renamed from: e */
    public C6341d[] mo22467e() throws C6567x {
        if (this.f21207b != null) {
            return C6511f.m25765a(this.f21207b, (C6523r) null);
        }
        return new C6341d[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
