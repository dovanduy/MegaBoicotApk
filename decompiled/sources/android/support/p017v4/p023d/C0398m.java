package android.support.p017v4.p023d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.d.m */
/* compiled from: SimpleArrayMap */
public class C0398m<K, V> {

    /* renamed from: b */
    static Object[] f998b;

    /* renamed from: c */
    static int f999c;

    /* renamed from: d */
    static Object[] f1000d;

    /* renamed from: e */
    static int f1001e;

    /* renamed from: f */
    int[] f1002f;

    /* renamed from: g */
    Object[] f1003g;

    /* renamed from: h */
    int f1004h;

    /* renamed from: a */
    private static int m1471a(int[] iArr, int i, int i2) {
        try {
            return C0380c.m1412a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1395a(Object obj, int i) {
        int i2 = this.f1004h;
        if (i2 == 0) {
            return -1;
        }
        int a = m1471a(this.f1002f, i2, i);
        if (a < 0 || obj.equals(this.f1003g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1002f[i3] == i) {
            if (obj.equals(this.f1003g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1002f[i4] == i) {
            if (obj.equals(this.f1003g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1393a() {
        int i = this.f1004h;
        if (i == 0) {
            return -1;
        }
        int a = m1471a(this.f1002f, i, 0);
        if (a < 0 || this.f1003g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1002f[i2] == 0) {
            if (this.f1003g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1002f[i3] == 0) {
            if (this.f1003g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: e */
    private void m1473e(int i) {
        if (i == 8) {
            synchronized (C0376a.class) {
                if (f1000d != null) {
                    Object[] objArr = f1000d;
                    this.f1003g = objArr;
                    f1000d = (Object[]) objArr[0];
                    this.f1002f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1001e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0376a.class) {
                if (f998b != null) {
                    Object[] objArr2 = f998b;
                    this.f1003g = objArr2;
                    f998b = (Object[]) objArr2[0];
                    this.f1002f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f999c--;
                    return;
                }
            }
        }
        this.f1002f = new int[i];
        this.f1003g = new Object[(i << 1)];
    }

    /* renamed from: a */
    private static void m1472a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0376a.class) {
                if (f1001e < 10) {
                    objArr[0] = f1000d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1000d = objArr;
                    f1001e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0376a.class) {
                if (f999c < 10) {
                    objArr[0] = f998b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f998b = objArr;
                    f999c++;
                }
            }
        }
    }

    public C0398m() {
        this.f1002f = C0380c.f960a;
        this.f1003g = C0380c.f962c;
        this.f1004h = 0;
    }

    public C0398m(int i) {
        if (i == 0) {
            this.f1002f = C0380c.f960a;
            this.f1003g = C0380c.f962c;
        } else {
            m1473e(i);
        }
        this.f1004h = 0;
    }

    public void clear() {
        if (this.f1004h > 0) {
            int[] iArr = this.f1002f;
            Object[] objArr = this.f1003g;
            int i = this.f1004h;
            this.f1002f = C0380c.f960a;
            this.f1003g = C0380c.f962c;
            this.f1004h = 0;
            m1472a(iArr, objArr, i);
        }
        if (this.f1004h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo1397a(int i) {
        int i2 = this.f1004h;
        if (this.f1002f.length < i) {
            int[] iArr = this.f1002f;
            Object[] objArr = this.f1003g;
            m1473e(i);
            if (this.f1004h > 0) {
                System.arraycopy(iArr, 0, this.f1002f, 0, i2);
                System.arraycopy(objArr, 0, this.f1003g, 0, i2 << 1);
            }
            m1472a(iArr, objArr, i2);
        }
        if (this.f1004h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo1394a(obj) >= 0;
    }

    /* renamed from: a */
    public int mo1394a(Object obj) {
        return obj == null ? mo1393a() : mo1395a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1398b(Object obj) {
        int i = this.f1004h * 2;
        Object[] objArr = this.f1003g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return mo1398b(obj) >= 0;
    }

    public V get(Object obj) {
        int a = mo1394a(obj);
        if (a >= 0) {
            return this.f1003g[(a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public K mo1399b(int i) {
        return this.f1003g[i << 1];
    }

    /* renamed from: c */
    public V mo1400c(int i) {
        return this.f1003g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V mo1396a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f1003g[i2];
        this.f1003g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f1004h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f1004h;
        if (k == null) {
            i2 = mo1393a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo1395a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f1003g[i4];
            this.f1003g[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f1002f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1002f;
            Object[] objArr = this.f1003g;
            m1473e(i6);
            if (i3 != this.f1004h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1002f.length > 0) {
                System.arraycopy(iArr, 0, this.f1002f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1003g, 0, objArr.length);
            }
            m1472a(iArr, objArr, i3);
        }
        if (i5 < i3) {
            int i7 = i5 + 1;
            System.arraycopy(this.f1002f, i5, this.f1002f, i7, i3 - i5);
            System.arraycopy(this.f1003g, i5 << 1, this.f1003g, i7 << 1, (this.f1004h - i5) << 1);
        }
        if (i3 != this.f1004h || i5 >= this.f1002f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1002f[i5] = i;
        int i8 = i5 << 1;
        this.f1003g[i8] = k;
        this.f1003g[i8 + 1] = v;
        this.f1004h++;
        return null;
    }

    public V remove(Object obj) {
        int a = mo1394a(obj);
        if (a >= 0) {
            return mo1404d(a);
        }
        return null;
    }

    /* renamed from: d */
    public V mo1404d(int i) {
        int i2 = i << 1;
        V v = this.f1003g[i2 + 1];
        int i3 = this.f1004h;
        int i4 = 0;
        if (i3 <= 1) {
            m1472a(this.f1002f, this.f1003g, i3);
            this.f1002f = C0380c.f960a;
            this.f1003g = C0380c.f962c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f1002f.length <= 8 || this.f1004h >= this.f1002f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f1002f, i7, this.f1002f, i, i8);
                    System.arraycopy(this.f1003g, i7 << 1, this.f1003g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f1003g[i9] = null;
                this.f1003g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f1002f;
                Object[] objArr = this.f1003g;
                m1473e(i6);
                if (i3 != this.f1004h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1002f, 0, i);
                    System.arraycopy(objArr, 0, this.f1003g, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f1002f, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1003g, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f1004h) {
            throw new ConcurrentModificationException();
        }
        this.f1004h = i4;
        return v;
    }

    public int size() {
        return this.f1004h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0398m) {
            C0398m mVar = (C0398m) obj;
            if (size() != mVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1004h) {
                try {
                    Object b = mo1399b(i);
                    Object c = mo1400c(i);
                    Object obj2 = mVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !mVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1004h) {
                try {
                    Object b2 = mo1399b(i2);
                    Object c2 = mo1400c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException unused3) {
                    return false;
                } catch (ClassCastException unused4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] iArr = this.f1002f;
        Object[] objArr = this.f1003g;
        int i = this.f1004h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1004h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1004h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1399b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo1400c(i);
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
