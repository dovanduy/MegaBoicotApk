package android.support.p028v7.view.menu;

import android.content.Context;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.p018a.p019a.C0207c;
import android.support.p017v4.p023d.C0376a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0779c<T> extends C0780d<T> {

    /* renamed from: a */
    final Context f2287a;

    /* renamed from: c */
    private Map<C0206b, MenuItem> f2288c;

    /* renamed from: d */
    private Map<C0207c, SubMenu> f2289d;

    C0779c(Context context, T t) {
        super(t);
        this.f2287a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo3109a(MenuItem menuItem) {
        if (!(menuItem instanceof C0206b)) {
            return menuItem;
        }
        C0206b bVar = (C0206b) menuItem;
        if (this.f2288c == null) {
            this.f2288c = new C0376a();
        }
        MenuItem menuItem2 = (MenuItem) this.f2288c.get(menuItem);
        if (menuItem2 == null) {
            menuItem2 = C0810q.m3424a(this.f2287a, bVar);
            this.f2288c.put(bVar, menuItem2);
        }
        return menuItem2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo3110a(SubMenu subMenu) {
        if (!(subMenu instanceof C0207c)) {
            return subMenu;
        }
        C0207c cVar = (C0207c) subMenu;
        if (this.f2289d == null) {
            this.f2289d = new C0376a();
        }
        SubMenu subMenu2 = (SubMenu) this.f2289d.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = C0810q.m3425a(this.f2287a, cVar);
            this.f2289d.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3111a() {
        if (this.f2288c != null) {
            this.f2288c.clear();
        }
        if (this.f2289d != null) {
            this.f2289d.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3112a(int i) {
        if (this.f2288c != null) {
            Iterator it = this.f2288c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3113b(int i) {
        if (this.f2288c != null) {
            Iterator it = this.f2288c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
