package android.support.p017v4.p023d;

/* renamed from: android.support.v4.d.n */
/* compiled from: SparseArrayCompat */
public class C0399n<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1005a = new Object();

    /* renamed from: b */
    private boolean f1006b;

    /* renamed from: c */
    private int[] f1007c;

    /* renamed from: d */
    private Object[] f1008d;

    /* renamed from: e */
    private int f1009e;

    public C0399n() {
        this(10);
    }

    public C0399n(int i) {
        this.f1006b = false;
        if (i == 0) {
            this.f1007c = C0380c.f960a;
            this.f1008d = C0380c.f962c;
        } else {
            int a = C0380c.m1411a(i);
            this.f1007c = new int[a];
            this.f1008d = new Object[a];
        }
        this.f1009e = 0;
    }

    /* renamed from: a */
    public C0399n<E> clone() {
        try {
            C0399n<E> nVar = (C0399n) super.clone();
            nVar.f1007c = (int[]) this.f1007c.clone();
            nVar.f1008d = (Object[]) this.f1008d.clone();
            return nVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public E mo1414a(int i) {
        return mo1415a(i, null);
    }

    /* renamed from: a */
    public E mo1415a(int i, E e) {
        int a = C0380c.m1412a(this.f1007c, this.f1009e, i);
        return (a < 0 || this.f1008d[a] == f1005a) ? e : this.f1008d[a];
    }

    /* renamed from: b */
    public void mo1417b(int i) {
        int a = C0380c.m1412a(this.f1007c, this.f1009e, i);
        if (a >= 0 && this.f1008d[a] != f1005a) {
            this.f1008d[a] = f1005a;
            this.f1006b = true;
        }
    }

    /* renamed from: c */
    public void mo1420c(int i) {
        mo1417b(i);
    }

    /* renamed from: d */
    private void m1483d() {
        int i = this.f1009e;
        int[] iArr = this.f1007c;
        Object[] objArr = this.f1008d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1005a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1006b = false;
        this.f1009e = i2;
    }

    /* renamed from: b */
    public void mo1418b(int i, E e) {
        int a = C0380c.m1412a(this.f1007c, this.f1009e, i);
        if (a >= 0) {
            this.f1008d[a] = e;
        } else {
            int i2 = a ^ -1;
            if (i2 >= this.f1009e || this.f1008d[i2] != f1005a) {
                if (this.f1006b && this.f1009e >= this.f1007c.length) {
                    m1483d();
                    i2 = C0380c.m1412a(this.f1007c, this.f1009e, i) ^ -1;
                }
                if (this.f1009e >= this.f1007c.length) {
                    int a2 = C0380c.m1411a(this.f1009e + 1);
                    int[] iArr = new int[a2];
                    Object[] objArr = new Object[a2];
                    System.arraycopy(this.f1007c, 0, iArr, 0, this.f1007c.length);
                    System.arraycopy(this.f1008d, 0, objArr, 0, this.f1008d.length);
                    this.f1007c = iArr;
                    this.f1008d = objArr;
                }
                if (this.f1009e - i2 != 0) {
                    int i3 = i2 + 1;
                    System.arraycopy(this.f1007c, i2, this.f1007c, i3, this.f1009e - i2);
                    System.arraycopy(this.f1008d, i2, this.f1008d, i3, this.f1009e - i2);
                }
                this.f1007c[i2] = i;
                this.f1008d[i2] = e;
                this.f1009e++;
            } else {
                this.f1007c[i2] = i;
                this.f1008d[i2] = e;
            }
        }
    }

    /* renamed from: b */
    public int mo1416b() {
        if (this.f1006b) {
            m1483d();
        }
        return this.f1009e;
    }

    /* renamed from: d */
    public int mo1423d(int i) {
        if (this.f1006b) {
            m1483d();
        }
        return this.f1007c[i];
    }

    /* renamed from: e */
    public E mo1424e(int i) {
        if (this.f1006b) {
            m1483d();
        }
        return this.f1008d[i];
    }

    /* renamed from: f */
    public int mo1425f(int i) {
        if (this.f1006b) {
            m1483d();
        }
        return C0380c.m1412a(this.f1007c, this.f1009e, i);
    }

    /* renamed from: c */
    public void mo1419c() {
        int i = this.f1009e;
        Object[] objArr = this.f1008d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1009e = 0;
        this.f1006b = false;
    }

    /* renamed from: c */
    public void mo1421c(int i, E e) {
        if (this.f1009e == 0 || i > this.f1007c[this.f1009e - 1]) {
            if (this.f1006b && this.f1009e >= this.f1007c.length) {
                m1483d();
            }
            int i2 = this.f1009e;
            if (i2 >= this.f1007c.length) {
                int a = C0380c.m1411a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f1007c, 0, iArr, 0, this.f1007c.length);
                System.arraycopy(this.f1008d, 0, objArr, 0, this.f1008d.length);
                this.f1007c = iArr;
                this.f1008d = objArr;
            }
            this.f1007c[i2] = i;
            this.f1008d[i2] = e;
            this.f1009e = i2 + 1;
            return;
        }
        mo1418b(i, e);
    }

    public String toString() {
        if (mo1416b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1009e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1009e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1423d(i));
            sb.append('=');
            Object e = mo1424e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
