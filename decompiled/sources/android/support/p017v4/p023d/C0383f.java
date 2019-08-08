package android.support.p017v4.p023d;

/* renamed from: android.support.v4.d.f */
/* compiled from: LongSparseArray */
public class C0383f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f965a = new Object();

    /* renamed from: b */
    private boolean f966b;

    /* renamed from: c */
    private long[] f967c;

    /* renamed from: d */
    private Object[] f968d;

    /* renamed from: e */
    private int f969e;

    public C0383f() {
        this(10);
    }

    public C0383f(int i) {
        this.f966b = false;
        if (i == 0) {
            this.f967c = C0380c.f961b;
            this.f968d = C0380c.f962c;
        } else {
            int b = C0380c.m1415b(i);
            this.f967c = new long[b];
            this.f968d = new Object[b];
        }
        this.f969e = 0;
    }

    /* renamed from: a */
    public C0383f<E> clone() {
        try {
            C0383f<E> fVar = (C0383f) super.clone();
            fVar.f967c = (long[]) this.f967c.clone();
            fVar.f968d = (Object[]) this.f968d.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public E mo1306a(long j) {
        return mo1307a(j, null);
    }

    /* renamed from: a */
    public E mo1307a(long j, E e) {
        int a = C0380c.m1413a(this.f967c, this.f969e, j);
        return (a < 0 || this.f968d[a] == f965a) ? e : this.f968d[a];
    }

    /* renamed from: b */
    public void mo1311b(long j) {
        int a = C0380c.m1413a(this.f967c, this.f969e, j);
        if (a >= 0 && this.f968d[a] != f965a) {
            this.f968d[a] = f965a;
            this.f966b = true;
        }
    }

    /* renamed from: a */
    public void mo1308a(int i) {
        if (this.f968d[i] != f965a) {
            this.f968d[i] = f965a;
            this.f966b = true;
        }
    }

    /* renamed from: d */
    private void m1419d() {
        int i = this.f969e;
        long[] jArr = this.f967c;
        Object[] objArr = this.f968d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f965a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f966b = false;
        this.f969e = i2;
    }

    /* renamed from: b */
    public void mo1312b(long j, E e) {
        int a = C0380c.m1413a(this.f967c, this.f969e, j);
        if (a >= 0) {
            this.f968d[a] = e;
        } else {
            int i = a ^ -1;
            if (i >= this.f969e || this.f968d[i] != f965a) {
                if (this.f966b && this.f969e >= this.f967c.length) {
                    m1419d();
                    i = C0380c.m1413a(this.f967c, this.f969e, j) ^ -1;
                }
                if (this.f969e >= this.f967c.length) {
                    int b = C0380c.m1415b(this.f969e + 1);
                    long[] jArr = new long[b];
                    Object[] objArr = new Object[b];
                    System.arraycopy(this.f967c, 0, jArr, 0, this.f967c.length);
                    System.arraycopy(this.f968d, 0, objArr, 0, this.f968d.length);
                    this.f967c = jArr;
                    this.f968d = objArr;
                }
                if (this.f969e - i != 0) {
                    int i2 = i + 1;
                    System.arraycopy(this.f967c, i, this.f967c, i2, this.f969e - i);
                    System.arraycopy(this.f968d, i, this.f968d, i2, this.f969e - i);
                }
                this.f967c[i] = j;
                this.f968d[i] = e;
                this.f969e++;
            } else {
                this.f967c[i] = j;
                this.f968d[i] = e;
            }
        }
    }

    /* renamed from: b */
    public int mo1309b() {
        if (this.f966b) {
            m1419d();
        }
        return this.f969e;
    }

    /* renamed from: b */
    public long mo1310b(int i) {
        if (this.f966b) {
            m1419d();
        }
        return this.f967c[i];
    }

    /* renamed from: c */
    public E mo1313c(int i) {
        if (this.f966b) {
            m1419d();
        }
        return this.f968d[i];
    }

    /* renamed from: c */
    public void mo1314c() {
        int i = this.f969e;
        Object[] objArr = this.f968d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f969e = 0;
        this.f966b = false;
    }

    /* renamed from: c */
    public void mo1315c(long j, E e) {
        if (this.f969e == 0 || j > this.f967c[this.f969e - 1]) {
            if (this.f966b && this.f969e >= this.f967c.length) {
                m1419d();
            }
            int i = this.f969e;
            if (i >= this.f967c.length) {
                int b = C0380c.m1415b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f967c, 0, jArr, 0, this.f967c.length);
                System.arraycopy(this.f968d, 0, objArr, 0, this.f968d.length);
                this.f967c = jArr;
                this.f968d = objArr;
            }
            this.f967c[i] = j;
            this.f968d[i] = e;
            this.f969e = i + 1;
            return;
        }
        mo1312b(j, e);
    }

    public String toString() {
        if (mo1309b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f969e * 28);
        sb.append('{');
        for (int i = 0; i < this.f969e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1310b(i));
            sb.append('=');
            Object c = mo1313c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
