package com.facebook.internal;

import com.facebook.C2649m;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.internal.ag */
/* compiled from: WorkQueue */
public class C2495ag {

    /* renamed from: a */
    static final /* synthetic */ boolean f7853a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f7854b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2498b f7855c;

    /* renamed from: d */
    private final int f7856d;

    /* renamed from: e */
    private final Executor f7857e;

    /* renamed from: f */
    private C2498b f7858f;

    /* renamed from: g */
    private int f7859g;

    /* renamed from: com.facebook.internal.ag$a */
    /* compiled from: WorkQueue */
    public interface C2497a {
        /* renamed from: a */
        boolean mo8968a();

        /* renamed from: b */
        void mo8969b();
    }

    /* renamed from: com.facebook.internal.ag$b */
    /* compiled from: WorkQueue */
    private class C2498b implements C2497a {

        /* renamed from: a */
        static final /* synthetic */ boolean f7862a = true;

        /* renamed from: c */
        private final Runnable f7864c;

        /* renamed from: d */
        private C2498b f7865d;

        /* renamed from: e */
        private C2498b f7866e;

        /* renamed from: f */
        private boolean f7867f;

        static {
            Class<C2495ag> cls = C2495ag.class;
        }

        C2498b(Runnable runnable) {
            this.f7864c = runnable;
        }

        /* renamed from: a */
        public boolean mo8968a() {
            synchronized (C2495ag.this.f7854b) {
                if (mo8973c()) {
                    return false;
                }
                C2495ag.this.f7855c = mo8970a(C2495ag.this.f7855c);
                return true;
            }
        }

        /* renamed from: b */
        public void mo8969b() {
            synchronized (C2495ag.this.f7854b) {
                if (!mo8973c()) {
                    C2495ag.this.f7855c = mo8970a(C2495ag.this.f7855c);
                    C2495ag.this.f7855c = mo8971a(C2495ag.this.f7855c, true);
                }
            }
        }

        /* renamed from: c */
        public boolean mo8973c() {
            return this.f7867f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Runnable mo8974d() {
            return this.f7864c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8972a(boolean z) {
            this.f7867f = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2498b mo8971a(C2498b bVar, boolean z) {
            if (!f7862a && this.f7865d != null) {
                throw new AssertionError();
            } else if (f7862a || this.f7866e == null) {
                if (bVar == null) {
                    this.f7866e = this;
                    this.f7865d = this;
                    bVar = this;
                } else {
                    this.f7865d = bVar;
                    this.f7866e = bVar.f7866e;
                    C2498b bVar2 = this.f7865d;
                    this.f7866e.f7865d = this;
                    bVar2.f7866e = this;
                }
                return z ? this : bVar;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2498b mo8970a(C2498b bVar) {
            if (!f7862a && this.f7865d == null) {
                throw new AssertionError();
            } else if (f7862a || this.f7866e != null) {
                if (bVar == this) {
                    if (this.f7865d == this) {
                        bVar = null;
                    } else {
                        bVar = this.f7865d;
                    }
                }
                this.f7865d.f7866e = this.f7866e;
                this.f7866e.f7865d = this.f7865d;
                this.f7866e = null;
                this.f7865d = null;
                return bVar;
            } else {
                throw new AssertionError();
            }
        }
    }

    public C2495ag() {
        this(8);
    }

    public C2495ag(int i) {
        this(i, C2649m.m10131d());
    }

    public C2495ag(int i, Executor executor) {
        this.f7854b = new Object();
        this.f7858f = null;
        this.f7859g = 0;
        this.f7856d = i;
        this.f7857e = executor;
    }

    /* renamed from: a */
    public C2497a mo8965a(Runnable runnable) {
        return mo8966a(runnable, true);
    }

    /* renamed from: a */
    public C2497a mo8966a(Runnable runnable, boolean z) {
        C2498b bVar = new C2498b(runnable);
        synchronized (this.f7854b) {
            this.f7855c = bVar.mo8971a(this.f7855c, z);
        }
        m9537a();
        return bVar;
    }

    /* renamed from: a */
    private void m9537a() {
        m9538a((C2498b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9538a(C2498b bVar) {
        C2498b bVar2;
        synchronized (this.f7854b) {
            if (bVar != null) {
                try {
                    this.f7858f = bVar.mo8970a(this.f7858f);
                    this.f7859g--;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.f7859g < this.f7856d) {
                bVar2 = this.f7855c;
                if (bVar2 != null) {
                    this.f7855c = bVar2.mo8970a(this.f7855c);
                    this.f7858f = bVar2.mo8971a(this.f7858f, false);
                    this.f7859g++;
                    bVar2.mo8972a(true);
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            m9542b(bVar2);
        }
    }

    /* renamed from: b */
    private void m9542b(final C2498b bVar) {
        this.f7857e.execute(new Runnable() {
            public void run() {
                try {
                    bVar.mo8974d().run();
                } finally {
                    C2495ag.this.m9538a(bVar);
                }
            }
        });
    }
}
