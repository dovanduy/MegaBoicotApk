package org.apache.p199a.p214d;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: org.apache.a.d.d */
/* compiled from: CookieIdentityComparator */
public class C6345d implements Serializable, Comparator<C6343b> {
    /* renamed from: a */
    public int compare(C6343b bVar, C6343b bVar2) {
        int compareTo = bVar.mo22575a().compareTo(bVar2.mo22575a());
        if (compareTo == 0) {
            String c = bVar.mo22578c();
            if (c == null) {
                c = "";
            } else if (c.indexOf(46) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(".local");
                c = sb.toString();
            }
            String c2 = bVar2.mo22578c();
            if (c2 == null) {
                c2 = "";
            } else if (c2.indexOf(46) == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2);
                sb2.append(".local");
                c2 = sb2.toString();
            }
            compareTo = c.compareToIgnoreCase(c2);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String d = bVar.mo22579d();
        if (d == null) {
            d = "/";
        }
        String d2 = bVar2.mo22579d();
        if (d2 == null) {
            d2 = "/";
        }
        return d.compareTo(d2);
    }
}
