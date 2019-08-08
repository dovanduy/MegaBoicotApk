package android.support.p028v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
/* compiled from: SubMenuBuilder */
public class C0816u extends C0790h implements SubMenu {

    /* renamed from: d */
    private C0790h f2453d;

    /* renamed from: e */
    private C0794j f2454e;

    public C0816u(Context context, C0790h hVar, C0794j jVar) {
        super(context);
        this.f2453d = hVar;
        this.f2454e = jVar;
    }

    public void setQwertyMode(boolean z) {
        this.f2453d.setQwertyMode(z);
    }

    /* renamed from: c */
    public boolean mo3191c() {
        return this.f2453d.mo3191c();
    }

    /* renamed from: d */
    public boolean mo3197d() {
        return this.f2453d.mo3197d();
    }

    /* renamed from: t */
    public Menu mo3408t() {
        return this.f2453d;
    }

    public MenuItem getItem() {
        return this.f2454e;
    }

    /* renamed from: a */
    public void mo3164a(C0791a aVar) {
        this.f2453d.mo3164a(aVar);
    }

    /* renamed from: q */
    public C0790h mo3218q() {
        return this.f2453d.mo3218q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3171a(C0790h hVar, MenuItem menuItem) {
        return super.mo3171a(hVar, menuItem) || this.f2453d.mo3171a(hVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2454e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f2454e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo3157a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo3200e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo3159a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo3196d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo3158a(view);
    }

    /* renamed from: c */
    public boolean mo3192c(C0794j jVar) {
        return this.f2453d.mo3192c(jVar);
    }

    /* renamed from: d */
    public boolean mo3198d(C0794j jVar) {
        return this.f2453d.mo3198d(jVar);
    }

    /* renamed from: a */
    public String mo3162a() {
        int itemId = this.f2454e != null ? this.f2454e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo3162a());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f2453d.setGroupDividerEnabled(z);
    }

    /* renamed from: b */
    public boolean mo3188b() {
        return this.f2453d.mo3188b();
    }
}
