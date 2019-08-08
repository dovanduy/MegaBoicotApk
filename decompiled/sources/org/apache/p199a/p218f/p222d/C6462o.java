package org.apache.p199a.p218f.p222d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6565v;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.o */
/* compiled from: CookieSpecBase */
public abstract class C6462o extends C6449b {
    /* renamed from: a */
    protected static String m25610a(C6346e eVar) {
        String b = eVar.mo22589b();
        int lastIndexOf = b.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return b;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return b.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    protected static String m25611b(C6346e eVar) {
        return eVar.mo22588a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C6343b> mo22833a(C6341d[] dVarArr, C6346e eVar) throws C6352k {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C6341d dVar : dVarArr) {
            String a = dVar.mo22569a();
            String b = dVar.mo22571b();
            if (a == null || a.length() == 0) {
                throw new C6352k("Cookie name may not be empty");
            }
            C6450c cVar = new C6450c(a, b);
            cVar.mo22609e(m25610a(eVar));
            cVar.mo22608d(m25611b(eVar));
            C6565v[] c = dVar.mo22572c();
            for (int length = c.length - 1; length >= 0; length--) {
                C6565v vVar = c[length];
                String lowerCase = vVar.mo22961a().toLowerCase(Locale.ENGLISH);
                cVar.mo22839a(lowerCase, vVar.mo22962b());
                C6344c a2 = mo22836a(lowerCase);
                if (a2 != null) {
                    a2.mo22584a((C6353l) cVar, vVar.mo22962b());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo22598a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            for (C6344c a : mo22838c()) {
                a.mo22583a(bVar, eVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo22600b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            for (C6344c b : mo22838c()) {
                if (!b.mo22585b(bVar, eVar)) {
                    return false;
                }
            }
            return true;
        }
    }
}
