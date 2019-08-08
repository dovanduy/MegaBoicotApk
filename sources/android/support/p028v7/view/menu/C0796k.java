package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.view.C0572b;
import android.support.p028v7.view.C0764c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
/* compiled from: MenuItemWrapperICS */
public class C0796k extends C0779c<C0206b> implements MenuItem {

    /* renamed from: c */
    private Method f2408c;

    /* renamed from: android.support.v7.view.menu.k$a */
    /* compiled from: MenuItemWrapperICS */
    class C0797a extends C0572b {

        /* renamed from: a */
        final ActionProvider f2409a;

        public C0797a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2409a = actionProvider;
        }

        /* renamed from: a */
        public View mo2053a() {
            return this.f2409a.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo2061d() {
            return this.f2409a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo2062e() {
            return this.f2409a.hasSubMenu();
        }

        /* renamed from: a */
        public void mo2057a(SubMenu subMenu) {
            this.f2409a.onPrepareSubMenu(C0796k.this.mo3110a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    /* compiled from: MenuItemWrapperICS */
    static class C0798b extends FrameLayout implements C0764c {

        /* renamed from: a */
        final CollapsibleActionView f2411a;

        C0798b(View view) {
            super(view.getContext());
            this.f2411a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo2956a() {
            this.f2411a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo2957b() {
            this.f2411a.onActionViewCollapsed();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo3350c() {
            return (View) this.f2411a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    /* compiled from: MenuItemWrapperICS */
    private class C0799c extends C0780d<OnActionExpandListener> implements OnActionExpandListener {
        C0799c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f2290b).onMenuItemActionExpand(C0796k.this.mo3109a(menuItem));
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f2290b).onMenuItemActionCollapse(C0796k.this.mo3109a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0800d extends C0780d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        C0800d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f2290b).onMenuItemClick(C0796k.this.mo3109a(menuItem));
        }
    }

    C0796k(Context context, C0206b bVar) {
        super(context, bVar);
    }

    public int getItemId() {
        return ((C0206b) this.f2290b).getItemId();
    }

    public int getGroupId() {
        return ((C0206b) this.f2290b).getGroupId();
    }

    public int getOrder() {
        return ((C0206b) this.f2290b).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0206b) this.f2290b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0206b) this.f2290b).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((C0206b) this.f2290b).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0206b) this.f2290b).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((C0206b) this.f2290b).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0206b) this.f2290b).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0206b) this.f2290b).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((C0206b) this.f2290b).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((C0206b) this.f2290b).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((C0206b) this.f2290b).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0206b) this.f2290b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0206b) this.f2290b).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0206b) this.f2290b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0206b) this.f2290b).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((C0206b) this.f2290b).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((C0206b) this.f2290b).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0206b) this.f2290b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0206b) this.f2290b).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((C0206b) this.f2290b).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((C0206b) this.f2290b).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((C0206b) this.f2290b).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((C0206b) this.f2290b).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((C0206b) this.f2290b).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((C0206b) this.f2290b).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((C0206b) this.f2290b).setVisible(z);
    }

    public boolean isVisible() {
        return ((C0206b) this.f2290b).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((C0206b) this.f2290b).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((C0206b) this.f2290b).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((C0206b) this.f2290b).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return mo3110a(((C0206b) this.f2290b).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0206b) this.f2290b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0800d(onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0206b) this.f2290b).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((C0206b) this.f2290b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0206b) this.f2290b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0798b(view);
        }
        ((C0206b) this.f2290b).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0206b) this.f2290b).setActionView(i);
        View actionView = ((C0206b) this.f2290b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0206b) this.f2290b).setActionView((View) new C0798b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((C0206b) this.f2290b).getActionView();
        return actionView instanceof C0798b ? ((C0798b) actionView).mo3350c() : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0206b) this.f2290b).mo492a((C0572b) actionProvider != null ? mo3294a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        C0572b a = ((C0206b) this.f2290b).mo494a();
        if (a instanceof C0797a) {
            return ((C0797a) a).f2409a;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((C0206b) this.f2290b).expandActionView();
    }

    public boolean collapseActionView() {
        return ((C0206b) this.f2290b).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((C0206b) this.f2290b).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0206b) this.f2290b).setOnActionExpandListener(onActionExpandListener != null ? new C0799c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0206b) this.f2290b).mo493a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((C0206b) this.f2290b).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0206b) this.f2290b).mo495b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((C0206b) this.f2290b).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0206b) this.f2290b).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((C0206b) this.f2290b).getIconTintList();
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0206b) this.f2290b).setIconTintMode(mode);
        return this;
    }

    public Mode getIconTintMode() {
        return ((C0206b) this.f2290b).getIconTintMode();
    }

    /* renamed from: a */
    public void mo3295a(boolean z) {
        try {
            if (this.f2408c == null) {
                this.f2408c = ((C0206b) this.f2290b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2408c.invoke(this.f2290b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0797a mo3294a(ActionProvider actionProvider) {
        return new C0797a(this.f2287a, actionProvider);
    }
}
