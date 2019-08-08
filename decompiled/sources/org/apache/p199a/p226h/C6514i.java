package org.apache.p199a.p226h;

import org.apache.p199a.C6262ab;
import org.apache.p199a.C6263ac;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6569z;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.i */
/* compiled from: BasicLineFormatter */
public class C6514i implements C6524s {

    /* renamed from: a */
    public static final C6514i f21226a = new C6514i();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6549b mo22942a(C6549b bVar) {
        if (bVar == null) {
            return new C6549b(64);
        }
        bVar.mo23041a();
        return bVar;
    }

    /* renamed from: a */
    public C6549b mo22946a(C6549b bVar, C6569z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null");
        }
        int a = mo22941a(zVar);
        if (bVar == null) {
            bVar = new C6549b(a);
        } else {
            bVar.mo23050b(a);
        }
        bVar.mo23044a(zVar.mo23068a());
        bVar.mo23042a('/');
        bVar.mo23044a(Integer.toString(zVar.mo23070b()));
        bVar.mo23042a('.');
        bVar.mo23044a(Integer.toString(zVar.mo23072c()));
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22941a(C6569z zVar) {
        return zVar.mo23068a().length() + 4;
    }

    /* renamed from: a */
    public C6549b mo22943a(C6549b bVar, C6262ab abVar) {
        if (abVar == null) {
            throw new IllegalArgumentException("Request line may not be null");
        }
        C6549b a = mo22942a(bVar);
        mo22947b(a, abVar);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22947b(C6549b bVar, C6262ab abVar) {
        String a = abVar.mo22426a();
        String c = abVar.mo22428c();
        bVar.mo23050b(a.length() + 1 + c.length() + 1 + mo22941a(abVar.mo22427b()));
        bVar.mo23044a(a);
        bVar.mo23042a(' ');
        bVar.mo23044a(c);
        bVar.mo23042a(' ');
        mo22946a(bVar, abVar.mo22427b());
    }

    /* renamed from: a */
    public C6549b mo22944a(C6549b bVar, C6263ac acVar) {
        if (acVar == null) {
            throw new IllegalArgumentException("Status line may not be null");
        }
        C6549b a = mo22942a(bVar);
        mo22948b(a, acVar);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22948b(C6549b bVar, C6263ac acVar) {
        int a = mo22941a(acVar.mo22429a()) + 1 + 3 + 1;
        String c = acVar.mo22431c();
        if (c != null) {
            a += c.length();
        }
        bVar.mo23050b(a);
        mo22946a(bVar, acVar.mo22429a());
        bVar.mo23042a(' ');
        bVar.mo23044a(Integer.toString(acVar.mo22430b()));
        bVar.mo23042a(' ');
        if (c != null) {
            bVar.mo23044a(c);
        }
    }

    /* renamed from: a */
    public C6549b mo22945a(C6549b bVar, C6301c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cVar instanceof C6266b) {
            return ((C6266b) cVar).mo22434a();
        } else {
            C6549b a = mo22942a(bVar);
            mo22949b(a, cVar);
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22949b(C6549b bVar, C6301c cVar) {
        String c = cVar.mo22465c();
        String d = cVar.mo22466d();
        int length = c.length() + 2;
        if (d != null) {
            length += d.length();
        }
        bVar.mo23050b(length);
        bVar.mo23044a(c);
        bVar.mo23044a(": ");
        if (d != null) {
            bVar.mo23044a(d);
        }
    }
}
