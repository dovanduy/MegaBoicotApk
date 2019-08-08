package org.apache.p199a.p229k;

/* renamed from: org.apache.a.k.f */
/* compiled from: LangUtils */
public final class C6553f {
    /* renamed from: a */
    public static int m25965a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m25967a(int i, boolean z) {
        return m25965a(i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static int m25966a(int i, Object obj) {
        return m25965a(i, obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: a */
    public static boolean m25968a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m25969a(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!m25968a(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
