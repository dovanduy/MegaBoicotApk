package org.apache.p199a.p229k;

import java.lang.reflect.Method;

/* renamed from: org.apache.a.k.e */
/* compiled from: ExceptionUtils */
public final class C6552e {

    /* renamed from: a */
    static Class f21265a;

    /* renamed from: b */
    private static final Method f21266b = m25963a();

    /* renamed from: a */
    static Class m25962a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: a */
    private static Method m25963a() {
        Class cls;
        Class cls2;
        try {
            Class[] clsArr = new Class[1];
            if (f21265a == null) {
                cls = m25962a("java.lang.Throwable");
                f21265a = cls;
            } else {
                cls = f21265a;
            }
            clsArr[0] = cls;
            if (f21265a == null) {
                cls2 = m25962a("java.lang.Throwable");
                f21265a = cls2;
            } else {
                cls2 = f21265a;
            }
            return cls2.getMethod("initCause", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m25964a(Throwable th, Throwable th2) {
        if (f21266b != null) {
            try {
                f21266b.invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
    }
}
