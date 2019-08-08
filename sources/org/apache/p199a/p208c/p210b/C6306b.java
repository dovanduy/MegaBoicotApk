package org.apache.p199a.p208c.p210b;

import java.net.InetAddress;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.p210b.C6309e.C6310a;
import org.apache.p199a.p208c.p210b.C6309e.C6311b;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.c.b.b */
/* compiled from: HttpRoute */
public final class C6306b implements Cloneable, C6309e {

    /* renamed from: a */
    private static final C6555l[] f20832a = new C6555l[0];

    /* renamed from: b */
    private final C6555l f20833b;

    /* renamed from: c */
    private final InetAddress f20834c;

    /* renamed from: d */
    private final C6555l[] f20835d;

    /* renamed from: e */
    private final C6311b f20836e;

    /* renamed from: f */
    private final C6310a f20837f;

    /* renamed from: g */
    private final boolean f20838g;

    private C6306b(InetAddress inetAddress, C6555l lVar, C6555l[] lVarArr, boolean z, C6311b bVar, C6310a aVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (lVarArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        } else if (bVar == C6311b.TUNNELLED && lVarArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        } else {
            if (bVar == null) {
                bVar = C6311b.PLAIN;
            }
            if (aVar == null) {
                aVar = C6310a.PLAIN;
            }
            this.f20833b = lVar;
            this.f20834c = inetAddress;
            this.f20835d = lVarArr;
            this.f20838g = z;
            this.f20836e = bVar;
            this.f20837f = aVar;
        }
    }

    public C6306b(C6555l lVar, InetAddress inetAddress, C6555l[] lVarArr, boolean z, C6311b bVar, C6310a aVar) {
        this(inetAddress, lVar, m24944a(lVarArr), z, bVar, aVar);
    }

    public C6306b(C6555l lVar, InetAddress inetAddress, boolean z) {
        this(inetAddress, lVar, f20832a, z, C6311b.PLAIN, C6310a.PLAIN);
    }

    public C6306b(C6555l lVar) {
        this((InetAddress) null, lVar, f20832a, false, C6311b.PLAIN, C6310a.PLAIN);
    }

    public C6306b(C6555l lVar, InetAddress inetAddress, C6555l lVar2, boolean z) {
        this(inetAddress, lVar, m24943a(lVar2), z, z ? C6311b.TUNNELLED : C6311b.PLAIN, z ? C6310a.LAYERED : C6310a.PLAIN);
        if (lVar2 == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
    }

    /* renamed from: a */
    private static C6555l[] m24943a(C6555l lVar) {
        if (lVar == null) {
            return f20832a;
        }
        return new C6555l[]{lVar};
    }

    /* renamed from: a */
    private static C6555l[] m24944a(C6555l[] lVarArr) {
        if (lVarArr == null || lVarArr.length < 1) {
            return f20832a;
        }
        for (C6555l lVar : lVarArr) {
            if (lVar == null) {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        C6555l[] lVarArr2 = new C6555l[lVarArr.length];
        System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
        return lVarArr2;
    }

    /* renamed from: a */
    public final C6555l mo22486a() {
        return this.f20833b;
    }

    /* renamed from: b */
    public final InetAddress mo22488b() {
        return this.f20834c;
    }

    /* renamed from: c */
    public final int mo22489c() {
        return this.f20835d.length + 1;
    }

    /* renamed from: a */
    public final C6555l mo22487a(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Hop index must not be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int c = mo22489c();
        if (i >= c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hop index ");
            sb2.append(i);
            sb2.append(" exceeds route length ");
            sb2.append(c);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i < c - 1) {
            return this.f20835d[i];
        } else {
            return this.f20833b;
        }
    }

    /* renamed from: d */
    public final C6555l mo22491d() {
        if (this.f20835d.length == 0) {
            return null;
        }
        return this.f20835d[0];
    }

    /* renamed from: e */
    public final boolean mo22492e() {
        return this.f20836e == C6311b.TUNNELLED;
    }

    /* renamed from: f */
    public final boolean mo22494f() {
        return this.f20837f == C6310a.LAYERED;
    }

    /* renamed from: g */
    public final boolean mo22495g() {
        return this.f20838g;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6306b)) {
            return false;
        }
        C6306b bVar = (C6306b) obj;
        if (this.f20838g != bVar.f20838g || this.f20836e != bVar.f20836e || this.f20837f != bVar.f20837f || !C6553f.m25968a((Object) this.f20833b, (Object) bVar.f20833b) || !C6553f.m25968a((Object) this.f20834c, (Object) bVar.f20834c) || !C6553f.m25969a((Object[]) this.f20835d, (Object[]) bVar.f20835d)) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int a = C6553f.m25966a(C6553f.m25966a(17, (Object) this.f20833b), (Object) this.f20834c);
        for (C6555l a2 : this.f20835d) {
            a = C6553f.m25966a(a, (Object) a2);
        }
        return C6553f.m25966a(C6553f.m25966a(C6553f.m25967a(a, this.f20838g), (Object) this.f20836e), (Object) this.f20837f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50 + (mo22489c() * 30));
        sb.append("HttpRoute[");
        if (this.f20834c != null) {
            sb.append(this.f20834c);
            sb.append("->");
        }
        sb.append('{');
        if (this.f20836e == C6311b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f20837f == C6310a.LAYERED) {
            sb.append('l');
        }
        if (this.f20838g) {
            sb.append('s');
        }
        sb.append("}->");
        for (C6555l append : this.f20835d) {
            sb.append(append);
            sb.append("->");
        }
        sb.append(this.f20833b);
        sb.append(']');
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
