package com.google.android.gms.internal.p148e;

import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import com.google.android.gms.internal.p148e.C4578f.C4581b;
import com.google.android.gms.internal.p148e.C4578f.C4581b.C4582a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.x */
public final class C4651x extends C4625gk<C4651x> {

    /* renamed from: N */
    private static volatile C4651x[] f15164N;

    /* renamed from: A */
    public C4646s[] f15165A;

    /* renamed from: B */
    public String f15166B;

    /* renamed from: C */
    public Integer f15167C;

    /* renamed from: D */
    public String f15168D;

    /* renamed from: E */
    public Long f15169E;

    /* renamed from: F */
    public Long f15170F;

    /* renamed from: G */
    public String f15171G;

    /* renamed from: H */
    public Integer f15172H;

    /* renamed from: I */
    public String f15173I;

    /* renamed from: J */
    public C4581b f15174J;

    /* renamed from: K */
    public int[] f15175K;

    /* renamed from: O */
    private Integer f15176O;

    /* renamed from: P */
    private Integer f15177P;

    /* renamed from: Q */
    private String f15178Q;

    /* renamed from: R */
    private Long f15179R;

    /* renamed from: a */
    public Integer f15180a;

    /* renamed from: b */
    public C4648u[] f15181b;

    /* renamed from: c */
    public C4433aa[] f15182c;

    /* renamed from: d */
    public Long f15183d;

    /* renamed from: e */
    public Long f15184e;

    /* renamed from: f */
    public Long f15185f;

    /* renamed from: g */
    public Long f15186g;

    /* renamed from: h */
    public Long f15187h;

    /* renamed from: i */
    public String f15188i;

    /* renamed from: j */
    public String f15189j;

    /* renamed from: k */
    public String f15190k;

    /* renamed from: l */
    public String f15191l;

    /* renamed from: m */
    public Integer f15192m;

    /* renamed from: n */
    public String f15193n;

    /* renamed from: o */
    public String f15194o;

    /* renamed from: p */
    public String f15195p;

    /* renamed from: q */
    public Long f15196q;

    /* renamed from: r */
    public Long f15197r;

    /* renamed from: s */
    public String f15198s;

    /* renamed from: t */
    public Boolean f15199t;

    /* renamed from: u */
    public String f15200u;

    /* renamed from: v */
    public Long f15201v;

    /* renamed from: w */
    public Integer f15202w;

    /* renamed from: x */
    public String f15203x;

    /* renamed from: y */
    public String f15204y;

    /* renamed from: z */
    public Boolean f15205z;

    /* renamed from: a */
    public static C4651x[] m20168a() {
        if (f15164N == null) {
            synchronized (C4629go.f15075b) {
                if (f15164N == null) {
                    f15164N = new C4651x[0];
                }
            }
        }
        return f15164N;
    }

