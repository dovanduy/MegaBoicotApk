package android.support.p017v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.d */
/* compiled from: BundleCompat */
public final class C0248d {

    /* renamed from: android.support.v4.app.d$a */
    /* compiled from: BundleCompat */
    static class C0249a {

        /* renamed from: a */
        private static Method f513a;

        /* renamed from: b */
        private static boolean f514b;

        /* renamed from: c */
        private static Method f515c;

        /* renamed from: d */
        private static boolean f516d;

        /* renamed from: a */
        public static IBinder m760a(Bundle bundle, String str) {
            if (!f514b) {
                try {
                    f513a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f513a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f514b = true;
            }
            if (f513a != null) {
                try {
                    return (IBinder) f513a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f513a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m761a(Bundle bundle, String str, IBinder iBinder) {
            if (!f516d) {
                try {
                    f515c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f515c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f516d = true;
            }
            if (f515c != null) {
                try {
                    f515c.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f515c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m758a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0249a.m760a(bundle, str);
    }

    /* renamed from: a */
    public static void m759a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0249a.m761a(bundle, str, iBinder);
        }
    }
}
