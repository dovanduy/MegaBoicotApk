package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f73a;

    /* renamed from: b */
    private final C0094a f74b = C0093a.f76a.mo129b(this.f73a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f73a = obj;
    }

    /* renamed from: a */
    public void mo108a(C0101e eVar, C0098a aVar) {
        this.f74b.mo130a(eVar, aVar, this.f73a);
    }
}
