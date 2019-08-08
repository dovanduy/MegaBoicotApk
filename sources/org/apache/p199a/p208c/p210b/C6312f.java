package org.apache.p199a.p208c.p210b;

import java.net.InetAddress;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.p210b.C6309e.C6310a;
import org.apache.p199a.p208c.p210b.C6309e.C6311b;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.c.b.f */
/* compiled from: RouteTracker */
public final class C6312f implements Cloneable, C6309e {

    /* renamed from: a */
    private final C6555l f20845a;

    /* renamed from: b */
    private final InetAddress f20846b;

    /* renamed from: c */
    private boolean f20847c;

    /* renamed from: d */
    private C6555l[] f20848d;

    /* renamed from: e */
    private C6311b f20849e;

    /* renamed from: f */
    private C6310a f20850f;

    /* renamed from: g */
    private boolean f20851g;

    public C6312f(C6555l lVar, InetAddress inetAddress) {
        if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        this.f20845a = lVar;
        this.f20846b = inetAddress;
        this.f20849e = C6311b.PLAIN;
        this.f20850f = C6310a.PLAIN;
    }

    public C6312f(C6306b bVar) {
        this(bVar.mo22486a(), bVar.mo22488b());
    }

    /* renamed from: a */
    public final void mo22500a(boolean z) {
        if (this.f20847c) {
            throw new IllegalStateException("Already connected.");
        }
        this.f20847c = true;
        this.f20851g = z;
    }

    /* renamed from: a */
    public final void mo22499a(C6555l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (this.f20847c) {
            throw new IllegalStateException("Already connected.");
        } else {
            this.f20847c = true;
            this.f20848d = new C6555l[]{lVar};
            this.f20851g = z;
        }
    }

    /* renamed from: b */
    public final void mo22502b(boolean z) {
        if (!this.f20847c) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.f20848d == null) {
            throw new IllegalStateException("No tunnel without proxy.");
        } else {
            this.f20849e = C6311b.TUNNELLED;
            this.f20851g = z;
        }
    }

    /* renamed from: b */
    public final void mo22501b(C6555l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.f20847c) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.f20848d == null) {
            throw new IllegalStateException("No proxy tunnel without proxy.");
        } else {
            C6555l[] lVarArr = new C6555l[(this.f20848d.length + 1)];
            System.arraycopy(this.f20848d, 0, lVarArr, 0, this.f20848d.length);
            lVarArr[lVarArr.length - 1] = lVar;
            this.f20848d = lVarArr;
            this.f20851g = z;
        }
    }

    /* renamed from: c */
    public final void mo22503c(boolean z) {
        if (!this.f20847c) {
            throw new IllegalStateException("No layered protocol unless connected.");
        }
        this.f20850f = C6310a.LAYERED;
        this.f20851g = z;
    }

    /* renamed from: a */
    public final C6555l mo22486a() {
        return this.f20845a;
    }

    /* renamed from: b */
    public final InetAddress mo22488b() {
        return this.f20846b;
    }

    /* renamed from: c */
    public final int mo22489c() {
        if (!this.f20847c) {
            return 0;
        }
        if (this.f20848d == null) {
            return 1;
        }
        return 1 + this.f20848d.length;
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
            sb2.append(" exceeds tracked route length ");
            sb2.append(c);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        } else if (i < c - 1) {
            return this.f20848d[i];
        } else {
            return this.f20845a;
        }
    }

    /* renamed from: d */
    public final boolean mo22505d() {
        return this.f20847c;
    }

    /* renamed from: e */
    public final boolean mo22492e() {
        return this.f20849e == C6311b.TUNNELLED;
    }

    /* renamed from: f */
    public final boolean mo22494f() {
        return this.f20850f == C6310a.LAYERED;
    }

    /* renamed from: g */
    public final boolean mo22495g() {
        return this.f20851g;
    }

    /* renamed from: h */
    public final C6306b mo22507h() {
        if (!this.f20847c) {
            return null;
        }
        C6306b bVar = new C6306b(this.f20845a, this.f20846b, this.f20848d, this.f20851g, this.f20849e, this.f20850f);
        return bVar;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6312f)) {
            return false;
        }
        C6312f fVar = (C6312f) obj;
        if (!(this.f20847c == fVar.f20847c && this.f20851g == fVar.f20851g && this.f20849e == fVar.f20849e && this.f20850f == fVar.f20850f && C6553f.m25968a((Object) this.f20845a, (Object) fVar.f20845a) && C6553f.m25968a((Object) this.f20846b, (Object) fVar.f20846b) && C6553f.m25969a((Object[]) this.f20848d, (Object[]) fVar.f20848d))) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int a = C6553f.m25966a(C6553f.m25966a(17, (Object) this.f20845a), (Object) this.f20846b);
        if (this.f20848d != null) {
            for (C6555l a2 : this.f20848d) {
                a = C6553f.m25966a(a, (Object) a2);
            }
        }
        return C6553f.m25966a(C6553f.m25966a(C6553f.m25967a(C6553f.m25967a(a, this.f20847c), this.f20851g), (Object) this.f20849e), (Object) this.f20850f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50 + (mo22489c() * 30));
        sb.append("RouteTracker[");
        if (this.f20846b != null) {
            sb.append(this.f20846b);
            sb.append("->");
        }
        sb.append('{');
        if (this.f20847c) {
            sb.append('c');
        }
        if (this.f20849e == C6311b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f20850f == C6310a.LAYERED) {
            sb.append('l');
        }
        if (this.f20851g) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.f20848d != null) {
            for (C6555l append : this.f20848d) {
                sb.append(append);
                sb.append("->");
            }
        }
        sb.append(this.f20845a);
        sb.append(']');
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
