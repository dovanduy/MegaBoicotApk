package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.g */
/* compiled from: BasicExpiresHandler */
public class C6454g extends C6440a {

    /* renamed from: a */
    private final String[] f21119a;

    public C6454g(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Array of date patterns may not be null");
        }
        this.f21119a = strArr;
    }

    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new C6352k("Missing value for expires attribute");
        } else {
            try {
                lVar.mo22606b(C6464q.m25615a(str, this.f21119a));
            } catch (C6463p unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse expires attribute: ");
                sb.append(str);
                throw new C6352k(sb.toString());
            }
        }
    }
}
