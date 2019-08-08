package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;
import android.arch.lifecycle.C0097c.C0099b;
import android.arch.p009a.p011b.C0081a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.f */
/* compiled from: LifecycleRegistry */
public class C0102f extends C0097c {

    /* renamed from: a */
    private C0081a<C0100d, C0104a> f89a = new C0081a<>();

    /* renamed from: b */
    private C0099b f90b;

    /* renamed from: c */
    private final WeakReference<C0101e> f91c;

    /* renamed from: d */
    private int f92d = 0;

    /* renamed from: e */
    private boolean f93e = false;

    /* renamed from: f */
    private boolean f94f = false;

    /* renamed from: g */
    private ArrayList<C0099b> f95g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.f$a */
    /* compiled from: LifecycleRegistry */
    static class C0104a {

        /* renamed from: a */
        C0099b f98a;

        /* renamed from: b */
        GenericLifecycleObserver f99b;

        C0104a(C0100d dVar, C0099b bVar) {
            this.f99b = C0106h.m175a((Object) dVar);
            this.f98a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo142a(C0101e eVar, C0098a aVar) {
            C0099b b = C0102f.m158b(aVar);
            this.f98a = C0102f.m156a(this.f98a, b);
            this.f99b.mo108a(eVar, aVar);
            this.f98a = b;
        }
    }

    public C0102f(C0101e eVar) {
        this.f91c = new WeakReference<>(eVar);
        this.f90b = C0099b.INITIALIZED;
    }

    /* renamed from: a */
    public void mo141a(C0099b bVar) {
        m159b(bVar);
    }

    /* renamed from: a */
    public void mo140a(C0098a aVar) {
        m159b(m158b(aVar));
    }

    /* renamed from: b */
    private void m159b(C0099b bVar) {
        if (this.f90b != bVar) {
            this.f90b = bVar;
            if (this.f93e || this.f92d != 0) {
                this.f94f = true;
                return;
            }
            this.f93e = true;
            m166d();
            this.f93e = false;
        }
    }

    /* renamed from: b */
    private boolean m161b() {
        boolean z = true;
        if (this.f89a.mo85a() == 0) {
            return true;
        }
        C0099b bVar = ((C0104a) this.f89a.mo89d().getValue()).f98a;
        C0099b bVar2 = ((C0104a) this.f89a.mo90e().getValue()).f98a;
        if (!(bVar == bVar2 && this.f90b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private C0099b m162c(C0100d dVar) {
        Entry d = this.f89a.mo84d(dVar);
        C0099b bVar = null;
        C0099b bVar2 = d != null ? ((C0104a) d.getValue()).f98a : null;
        if (!this.f95g.isEmpty()) {
            bVar = (C0099b) this.f95g.get(this.f95g.size() - 1);
        }
        return m156a(m156a(this.f90b, bVar2), bVar);
    }

    /* renamed from: a */
    public void mo136a(C0100d dVar) {
        C0104a aVar = new C0104a(dVar, this.f90b == C0099b.DESTROYED ? C0099b.DESTROYED : C0099b.INITIALIZED);
        if (((C0104a) this.f89a.mo81a(dVar, aVar)) == null) {
            C0101e eVar = (C0101e) this.f91c.get();
            if (eVar != null) {
                boolean z = this.f92d != 0 || this.f93e;
                C0099b c = m162c(dVar);
                this.f92d++;
                while (aVar.f98a.compareTo(c) < 0 && this.f89a.mo83c(dVar)) {
                    m164c(aVar.f98a);
                    aVar.mo142a(eVar, m167e(aVar.f98a));
                    m163c();
                    c = m162c(dVar);
                }
                if (!z) {
                    m166d();
                }
                this.f92d--;
            }
        }
    }

    /* renamed from: c */
    private void m163c() {
        this.f95g.remove(this.f95g.size() - 1);
    }

    /* renamed from: c */
    private void m164c(C0099b bVar) {
        this.f95g.add(bVar);
    }

    /* renamed from: b */
    public void mo137b(C0100d dVar) {
        this.f89a.mo82b(dVar);
    }

    /* renamed from: a */
    public C0099b mo135a() {
        return this.f90b;
    }

    /* renamed from: b */
    static C0099b m158b(C0098a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0099b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0099b.STARTED;
            case ON_RESUME:
                return C0099b.RESUMED;
            case ON_DESTROY:
                return C0099b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private static C0098a m165d(C0099b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0098a.ON_DESTROY;
            case STARTED:
                return C0098a.ON_STOP;
            case RESUMED:
                return C0098a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    private static C0098a m167e(C0099b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0098a.ON_CREATE;
            case CREATED:
                return C0098a.ON_START;
            case STARTED:
                return C0098a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m157a(C0101e eVar) {
        C0087d c = this.f89a.mo88c();
        while (c.hasNext() && !this.f94f) {
            Entry entry = (Entry) c.next();
            C0104a aVar = (C0104a) entry.getValue();
            while (aVar.f98a.compareTo(this.f90b) < 0 && !this.f94f && this.f89a.mo83c(entry.getKey())) {
                m164c(aVar.f98a);
                aVar.mo142a(eVar, m167e(aVar.f98a));
                m163c();
            }
        }
    }

    /* renamed from: b */
    private void m160b(C0101e eVar) {
        Iterator b = this.f89a.mo87b();
        while (b.hasNext() && !this.f94f) {
            Entry entry = (Entry) b.next();
            C0104a aVar = (C0104a) entry.getValue();
            while (aVar.f98a.compareTo(this.f90b) > 0 && !this.f94f && this.f89a.mo83c(entry.getKey())) {
                C0098a d = m165d(aVar.f98a);
                m164c(m158b(d));
                aVar.mo142a(eVar, d);
                m163c();
            }
        }
    }

    /* renamed from: d */
    private void m166d() {
        C0101e eVar = (C0101e) this.f91c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m161b()) {
            this.f94f = false;
            if (this.f90b.compareTo(((C0104a) this.f89a.mo89d().getValue()).f98a) < 0) {
                m160b(eVar);
            }
            Entry e = this.f89a.mo90e();
            if (!this.f94f && e != null && this.f90b.compareTo(((C0104a) e.getValue()).f98a) > 0) {
                m157a(eVar);
            }
        }
        this.f94f = false;
    }

    /* renamed from: a */
    static C0099b m156a(C0099b bVar, C0099b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
