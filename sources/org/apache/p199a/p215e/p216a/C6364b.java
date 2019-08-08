package org.apache.p199a.p215e.p216a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: org.apache.a.e.a.b */
/* compiled from: Header */
public class C6364b implements Iterable<C6369f> {

    /* renamed from: a */
    private final List<C6369f> f20896a = new LinkedList();

    /* renamed from: b */
    private final Map<String, List<C6369f>> f20897b = new HashMap();

    /* renamed from: a */
    public void mo22636a(C6369f fVar) {
        if (fVar != null) {
            String lowerCase = fVar.mo22644a().toLowerCase(Locale.US);
            List list = (List) this.f20897b.get(lowerCase);
            if (list == null) {
                list = new LinkedList();
                this.f20897b.put(lowerCase, list);
            }
            list.add(fVar);
            this.f20896a.add(fVar);
        }
    }

    /* renamed from: a */
    public C6369f mo22635a(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) this.f20897b.get(str.toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C6369f) list.get(0);
    }

    public Iterator<C6369f> iterator() {
        return Collections.unmodifiableList(this.f20896a).iterator();
    }

    public String toString() {
        return this.f20896a.toString();
    }
}
