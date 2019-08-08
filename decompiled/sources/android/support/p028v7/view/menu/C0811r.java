package android.support.p028v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p017v4.p018a.p019a.C0205a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
/* compiled from: MenuWrapperICS */
class C0811r extends C0779c<C0205a> implements Menu {
    C0811r(Context context, C0205a aVar) {
        super(context, aVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3109a(((C0205a) this.f2290b).add(charSequence));
    }

    public MenuItem add(int i) {
        return mo3109a(((C0205a) this.f2290b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3109a(((C0205a) this.f2290b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3109a(((C0205a) this.f2290b).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo3110a(((C0205a) this.f2290b).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return mo3110a(((C0205a) this.f2290b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo3110a(((C0205a) this.f2290b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo3110a(((C0205a) this.f2290b).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0205a) this.f2290b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo3109a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        mo3113b(i);
        ((C0205a) this.f2290b).removeItem(i);
    }

    public void removeGroup(int i) {
        mo3112a(i);
        ((C0205a) this.f2290b).removeGroup(i);
    }

    public void clear() {
        mo3111a();
        ((C0205a) this.f2290b).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0205a) this.f2290b).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0205a) this.f2290b).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0205a) this.f2290b).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((C0205a) this.f2290b).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return mo3109a(((C0205a) this.f2290b).findItem(i));
    }

    public int size() {
        return ((C0205a) this.f2290b).size();
    }

    public MenuItem getItem(int i) {
        return mo3109a(((C0205a) this.f2290b).getItem(i));
    }

    public void close() {
        ((C0205a) this.f2290b).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0205a) this.f2290b).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0205a) this.f2290b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0205a) this.f2290b).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((C0205a) this.f2290b).setQwertyMode(z);
    }
}