    public C4651x() {
        this.f15180a = null;
        this.f15181b = C4648u.m20157a();
        this.f15182c = C4433aa.m18863a();
        this.f15183d = null;
        this.f15184e = null;
        this.f15185f = null;
        this.f15186g = null;
        this.f15187h = null;
        this.f15188i = null;
        this.f15189j = null;
        this.f15190k = null;
        this.f15191l = null;
        this.f15192m = null;
        this.f15193n = null;
        this.f15194o = null;
        this.f15195p = null;
        this.f15196q = null;
        this.f15197r = null;
        this.f15198s = null;
        this.f15199t = null;
        this.f15200u = null;
        this.f15201v = null;
        this.f15202w = null;
        this.f15203x = null;
        this.f15204y = null;
        this.f15205z = null;
        this.f15165A = C4646s.m20149a();
        this.f15166B = null;
        this.f15167C = null;
        this.f15176O = null;
        this.f15177P = null;
        this.f15168D = null;
        this.f15169E = null;
        this.f15170F = null;
        this.f15171G = null;
        this.f15178Q = null;
        this.f15172H = null;
        this.f15173I = null;
        this.f15174J = null;
        this.f15175K = C4634gt.f15080a;
        this.f15179R = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4651x)) {
            return false;
        }
        C4651x xVar = (C4651x) obj;
        if (this.f15180a == null) {
            if (xVar.f15180a != null) {
                return false;
            }
        } else if (!this.f15180a.equals(xVar.f15180a)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15181b, (Object[]) xVar.f15181b) || !C4629go.m20098a((Object[]) this.f15182c, (Object[]) xVar.f15182c)) {
            return false;
        }
        if (this.f15183d == null) {
            if (xVar.f15183d != null) {
                return false;
            }
        } else if (!this.f15183d.equals(xVar.f15183d)) {
            return false;
        }
        if (this.f15184e == null) {
            if (xVar.f15184e != null) {
                return false;
            }
        } else if (!this.f15184e.equals(xVar.f15184e)) {
            return false;
        }
        if (this.f15185f == null) {
            if (xVar.f15185f != null) {
                return false;
            }
        } else if (!this.f15185f.equals(xVar.f15185f)) {
            return false;
        }
        if (this.f15186g == null) {
            if (xVar.f15186g != null) {
                return false;
            }
        } else if (!this.f15186g.equals(xVar.f15186g)) {
            return false;
        }
        if (this.f15187h == null) {
            if (xVar.f15187h != null) {
                return false;
            }
        } else if (!this.f15187h.equals(xVar.f15187h)) {
            return false;
        }
        if (this.f15188i == null) {
            if (xVar.f15188i != null) {
                return false;
            }
        } else if (!this.f15188i.equals(xVar.f15188i)) {
            return false;
        }
        if (this.f15189j == null) {
            if (xVar.f15189j != null) {
                return false;
            }
        } else if (!this.f15189j.equals(xVar.f15189j)) {
            return false;
        }
        if (this.f15190k == null) {
            if (xVar.f15190k != null) {
                return false;
            }
        } else if (!this.f15190k.equals(xVar.f15190k)) {
            return false;
        }
        if (this.f15191l == null) {
            if (xVar.f15191l != null) {
                return false;
            }
        } else if (!this.f15191l.equals(xVar.f15191l)) {
            return false;
        }
        if (this.f15192m == null) {
            if (xVar.f15192m != null) {
                return false;
            }
        } else if (!this.f15192m.equals(xVar.f15192m)) {
            return false;
        }
        if (this.f15193n == null) {
            if (xVar.f15193n != null) {
                return false;
            }
        } else if (!this.f15193n.equals(xVar.f15193n)) {
            return false;
        }
        if (this.f15194o == null) {
            if (xVar.f15194o != null) {
                return false;
            }
        } else if (!this.f15194o.equals(xVar.f15194o)) {
            return false;
        }
        if (this.f15195p == null) {
            if (xVar.f15195p != null) {
                return false;
            }
        } else if (!this.f15195p.equals(xVar.f15195p)) {
            return false;
        }
        if (this.f15196q == null) {
            if (xVar.f15196q != null) {
                return false;
            }
        } else if (!this.f15196q.equals(xVar.f15196q)) {
            return false;
        }
        if (this.f15197r == null) {
            if (xVar.f15197r != null) {
                return false;
            }
        } else if (!this.f15197r.equals(xVar.f15197r)) {
            return false;
        }
        if (this.f15198s == null) {
            if (xVar.f15198s != null) {
                return false;
            }
        } else if (!this.f15198s.equals(xVar.f15198s)) {
            return false;
        }
        if (this.f15199t == null) {
            if (xVar.f15199t != null) {
                return false;
            }
        } else if (!this.f15199t.equals(xVar.f15199t)) {
            return false;
        }
        if (this.f15200u == null) {
            if (xVar.f15200u != null) {
                return false;
            }
        } else if (!this.f15200u.equals(xVar.f15200u)) {
            return false;
        }
        if (this.f15201v == null) {
            if (xVar.f15201v != null) {
                return false;
            }
        } else if (!this.f15201v.equals(xVar.f15201v)) {
            return false;
        }
        if (this.f15202w == null) {
            if (xVar.f15202w != null) {
                return false;
            }
        } else if (!this.f15202w.equals(xVar.f15202w)) {
            return false;
        }
        if (this.f15203x == null) {
            if (xVar.f15203x != null) {
                return false;
            }
        } else if (!this.f15203x.equals(xVar.f15203x)) {
            return false;
        }
        if (this.f15204y == null) {
            if (xVar.f15204y != null) {
                return false;
            }
        } else if (!this.f15204y.equals(xVar.f15204y)) {
            return false;
        }
        if (this.f15205z == null) {
            if (xVar.f15205z != null) {
                return false;
            }
        } else if (!this.f15205z.equals(xVar.f15205z)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15165A, (Object[]) xVar.f15165A)) {
            return false;
        }
        if (this.f15166B == null) {
            if (xVar.f15166B != null) {
                return false;
            }
        } else if (!this.f15166B.equals(xVar.f15166B)) {
            return false;
        }
        if (this.f15167C == null) {
            if (xVar.f15167C != null) {
                return false;
            }
        } else if (!this.f15167C.equals(xVar.f15167C)) {
            return false;
        }
        if (this.f15176O == null) {
            if (xVar.f15176O != null) {
                return false;
            }
        } else if (!this.f15176O.equals(xVar.f15176O)) {
            return false;
        }
        if (this.f15177P == null) {
            if (xVar.f15177P != null) {
                return false;
            }
        } else if (!this.f15177P.equals(xVar.f15177P)) {
            return false;
        }
        if (this.f15168D == null) {
            if (xVar.f15168D != null) {
                return false;
            }
        } else if (!this.f15168D.equals(xVar.f15168D)) {
            return false;
        }
        if (this.f15169E == null) {
            if (xVar.f15169E != null) {
                return false;
            }
        } else if (!this.f15169E.equals(xVar.f15169E)) {
            return false;
        }
        if (this.f15170F == null) {
            if (xVar.f15170F != null) {
                return false;
            }
        } else if (!this.f15170F.equals(xVar.f15170F)) {
            return false;
        }
        if (this.f15171G == null) {
            if (xVar.f15171G != null) {
                return false;
            }
        } else if (!this.f15171G.equals(xVar.f15171G)) {
            return false;
        }
        if (this.f15178Q == null) {
            if (xVar.f15178Q != null) {
                return false;
            }
        } else if (!this.f15178Q.equals(xVar.f15178Q)) {
            return false;
        }
        if (this.f15172H == null) {
            if (xVar.f15172H != null) {
                return false;
            }
        } else if (!this.f15172H.equals(xVar.f15172H)) {
            return false;
        }
        if (this.f15173I == null) {
            if (xVar.f15173I != null) {
                return false;
            }
        } else if (!this.f15173I.equals(xVar.f15173I)) {
            return false;
        }
        if (this.f15174J == null) {
            if (xVar.f15174J != null) {
                return false;
            }
        } else if (!this.f15174J.equals(xVar.f15174J)) {
            return false;
        }
        if (!C4629go.m20096a(this.f15175K, xVar.f15175K)) {
            return false;
        }
        if (this.f15179R == null) {
            if (xVar.f15179R != null) {
                return false;
            }
        } else if (!this.f15179R.equals(xVar.f15179R)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return xVar.f15061L == null || xVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(xVar.f15061L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15180a == null ? 0 : this.f15180a.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15181b)) * 31) + C4629go.m20094a((Object[]) this.f15182c)) * 31) + (this.f15183d == null ? 0 : this.f15183d.hashCode())) * 31) + (this.f15184e == null ? 0 : this.f15184e.hashCode())) * 31) + (this.f15185f == null ? 0 : this.f15185f.hashCode())) * 31) + (this.f15186g == null ? 0 : this.f15186g.hashCode())) * 31) + (this.f15187h == null ? 0 : this.f15187h.hashCode())) * 31) + (this.f15188i == null ? 0 : this.f15188i.hashCode())) * 31) + (this.f15189j == null ? 0 : this.f15189j.hashCode())) * 31) + (this.f15190k == null ? 0 : this.f15190k.hashCode())) * 31) + (this.f15191l == null ? 0 : this.f15191l.hashCode())) * 31) + (this.f15192m == null ? 0 : this.f15192m.hashCode())) * 31) + (this.f15193n == null ? 0 : this.f15193n.hashCode())) * 31) + (this.f15194o == null ? 0 : this.f15194o.hashCode())) * 31) + (this.f15195p == null ? 0 : this.f15195p.hashCode())) * 31) + (this.f15196q == null ? 0 : this.f15196q.hashCode())) * 31) + (this.f15197r == null ? 0 : this.f15197r.hashCode())) * 31) + (this.f15198s == null ? 0 : this.f15198s.hashCode())) * 31) + (this.f15199t == null ? 0 : this.f15199t.hashCode())) * 31) + (this.f15200u == null ? 0 : this.f15200u.hashCode())) * 31) + (this.f15201v == null ? 0 : this.f15201v.hashCode())) * 31) + (this.f15202w == null ? 0 : this.f15202w.hashCode())) * 31) + (this.f15203x == null ? 0 : this.f15203x.hashCode())) * 31) + (this.f15204y == null ? 0 : this.f15204y.hashCode())) * 31) + (this.f15205z == null ? 0 : this.f15205z.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15165A)) * 31) + (this.f15166B == null ? 0 : this.f15166B.hashCode())) * 31) + (this.f15167C == null ? 0 : this.f15167C.hashCode())) * 31) + (this.f15176O == null ? 0 : this.f15176O.hashCode())) * 31) + (this.f15177P == null ? 0 : this.f15177P.hashCode())) * 31) + (this.f15168D == null ? 0 : this.f15168D.hashCode())) * 31) + (this.f15169E == null ? 0 : this.f15169E.hashCode())) * 31) + (this.f15170F == null ? 0 : this.f15170F.hashCode())) * 31) + (this.f15171G == null ? 0 : this.f15171G.hashCode())) * 31) + (this.f15178Q == null ? 0 : this.f15178Q.hashCode())) * 31) + (this.f15172H == null ? 0 : this.f15172H.hashCode())) * 31) + (this.f15173I == null ? 0 : this.f15173I.hashCode());
        C4581b bVar = this.f15174J;
        int i3 = hashCode * 31;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int a = (((((i3 + i) * 31) + C4629go.m20092a(this.f15175K)) * 31) + (this.f15179R == null ? 0 : this.f15179R.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i2 = this.f15061L.hashCode();
        }
        return a + i2;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15180a != null) {
            giVar.mo16833a(1, this.f15180a.intValue());
        }
        if (this.f15181b != null && this.f15181b.length > 0) {
            for (C4648u uVar : this.f15181b) {
                if (uVar != null) {
                    giVar.mo16836a(2, (C4631gq) uVar);
                }
            }
        }
        if (this.f15182c != null && this.f15182c.length > 0) {
            for (C4433aa aaVar : this.f15182c) {
                if (aaVar != null) {
                    giVar.mo16836a(3, (C4631gq) aaVar);
                }
            }
        }
        if (this.f15183d != null) {
            giVar.mo16840b(4, this.f15183d.longValue());
        }
        if (this.f15184e != null) {
            giVar.mo16840b(5, this.f15184e.longValue());
        }
        if (this.f15185f != null) {
            giVar.mo16840b(6, this.f15185f.longValue());
        }
        if (this.f15187h != null) {
            giVar.mo16840b(7, this.f15187h.longValue());
        }
        if (this.f15188i != null) {
            giVar.mo16837a(8, this.f15188i);
        }
        if (this.f15189j != null) {
            giVar.mo16837a(9, this.f15189j);
        }
        if (this.f15190k != null) {
            giVar.mo16837a(10, this.f15190k);
        }
        if (this.f15191l != null) {
            giVar.mo16837a(11, this.f15191l);
        }
        if (this.f15192m != null) {
            giVar.mo16833a(12, this.f15192m.intValue());
        }
        if (this.f15193n != null) {
            giVar.mo16837a(13, this.f15193n);
        }
        if (this.f15194o != null) {
            giVar.mo16837a(14, this.f15194o);
        }
        if (this.f15195p != null) {
            giVar.mo16837a(16, this.f15195p);
        }
        if (this.f15196q != null) {
            giVar.mo16840b(17, this.f15196q.longValue());
        }
        if (this.f15197r != null) {
            giVar.mo16840b(18, this.f15197r.longValue());
        }
        if (this.f15198s != null) {
            giVar.mo16837a(19, this.f15198s);
        }
        if (this.f15199t != null) {
            giVar.mo16838a(20, this.f15199t.booleanValue());
        }
        if (this.f15200u != null) {
            giVar.mo16837a(21, this.f15200u);
        }
        if (this.f15201v != null) {
            giVar.mo16840b(22, this.f15201v.longValue());
        }
        if (this.f15202w != null) {
            giVar.mo16833a(23, this.f15202w.intValue());
        }
        if (this.f15203x != null) {
            giVar.mo16837a(24, this.f15203x);
        }
        if (this.f15204y != null) {
            giVar.mo16837a(25, this.f15204y);
        }
        if (this.f15186g != null) {
            giVar.mo16840b(26, this.f15186g.longValue());
        }
        if (this.f15205z != null) {
            giVar.mo16838a(28, this.f15205z.booleanValue());
        }
        if (this.f15165A != null && this.f15165A.length > 0) {
            for (C4646s sVar : this.f15165A) {
                if (sVar != null) {
                    giVar.mo16836a(29, (C4631gq) sVar);
                }
            }
        }
        if (this.f15166B != null) {
            giVar.mo16837a(30, this.f15166B);
        }
        if (this.f15167C != null) {
            giVar.mo16833a(31, this.f15167C.intValue());
        }
        if (this.f15176O != null) {
            giVar.mo16833a(32, this.f15176O.intValue());
        }
        if (this.f15177P != null) {
            giVar.mo16833a(33, this.f15177P.intValue());
        }
        if (this.f15168D != null) {
            giVar.mo16837a(34, this.f15168D);
        }
        if (this.f15169E != null) {
            giVar.mo16840b(35, this.f15169E.longValue());
        }
        if (this.f15170F != null) {
            giVar.mo16840b(36, this.f15170F.longValue());
        }
        if (this.f15171G != null) {
            giVar.mo16837a(37, this.f15171G);
        }
        if (this.f15178Q != null) {
            giVar.mo16837a(38, this.f15178Q);
        }
        if (this.f15172H != null) {
            giVar.mo16833a(39, this.f15172H.intValue());
        }
        if (this.f15173I != null) {
            giVar.mo16837a(41, this.f15173I);
        }
        if (this.f15174J != null) {
            giVar.mo16835a(44, (C4554ec) this.f15174J);
        }
        if (this.f15175K != null && this.f15175K.length > 0) {
            for (int i : this.f15175K) {
                giVar.mo16843c(45, 0);
                giVar.mo16842c(i);
            }
        }
        if (this.f15179R != null) {
            giVar.mo16840b(46, this.f15179R.longValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15180a != null) {
            b += C4623gi.m20050b(1, this.f15180a.intValue());
        }
        if (this.f15181b != null && this.f15181b.length > 0) {
            int i = b;
            for (C4648u uVar : this.f15181b) {
                if (uVar != null) {
                    i += C4623gi.m20051b(2, (C4631gq) uVar);
                }
            }
            b = i;
        }
        if (this.f15182c != null && this.f15182c.length > 0) {
            int i2 = b;
            for (C4433aa aaVar : this.f15182c) {
                if (aaVar != null) {
                    i2 += C4623gi.m20051b(3, (C4631gq) aaVar);
                }
            }
            b = i2;
        }
        if (this.f15183d != null) {
            b += C4623gi.m20055c(4, this.f15183d.longValue());
        }
        if (this.f15184e != null) {
            b += C4623gi.m20055c(5, this.f15184e.longValue());
        }
        if (this.f15185f != null) {
            b += C4623gi.m20055c(6, this.f15185f.longValue());
        }
        if (this.f15187h != null) {
            b += C4623gi.m20055c(7, this.f15187h.longValue());
        }
        if (this.f15188i != null) {
            b += C4623gi.m20052b(8, this.f15188i);
        }
        if (this.f15189j != null) {
            b += C4623gi.m20052b(9, this.f15189j);
        }
        if (this.f15190k != null) {
            b += C4623gi.m20052b(10, this.f15190k);
        }
        if (this.f15191l != null) {
            b += C4623gi.m20052b(11, this.f15191l);
        }
        if (this.f15192m != null) {
            b += C4623gi.m20050b(12, this.f15192m.intValue());
        }
        if (this.f15193n != null) {
            b += C4623gi.m20052b(13, this.f15193n);
        }
        if (this.f15194o != null) {
            b += C4623gi.m20052b(14, this.f15194o);
        }
        if (this.f15195p != null) {
            b += C4623gi.m20052b(16, this.f15195p);
        }
        if (this.f15196q != null) {
            b += C4623gi.m20055c(17, this.f15196q.longValue());
        }
        if (this.f15197r != null) {
            b += C4623gi.m20055c(18, this.f15197r.longValue());
        }
        if (this.f15198s != null) {
            b += C4623gi.m20052b(19, this.f15198s);
        }
        if (this.f15199t != null) {
            this.f15199t.booleanValue();
            b += C4623gi.m20049b(20) + 1;
        }
        if (this.f15200u != null) {
            b += C4623gi.m20052b(21, this.f15200u);
        }
        if (this.f15201v != null) {
            b += C4623gi.m20055c(22, this.f15201v.longValue());
        }
        if (this.f15202w != null) {
            b += C4623gi.m20050b(23, this.f15202w.intValue());
        }
        if (this.f15203x != null) {
            b += C4623gi.m20052b(24, this.f15203x);
        }
        if (this.f15204y != null) {
            b += C4623gi.m20052b(25, this.f15204y);
        }
        if (this.f15186g != null) {
            b += C4623gi.m20055c(26, this.f15186g.longValue());
        }
        if (this.f15205z != null) {
            this.f15205z.booleanValue();
            b += C4623gi.m20049b(28) + 1;
        }
        if (this.f15165A != null && this.f15165A.length > 0) {
            int i3 = b;
            for (C4646s sVar : this.f15165A) {
                if (sVar != null) {
                    i3 += C4623gi.m20051b(29, (C4631gq) sVar);
                }
            }
            b = i3;
        }
        if (this.f15166B != null) {
            b += C4623gi.m20052b(30, this.f15166B);
        }
        if (this.f15167C != null) {
            b += C4623gi.m20050b(31, this.f15167C.intValue());
        }
        if (this.f15176O != null) {
            b += C4623gi.m20050b(32, this.f15176O.intValue());
        }
        if (this.f15177P != null) {
            b += C4623gi.m20050b(33, this.f15177P.intValue());
        }
        if (this.f15168D != null) {
            b += C4623gi.m20052b(34, this.f15168D);
        }
        if (this.f15169E != null) {
            b += C4623gi.m20055c(35, this.f15169E.longValue());
        }
        if (this.f15170F != null) {
            b += C4623gi.m20055c(36, this.f15170F.longValue());
        }
        if (this.f15171G != null) {
            b += C4623gi.m20052b(37, this.f15171G);
        }
        if (this.f15178Q != null) {
            b += C4623gi.m20052b(38, this.f15178Q);
        }
        if (this.f15172H != null) {
            b += C4623gi.m20050b(39, this.f15172H.intValue());
        }
        if (this.f15173I != null) {
            b += C4623gi.m20052b(41, this.f15173I);
        }
        if (this.f15174J != null) {
            b += C4487ca.m19131c(44, (C4554ec) this.f15174J);
        }
        if (this.f15175K != null && this.f15175K.length > 0) {
            int i4 = 0;
            for (int d : this.f15175K) {
                i4 += C4623gi.m20056d(d);
            }
            b = b + i4 + (2 * this.f15175K.length);
        }
        return this.f15179R != null ? b + C4623gi.m20055c(46, this.f15179R.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f15180a = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 18:
                    int a2 = C4634gt.m20112a(ghVar, 18);
                    int length = this.f15181b == null ? 0 : this.f15181b.length;
                    C4648u[] uVarArr = new C4648u[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f15181b, 0, uVarArr, 0, length);
                    }
                    while (length < uVarArr.length - 1) {
                        uVarArr[length] = new C4648u();
                        ghVar.mo16814a((C4631gq) uVarArr[length]);
                        ghVar.mo16811a();
                        length++;
                    }
                    uVarArr[length] = new C4648u();
                    ghVar.mo16814a((C4631gq) uVarArr[length]);
                    this.f15181b = uVarArr;
                    break;
                case 26:
                    int a3 = C4634gt.m20112a(ghVar, 26);
                    int length2 = this.f15182c == null ? 0 : this.f15182c.length;
                    C4433aa[] aaVarArr = new C4433aa[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f15182c, 0, aaVarArr, 0, length2);
                    }
                    while (length2 < aaVarArr.length - 1) {
                        aaVarArr[length2] = new C4433aa();
                        ghVar.mo16814a((C4631gq) aaVarArr[length2]);
                        ghVar.mo16811a();
                        length2++;
                    }
                    aaVarArr[length2] = new C4433aa();
                    ghVar.mo16814a((C4631gq) aaVarArr[length2]);
                    this.f15182c = aaVarArr;
                    break;
                case 32:
                    this.f15183d = Long.valueOf(ghVar.mo16824e());
                    break;
                case 40:
                    this.f15184e = Long.valueOf(ghVar.mo16824e());
                    break;
                case 48:
                    this.f15185f = Long.valueOf(ghVar.mo16824e());
                    break;
                case 56:
                    this.f15187h = Long.valueOf(ghVar.mo16824e());
                    break;
                case 66:
                    this.f15188i = ghVar.mo16821c();
                    break;
                case 74:
                    this.f15189j = ghVar.mo16821c();
                    break;
                case 82:
                    this.f15190k = ghVar.mo16821c();
                    break;
                case 90:
                    this.f15191l = ghVar.mo16821c();
                    break;
                case 96:
                    this.f15192m = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 106:
                    this.f15193n = ghVar.mo16821c();
                    break;
                case 114:
                    this.f15194o = ghVar.mo16821c();
                    break;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /*130*/:
                    this.f15195p = ghVar.mo16821c();
                    break;
                case 136:
                    this.f15196q = Long.valueOf(ghVar.mo16824e());
                    break;
                case 144:
                    this.f15197r = Long.valueOf(ghVar.mo16824e());
                    break;
                case 154:
                    this.f15198s = ghVar.mo16821c();
                    break;
                case 160:
                    this.f15199t = Boolean.valueOf(ghVar.mo16818b());
                    break;
                case 170:
                    this.f15200u = ghVar.mo16821c();
                    break;
                case 176:
                    this.f15201v = Long.valueOf(ghVar.mo16824e());
                    break;
                case 184:
                    this.f15202w = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 194:
                    this.f15203x = ghVar.mo16821c();
                    break;
                case 202:
                    this.f15204y = ghVar.mo16821c();
                    break;
                case 208:
                    this.f15186g = Long.valueOf(ghVar.mo16824e());
                    break;
                case 224:
                    this.f15205z = Boolean.valueOf(ghVar.mo16818b());
                    break;
                case 234:
                    int a4 = C4634gt.m20112a(ghVar, 234);
                    int length3 = this.f15165A == null ? 0 : this.f15165A.length;
                    C4646s[] sVarArr = new C4646s[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f15165A, 0, sVarArr, 0, length3);
                    }
                    while (length3 < sVarArr.length - 1) {
                        sVarArr[length3] = new C4646s();
                        ghVar.mo16814a((C4631gq) sVarArr[length3]);
                        ghVar.mo16811a();
                        length3++;
                    }
                    sVarArr[length3] = new C4646s();
                    ghVar.mo16814a((C4631gq) sVarArr[length3]);
                    this.f15165A = sVarArr;
                    break;
                case 242:
                    this.f15166B = ghVar.mo16821c();
                    break;
                case 248:
                    this.f15167C = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 256:
                    this.f15176O = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 264:
                    this.f15177P = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 274:
                    this.f15168D = ghVar.mo16821c();
                    break;
                case 280:
                    this.f15169E = Long.valueOf(ghVar.mo16824e());
                    break;
                case 288:
                    this.f15170F = Long.valueOf(ghVar.mo16824e());
                    break;
                case 298:
                    this.f15171G = ghVar.mo16821c();
                    break;
                case 306:
                    this.f15178Q = ghVar.mo16821c();
                    break;
                case 312:
                    this.f15172H = Integer.valueOf(ghVar.mo16822d());
                    break;
                case 330:
                    this.f15173I = ghVar.mo16821c();
                    break;
                case 354:
                    C4581b bVar = (C4581b) ghVar.mo16812a(C4581b.m19767b());
                    if (this.f15174J != null) {
                        bVar = (C4581b) ((C4513cu) ((C4582a) ((C4582a) this.f15174J.mo16610g()).mo16364a(bVar)).mo16622g());
                    }
                    this.f15174J = bVar;
                    break;
                case 360:
                    int a5 = C4634gt.m20112a(ghVar, 360);
                    int length4 = this.f15175K == null ? 0 : this.f15175K.length;
                    int[] iArr = new int[(a5 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f15175K, 0, iArr, 0, length4);
                    }
                    while (length4 < iArr.length - 1) {
                        iArr[length4] = ghVar.mo16822d();
                        ghVar.mo16811a();
                        length4++;
                    }
                    iArr[length4] = ghVar.mo16822d();
                    this.f15175K = iArr;
                    break;
                case 362:
                    int c = ghVar.mo16820c(ghVar.mo16822d());
                    int i = ghVar.mo16829i();
                    int i2 = 0;
                    while (ghVar.mo16828h() > 0) {
                        ghVar.mo16822d();
                        i2++;
                    }
                    ghVar.mo16825e(i);
                    int length5 = this.f15175K == null ? 0 : this.f15175K.length;
                    int[] iArr2 = new int[(i2 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f15175K, 0, iArr2, 0, length5);
                    }
                    while (length5 < iArr2.length) {
                        iArr2[length5] = ghVar.mo16822d();
                        length5++;
                    }
                    this.f15175K = iArr2;
                    ghVar.mo16823d(c);
                    break;
                case 368:
                    this.f15179R = Long.valueOf(ghVar.mo16824e());
                    break;
                default:
                    if (super.mo16844a(ghVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
