package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;
import org.apache.p199a.p214d.C6354m;

/* renamed from: org.apache.a.f.d.ah */
/* compiled from: RFC2965VersionAttributeHandler */
public class C6448ah implements C6344c {
    /* renamed from: b */
    public boolean mo22585b(C6343b bVar, C6346e eVar) {
        return true;
    }

    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        int i;
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for version attribute");
        } else {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0) {
                throw new C6352k("Invalid cookie version.");
            }
            lVar.mo22604a(i);
        }
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if ((bVar instanceof C6354m) && (bVar instanceof C6342a) && !((C6342a) bVar).mo22574b("version")) {
            throw new C6348g("Violates RFC 2965. Version attribute is required.");
        }
    }
}
