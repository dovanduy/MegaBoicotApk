package org.apache.p199a.p218f.p222d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6349h;

/* renamed from: org.apache.a.f.d.b */
/* compiled from: AbstractCookieSpec */
public abstract class C6449b implements C6349h {

    /* renamed from: a */
    private final Map<String, C6344c> f21106a = new HashMap(10);

    /* renamed from: a */
    public void mo22837a(String str, C6344c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Attribute name may not be null");
        } else if (cVar == null) {
            throw new IllegalArgumentException("Attribute handler may not be null");
        } else {
            this.f21106a.put(str, cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6344c mo22836a(String str) {
        return (C6344c) this.f21106a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<C6344c> mo22838c() {
        return this.f21106a.values();
    }
}
