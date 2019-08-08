package org.apache.p199a.p218f.p222d;

import java.util.StringTokenizer;
import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;
import org.apache.p199a.p214d.C6354m;

/* renamed from: org.apache.a.f.d.ae */
/* compiled from: RFC2965PortAttributeHandler */
public class C6445ae implements C6344c {
    /* renamed from: a */
    private static int[] m25542a(String str) throws C6352k {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] < 0) {
                    throw new C6352k("Invalid Port attribute.");
                }
                i++;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Port attribute: ");
                sb.append(e.getMessage());
                throw new C6352k(sb.toString());
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static boolean m25541a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (lVar instanceof C6354m) {
            C6354m mVar = (C6354m) lVar;
            if (str != null && str.trim().length() > 0) {
                mVar.mo22610a(m25542a(str));
            }
        }
    }

    /* renamed from: a */
    public void mo22583a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            int c = eVar.mo22590c();
            if ((bVar instanceof C6342a) && ((C6342a) bVar).mo22574b("port") && !m25541a(c, bVar.mo22580e())) {
                throw new C6348g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
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
            int c = eVar.mo22590c();
            if (!(bVar instanceof C6342a) || !((C6342a) bVar).mo22574b("port") || (bVar.mo22580e() != null && m25541a(c, bVar.mo22580e()))) {
                return true;
            }
            return false;
        }
    }
}
