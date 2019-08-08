package org.apache.p199a.p218f.p222d;

import java.util.ArrayList;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6565v;
import org.apache.p199a.C6567x;
import org.apache.p199a.p226h.C6508c;
import org.apache.p199a.p226h.C6517l;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p228j.C6538d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.d.u */
/* compiled from: NetscapeDraftHeaderParser */
public class C6470u {

    /* renamed from: a */
    public static final C6470u f21132a = new C6470u();

    /* renamed from: a */
    public C6341d mo22846a(C6549b bVar, C6526u uVar) throws C6567x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            C6565v b = m25627b(bVar, uVar);
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo22999c()) {
                arrayList.add(m25627b(bVar, uVar));
            }
            return new C6508c(b.mo22961a(), b.mo22962b(), (C6565v[]) arrayList.toArray(new C6565v[arrayList.size()]));
        }
    }

    /* renamed from: b */
    private C6565v m25627b(C6549b bVar, C6526u uVar) {
        boolean z;
        boolean z2;
        String str;
        int b = uVar.mo22998b();
        int b2 = uVar.mo22998b();
        int a = uVar.mo22996a();
        while (true) {
            z = true;
            if (b >= a) {
                break;
            }
            char a2 = bVar.mo23038a(b);
            if (a2 == '=') {
                break;
            } else if (a2 == ';') {
                z2 = true;
                break;
            } else {
                b++;
            }
        }
        z2 = false;
        if (b == a) {
            str = bVar.mo23049b(b2, a);
            z2 = true;
        } else {
            str = bVar.mo23049b(b2, b);
            b++;
        }
        if (z2) {
            uVar.mo22997a(b);
            return new C6517l(str, null);
        }
        int i = b;
        while (true) {
            if (i >= a) {
                z = z2;
                break;
            } else if (bVar.mo23038a(i) == ';') {
                break;
            } else {
                i++;
            }
        }
        while (b < i && C6538d.m25905a(bVar.mo23038a(b))) {
            b++;
        }
        int i2 = i;
        while (i2 > b && C6538d.m25905a(bVar.mo23038a(i2 - 1))) {
            i2--;
        }
        String a3 = bVar.mo23040a(b, i2);
        if (z) {
            i++;
        }
        uVar.mo22997a(i);
        return new C6517l(str, a3);
    }
}
