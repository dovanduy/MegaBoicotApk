package org.apache.p199a.p218f.p222d;

import java.util.Collection;
import org.apache.p199a.p214d.C6349h;
import org.apache.p199a.p214d.C6350i;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.d.l */
/* compiled from: BestMatchSpecFactory */
public class C6459l implements C6350i {
    /* renamed from: a */
    public C6349h mo22601a(C6531d dVar) {
        if (dVar == null) {
            return new C6458k();
        }
        String[] strArr = null;
        Collection collection = (Collection) dVar.mo22751a("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C6458k(strArr, dVar.mo23002a("http.protocol.single-cookie-header", false));
    }
}
