package android.support.p017v4.p023d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.d.b */
/* compiled from: ArraySet */
public final class C0378b<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f949c = new int[0];

    /* renamed from: d */
    private static final Object[] f950d = new Object[0];

    /* renamed from: e */
    private static Object[] f951e;

    /* renamed from: f */
    private static int f952f;

    /* renamed from: g */
    private static Object[] f953g;

    /* renamed from: h */
    private static int f954h;

    /* renamed from: a */
    Object[] f955a;

    /* renamed from: b */
    int f956b;

    /* renamed from: i */
    private int[] f957i;

    /* renamed from: j */
    private C0385h<E, E> f958j;

    /* renamed from: a */
    private int m1394a(Object obj, int i) {
        int i2 = this.f956b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0380c.m1412a(this.f957i, i2, i);
        if (a < 0 || obj.equals(this.f955a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f957i[i3] == i) {
            if (obj.equals(this.f955a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f957i[i4] == i) {
            if (obj.equals(this.f955a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private int m1393a() {
        int i = this.f956b;
        if (i == 0) {
            return -1;
        }
        int a = C0380c.m1412a(this.f957i, i, 0);
        if (a < 0 || this.f955a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f957i[i2] == 0) {
            if (this.f955a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f957i[i3] == 0) {
            if (this.f955a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private void m1397d(int i) {
        if (i == 8) {
            synchronized (C0378b.class) {
                if (f953g != null) {
                    Object[] objArr = f953g;
                    this.f955a = objArr;
                    f953g = (Object[]) objArr[0];
                    this.f957i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f954h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0378b.class) {
                if (f951e != null) {
                    Object[] objArr2 = f951e;
                    this.f955a = objArr2;
                    f951e = (Object[]) objArr2[0];
                    this.f957i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f952f--;
                    return;
                }
            }
        }
        this.f957i = new int[i];
        this.f955a = new Object[i];
    }

    /* renamed from: a */
    private static void m1395a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0378b.class) {
                if (f954h < 10) {
                    objArr[0] = f953g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f953g = objArr;
                    f954h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0378b.class) {
                if (f952f < 10) {
                    objArr[0] = f951e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f951e = objArr;
                    f952f++;
                }
            }
        }
    }

    public C0378b() {
        this(0);
    }

    public C0378b(int i) {
        if (i == 0) {
            this.f957i = f949c;
            this.f955a = f950d;
        } else {
            m1397d(i);
        }
        this.f956b = 0;
    }

    public void clear() {
        if (this.f956b != 0) {
            m1395a(this.f957i, this.f955a, this.f956b);
            this.f957i = f949c;
            this.f955a = f950d;
            this.f956b = 0;
        }
    }

    /* renamed from: a */
    public void mo1283a(int i) {
        if (this.f957i.length < i) {
            int[] iArr = this.f957i;
            Object[] objArr = this.f955a;
            m1397d(i);
            if (this.f956b > 0) {
                System.arraycopy(iArr, 0, this.f957i, 0, this.f956b);
                System.arraycopy(objArr, 0, this.f955a, 0, this.f956b);
            }
            m1395a(iArr, objArr, this.f956b);
        }
    }

    public boolean contains(Object obj) {
        return mo1282a(obj) >= 0;
    }

    /* renamed from: a */
    public int mo1282a(Object obj) {
        return obj == null ? m1393a() : m1394a(obj, obj.hashCode());
    }

    /* renamed from: b */
    public E mo1286b(int i) {
        return this.f955a[i];
    }

    public boolean isEmpty() {
        return this.f956b <= 0;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m1393a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m1394a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        if (this.f956b >= this.f957i.length) {
            int i4 = 4;
            if (this.f956b >= 8) {
                i4 = (this.f956b >> 1) + this.f956b;
            } else if (this.f956b >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f957i;
            Object[] objArr = this.f955a;
            m1397d(i4);
            if (this.f957i.length > 0) {
                System.arraycopy(iArr, 0, this.f957i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f955a, 0, objArr.length);
            }
            m1395a(iArr, objArr, this.f956b);
        }
        if (i3 < this.f956b) {
            int i5 = i3 + 1;
            System.arraycopy(this.f957i, i3, this.f957i, i5, this.f956b - i3);
            System.arraycopy(this.f955a, i3, this.f955a, i5, this.f956b - i3);
        }
        this.f957i[i3] = i;
        this.f955a[i3] = e;
        this.f956b++;
        return true;
    }

    public boolean remove(Object obj) {
        int a = mo1282a(obj);
        if (a < 0) {
            return false;
        }
        mo1287c(a);
        return true;
    }

    /* renamed from: c */
    public E mo1287c(int i) {
        E e = this.f955a[i];
        if (this.f956b <= 1) {
            m1395a(this.f957i, this.f955a, this.f956b);
            this.f957i = f949c;
            this.f955a = f950d;
            this.f956b = 0;
        } else {
            int i2 = 8;
            if (this.f957i.length <= 8 || this.f956b >= this.f957i.length / 3) {
                this.f956b--;
                if (i < this.f956b) {
                    int i3 = i + 1;
                    System.arraycopy(this.f957i, i3, this.f957i, i, this.f956b - i);
                    System.arraycopy(this.f955a, i3, this.f955a, i, this.f956b - i);
                }
                this.f955a[this.f956b] = null;
            } else {
                if (this.f956b > 8) {
                    i2 = (this.f956b >> 1) + this.f956b;
                }
                int[] iArr = this.f957i;
                Object[] objArr = this.f955a;
                m1397d(i2);
                this.f956b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f957i, 0, i);
                    System.arraycopy(objArr, 0, this.f955a, 0, i);
                }
                if (i < this.f956b) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.f957i, i, this.f956b - i);
                    System.arraycopy(objArr, i4, this.f955a, i, this.f956b - i);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f956b;
    }

    public Object[] toArray() {
        Object[] objArr = new Object[this.f956b];
        System.arraycopy(this.f955a, 0, objArr, 0, this.f956b);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f956b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f956b);
        }
        System.arraycopy(this.f955a, 0, tArr, 0, this.f956b);
        if (tArr.length > this.f956b) {
            tArr[this.f956b] = null;
        }
        return tArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f956b) {
            try {
                if (!set.contains(mo1286b(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException unused) {
                return false;
            } catch (ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f957i;
        int i = 0;
        for (int i2 = 0; i2 < this.f956b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f956b * 14);
        sb.append('{');
        for (int i = 0; i < this.f956b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1286b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private C0385h<E, E> m1396b() {
        if (this.f958j == null) {
            this.f958j = new C0385h<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1273a() {
                    return C0378b.this.f956b;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1275a(int i, int i2) {
                    return C0378b.this.f955a[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1274a(Object obj) {
                    return C0378b.this.mo1282a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1279b(Object obj) {
                    return C0378b.this.mo1282a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<E, E> mo1280b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1278a(E e, E e2) {
                    C0378b.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo1276a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1277a(int i) {
                    C0378b.this.mo1287c(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1281c() {
                    C0378b.this.clear();
                }
            };
        }
        return this.f958j;
    }

    public Iterator<E> iterator() {
        return m1396b().mo1329e().iterator();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1283a(this.f956b + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f956b - 1; i >= 0; i--) {
            if (!collection.contains(this.f955a[i])) {
                mo1287c(i);
                z = true;
            }
        }
        return z;
    }
}
