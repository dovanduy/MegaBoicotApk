package org.apache.p199a.p218f.p220b;

import org.apache.p199a.C6341d;
import org.apache.p199a.C6560q;
import org.apache.p199a.p208c.C6332g;
import org.apache.p199a.p226h.C6509d;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b.g */
/* compiled from: DefaultConnectionKeepAliveStrategy */
public class C6408g implements C6332g {
    /* renamed from: a */
    public long mo22544a(C6560q qVar, C6539e eVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        C6509d dVar = new C6509d(qVar.mo22912d("Keep-Alive"));
        while (dVar.hasNext()) {
            C6341d a = dVar.mo22613a();
            String a2 = a.mo22569a();
            String b = a.mo22571b();
            if (b != null && a2.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(b) * 1000;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return -1;
    }
}
