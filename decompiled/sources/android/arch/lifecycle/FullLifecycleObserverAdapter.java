package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f54a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f54a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo108a(C0101e eVar, C0098a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f54a.mo109a(eVar);
                return;
            case ON_START:
                this.f54a.mo110b(eVar);
                return;
            case ON_RESUME:
                this.f54a.mo111c(eVar);
                return;
            case ON_PAUSE:
                this.f54a.mo112d(eVar);
                return;
            case ON_STOP:
                this.f54a.mo113e(eVar);
                return;
            case ON_DESTROY:
                this.f54a.mo114f(eVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
