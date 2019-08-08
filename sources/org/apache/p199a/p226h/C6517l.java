package org.apache.p199a.p226h;

import java.io.Serializable;
import org.apache.p199a.C6565v;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.h.l */
/* compiled from: BasicNameValuePair */
public class C6517l implements Serializable, Cloneable, C6565v {

    /* renamed from: a */
    private final String f21233a;

    /* renamed from: b */
    private final String f21234b;

    public C6517l(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f21233a = str;
        this.f21234b = str2;
    }

    /* renamed from: a */
    public String mo22961a() {
        return this.f21233a;
    }

    /* renamed from: b */
    public String mo22962b() {
        return this.f21234b;
    }

    public String toString() {
        if (this.f21234b == null) {
            return this.f21233a;
        }
        C6549b bVar = new C6549b(this.f21233a.length() + 1 + this.f21234b.length());
        bVar.mo23044a(this.f21233a);
        bVar.mo23044a("=");
        bVar.mo23044a(this.f21234b);
        return bVar.toString();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6565v)) {
            return false;
        }
        C6517l lVar = (C6517l) obj;
        if (this.f21233a.equals(lVar.f21233a) && C6553f.m25968a((Object) this.f21234b, (Object) lVar.f21234b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C6553f.m25966a(C6553f.m25966a(17, (Object) this.f21233a), (Object) this.f21234b);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
