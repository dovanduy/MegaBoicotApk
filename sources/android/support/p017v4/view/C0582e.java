package android.support.p017v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.e */
/* compiled from: LayoutInflaterCompat */
public final class C0582e {

    /* renamed from: a */
    private static Field f1424a;

    /* renamed from: b */
    private static boolean f1425b;

    /* renamed from: b */
    private static void m2189b(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1425b) {
            try {
                f1424a = LayoutInflater.class.getDeclaredField("mFactory2");
                f1424a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), e);
            }
            f1425b = true;
        }
        if (f1424a != null) {
            try {
                f1424a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public static void m2188a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m2189b(layoutInflater, (Factory2) factory);
            } else {
                m2189b(layoutInflater, factory2);
            }
        }
    }
}
