package com.p055c.p056a.p057a.p058a.p060b;

import android.view.View;
import com.p055c.p056a.p057a.p058a.p062c.C1446a;
import com.p055c.p056a.p057a.p058a.p062c.C1453e;
import com.p055c.p056a.p057a.p058a.p064e.C1465e;
import com.p055c.p056a.p057a.p058a.p065f.C1467a;
import com.p055c.p056a.p057a.p058a.p066g.C1469a;
import com.p055c.p056a.p057a.p058a.p066g.C1471b;
import com.p055c.p056a.p057a.p058a.p066g.C1472c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.c.a.a.a.b.i */
public class C1444i extends C1437b {

    /* renamed from: a */
    private final C1439d f4399a;

    /* renamed from: b */
    private final C1438c f4400b;

    /* renamed from: c */
    private final List<C1467a> f4401c = new ArrayList();

    /* renamed from: d */
    private C1467a f4402d;

    /* renamed from: e */
    private C1469a f4403e;

    /* renamed from: f */
    private boolean f4404f = false;

    /* renamed from: g */
    private boolean f4405g = false;

    /* renamed from: h */
    private String f4406h;

    /* renamed from: i */
    private boolean f4407i;

    C1444i(C1438c cVar, C1439d dVar) {
        this.f4400b = cVar;
        this.f4399a = dVar;
        this.f4406h = UUID.randomUUID().toString();
        m5958e(null);
        this.f4403e = dVar.mo6496f() == C1440e.HTML ? new C1471b(dVar.mo6493c()) : new C1472c(dVar.mo6492b(), dVar.mo6495e());
        this.f4403e.mo6559a();
        C1446a.m5984a().mo6521a(this);
        this.f4403e.mo6564a(cVar);
    }

    /* renamed from: c */
    private C1467a m5956c(View view) {
        for (C1467a aVar : this.f4401c) {
            if (aVar.get() == view) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m5957d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: e */
    private void m5958e(View view) {
        this.f4402d = new C1467a(view);
    }

    /* renamed from: f */
    private void m5959f(View view) {
        Collection<C1444i> b = C1446a.m5984a().mo6522b();
        if (b != null && b.size() > 0) {
            for (C1444i iVar : b) {
                if (iVar != this && iVar.mo6509h() == view) {
                    iVar.f4402d.clear();
                }
            }
        }
    }

    /* renamed from: n */
    private void m5960n() {
        if (this.f4407i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public void mo6484a() {
        if (!this.f4404f) {
            this.f4404f = true;
            C1446a.m5984a().mo6523b(this);
            this.f4403e.mo6560a(C1453e.m6020a().mo6553d());
            this.f4403e.mo6565a(this, this.f4399a);
        }
    }

    /* renamed from: a */
    public void mo6485a(View view) {
        if (!this.f4405g) {
            C1465e.m6070a((Object) view, "AdView is null");
            if (mo6509h() != view) {
                m5958e(view);
                mo6507f().mo6578i();
                m5959f(view);
            }
        }
    }

    /* renamed from: b */
    public void mo6486b() {
        if (!this.f4405g) {
            this.f4402d.clear();
            mo6504c();
            this.f4405g = true;
            mo6507f().mo6576g();
            C1446a.m5984a().mo6525c(this);
            mo6507f().mo6570b();
            this.f4403e = null;
        }
    }

    /* renamed from: b */
    public void mo6487b(View view) {
        if (!this.f4405g) {
            m5957d(view);
            if (m5956c(view) == null) {
                this.f4401c.add(new C1467a(view));
            }
        }
    }

    /* renamed from: c */
    public void mo6504c() {
        if (!this.f4405g) {
            this.f4401c.clear();
        }
    }

    /* renamed from: d */
    public List<C1467a> mo6505d() {
        return this.f4401c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6506e() {
        m5960n();
        mo6507f().mo6577h();
        this.f4407i = true;
    }

    /* renamed from: f */
    public C1469a mo6507f() {
        return this.f4403e;
    }

    /* renamed from: g */
    public String mo6508g() {
        return this.f4406h;
    }

    /* renamed from: h */
    public View mo6509h() {
        return (View) this.f4402d.get();
    }

    /* renamed from: i */
    public boolean mo6510i() {
        return this.f4404f && !this.f4405g;
    }

    /* renamed from: j */
    public boolean mo6511j() {
        return this.f4404f;
    }

    /* renamed from: k */
    public boolean mo6512k() {
        return this.f4405g;
    }

    /* renamed from: l */
    public boolean mo6513l() {
        return this.f4400b.mo6488a();
    }

    /* renamed from: m */
    public boolean mo6514m() {
        return this.f4400b.mo6489b();
    }
}
