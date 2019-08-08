package org.apache.p199a.p218f.p220b;

import org.apache.p199a.C6559p;
import org.apache.p199a.C6562s;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6569z;
import org.apache.p199a.p202b.p206d.C6280a;
import org.apache.p199a.p202b.p206d.C6281b;
import org.apache.p199a.p202b.p206d.C6282c;
import org.apache.p199a.p202b.p206d.C6283d;
import org.apache.p199a.p202b.p206d.C6284e;
import org.apache.p199a.p202b.p206d.C6285f;
import org.apache.p199a.p202b.p206d.C6286g;
import org.apache.p199a.p202b.p206d.C6287h;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;
import org.apache.p199a.p227i.C6533f;
import org.apache.p199a.p228j.C6536b;
import org.apache.p199a.p228j.C6543i;
import org.apache.p199a.p228j.C6544j;
import org.apache.p199a.p228j.C6545k;
import org.apache.p199a.p228j.C6546l;
import org.apache.p199a.p229k.C6554g;

/* renamed from: org.apache.a.f.b.h */
/* compiled from: DefaultHttpClient */
public class C6409h extends C6403b {
    public C6409h(C6531d dVar) {
        super(null, dVar);
    }

    public C6409h() {
        super(null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6531d mo22723b() {
        C6533f fVar = new C6533f();
        m25372a(fVar);
        return fVar;
    }

    /* renamed from: a */
    public static void m25372a(C6531d dVar) {
        C6532e.m25881a(dVar, (C6569z) C6563t.f21278c);
        C6532e.m25880a(dVar, "ISO-8859-1");
        C6530c.m25862a(dVar, true);
        C6530c.m25863b(dVar, 8192);
        C6554g a = C6554g.m25970a("org.apache.http.client", C6409h.class.getClassLoader());
        String a2 = a != null ? a.mo23056a() : "UNAVAILABLE";
        StringBuilder sb = new StringBuilder();
        sb.append("Apache-HttpClient/");
        sb.append(a2);
        sb.append(" (java 1.5)");
        C6532e.m25883b(dVar, sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6536b mo22724c() {
        C6536b bVar = new C6536b();
        bVar.mo23016b((C6559p) new C6283d());
        bVar.mo23016b((C6559p) new C6543i());
        bVar.mo23016b((C6559p) new C6545k());
        bVar.mo23016b((C6559p) new C6282c());
        bVar.mo23016b((C6559p) new C6546l());
        bVar.mo23016b((C6559p) new C6544j());
        bVar.mo23016b((C6559p) new C6280a());
        bVar.mo23017b((C6562s) new C6287h());
        bVar.mo23016b((C6559p) new C6281b());
        bVar.mo23017b((C6562s) new C6286g());
        bVar.mo23016b((C6559p) new C6285f());
        bVar.mo23016b((C6559p) new C6284e());
        return bVar;
    }
}
