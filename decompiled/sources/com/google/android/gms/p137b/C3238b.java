package com.google.android.gms.p137b;

import android.os.IBinder;
import com.google.android.gms.p137b.C3235a.C3236a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.b.b */
public final class C3238b<T> extends C3236a {

    /* renamed from: a */
    private final T f9428a;

    private C3238b(T t) {
        this.f9428a = t;
    }

    /* renamed from: a */
    public static <T> C3235a m11573a(T t) {
        return new C3238b(t);
    }

    /* renamed from: a */
    public static <T> T m11574a(C3235a aVar) {
        if (aVar instanceof C3238b) {
            return ((C3238b) aVar).f9428a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
