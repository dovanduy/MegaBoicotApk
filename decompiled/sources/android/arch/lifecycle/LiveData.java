package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;
import android.arch.lifecycle.C0097c.C0099b;
import android.arch.p009a.p010a.C0076a;
import android.arch.p009a.p011b.C0082b;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f56b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f57a = new Object();

    /* renamed from: c */
    private C0082b<C0109k<T>, C0092a> f58c = new C0082b<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f59d = 0;

    /* renamed from: e */
    private volatile Object f60e = f56b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f61f = f56b;

    /* renamed from: g */
    private int f62g = -1;

    /* renamed from: h */
    private boolean f63h;

    /* renamed from: i */
    private boolean f64i;

    /* renamed from: j */
    private final Runnable f65j = new Runnable() {
        public void run() {
            Object b;
            synchronized (LiveData.this.f57a) {
                b = LiveData.this.f61f;
                LiveData.this.f61f = LiveData.f56b;
            }
            LiveData.this.mo120b(b);
        }
    };

    class LifecycleBoundObserver extends C0092a implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0101e f67a;

        LifecycleBoundObserver(C0101e eVar, C0109k<T> kVar) {
            super(kVar);
            this.f67a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo124a() {
            return this.f67a.mo139a().mo135a().mo138a(C0099b.STARTED);
        }

        /* renamed from: a */
        public void mo108a(C0101e eVar, C0098a aVar) {
            if (this.f67a.mo139a().mo135a() == C0099b.DESTROYED) {
                LiveData.this.mo117a(this.f69c);
            } else {
                mo127a(mo124a());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo125a(C0101e eVar) {
            return this.f67a == eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo126b() {
            this.f67a.mo139a().mo137b(this);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0092a {

        /* renamed from: c */
        final C0109k<T> f69c;

        /* renamed from: d */
        boolean f70d;

        /* renamed from: e */
        int f71e = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo124a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo125a(C0101e eVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo126b() {
        }

        C0092a(C0109k<T> kVar) {
            this.f69c = kVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo127a(boolean z) {
            if (z != this.f70d) {
                this.f70d = z;
                int i = 1;
                boolean z2 = LiveData.this.f59d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f59d;
                if (!this.f70d) {
                    i = -1;
                }
                liveData.f59d = c + i;
                if (z2 && this.f70d) {
                    LiveData.this.mo119b();
                }
                if (LiveData.this.f59d == 0 && !this.f70d) {
                    LiveData.this.mo121c();
                }
                if (this.f70d) {
                    LiveData.this.m121b(this);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo119b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo121c() {
    }

    /* renamed from: a */
    private void m117a(C0092a aVar) {
        if (aVar.f70d) {
            if (!aVar.mo124a()) {
                aVar.mo127a(false);
            } else if (aVar.f71e < this.f62g) {
                aVar.f71e = this.f62g;
                aVar.f69c.mo144a(this.f60e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m121b(C0092a aVar) {
        if (this.f63h) {
            this.f64i = true;
            return;
        }
        this.f63h = true;
        do {
            this.f64i = false;
            if (aVar == null) {
                C0087d c = this.f58c.mo88c();
                while (c.hasNext()) {
                    m117a((C0092a) ((Entry) c.next()).getValue());
                    if (this.f64i) {
                        break;
                    }
                }
            } else {
                m117a(aVar);
                aVar = null;
            }
        } while (this.f64i);
        this.f63h = false;
    }

    /* renamed from: a */
    public void mo116a(C0101e eVar, C0109k<T> kVar) {
        if (eVar.mo139a().mo135a() != C0099b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
            C0092a aVar = (C0092a) this.f58c.mo81a(kVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.mo125a(eVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                eVar.mo139a().mo136a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo117a(C0109k<T> kVar) {
        m119a("removeObserver");
        C0092a aVar = (C0092a) this.f58c.mo82b(kVar);
        if (aVar != null) {
            aVar.mo126b();
            aVar.mo127a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo118a(T t) {
        boolean z;
        synchronized (this.f57a) {
            z = this.f61f == f56b;
            this.f61f = t;
        }
        if (z) {
            C0076a.m68a().mo76b(this.f65j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo120b(T t) {
        m119a("setValue");
        this.f62g++;
        this.f60e = t;
        m121b(null);
    }

    /* renamed from: a */
    public T mo115a() {
        T t = this.f60e;
        if (t != f56b) {
            return t;
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo122d() {
        return this.f59d > 0;
    }

    /* renamed from: a */
    private static void m119a(String str) {
        if (!C0076a.m68a().mo77b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
