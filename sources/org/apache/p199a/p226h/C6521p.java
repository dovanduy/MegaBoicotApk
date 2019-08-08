package org.apache.p199a.p226h;

import java.io.Serializable;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6567x;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.p */
/* compiled from: BufferedHeader */
public class C6521p implements Serializable, Cloneable, C6266b {

    /* renamed from: a */
    private final String f21245a;

    /* renamed from: b */
    private final C6549b f21246b;

    /* renamed from: c */
    private final int f21247c;

    public C6521p(C6549b bVar) throws C6567x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        int c = bVar.mo23053c(58);
        if (c == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid header: ");
            stringBuffer.append(bVar.toString());
            throw new C6567x(stringBuffer.toString());
        }
        String b = bVar.mo23049b(0, c);
        if (b.length() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid header: ");
            stringBuffer2.append(bVar.toString());
            throw new C6567x(stringBuffer2.toString());
        }
        this.f21246b = bVar;
        this.f21245a = b;
        this.f21247c = c + 1;
    }

    /* renamed from: c */
    public String mo22465c() {
        return this.f21245a;
    }

    /* renamed from: d */
    public String mo22466d() {
        return this.f21246b.mo23049b(this.f21247c, this.f21246b.mo23052c());
    }

    /* renamed from: e */
    public C6341d[] mo22467e() throws C6567x {
        C6526u uVar = new C6526u(0, this.f21246b.mo23052c());
        uVar.mo22997a(this.f21247c);
        return C6511f.f21217a.mo22932a(this.f21246b, uVar);
    }

    /* renamed from: b */
    public int mo22435b() {
        return this.f21247c;
    }

    /* renamed from: a */
    public C6549b mo22434a() {
        return this.f21246b;
    }

    public String toString() {
        return this.f21246b.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
