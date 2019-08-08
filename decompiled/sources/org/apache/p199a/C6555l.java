package org.apache.p199a;

import java.io.Serializable;
import java.util.Locale;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.l */
/* compiled from: HttpHost */
public final class C6555l implements Serializable, Cloneable {

    /* renamed from: a */
    protected final String f21272a;

    /* renamed from: b */
    protected final String f21273b;

    /* renamed from: c */
    protected final int f21274c;

    /* renamed from: d */
    protected final String f21275d;

    public C6555l(String str, int i, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Host name may not be null");
        }
        this.f21272a = str;
        this.f21273b = str.toLowerCase(Locale.ENGLISH);
        if (str2 != null) {
            this.f21275d = str2.toLowerCase(Locale.ENGLISH);
        } else {
            this.f21275d = "http";
        }
        this.f21274c = i;
    }

    public C6555l(String str, int i) {
        this(str, i, null);
    }

    /* renamed from: a */
    public String mo23058a() {
        return this.f21272a;
    }

    /* renamed from: b */
    public int mo23059b() {
        return this.f21274c;
    }

    /* renamed from: c */
    public String mo23060c() {
        return this.f21275d;
    }

    /* renamed from: d */
    public String mo23062d() {
        C6549b bVar = new C6549b(32);
        bVar.mo23044a(this.f21275d);
        bVar.mo23044a("://");
        bVar.mo23044a(this.f21272a);
        if (this.f21274c != -1) {
            bVar.mo23042a(':');
            bVar.mo23044a(Integer.toString(this.f21274c));
        }
        return bVar.toString();
    }

    /* renamed from: e */
    public String mo23063e() {
        if (this.f21274c == -1) {
            return this.f21272a;
        }
        C6549b bVar = new C6549b(this.f21272a.length() + 6);
        bVar.mo23044a(this.f21272a);
        bVar.mo23044a(":");
        bVar.mo23044a(Integer.toString(this.f21274c));
        return bVar.toString();
    }

    public String toString() {
        return mo23062d();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6555l)) {
            return false;
        }
        C6555l lVar = (C6555l) obj;
        if (this.f21273b.equals(lVar.f21273b) && this.f21274c == lVar.f21274c && this.f21275d.equals(lVar.f21275d)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C6553f.m25966a(C6553f.m25965a(C6553f.m25966a(17, (Object) this.f21273b), this.f21274c), (Object) this.f21275d);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
