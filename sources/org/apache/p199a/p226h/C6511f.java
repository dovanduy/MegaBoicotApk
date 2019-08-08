package org.apache.p199a.p226h;

import java.util.ArrayList;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6565v;
import org.apache.p199a.C6567x;
import org.apache.p199a.p228j.C6538d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.f */
/* compiled from: BasicHeaderValueParser */
public class C6511f implements C6523r {

    /* renamed from: a */
    public static final C6511f f21217a = new C6511f();

    /* renamed from: b */
    private static final char[] f21218b = {';', ','};

    /* renamed from: a */
    public static final C6341d[] m25765a(String str, C6523r rVar) throws C6567x {
        if (str == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (rVar == null) {
            rVar = f21217a;
        }
        C6549b bVar = new C6549b(str.length());
        bVar.mo23044a(str);
        return rVar.mo22932a(bVar, new C6526u(0, str.length()));
    }

    /* renamed from: a */
    public C6341d[] mo22932a(C6549b bVar, C6526u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo22999c()) {
                C6341d b = mo22933b(bVar, uVar);
                if (b.mo22569a().length() != 0 || b.mo22571b() != null) {
                    arrayList.add(b);
                }
            }
            return (C6341d[]) arrayList.toArray(new C6341d[arrayList.size()]);
        }
    }

    /* renamed from: b */
    public C6341d mo22933b(C6549b bVar, C6526u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            C6565v d = mo22935d(bVar, uVar);
            C6565v[] vVarArr = null;
            if (!uVar.mo22999c() && bVar.mo23038a(uVar.mo22998b() - 1) != ',') {
                vVarArr = mo22934c(bVar, uVar);
            }
            return mo22929a(d.mo22961a(), d.mo22962b(), vVarArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6341d mo22929a(String str, String str2, C6565v[] vVarArr) {
        return new C6508c(str, str2, vVarArr);
    }

    /* renamed from: c */
    public C6565v[] mo22934c(C6549b bVar, C6526u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            int b = uVar.mo22998b();
            int a = uVar.mo22996a();
            while (b < a && C6538d.m25905a(bVar.mo23038a(b))) {
                b++;
            }
            uVar.mo22997a(b);
            if (uVar.mo22999c()) {
                return new C6565v[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo22999c()) {
                arrayList.add(mo22935d(bVar, uVar));
                if (bVar.mo23038a(uVar.mo22998b() - 1) == ',') {
                    break;
                }
            }
            return (C6565v[]) arrayList.toArray(new C6565v[arrayList.size()]);
        }
    }

    /* renamed from: d */
    public C6565v mo22935d(C6549b bVar, C6526u uVar) {
        return mo22931a(bVar, uVar, f21218b);
    }

    /* renamed from: a */
    private static boolean m25764a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C6565v mo22931a(C6549b bVar, C6526u uVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
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
                } else if (m25764a(a2, cArr)) {
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
                return mo22930a(str, (String) null);
            }
            int i = b;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i >= a) {
                    z = z2;
                    break;
                }
                char a3 = bVar.mo23038a(i);
                if (a3 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && m25764a(a3, cArr)) {
                    break;
                }
                z3 = !z3 && z4 && a3 == '\\';
                i++;
            }
            while (b < i && C6538d.m25905a(bVar.mo23038a(b))) {
                b++;
            }
            int i2 = i;
            while (i2 > b && C6538d.m25905a(bVar.mo23038a(i2 - 1))) {
                i2--;
            }
            if (i2 - b >= 2 && bVar.mo23038a(b) == '\"' && bVar.mo23038a(i2 - 1) == '\"') {
                b++;
                i2--;
            }
            String a4 = bVar.mo23040a(b, i2);
            if (z) {
                i++;
            }
            uVar.mo22997a(i);
            return mo22930a(str, a4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6565v mo22930a(String str, String str2) {
        return new C6517l(str, str2);
    }
}
