package org.apache.p199a.p226h;

import org.apache.p199a.C6263ac;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6567x;
import org.apache.p199a.C6569z;
import org.apache.p199a.p228j.C6538d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.j */
/* compiled from: BasicLineParser */
public class C6515j implements C6525t {

    /* renamed from: a */
    public static final C6515j f21227a = new C6515j();

    /* renamed from: b */
    protected final C6569z f21228b;

    public C6515j(C6569z zVar) {
        if (zVar == null) {
            zVar = C6563t.f21278c;
        }
        this.f21228b = zVar;
    }

    public C6515j() {
        this(null);
    }

    /* renamed from: a */
    public C6569z mo22953a(C6549b bVar, C6526u uVar) throws C6567x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            String a = this.f21228b.mo23068a();
            int length = a.length();
            int b = uVar.mo22998b();
            int a2 = uVar.mo22996a();
            mo22956d(bVar, uVar);
            int b2 = uVar.mo22998b();
            int i = b2 + length;
            if (i + 4 > a2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Not a valid protocol version: ");
                stringBuffer.append(bVar.mo23040a(b, a2));
                throw new C6567x(stringBuffer.toString());
            }
            int i2 = 0;
            boolean z = true;
            while (z && i2 < length) {
                z = bVar.mo23038a(b2 + i2) == a.charAt(i2);
                i2++;
            }
            if (z) {
                z = bVar.mo23038a(i) == '/';
            }
            if (!z) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Not a valid protocol version: ");
                stringBuffer2.append(bVar.mo23040a(b, a2));
                throw new C6567x(stringBuffer2.toString());
            }
            int i3 = b2 + length + 1;
            int a3 = bVar.mo23039a(46, i3, a2);
            if (a3 == -1) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid protocol version number: ");
                stringBuffer3.append(bVar.mo23040a(b, a2));
                throw new C6567x(stringBuffer3.toString());
            }
            try {
                int parseInt = Integer.parseInt(bVar.mo23049b(i3, a3));
                int i4 = a3 + 1;
                int a4 = bVar.mo23039a(32, i4, a2);
                if (a4 == -1) {
                    a4 = a2;
                }
                try {
                    int parseInt2 = Integer.parseInt(bVar.mo23049b(i4, a4));
                    uVar.mo22997a(a4);
                    return mo22952a(parseInt, parseInt2);
                } catch (NumberFormatException unused) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Invalid protocol minor version number: ");
                    stringBuffer4.append(bVar.mo23040a(b, a2));
                    throw new C6567x(stringBuffer4.toString());
                }
            } catch (NumberFormatException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Invalid protocol major version number: ");
                stringBuffer5.append(bVar.mo23040a(b, a2));
                throw new C6567x(stringBuffer5.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6569z mo22952a(int i, int i2) {
        return this.f21228b.mo23067a(i, i2);
    }

    /* renamed from: b */
    public boolean mo22954b(C6549b bVar, C6526u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            int b = uVar.mo22998b();
            String a = this.f21228b.mo23068a();
            int length = a.length();
            if (bVar.mo23052c() < length + 4) {
                return false;
            }
            if (b < 0) {
                b = (bVar.mo23052c() - 4) - length;
            } else if (b == 0) {
                while (b < bVar.mo23052c() && C6538d.m25905a(bVar.mo23038a(b))) {
                    b++;
                }
            }
            int i = b + length;
            if (i + 4 > bVar.mo23052c()) {
                return false;
            }
            boolean z = true;
            int i2 = 0;
            while (z && i2 < length) {
                z = bVar.mo23038a(b + i2) == a.charAt(i2);
                i2++;
            }
            if (z) {
                z = bVar.mo23038a(i) == '/';
            }
            return z;
        }
    }

    /* renamed from: c */
    public C6263ac mo22955c(C6549b bVar, C6526u uVar) throws C6567x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        } else {
            int b = uVar.mo22998b();
            int a = uVar.mo22996a();
            try {
                C6569z a2 = mo22953a(bVar, uVar);
                mo22956d(bVar, uVar);
                int b2 = uVar.mo22998b();
                int a3 = bVar.mo23039a(32, b2, a);
                if (a3 < 0) {
                    a3 = a;
                }
                String b3 = bVar.mo23049b(b2, a3);
                for (int i = 0; i < b3.length(); i++) {
                    if (!Character.isDigit(b3.charAt(i))) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Status line contains invalid status code: ");
                        stringBuffer.append(bVar.mo23040a(b, a));
                        throw new C6567x(stringBuffer.toString());
                    }
                }
                return mo22950a(a2, Integer.parseInt(b3), a3 < a ? bVar.mo23049b(a3, a) : "");
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Status line contains invalid status code: ");
                stringBuffer2.append(bVar.mo23040a(b, a));
                throw new C6567x(stringBuffer2.toString());
            } catch (IndexOutOfBoundsException unused2) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid status line: ");
                stringBuffer3.append(bVar.mo23040a(b, a));
                throw new C6567x(stringBuffer3.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6263ac mo22950a(C6569z zVar, int i, String str) {
        return new C6519n(zVar, i, str);
    }

    /* renamed from: a */
    public C6301c mo22951a(C6549b bVar) throws C6567x {
        return new C6521p(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22956d(C6549b bVar, C6526u uVar) {
        int b = uVar.mo22998b();
        int a = uVar.mo22996a();
        while (b < a && C6538d.m25905a(bVar.mo23038a(b))) {
            b++;
        }
        uVar.mo22997a(b);
    }
}
