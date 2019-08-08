package com.appnext.core;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.l */
public final class C1340l {

    /* renamed from: lt */
    private static int f4239lt = 2;

    /* renamed from: j */
    public static void m5722j(int i) {
        if (i >= 0 && i <= 2) {
            f4239lt = i;
        }
    }

    /* renamed from: cJ */
    public static int m5720cJ() {
        return f4239lt;
    }

    /* renamed from: a */
    public static Object m5717a(Class<?> cls, JSONObject jSONObject) {
        Field[] fieldArr;
        try {
            Object newInstance = cls.newInstance();
            if (f4239lt == 0) {
                fieldArr = cls.getFields();
            } else {
                fieldArr = cls.getDeclaredFields();
            }
            for (Field field : fieldArr) {
                if (f4239lt == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(true);
                }
                try {
                    if (jSONObject.has(field.getName())) {
                        String simpleName = field.getType().getSimpleName();
                        if (simpleName.equalsIgnoreCase("boolean")) {
                            field.setBoolean(newInstance, jSONObject.getBoolean(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("int")) {
                            field.setInt(newInstance, jSONObject.getInt(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("double")) {
                            field.setDouble(newInstance, jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("float")) {
                            field.setFloat(newInstance, (float) jSONObject.getDouble(field.getName()));
                        } else if (simpleName.equalsIgnoreCase("string")) {
                            field.set(newInstance, jSONObject.getString(field.getName()));
                        } else if (field.getType().isArray()) {
                            field.set(newInstance, Array.newInstance(field.getType().getComponentType(), jSONObject.getJSONArray(field.getName()).length()));
                            m5718a(field.get(newInstance), jSONObject.getJSONArray(field.getName()));
                        } else {
                            field.set(newInstance, m5717a(field.getType(), jSONObject.getJSONObject(field.getName())));
                        }
                    }
                } catch (Throwable unused) {
                }
                if (f4239lt == 2 && Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(false);
                }
            }
            return newInstance;
        } catch (InstantiationException unused2) {
            return null;
        } catch (IllegalAccessException unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m5718a(Object obj, JSONArray jSONArray) throws IllegalArgumentException, NegativeArraySizeException, IllegalAccessException, JSONException {
        Class cls = obj.getClass();
        String simpleName = cls.getComponentType().getSimpleName();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (cls.getComponentType().isArray()) {
                Array.set(obj, i, Array.newInstance(cls.getComponentType().getComponentType(), jSONArray.getJSONArray(i).length()));
                m5718a(Array.get(obj, i), jSONArray.getJSONArray(i));
            } else if (cls.getComponentType().isPrimitive() || simpleName.equalsIgnoreCase("string")) {
                Array.set(obj, i, jSONArray.get(i));
            } else {
                Array.set(obj, i, m5717a(cls.getComponentType(), jSONArray.getJSONObject(i)));
            }
        }
    }

    /* renamed from: c */
    public static JSONObject m5719c(Object obj) {
        Field[] fieldArr;
        JSONObject jSONObject = new JSONObject();
        Class cls = obj.getClass();
        if (f4239lt == 0) {
            fieldArr = cls.getFields();
        } else {
            fieldArr = cls.getDeclaredFields();
        }
        for (Field field : fieldArr) {
            if (f4239lt == 2 && Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            try {
                String name = field.getName();
                String simpleName = field.getType().getSimpleName();
                if (field.get(obj) != null) {
                    if (simpleName.equalsIgnoreCase("boolean")) {
                        jSONObject.put(name, field.getBoolean(obj));
                    } else if (simpleName.equalsIgnoreCase("int")) {
                        jSONObject.put(name, field.getInt(obj));
                    } else if (simpleName.equalsIgnoreCase("double")) {
                        jSONObject.put(name, field.getDouble(obj));
                    } else if (simpleName.equalsIgnoreCase("float")) {
                        jSONObject.put(name, (double) field.getFloat(obj));
                    } else if (simpleName.equalsIgnoreCase("long")) {
                        jSONObject.put(name, field.getLong(obj));
                    } else if (simpleName.equalsIgnoreCase("string")) {
                        jSONObject.put(name, (String) field.get(obj));
                    } else if (simpleName.endsWith("]")) {
                        jSONObject.put(name, m5721d(field.get(obj)));
                    } else {
                        jSONObject.put(name, m5719c(field.get(obj)));
                    }
                }
            } catch (Throwable unused) {
            }
            if (f4239lt == 2 && Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(false);
            }
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static JSONArray m5721d(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (Array.get(obj, i).getClass().isArray()) {
                jSONArray.put(i, m5721d(Array.get(obj, i)));
            } else {
                jSONArray.put(i, Array.get(obj, i));
            }
        }
        return jSONArray;
    }
}
