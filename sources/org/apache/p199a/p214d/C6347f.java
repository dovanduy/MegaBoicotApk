package org.apache.p199a.p214d;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: org.apache.a.d.f */
/* compiled from: CookiePathComparator */
public class C6347f implements Serializable, Comparator<C6343b> {
    /* renamed from: a */
    private String m25074a(C6343b bVar) {
        String d = bVar.mo22579d();
        if (d == null) {
            d = "/";
        }
        if (d.endsWith("/")) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append('/');
        return sb.toString();
    }

    /* renamed from: a */
    public int compare(C6343b bVar, C6343b bVar2) {
        String a = m25074a(bVar);
        String a2 = m25074a(bVar2);
        if (a.equals(a2)) {
            return 0;
        }
        if (a.startsWith(a2)) {
            return -1;
        }
        if (a2.startsWith(a)) {
            return 1;
        }
        return 0;
    }
}
