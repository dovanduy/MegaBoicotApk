package org.apache.p199a.p218f.p222d;

import java.util.Date;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.h */
/* compiled from: BasicMaxAgeHandler */
public class C6455h extends C6440a {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for max-age attribute");
        } else {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Negative max-age attribute: ");
                    sb.append(str);
                    throw new C6352k(sb.toString());
                }
                lVar.mo22606b(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid max-age attribute: ");
                sb2.append(str);
                throw new C6352k(sb2.toString());
            }
        }
    }
}
