package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.C6567x;
import org.apache.p199a.C6568y;
import org.apache.p199a.p225g.C6500c;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p226h.C6515j;
import org.apache.p199a.p226h.C6525t;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.f.a */
/* compiled from: AbstractMessageParser */
public abstract class C6482a implements C6500c {

    /* renamed from: a */
    protected final C6525t f21146a;

    /* renamed from: b */
    private final C6503f f21147b;

    /* renamed from: c */
    private final int f21148c;

    /* renamed from: d */
    private final int f21149d;

    /* renamed from: e */
    private final List f21150e;

    /* renamed from: f */
    private int f21151f;

    /* renamed from: g */
    private C6557n f21152g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C6557n mo22804a(C6503f fVar) throws IOException, C6547k, C6567x;

    public C6482a(C6503f fVar, C6525t tVar, C6531d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            this.f21147b = fVar;
            this.f21148c = dVar.mo23001a("http.connection.max-header-count", -1);
            this.f21149d = dVar.mo23001a("http.connection.max-line-length", -1);
            if (tVar == null) {
                tVar = C6515j.f21227a;
            }
            this.f21146a = tVar;
            this.f21150e = new ArrayList();
            this.f21151f = 0;
        }
    }

    /* renamed from: a */
    public static C6301c[] m25667a(C6503f fVar, int i, int i2, C6525t tVar) throws C6547k, IOException {
        if (tVar == null) {
            tVar = C6515j.f21227a;
        }
        return m25668a(fVar, i, i2, tVar, new ArrayList());
    }

    /* renamed from: a */
    public static C6301c[] m25668a(C6503f fVar, int i, int i2, C6525t tVar, List list) throws C6547k, IOException {
        int i3;
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (tVar == null) {
            throw new IllegalArgumentException("Line parser may not be null");
        } else if (list == null) {
            throw new IllegalArgumentException("Header line list may not be null");
        } else {
            C6549b bVar = null;
            C6549b bVar2 = null;
            while (true) {
                if (bVar == null) {
                    bVar = new C6549b(64);
                } else {
                    bVar.mo23041a();
                }
                i3 = 0;
                if (fVar.mo22806a(bVar) == -1 || bVar.mo23052c() < 1) {
                    C6301c[] cVarArr = new C6301c[list.size()];
                } else {
                    if ((bVar.mo23038a(0) == ' ' || bVar.mo23038a(0) == 9) && bVar2 != null) {
                        while (i3 < bVar.mo23052c()) {
                            char a = bVar.mo23038a(i3);
                            if (a != ' ' && a != 9) {
                                break;
                            }
                            i3++;
                        }
                        if (i2 <= 0 || ((bVar2.mo23052c() + 1) + bVar.mo23052c()) - i3 <= i2) {
                            bVar2.mo23042a(' ');
                            bVar2.mo23046a(bVar, i3, bVar.mo23052c() - i3);
                        } else {
                            throw new IOException("Maximum line length limit exceeded");
                        }
                    } else {
                        list.add(bVar);
                        bVar2 = bVar;
                        bVar = null;
                    }
                    if (i > 0 && list.size() >= i) {
                        throw new IOException("Maximum header count exceeded");
                    }
                }
            }
            C6301c[] cVarArr2 = new C6301c[list.size()];
            while (i3 < list.size()) {
                try {
                    cVarArr2[i3] = tVar.mo22951a((C6549b) list.get(i3));
                    i3++;
                } catch (C6567x e) {
                    throw new C6568y(e.getMessage());
                }
            }
            return cVarArr2;
        }
    }

    /* renamed from: a */
    public C6557n mo22857a() throws IOException, C6547k {
        switch (this.f21151f) {
            case 0:
                try {
                    this.f21152g = mo22804a(this.f21147b);
                    this.f21151f = 1;
                    break;
                } catch (C6567x e) {
                    throw new C6568y(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.f21152g.mo22907a(m25668a(this.f21147b, this.f21148c, this.f21149d, this.f21146a, this.f21150e));
        C6557n nVar = this.f21152g;
        this.f21152g = null;
        this.f21150e.clear();
        this.f21151f = 0;
        return nVar;
    }
}
