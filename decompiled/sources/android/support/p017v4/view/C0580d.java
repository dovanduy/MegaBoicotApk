package android.support.p017v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.d */
/* compiled from: KeyEventDispatcher */
public class C0580d {

    /* renamed from: a */
    private static boolean f1420a = false;

    /* renamed from: b */
    private static Method f1421b = null;

    /* renamed from: c */
    private static boolean f1422c = false;

    /* renamed from: d */
    private static Field f1423d;

    /* renamed from: android.support.v4.view.d$a */
    /* compiled from: KeyEventDispatcher */
    public interface C0581a {
        /* renamed from: a */
        boolean mo786a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m2186a(View view, KeyEvent keyEvent) {
        return C0595r.m2245a(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m2185a(C0581a aVar, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.mo786a(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2183a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2184a((Dialog) callback, keyEvent);
        }
        if ((view != null && C0595r.m2249b(view, keyEvent)) || aVar.mo786a(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2182a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1420a) {
            try {
                f1421b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f1420a = true;
        }
        if (f1421b != null) {
            try {
                return ((Boolean) f1421b.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2183a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2182a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0595r.m2249b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static OnKeyListener m2181a(Dialog dialog) {
        if (!f1422c) {
            try {
                f1423d = Dialog.class.getDeclaredField("mOnKeyListener");
                f1423d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1422c = true;
        }
        if (f1423d != null) {
            try {
                return (OnKeyListener) f1423d.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m2184a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m2181a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0595r.m2249b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
