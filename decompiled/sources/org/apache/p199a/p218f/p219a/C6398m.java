package org.apache.p199a.p218f.p219a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.p199a.C6341d;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p226h.C6511f;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.a.m */
/* compiled from: RFC2617Scheme */
public abstract class C6398m extends C6378a {

    /* renamed from: a */
    private Map<String, String> f20990a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22676a(C6549b bVar, int i, int i2) throws C6258j {
        C6341d[] a = C6511f.f21217a.mo22932a(bVar, new C6526u(i, bVar.mo23052c()));
        if (a.length == 0) {
            throw new C6258j("Authentication challenge is empty");
        }
        this.f20990a = new HashMap(a.length);
        for (C6341d dVar : a) {
            this.f20990a.put(dVar.mo22569a(), dVar.mo22571b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Map<String, String> mo22707g() {
        if (this.f20990a == null) {
            this.f20990a = new HashMap();
        }
        return this.f20990a;
    }

    /* renamed from: a */
    public String mo22706a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter name may not be null");
        } else if (this.f20990a == null) {
            return null;
        } else {
            return (String) this.f20990a.get(str.toLowerCase(Locale.ENGLISH));
        }
    }

    /* renamed from: b */
    public String mo22392b() {
        return mo22706a("realm");
    }
}
