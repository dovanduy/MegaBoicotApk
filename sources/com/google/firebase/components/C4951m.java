package com.google.firebase.components;

import com.google.android.gms.common.internal.C3513t;
import com.google.firebase.components.C4937a.C49381;
import com.google.firebase.p149a.C4920c;
import com.google.firebase.p149a.C4921d;
import com.google.firebase.p150b.C4934a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.m */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C4951m extends C4947i {

    /* renamed from: a */
    private final List<C4937a<?>> f16129a;

    /* renamed from: b */
    private final Map<Class<?>, C4955q<?>> f16130b = new HashMap();

    /* renamed from: c */
    private final C4953o f16131c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17861a(Class cls) {
        return super.mo17861a(cls);
    }

    public C4951m(Executor executor, Iterable<C4942d> iterable, C4937a<?>... aVarArr) {
        this.f16131c = new C4953o(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4937a.m21520a(this.f16131c, C4953o.class, C4921d.class, C4920c.class));
        for (C4942d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        this.f16129a = Collections.unmodifiableList(C49381.m21529a((List<C4937a<?>>) arrayList));
        for (C4937a a : this.f16129a) {
            m21553a(a);
        }
        m21552a();
    }

    /* renamed from: b */
    public final <T> C4934a<T> mo17862b(Class<T> cls) {
        C3513t.m12626a(cls, (Object) "Null interface requested.");
        return (C4934a) this.f16130b.get(cls);
    }

    /* renamed from: a */
    public final void mo17870a(boolean z) {
        for (C4937a aVar : this.f16129a) {
            if (aVar.mo17852e() || (aVar.mo17853f() && z)) {
                mo17861a((Class) aVar.mo17848a().iterator().next());
            }
        }
        this.f16131c.mo17878a();
    }

    /* renamed from: a */
    private <T> void m21553a(C4937a<T> aVar) {
        C4955q qVar = new C4955q(aVar.mo17850c(), new C4957s(aVar, this));
        for (Class put : aVar.mo17848a()) {
            this.f16130b.put(put, qVar);
        }
    }

    /* renamed from: a */
    private void m21552a() {
        for (C4937a aVar : this.f16129a) {
            Iterator it = aVar.mo17849b().iterator();
            while (true) {
                if (it.hasNext()) {
                    C4943e eVar = (C4943e) it.next();
                    if (eVar.mo17864b() && !this.f16130b.containsKey(eVar.mo17863a())) {
                        throw new C4946h(String.format("Unsatisfied dependency for component %s: %s", new Object[]{aVar, eVar.mo17863a()}));
                    }
                }
            }
        }
    }
}
