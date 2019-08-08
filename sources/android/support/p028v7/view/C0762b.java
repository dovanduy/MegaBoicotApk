package android.support.p028v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
/* compiled from: ActionMode */
public abstract class C0762b {

    /* renamed from: a */
    private Object f2151a;

    /* renamed from: b */
    private boolean f2152b;

    /* renamed from: android.support.v7.view.b$a */
    /* compiled from: ActionMode */
    public interface C0763a {
        /* renamed from: a */
        void mo2723a(C0762b bVar);

        /* renamed from: a */
        boolean mo2724a(C0762b bVar, Menu menu);

        /* renamed from: a */
        boolean mo2725a(C0762b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo2726b(C0762b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo2800a();

    /* renamed from: a */
    public abstract void mo2801a(int i);

    /* renamed from: a */
    public abstract void mo2802a(View view);

    /* renamed from: a */
    public abstract void mo2803a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo2805b();

    /* renamed from: b */
    public abstract void mo2806b(int i);

    /* renamed from: b */
    public abstract void mo2807b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo2808c();

    /* renamed from: d */
    public abstract void mo2809d();

    /* renamed from: f */
    public abstract CharSequence mo2811f();

    /* renamed from: g */
    public abstract CharSequence mo2812g();

    /* renamed from: h */
    public boolean mo2813h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo2814i();

    /* renamed from: a */
    public void mo2953a(Object obj) {
        this.f2151a = obj;
    }

    /* renamed from: j */
    public Object mo2954j() {
        return this.f2151a;
    }

    /* renamed from: a */
    public void mo2804a(boolean z) {
        this.f2152b = z;
    }

    /* renamed from: k */
    public boolean mo2955k() {
        return this.f2152b;
    }
}
