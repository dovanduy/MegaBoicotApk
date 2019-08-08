package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.i */
/* compiled from: BasicPathHandler */
public class C6456i implements C6344c {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null || str.trim().length() == 0) {
            str = "/";
        }
        lVar.mo22609e(str);
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (!mo22585b(bVar, eVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal path attribute \"");
            sb.append(bVar.mo22579d());
            sb.append("\". Path of origin: \"");
            sb.append(eVar.mo22589b());
            sb.append("\"");
            throw new C6348g(sb.toString());
        }
    }

    /* renamed from: b */
    public boolean mo22585b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            String b = eVar.mo22589b();
            String d = bVar.mo22579d();
            if (d == null) {
                d = "/";
            }
            if (d.length() > 1 && d.endsWith("/")) {
                d = d.substring(0, d.length() - 1);
            }
            boolean startsWith = b.startsWith(d);
            if (!startsWith || b.length() == d.length() || d.endsWith("/")) {
                return startsWith;
            }
            return b.charAt(d.length()) == '/';
        }
    }
}
