package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0096b[] f53a;

    CompositeGeneratedAdaptersObserver(C0096b[] bVarArr) {
        this.f53a = bVarArr;
    }

    /* renamed from: a */
    public void mo108a(C0101e eVar, C0098a aVar) {
        C0107i iVar = new C0107i();
        for (C0096b a : this.f53a) {
            a.mo134a(eVar, aVar, false, iVar);
        }
        for (C0096b a2 : this.f53a) {
            a2.mo134a(eVar, aVar, true, iVar);
        }
    }
}
