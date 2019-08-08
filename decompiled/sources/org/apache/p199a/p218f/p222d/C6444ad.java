package org.apache.p199a.p218f.p222d;

import java.util.Locale;
import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.ad */
/* compiled from: RFC2965DomainAttributeHandler */
public class C6444ad implements C6344c {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for domain attribute");
        } else if (str.trim().length() == 0) {
            throw new C6352k("Blank value for domain attribute");
        } else {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append('.');
                sb.append(lowerCase);
                lowerCase = sb.toString();
            }
            lVar.mo22608d(lowerCase);
        }
    }

    /* renamed from: a */
    public boolean mo22832a(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            String lowerCase = eVar.mo22588a().toLowerCase(Locale.ENGLISH);
            if (bVar.mo22578c() == null) {
                throw new C6348g("Invalid cookie state: domain not specified");
            }
            String lowerCase2 = bVar.mo22578c().toLowerCase(Locale.ENGLISH);
            if (!(bVar instanceof C6342a) || !((C6342a) bVar).mo22574b("domain")) {
                if (!bVar.mo22578c().equals(lowerCase)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Illegal domain attribute: \"");
                    sb.append(bVar.mo22578c());
                    sb.append("\".");
                    sb.append("Domain of origin: \"");
                    sb.append(lowerCase);
                    sb.append("\"");
                    throw new C6348g(sb.toString());
                }
            } else if (!lowerCase2.startsWith(".")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Domain attribute \"");
                sb2.append(bVar.mo22578c());
                sb2.append("\" violates RFC 2109: domain must start with a dot");
                throw new C6348g(sb2.toString());
            } else {
                int indexOf = lowerCase2.indexOf(46, 1);
                if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Domain attribute \"");
                    sb3.append(bVar.mo22578c());
                    sb3.append("\" violates RFC 2965: the value contains no embedded dots ");
                    sb3.append("and the value is not .local");
                    throw new C6348g(sb3.toString());
                } else if (!mo22832a(lowerCase, lowerCase2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Domain attribute \"");
                    sb4.append(bVar.mo22578c());
                    sb4.append("\" violates RFC 2965: effective host name does not ");
                    sb4.append("domain-match domain attribute.");
                    throw new C6348g(sb4.toString());
                } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Domain attribute \"");
                    sb5.append(bVar.mo22578c());
                    sb5.append("\" violates RFC 2965: ");
                    sb5.append("effective host minus domain may not contain any dots");
                    throw new C6348g(sb5.toString());
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
            String lowerCase = eVar.mo22588a().toLowerCase(Locale.ENGLISH);
            String c = bVar.mo22578c();
            boolean z = false;
            if (!mo22832a(lowerCase, c)) {
                return false;
            }
            if (lowerCase.substring(0, lowerCase.length() - c.length()).indexOf(46) == -1) {
                z = true;
            }
            return z;
        }
    }
}
