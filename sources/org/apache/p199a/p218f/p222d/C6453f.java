package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.f */
/* compiled from: BasicDomainHandler */
public class C6453f implements C6344c {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for domain attribute");
        } else if (str.trim().length() == 0) {
            throw new C6352k("Blank value for domain attribute");
        } else {
            lVar.mo22608d(str);
        }
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            String a = eVar.mo22588a();
            String c = bVar.mo22578c();
            if (c == null) {
                throw new C6348g("Cookie domain may not be null");
            } else if (a.contains(".")) {
                if (!a.endsWith(c)) {
                    if (c.startsWith(".")) {
                        c = c.substring(1, c.length());
                    }
                    if (!a.equals(c)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal domain attribute \"");
                        sb.append(c);
                        sb.append("\". Domain of origin: \"");
                        sb.append(a);
                        sb.append("\"");
                        throw new C6348g(sb.toString());
                    }
                }
            } else if (!a.equals(c)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Illegal domain attribute \"");
                sb2.append(c);
                sb2.append("\". Domain of origin: \"");
                sb2.append(a);
                sb2.append("\"");
                throw new C6348g(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    public boolean mo22585b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            String a = eVar.mo22588a();
            String c = bVar.mo22578c();
            boolean z = false;
            if (c == null) {
                return false;
            }
            if (a.equals(c)) {
                return true;
            }
            if (!c.startsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append('.');
                sb.append(c);
                c = sb.toString();
            }
            if (a.endsWith(c) || a.equals(c.substring(1))) {
                z = true;
            }
            return z;
        }
    }
}
