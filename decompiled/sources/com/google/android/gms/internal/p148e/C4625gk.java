package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4625gk;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.gk */
public abstract class C4625gk<M extends C4625gk<M>> extends C4631gq {

    /* renamed from: L */
    protected C4627gm f15061L;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo16328b() {
        if (this.f15061L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f15061L.mo16852a(); i2++) {
            i += this.f15061L.mo16855b(i2).mo16860a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15061L != null) {
            for (int i = 0; i < this.f15061L.mo16852a(); i++) {
                this.f15061L.mo16855b(i).mo16861a(giVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16844a(C4622gh ghVar, int i) throws IOException {
        int i2 = ghVar.mo16829i();
        if (!ghVar.mo16819b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        C4633gs gsVar = new C4633gs(i, ghVar.mo16816a(i2, ghVar.mo16829i() - i2));
        C4628gn gnVar = null;
        if (this.f15061L == null) {
            this.f15061L = new C4627gm();
        } else {
            gnVar = this.f15061L.mo16853a(i3);
        }
        if (gnVar == null) {
            gnVar = new C4628gn();
            this.f15061L.mo16854a(i3, gnVar);
        }
        gnVar.mo16862a(gsVar);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ C4631gq mo16845c() throws CloneNotSupportedException {
        return (C4625gk) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        C4625gk gkVar = (C4625gk) super.clone();
        C4629go.m20095a(this, gkVar);
        return gkVar;
    }
}
