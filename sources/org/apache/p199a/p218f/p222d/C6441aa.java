package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.aa */
/* compiled from: RFC2109VersionHandler */
public class C6441aa extends C6440a {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for version attribute");
        } else if (str.trim().length() == 0) {
            throw new C6352k("Blank value for version attribute");
        } else {
            try {
                lVar.mo22604a(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid version: ");
                sb.append(e.getMessage());
                throw new C6352k(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (bVar.mo22582g() < 0) {
            throw new C6348g("Cookie version may not be negative");
        }
    }
}
