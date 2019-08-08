package org.apache.p199a.p226h;

import java.io.Serializable;
import org.apache.p199a.C6262ab;
import org.apache.p199a.C6569z;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.m */
/* compiled from: BasicRequestLine */
public class C6518m implements Serializable, Cloneable, C6262ab {

    /* renamed from: a */
    private final C6569z f21235a;

    /* renamed from: b */
    private final String f21236b;

    /* renamed from: c */
    private final String f21237c;

    public C6518m(String str, String str2, C6569z zVar) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        } else if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        } else if (zVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else {
            this.f21236b = str;
            this.f21237c = str2;
            this.f21235a = zVar;
        }
    }

    /* renamed from: a */
    public String mo22426a() {
        return this.f21236b;
    }

    /* renamed from: b */
    public C6569z mo22427b() {
        return this.f21235a;
    }

    /* renamed from: c */
    public String mo22428c() {
        return this.f21237c;
    }

    public String toString() {
        return C6514i.f21226a.mo22943a((C6549b) null, (C6262ab) this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
