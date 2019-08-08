package android.support.p017v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.p017v4.p018a.p019a.C0206b;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: android.support.v4.view.g */
/* compiled from: MenuItemCompat */
public final class C0584g {
    /* renamed from: a */
    public static MenuItem m2192a(MenuItem menuItem, C0572b bVar) {
        if (menuItem instanceof C0206b) {
            return ((C0206b) menuItem).mo492a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m2196a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).mo493a(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m2198b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).mo495b(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m2193a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m2197b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m2194a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2195a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0206b) {
            ((C0206b) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
