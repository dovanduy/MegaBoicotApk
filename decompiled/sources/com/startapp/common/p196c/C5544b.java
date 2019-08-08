package com.startapp.common.p196c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.common.c.b */
/* compiled from: StartAppSDK */
public class C5544b {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0016 A[SYNTHETIC, Splitter:B:14:0x0016] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m23666a(java.lang.String r2, java.lang.Class<T> r3) {
        /*
            r0 = 0
            com.startapp.common.c.a r1 = new com.startapp.common.c.a     // Catch:{ all -> 0x0013 }
            r1.<init>(r2)     // Catch:{ all -> 0x0013 }
            java.lang.Object r2 = r1.mo20528a(r3, r0)     // Catch:{ all -> 0x0010 }
            if (r1 == 0) goto L_0x000f
            r1.close()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            return r2
        L_0x0010:
            r2 = move-exception
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r2 = move-exception
        L_0x0014:
            if (r0 == 0) goto L_0x0019
            r0.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.p196c.C5544b.m23666a(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: a */
    public static String m23667a(Object obj) {
        return m23669c(obj).toString();
    }

    /* renamed from: c */
    private static JSONObject m23669c(Object obj) {
        Class cls = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList<>();
        while (cls != null && !Object.class.equals(cls)) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        JSONObject jSONObject = new JSONObject();
        for (Field field : arrayList) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        String a = C5545c.m23670a(field);
                        if (C5545c.m23675e(field)) {
                            jSONObject.put(a, m23669c(field.get(obj)));
                        } else if (C5545c.m23673c(field)) {
                            JSONArray jSONArray = new JSONArray();
                            for (Object b : (List) field.get(obj)) {
                                jSONArray.put(m23668b(b));
                            }
                            jSONObject.put(a, jSONArray);
                        } else if (C5545c.m23674d(field)) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (Object b2 : (Set) field.get(obj)) {
                                jSONArray2.put(m23668b(b2));
                            }
                            jSONObject.put(a, jSONArray2);
                        } else if (C5545c.m23672b(field)) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (Entry entry : ((Map) field.get(obj)).entrySet()) {
                                jSONObject2.put(entry.getKey().toString(), m23668b(entry.getValue()));
                            }
                            jSONObject.put(a, jSONObject2);
                        } else {
                            jSONObject.put(a, field.get(obj));
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static Object m23668b(Object obj) {
        if (C5545c.m23671a(obj)) {
            return obj;
        }
        return m23669c(obj);
    }
}
