package android.support.p028v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.e */
/* compiled from: ResourcesFlusher */
class C0722e {

    /* renamed from: a */
    private static Field f2002a;

    /* renamed from: b */
    private static boolean f2003b;

    /* renamed from: c */
    private static Class f2004c;

    /* renamed from: d */
    private static boolean f2005d;

    /* renamed from: e */
    private static Field f2006e;

    /* renamed from: f */
    private static boolean f2007f;

    /* renamed from: g */
    private static Field f2008g;

    /* renamed from: h */
    private static boolean f2009h;

    /* renamed from: a */
    static void m2917a(Resources resources) {
        if (VERSION.SDK_INT < 28) {
            if (VERSION.SDK_INT >= 24) {
                m2921d(resources);
            } else if (VERSION.SDK_INT >= 23) {
                m2920c(resources);
            } else if (VERSION.SDK_INT >= 21) {
                m2919b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m2919b(Resources resources) {
        Map map;
        if (!f2003b) {
            try {
                f2002a = Resources.class.getDeclaredField("mDrawableCache");
                f2002a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2003b = true;
        }
        if (f2002a != null) {
            try {
                map = (Map) f2002a.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2920c(android.content.res.Resources r4) {
        /*
            boolean r0 = f2003b
            if (r0 != 0) goto L_0x001f
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0015 }
            f2002a = r1     // Catch:{ NoSuchFieldException -> 0x0015 }
            java.lang.reflect.Field r1 = f2002a     // Catch:{ NoSuchFieldException -> 0x0015 }
            r1.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r2, r3, r1)
        L_0x001d:
            f2003b = r0
        L_0x001f:
            r0 = 0
            java.lang.reflect.Field r1 = f2002a
            if (r1 == 0) goto L_0x0033
            java.lang.reflect.Field r1 = f2002a     // Catch:{ IllegalAccessException -> 0x002b }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r4 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r2, r4)
        L_0x0033:
            r4 = r0
        L_0x0034:
            if (r4 != 0) goto L_0x0037
            return
        L_0x0037:
            m2918a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.app.C0722e.m2920c(android.content.res.Resources):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2921d(android.content.res.Resources r5) {
        /*
            boolean r0 = f2009h
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0015 }
            f2008g = r0     // Catch:{ NoSuchFieldException -> 0x0015 }
            java.lang.reflect.Field r0 = f2008g     // Catch:{ NoSuchFieldException -> 0x0015 }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r0)
        L_0x001d:
            f2009h = r1
        L_0x001f:
            java.lang.reflect.Field r0 = f2008g
            if (r0 != 0) goto L_0x0024
            return
        L_0x0024:
            r0 = 0
            java.lang.reflect.Field r2 = f2008g     // Catch:{ IllegalAccessException -> 0x002c }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r5 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r3, r5)
            r5 = r0
        L_0x0035:
            if (r5 != 0) goto L_0x0038
            return
        L_0x0038:
            boolean r2 = f2003b
            if (r2 != 0) goto L_0x0058
            java.lang.Class r2 = r5.getClass()     // Catch:{ NoSuchFieldException -> 0x004e }
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x004e }
            f2002a = r2     // Catch:{ NoSuchFieldException -> 0x004e }
            java.lang.reflect.Field r2 = f2002a     // Catch:{ NoSuchFieldException -> 0x004e }
            r2.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x004e }
            goto L_0x0056
        L_0x004e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r3, r4, r2)
        L_0x0056:
            f2003b = r1
        L_0x0058:
            java.lang.reflect.Field r1 = f2002a
            if (r1 == 0) goto L_0x006b
            java.lang.reflect.Field r1 = f2002a     // Catch:{ IllegalAccessException -> 0x0063 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ IllegalAccessException -> 0x0063 }
            goto L_0x006c
        L_0x0063:
            r5 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r1, r2, r5)
        L_0x006b:
            r5 = r0
        L_0x006c:
            if (r5 == 0) goto L_0x0071
            m2918a(r5)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.app.C0722e.m2921d(android.content.res.Resources):void");
    }

    /* renamed from: a */
    private static void m2918a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2005d) {
            try {
                f2004c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2005d = true;
        }
        if (f2004c != null) {
            if (!f2007f) {
                try {
                    f2006e = f2004c.getDeclaredField("mUnthemedEntries");
                    f2006e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f2007f = true;
            }
            if (f2006e != null) {
                try {
                    longSparseArray = (LongSparseArray) f2006e.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
