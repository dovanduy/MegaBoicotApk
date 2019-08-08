package org.apache.p199a.p218f;

import java.io.IOException;
import org.apache.p199a.C6497g;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6561r;
import org.apache.p199a.p218f.p223e.C6477a;
import org.apache.p199a.p218f.p223e.C6478b;
import org.apache.p199a.p218f.p223e.C6479c;
import org.apache.p199a.p218f.p223e.C6480d;
import org.apache.p199a.p218f.p224f.C6490i;
import org.apache.p199a.p218f.p224f.C6491j;
import org.apache.p199a.p225g.C6499b;
import org.apache.p199a.p225g.C6500c;
import org.apache.p199a.p225g.C6501d;
import org.apache.p199a.p225g.C6502e;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.a */
/* compiled from: AbstractHttpClientConnection */
public abstract class C6377a implements C6497g {

    /* renamed from: a */
    private final C6478b f20923a = mo22672m();

    /* renamed from: b */
    private final C6477a f20924b = mo22671l();

    /* renamed from: c */
    private C6503f f20925c = null;

    /* renamed from: d */
    private C6504g f20926d = null;

    /* renamed from: e */
    private C6499b f20927e = null;

    /* renamed from: f */
    private C6500c f20928f = null;

    /* renamed from: g */
    private C6501d f20929g = null;

    /* renamed from: h */
    private C6476e f20930h = null;

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo22670k() throws IllegalStateException;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6477a mo22671l() {
        return new C6477a(new C6479c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C6478b mo22672m() {
        return new C6478b(new C6480d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6561r mo22673n() {
        return new C6422c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6500c mo22660a(C6503f fVar, C6561r rVar, C6531d dVar) {
        return new C6491j(fVar, null, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6501d mo22661a(C6504g gVar, C6531d dVar) {
        return new C6490i(gVar, null, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6476e mo22659a(C6502e eVar, C6502e eVar2) {
        return new C6476e(eVar, eVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22663a(C6503f fVar, C6504g gVar, C6531d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Output session buffer may not be null");
        } else {
            this.f20925c = fVar;
            this.f20926d = gVar;
            if (fVar instanceof C6499b) {
                this.f20927e = (C6499b) fVar;
            }
            this.f20928f = mo22660a(fVar, mo22673n(), dVar);
            this.f20929g = mo22661a(gVar, dVar);
            this.f20930h = mo22659a(fVar.mo22809b(), gVar.mo22816b());
        }
    }

    /* renamed from: a */
    public boolean mo22667a(int i) throws IOException {
        mo22670k();
        return this.f20925c.mo22808a(i);
    }

    /* renamed from: a */
    public void mo22665a(C6558o oVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        mo22670k();
        this.f20929g.mo22859b(oVar);
        this.f20930h.mo22849a();
    }

    /* renamed from: a */
    public void mo22664a(C6534j jVar) throws C6547k, IOException {
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        mo22670k();
        if (jVar.mo22446b() != null) {
            this.f20923a.mo22854a(this.f20926d, jVar, jVar.mo22446b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo22674o() throws IOException {
        this.f20926d.mo22811a();
    }

    /* renamed from: b */
    public void mo22668b() throws IOException {
        mo22670k();
        mo22674o();
    }

    /* renamed from: a */
    public C6560q mo22662a() throws C6547k, IOException {
        mo22670k();
        C6560q qVar = (C6560q) this.f20928f.mo22857a();
        if (qVar.mo22937a().mo22430b() >= 200) {
            this.f20930h.mo22850b();
        }
        return qVar;
    }

    /* renamed from: a */
    public void mo22666a(C6560q qVar) throws C6547k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        mo22670k();
        qVar.mo22938a(this.f20924b.mo22852b(this.f20925c, qVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo22675p() {
        return this.f20927e != null && this.f20927e.mo22810c();
    }

    /* renamed from: e */
    public boolean mo22669e() {
        if (!mo22781d() || mo22675p()) {
            return true;
        }
        try {
            this.f20925c.mo22808a(1);
            return mo22675p();
        } catch (IOException unused) {
            return true;
        }
    }
}
