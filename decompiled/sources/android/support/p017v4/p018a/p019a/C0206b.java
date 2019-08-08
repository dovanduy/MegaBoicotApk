package android.support.p017v4.p018a.p019a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.p017v4.view.C0572b;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.a.a.b */
/* compiled from: SupportMenuItem */
public interface C0206b extends MenuItem {
    /* renamed from: a */
    C0206b mo492a(C0572b bVar);

    /* renamed from: a */
    C0206b mo493a(CharSequence charSequence);

    /* renamed from: a */
    C0572b mo494a();

    /* renamed from: b */
    C0206b mo495b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
