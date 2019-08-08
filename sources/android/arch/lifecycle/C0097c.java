package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.c */
/* compiled from: Lifecycle */
public abstract class C0097c {

    /* renamed from: android.arch.lifecycle.c$a */
    /* compiled from: Lifecycle */
    public enum C0098a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.c$b */
    /* compiled from: Lifecycle */
    public enum C0099b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo138a(C0099b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0099b mo135a();

    /* renamed from: a */
    public abstract void mo136a(C0100d dVar);

    /* renamed from: b */
    public abstract void mo137b(C0100d dVar);
}
