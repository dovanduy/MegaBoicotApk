package android.support.p017v4.widget;

import android.os.Build.VERSION;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0595r;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.m */
/* compiled from: PopupWindowCompat */
public final class C0658m {

    /* renamed from: a */
    private static Method f1732a;

    /* renamed from: b */
    private static boolean f1733b;

    /* renamed from: c */
    private static Field f1734c;

    /* renamed from: d */
    private static boolean f1735d;

    /* renamed from: a */
    public static void m2606a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0579c.m2179a(i3, C0595r.m2256f(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m2607a(PopupWindow popupWindow, boolean z) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (VERSION.SDK_INT >= 21) {
            if (!f1735d) {
                try {
                    f1734c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1734c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f1735d = true;
            }
            if (f1734c != null) {
                try {
                    f1734c.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2605a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f1733b) {
            try {
                f1732a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f1732a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1733b = true;
        }
        if (f1732a != null) {
            try {
                f1732a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
