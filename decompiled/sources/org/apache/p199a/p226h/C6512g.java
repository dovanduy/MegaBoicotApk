package org.apache.p199a.p226h;

import org.apache.p199a.C6262ab;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6569z;
import org.apache.p199a.p227i.C6532e;

/* renamed from: org.apache.a.h.g */
/* compiled from: BasicHttpRequest */
public class C6512g extends C6506a implements C6558o {

    /* renamed from: c */
    private final String f21219c;

    /* renamed from: d */
    private final String f21220d;

    /* renamed from: e */
    private C6262ab f21221e;

    public C6512g(String str, String str2, C6569z zVar) {
        this(new C6518m(str, str2, zVar));
    }

    public C6512g(C6262ab abVar) {
        if (abVar == null) {
            throw new IllegalArgumentException("Request line may not be null");
        }
        this.f21221e = abVar;
        this.f21219c = abVar.mo22426a();
        this.f21220d = abVar.mo22428c();
    }

    /* renamed from: c */
    public C6569z mo22450c() {
        return mo22451g().mo22427b();
    }

    /* renamed from: g */
    public C6262ab mo22451g() {
        if (this.f21221e == null) {
            this.f21221e = new C6518m(this.f21219c, this.f21220d, C6532e.m25882b(mo22915f()));
        }
        return this.f21221e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f21219c);
        stringBuffer.append(" ");
        stringBuffer.append(this.f21220d);
        stringBuffer.append(" ");
        stringBuffer.append(this.f21204a);
        return stringBuffer.toString();
    }
}
