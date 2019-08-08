package org.apache.p199a.p228j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6562s;

/* renamed from: org.apache.a.j.b */
/* compiled from: BasicHttpProcessor */
public final class C6536b implements Cloneable, C6540f {

    /* renamed from: a */
    protected final List f21255a = new ArrayList();

    /* renamed from: b */
    protected final List f21256b = new ArrayList();

    /* renamed from: a */
    public void mo23012a(C6559p pVar) {
        if (pVar != null) {
            this.f21255a.add(pVar);
        }
    }

    /* renamed from: b */
    public final void mo23016b(C6559p pVar) {
        mo23012a(pVar);
    }

    /* renamed from: a */
    public int mo23009a() {
        return this.f21255a.size();
    }

    /* renamed from: a */
    public C6559p mo23010a(int i) {
        if (i < 0 || i >= this.f21255a.size()) {
            return null;
        }
        return (C6559p) this.f21255a.get(i);
    }

    /* renamed from: a */
    public void mo23013a(C6562s sVar) {
        if (sVar != null) {
            this.f21256b.add(sVar);
        }
    }

    /* renamed from: b */
    public final void mo23017b(C6562s sVar) {
        mo23013a(sVar);
    }

    /* renamed from: b */
    public int mo23014b() {
        return this.f21256b.size();
    }

    /* renamed from: b */
    public C6562s mo23015b(int i) {
        if (i < 0 || i >= this.f21256b.size()) {
            return null;
        }
        return (C6562s) this.f21256b.get(i);
    }

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws IOException, C6547k {
        for (int i = 0; i < this.f21255a.size(); i++) {
            ((C6559p) this.f21255a.get(i)).mo22453a(oVar, eVar);
        }
    }

    /* renamed from: a */
    public void mo22454a(C6560q qVar, C6539e eVar) throws IOException, C6547k {
        for (int i = 0; i < this.f21256b.size(); i++) {
            ((C6562s) this.f21256b.get(i)).mo22454a(qVar, eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23011a(C6536b bVar) {
        bVar.f21255a.clear();
        bVar.f21255a.addAll(this.f21255a);
        bVar.f21256b.clear();
        bVar.f21256b.addAll(this.f21256b);
    }

    public Object clone() throws CloneNotSupportedException {
        C6536b bVar = (C6536b) super.clone();
        mo23011a(bVar);
        return bVar;
    }
}
