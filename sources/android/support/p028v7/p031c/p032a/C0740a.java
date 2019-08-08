package android.support.p028v7.p031c.p032a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.content.p022a.C0340a;
import android.support.p028v7.widget.C1007g;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.c.a.a */
/* compiled from: AppCompatResources */
public final class C0740a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2075a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0741a>> f2076b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2077c = new Object();

    /* renamed from: android.support.v7.c.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C0741a {

        /* renamed from: a */
        final ColorStateList f2078a;

        /* renamed from: b */
        final Configuration f2079b;

        C0741a(ColorStateList colorStateList, Configuration configuration) {
            this.f2078a = colorStateList;
            this.f2079b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m3005a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m3010d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m3009c(context, i);
        if (c == null) {
            return C0356c.m1319b(context, i);
        }
        m3007a(context, i, c);
        return c;
    }

    /* renamed from: b */
    public static Drawable m3008b(Context context, int i) {
        return C1007g.m4568a().mo5238a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m3009c(Context context, int i) {
        if (m3011e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0340a.m1252a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3010d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f2077c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.c.a.a$a>> r1 = f2076b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.c.a.a$a r2 = (android.support.p028v7.p031c.p032a.C0740a.C0741a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f2079b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f2078a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.p031c.p032a.C0740a.m3010d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m3007a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2077c) {
            SparseArray sparseArray = (SparseArray) f2076b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2076b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0741a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e */
    private static boolean m3011e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m3006a();
        resources.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static TypedValue m3006a() {
        TypedValue typedValue = (TypedValue) f2075a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2075a.set(typedValue2);
        return typedValue2;
    }
}
