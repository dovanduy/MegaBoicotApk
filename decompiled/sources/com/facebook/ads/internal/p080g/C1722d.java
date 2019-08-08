package com.facebook.ads.internal.p080g;

import java.lang.reflect.Method;

/* renamed from: com.facebook.ads.internal.g.d */
public class C1722d {
    /* renamed from: a */
    public static Object m7173a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m7174a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m7175a(String str, String str2, Class<?>... clsArr) {
        try {
            return m7174a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
