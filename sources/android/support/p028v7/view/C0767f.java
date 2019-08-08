package android.support.p028v7.view;

import android.content.Context;
import android.support.p017v4.p018a.p019a.C0205a;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.p023d.C0398m;
import android.support.p028v7.view.C0762b.C0763a;
import android.support.p028v7.view.menu.C0810q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
/* compiled from: SupportActionModeWrapper */
public class C0767f extends ActionMode {

    /* renamed from: a */
    final Context f2165a;

    /* renamed from: b */
    final C0762b f2166b;

    /* renamed from: android.support.v7.view.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C0768a implements C0763a {

        /* renamed from: a */
        final Callback f2167a;

        /* renamed from: b */
        final Context f2168b;

        /* renamed from: c */
        final ArrayList<C0767f> f2169c = new ArrayList<>();

        /* renamed from: d */
        final C0398m<Menu, Menu> f2170d = new C0398m<>();

        public C0768a(Context context, Callback callback) {
            this.f2168b = context;
            this.f2167a = callback;
        }

        /* renamed from: a */
        public boolean mo2724a(C0762b bVar, Menu menu) {
            return this.f2167a.onCreateActionMode(mo2983b(bVar), m3148a(menu));
        }

        /* renamed from: b */
        public boolean mo2726b(C0762b bVar, Menu menu) {
            return this.f2167a.onPrepareActionMode(mo2983b(bVar), m3148a(menu));
        }

        /* renamed from: a */
        public boolean mo2725a(C0762b bVar, MenuItem menuItem) {
            return this.f2167a.onActionItemClicked(mo2983b(bVar), C0810q.m3424a(this.f2168b, (C0206b) menuItem));
        }

        /* renamed from: a */
        public void mo2723a(C0762b bVar) {
            this.f2167a.onDestroyActionMode(mo2983b(bVar));
        }

        /* renamed from: a */
        private Menu m3148a(Menu menu) {
            Menu menu2 = (Menu) this.f2170d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0810q.m3423a(this.f2168b, (C0205a) menu);
            this.f2170d.put(menu, a);
            return a;
        }

        /* renamed from: b */
        public ActionMode mo2983b(C0762b bVar) {
            int size = this.f2169c.size();
            for (int i = 0; i < size; i++) {
                C0767f fVar = (C0767f) this.f2169c.get(i);
                if (fVar != null && fVar.f2166b == bVar) {
                    return fVar;
                }
            }
            C0767f fVar2 = new C0767f(this.f2168b, bVar);
            this.f2169c.add(fVar2);
            return fVar2;
        }
    }

    public C0767f(Context context, C0762b bVar) {
        this.f2165a = context;
        this.f2166b = bVar;
    }

    public Object getTag() {
        return this.f2166b.mo2954j();
    }

    public void setTag(Object obj) {
        this.f2166b.mo2953a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2166b.mo2807b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2166b.mo2803a(charSequence);
    }

    public void invalidate() {
        this.f2166b.mo2809d();
    }

    public void finish() {
        this.f2166b.mo2808c();
    }

    public Menu getMenu() {
        return C0810q.m3423a(this.f2165a, (C0205a) this.f2166b.mo2805b());
    }

    public CharSequence getTitle() {
        return this.f2166b.mo2811f();
    }

    public void setTitle(int i) {
        this.f2166b.mo2801a(i);
    }

    public CharSequence getSubtitle() {
        return this.f2166b.mo2812g();
    }

    public void setSubtitle(int i) {
        this.f2166b.mo2806b(i);
    }

    public View getCustomView() {
        return this.f2166b.mo2814i();
    }

    public void setCustomView(View view) {
        this.f2166b.mo2802a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f2166b.mo2800a();
    }

    public boolean getTitleOptionalHint() {
        return this.f2166b.mo2955k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2166b.mo2804a(z);
    }

    public boolean isTitleOptional() {
        return this.f2166b.mo2813h();
    }
}
