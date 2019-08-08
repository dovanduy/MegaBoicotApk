package org.apache.p199a.p218f.p222d;

import java.util.Locale;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.x */
/* compiled from: RFC2109DomainHandler */
public class C6473x implements C6344c {
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
            } else if (c.equals(a)) {
            } else {
                if (c.indexOf(46) == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Domain attribute \"");
                    sb.append(c);
                    sb.append("\" does not match the host \"");
                    sb.append(a);
                    sb.append("\"");
                    throw new C6348g(sb.toString());
                } else if (!c.startsWith(".")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Domain attribute \"");
                    sb2.append(c);
                    sb2.append("\" violates RFC 2109: domain must start with a dot");
                    throw new C6348g(sb2.toString());
                } else {
                    int indexOf = c.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == c.length() - 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Domain attribute \"");
                        sb3.append(c);
                        sb3.append("\" violates RFC 2109: domain must contain an embedded dot");
                        throw new C6348g(sb3.toString());
                    }
                    String lowerCase = a.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(c)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Illegal domain attribute \"");
                        sb4.append(c);
                        sb4.append("\". Domain of origin: \"");
                        sb4.append(lowerCase);
                        sb4.append("\"");
                        throw new C6348g(sb4.toString());
                    } else if (lowerCase.substring(0, lowerCase.length() - c.length()).indexOf(46) != -1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Domain attribute \"");
                        sb5.append(c);
                        sb5.append("\" violates RFC 2109: host minus domain may not contain any dots");
                        throw new C6348g(sb5.toString());
                    }
                }
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
            if (a.equals(c) || (c.startsWith(".") && a.endsWith(c))) {
                z = true;
            }
            return z;
        }
    }
}
