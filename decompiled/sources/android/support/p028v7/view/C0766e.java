package android.support.p028v7.view;

import android.content.Context;
import android.support.p028v7.view.C0762b.C0763a;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
/* compiled from: StandaloneActionMode */
public class C0766e extends C0762b implements C0791a {

    /* renamed from: a */
    private Context f2158a;

    /* renamed from: b */
    private ActionBarContextView f2159b;

    /* renamed from: c */
    private C0763a f2160c;

    /* renamed from: d */
    private WeakReference<View> f2161d;

    /* renamed from: e */
    private boolean f2162e;

    /* renamed from: f */
    private boolean f2163f;

    /* renamed from: g */
    private C0790h f2164g;

    public C0766e(Context context, ActionBarContextView actionBarContextView, C0763a aVar, boolean z) {
        this.f2158a = context;
        this.f2159b = actionBarContextView;
        this.f2160c = aVar;
        this.f2164g = new C0790h(actionBarContextView.getContext()).mo3156a(1);
        this.f2164g.mo3164a((C0791a) this);
        this.f2163f = z;
    }

    /* renamed from: b */
    public void mo2807b(CharSequence charSequence) {
        this.f2159b.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo2803a(CharSequence charSequence) {
        this.f2159b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo2801a(int i) {
        mo2807b((CharSequence) this.f2158a.getString(i));
    }

    /* renamed from: b */
    public void mo2806b(int i) {
        mo2803a((CharSequence) this.f2158a.getString(i));
    }

    /* renamed from: a */
    public void mo2804a(boolean z) {
        super.mo2804a(z);
        this.f2159b.setTitleOptional(z);
    }

    /* renamed from: h */
    public boolean mo2813h() {
        return this.f2159b.mo3442d();
    }

    /* renamed from: a */
    public void mo2802a(View view) {
        this.f2159b.setCustomView(view);
        this.f2161d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: d */
    public void mo2809d() {
        this.f2160c.mo2726b(this, this.f2164g);
    }

    /* renamed from: c */
    public void mo2808c() {
        if (!this.f2162e) {
            this.f2162e = true;
            this.f2159b.sendAccessibilityEvent(32);
            this.f2160c.mo2723a(this);
        }
    }

    /* renamed from: b */
    public Menu mo2805b() {
        return this.f2164g;
    }

    /* renamed from: f */
    public CharSequence mo2811f() {
        return this.f2159b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo2812g() {
        return this.f2159b.getSubtitle();
    }

    /* renamed from: i */
    public View mo2814i() {
        if (this.f2161d != null) {
            return (View) this.f2161d.get();
        }
        return null;
    }

    /* renamed from: a */
    public MenuInflater mo2800a() {
        return new C0769g(this.f2159b.getContext());
    }

    /* renamed from: a */
    public boolean mo2667a(C0790h hVar, MenuItem menuItem) {
        return this.f2160c.mo2725a((C0762b) this, menuItem);
    }

    /* renamed from: a */
    public void mo2661a(C0790h hVar) {
        mo2809d();
        this.f2159b.mo3439a();
    }
}
