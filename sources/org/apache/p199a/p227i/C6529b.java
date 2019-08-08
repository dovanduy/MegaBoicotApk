package org.apache.p199a.p227i;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: org.apache.a.i.b */
/* compiled from: BasicHttpParams */
public class C6529b extends C6528a implements Serializable, Cloneable {

    /* renamed from: a */
    private final HashMap f21252a = new HashMap();

    /* renamed from: a */
    public Object mo22751a(String str) {
        return this.f21252a.get(str);
    }

    /* renamed from: a */
    public C6531d mo22752a(String str, Object obj) {
        this.f21252a.put(str, obj);
        return this;
    }

    public Object clone() throws CloneNotSupportedException {
        C6529b bVar = (C6529b) super.clone();
        mo23007a((C6531d) bVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23007a(C6531d dVar) {
        for (Entry entry : this.f21252a.entrySet()) {
            if (entry.getKey() instanceof String) {
                dVar.mo22752a((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
