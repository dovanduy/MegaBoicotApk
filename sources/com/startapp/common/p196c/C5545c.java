package com.startapp.common.p196c;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.common.c.c */
/* compiled from: StartAppSDK */
public class C5545c {
    /* renamed from: a */
    public static String m23670a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(C5548f.class)) {
                C5548f fVar = (C5548f) annotation;
                if (!"".equals(fVar.mo20539f())) {
                    return fVar.mo20539f();
                }
            }
        }
        return field.getName();
    }

    /* renamed from: b */
    public static boolean m23672b(Field field) {
        return Map.class.isAssignableFrom(field.getType());
    }

    /* renamed from: c */
    public static boolean m23673c(Field field) {
        return List.class.isAssignableFrom(field.getType());
    }

    /* renamed from: d */
    public static boolean m23674d(Field field) {
        return Set.class.isAssignableFrom(field.getType());
    }

    /* renamed from: e */
    public static boolean m23675e(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (!annotation.annotationType().equals(C5548f.class)) {
            return false;
        }
        return ((C5548f) annotation).mo20534a();
    }

    /* renamed from: a */
    public static boolean m23671a(Object obj) {
        Class cls = obj.getClass();
        return cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class) || cls.equals(String.class);
    }
}
