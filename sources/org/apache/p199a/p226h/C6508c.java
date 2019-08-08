package org.apache.p199a.p226h;

import org.apache.p199a.C6341d;
import org.apache.p199a.C6565v;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.h.c */
/* compiled from: BasicHeaderElement */
public class C6508c implements Cloneable, C6341d {

    /* renamed from: a */
    private final String f21208a;

    /* renamed from: b */
    private final String f21209b;

    /* renamed from: c */
    private final C6565v[] f21210c;

    public C6508c(String str, String str2, C6565v[] vVarArr) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f21208a = str;
        this.f21209b = str2;
        if (vVarArr != null) {
            this.f21210c = vVarArr;
        } else {
            this.f21210c = new C6565v[0];
        }
    }

    /* renamed from: a */
    public String mo22569a() {
        return this.f21208a;
    }

    /* renamed from: b */
    public String mo22571b() {
        return this.f21209b;
    }

    /* renamed from: c */
    public C6565v[] mo22572c() {
        return (C6565v[]) this.f21210c.clone();
    }

    /* renamed from: a */
    public C6565v mo22570a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        for (C6565v vVar : this.f21210c) {
            if (vVar.mo22961a().equalsIgnoreCase(str)) {
                return vVar;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6341d)) {
            return false;
        }
        C6508c cVar = (C6508c) obj;
        if (this.f21208a.equals(cVar.f21208a) && C6553f.m25968a((Object) this.f21209b, (Object) cVar.f21209b) && C6553f.m25969a((Object[]) this.f21210c, (Object[]) cVar.f21210c)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int a = C6553f.m25966a(C6553f.m25966a(17, (Object) this.f21208a), (Object) this.f21209b);
        for (C6565v a2 : this.f21210c) {
            a = C6553f.m25966a(a, (Object) a2);
        }
        return a;
    }

    public String toString() {
        C6549b bVar = new C6549b(64);
        bVar.mo23044a(this.f21208a);
        if (this.f21209b != null) {
            bVar.mo23044a("=");
            bVar.mo23044a(this.f21209b);
        }
        for (C6565v a : this.f21210c) {
            bVar.mo23044a("; ");
            bVar.mo23043a((Object) a);
        }
        return bVar.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
