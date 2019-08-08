package org.apache.p199a.p218f.p220b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import org.apache.p199a.p202b.C6288e;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6345d;

/* renamed from: org.apache.a.f.b.d */
/* compiled from: BasicCookieStore */
public class C6405d implements Serializable, C6288e {

    /* renamed from: a */
    private final TreeSet<C6343b> f21012a = new TreeSet<>(new C6345d());

    /* renamed from: a */
    public synchronized void mo22456a(C6343b bVar) {
        if (bVar != null) {
            this.f21012a.remove(bVar);
            if (!bVar.mo22576a(new Date())) {
                this.f21012a.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized List<C6343b> mo22455a() {
        return new ArrayList(this.f21012a);
    }

    public synchronized String toString() {
        return this.f21012a.toString();
    }
}
