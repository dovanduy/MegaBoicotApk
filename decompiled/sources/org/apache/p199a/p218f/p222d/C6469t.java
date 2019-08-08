package org.apache.p199a.p218f.p222d;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;

/* renamed from: org.apache.a.f.d.t */
/* compiled from: NetscapeDomainHandler */
public class C6469t extends C6453f {
    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        super.mo22583a(bVar, eVar);
        String a = eVar.mo22588a();
        String c = bVar.mo22578c();
        if (a.contains(".")) {
            int countTokens = new StringTokenizer(c, ".").countTokens();
            if (m25624a(c)) {
                if (countTokens < 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Domain attribute \"");
                    sb.append(c);
                    sb.append("\" violates the Netscape cookie specification for ");
                    sb.append("special domains");
                    throw new C6348g(sb.toString());
                }
            } else if (countTokens < 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Domain attribute \"");
                sb2.append(c);
                sb2.append("\" violates the Netscape cookie specification");
                throw new C6348g(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    private static boolean m25624a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
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
            if (c == null) {
                return false;
            }
            return a.endsWith(c);
        }
    }
}
