package android.support.p017v4.p023d;

/* renamed from: android.support.v4.d.k */
/* compiled from: Pools */
public final class C0393k {

    /* renamed from: android.support.v4.d.k$a */
    /* compiled from: Pools */
    public interface C0394a<T> {
        /* renamed from: a */
        T mo1391a();

        /* renamed from: a */
        boolean mo1392a(T t);
    }

    /* renamed from: android.support.v4.d.k$b */
    /* compiled from: Pools */
    public static class C0395b<T> implements C0394a<T> {

        /* renamed from: a */
        private final Object[] f995a;

        /* renamed from: b */
        private int f996b;

        public C0395b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f995a = new Object[i];
        }

        /* renamed from: a */
        public T mo1391a() {
            if (this.f996b <= 0) {
                return null;
            }
            int i = this.f996b - 1;
            T t = this.f995a[i];
            this.f995a[i] = null;
            this.f996b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo1392a(T t) {
            if (m1463b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f996b >= this.f995a.length) {
                return false;
            } else {
                this.f995a[this.f996b] = t;
                this.f996b++;
                return true;
            }
        }

        /* renamed from: b */
        private boolean m1463b(T t) {
            for (int i = 0; i < this.f996b; i++) {
                if (this.f995a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.d.k$c */
    /* compiled from: Pools */
    public static class C0396c<T> extends C0395b<T> {

        /* renamed from: a */
        private final Object f997a = new Object();

        public C0396c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo1391a() {
            T a;
            synchronized (this.f997a) {
                a = super.mo1391a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo1392a(T t) {
            boolean a;
            synchronized (this.f997a) {
                a = super.mo1392a(t);
            }
            return a;
        }
    }
}
