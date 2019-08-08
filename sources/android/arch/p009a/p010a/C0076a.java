package android.arch.p009a.p010a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
/* compiled from: ArchTaskExecutor */
public class C0076a extends C0080c {

    /* renamed from: a */
    private static volatile C0076a f31a;

    /* renamed from: d */
    private static final Executor f32d = new Executor() {
        public void execute(Runnable runnable) {
            C0076a.m68a().mo76b(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f33e = new Executor() {
        public void execute(Runnable runnable) {
            C0076a.m68a().mo75a(runnable);
        }
    };

    /* renamed from: b */
    private C0080c f34b = this.f35c;

    /* renamed from: c */
    private C0080c f35c = new C0079b();

    private C0076a() {
    }

    /* renamed from: a */
    public static C0076a m68a() {
        if (f31a != null) {
            return f31a;
        }
        synchronized (C0076a.class) {
            if (f31a == null) {
                f31a = new C0076a();
            }
        }
        return f31a;
    }

    /* renamed from: a */
    public void mo75a(Runnable runnable) {
        this.f34b.mo75a(runnable);
    }

    /* renamed from: b */
    public void mo76b(Runnable runnable) {
        this.f34b.mo76b(runnable);
    }

    /* renamed from: b */
    public boolean mo77b() {
        return this.f34b.mo77b();
    }
}
