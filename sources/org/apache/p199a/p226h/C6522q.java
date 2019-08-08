package org.apache.p199a.p226h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6376f;

/* renamed from: org.apache.a.h.q */
/* compiled from: HeaderGroup */
public class C6522q implements Serializable, Cloneable {

    /* renamed from: a */
    private final List f21248a = new ArrayList(16);

    /* renamed from: a */
    public void mo22984a() {
        this.f21248a.clear();
    }

    /* renamed from: a */
    public void mo22985a(C6301c cVar) {
        if (cVar != null) {
            this.f21248a.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo22989b(C6301c cVar) {
        if (cVar != null) {
            for (int i = 0; i < this.f21248a.size(); i++) {
                if (((C6301c) this.f21248a.get(i)).mo22465c().equalsIgnoreCase(cVar.mo22465c())) {
                    this.f21248a.set(i, cVar);
                    return;
                }
            }
            this.f21248a.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo22986a(C6301c[] cVarArr) {
        mo22984a();
        if (cVarArr != null) {
            for (C6301c add : cVarArr) {
                this.f21248a.add(add);
            }
        }
    }

    /* renamed from: a */
    public C6301c[] mo22987a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f21248a.size(); i++) {
            C6301c cVar = (C6301c) this.f21248a.get(i);
            if (cVar.mo22465c().equalsIgnoreCase(str)) {
                arrayList.add(cVar);
            }
        }
        return (C6301c[]) arrayList.toArray(new C6301c[arrayList.size()]);
    }

    /* renamed from: b */
    public C6301c mo22988b(String str) {
        for (int i = 0; i < this.f21248a.size(); i++) {
            C6301c cVar = (C6301c) this.f21248a.get(i);
            if (cVar.mo22465c().equalsIgnoreCase(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C6301c[] mo22990b() {
        return (C6301c[]) this.f21248a.toArray(new C6301c[this.f21248a.size()]);
    }

    /* renamed from: c */
    public boolean mo22992c(String str) {
        for (int i = 0; i < this.f21248a.size(); i++) {
            if (((C6301c) this.f21248a.get(i)).mo22465c().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C6376f mo22991c() {
        return new C6516k(this.f21248a, null);
    }

    /* renamed from: d */
    public C6376f mo22994d(String str) {
        return new C6516k(this.f21248a, str);
    }

    public Object clone() throws CloneNotSupportedException {
        C6522q qVar = (C6522q) super.clone();
        qVar.f21248a.clear();
        qVar.f21248a.addAll(this.f21248a);
        return qVar;
    }

    public String toString() {
        return this.f21248a.toString();
    }
}
