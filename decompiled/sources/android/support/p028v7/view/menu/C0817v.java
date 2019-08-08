package android.support.p028v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p017v4.p018a.p019a.C0207c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
/* compiled from: SubMenuWrapperICS */
class C0817v extends C0811r implements SubMenu {
    C0817v(Context context, C0207c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public C0207c mo3409b() {
        return (C0207c) this.f2290b;
    }

    public SubMenu setHeaderTitle(int i) {
        mo3409b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo3409b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        mo3409b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo3409b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo3409b().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        mo3409b().clearHeader();
    }

    public SubMenu setIcon(int i) {
        mo3409b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo3409b().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return mo3109a(mo3409b().getItem());
    }
}
