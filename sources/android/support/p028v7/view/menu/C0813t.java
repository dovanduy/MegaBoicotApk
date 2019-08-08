package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.widget.C0944af;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
/* compiled from: StandardMenuPopup */
final class C0813t extends C0803m implements C0806o, OnKeyListener, OnItemClickListener, OnDismissListener {

    /* renamed from: e */
    private static final int f2430e = C0679g.abc_popup_menu_item_layout;

    /* renamed from: a */
    final C0944af f2431a;

    /* renamed from: b */
    final OnGlobalLayoutListener f2432b = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0813t.this.mo3124d() && !C0813t.this.f2431a.mo3964g()) {
                View view = C0813t.this.f2433c;
                if (view == null || !view.isShown()) {
                    C0813t.this.mo3121c();
                } else {
                    C0813t.this.f2431a.mo3114a();
                }
            }
        }
    };

    /* renamed from: c */
    View f2433c;

    /* renamed from: d */
    ViewTreeObserver f2434d;

    /* renamed from: f */
    private final Context f2435f;

    /* renamed from: g */
    private final C0790h f2436g;

    /* renamed from: h */
    private final C0789g f2437h;

    /* renamed from: i */
    private final boolean f2438i;

    /* renamed from: j */
    private final int f2439j;

    /* renamed from: k */
    private final int f2440k;

    /* renamed from: l */
    private final int f2441l;

    /* renamed from: m */
    private final OnAttachStateChangeListener f2442m = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0813t.this.f2434d != null) {
                if (!C0813t.this.f2434d.isAlive()) {
                    C0813t.this.f2434d = view.getViewTreeObserver();
                }
                C0813t.this.f2434d.removeGlobalOnLayoutListener(C0813t.this.f2432b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: n */
    private OnDismissListener f2443n;

    /* renamed from: o */
    private View f2444o;

    /* renamed from: p */
    private C0807a f2445p;

    /* renamed from: q */
    private boolean f2446q;

    /* renamed from: r */
    private boolean f2447r;

    /* renamed from: s */
    private int f2448s;

    /* renamed from: t */
    private int f2449t = 0;

    /* renamed from: u */
    private boolean f2450u;

    /* renamed from: a */
    public void mo3116a(C0790h hVar) {
    }

    /* renamed from: b */
    public boolean mo3107b() {
        return false;
    }

    public C0813t(Context context, C0790h hVar, View view, int i, int i2, boolean z) {
        this.f2435f = context;
        this.f2436g = hVar;
        this.f2438i = z;
        this.f2437h = new C0789g(hVar, LayoutInflater.from(context), this.f2438i, f2430e);
        this.f2440k = i;
        this.f2441l = i2;
        Resources resources = context.getResources();
        this.f2439j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0676d.abc_config_prefDialogWidth));
        this.f2444o = view;
        this.f2431a = new C0944af(this.f2435f, null, this.f2440k, this.f2441l);
        hVar.mo3167a((C0806o) this, context);
    }

    /* renamed from: a */
    public void mo3119a(boolean z) {
        this.f2437h.mo3148a(z);
    }

    /* renamed from: a */
    public void mo3115a(int i) {
        this.f2449t = i;
    }

    /* renamed from: h */
    private boolean m3430h() {
        if (mo3124d()) {
            return true;
        }
        if (this.f2446q || this.f2444o == null) {
            return false;
        }
        this.f2433c = this.f2444o;
        this.f2431a.mo3954a((OnDismissListener) this);
        this.f2431a.mo3953a((OnItemClickListener) this);
        this.f2431a.mo3955a(true);
        View view = this.f2433c;
        boolean z = this.f2434d == null;
        this.f2434d = view.getViewTreeObserver();
        if (z) {
            this.f2434d.addOnGlobalLayoutListener(this.f2432b);
        }
        view.addOnAttachStateChangeListener(this.f2442m);
        this.f2431a.mo3957b(view);
        this.f2431a.mo3961e(this.f2449t);
        if (!this.f2447r) {
            this.f2448s = m3379a(this.f2437h, null, this.f2435f, this.f2439j);
            this.f2447r = true;
        }
        this.f2431a.mo3963g(this.f2448s);
        this.f2431a.mo3966h(2);
        this.f2431a.mo3951a(mo3356g());
        this.f2431a.mo3114a();
        ListView e = this.f2431a.mo3125e();
        e.setOnKeyListener(this);
        if (this.f2450u && this.f2436g.mo3213n() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2435f).inflate(C0679g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2436g.mo3213n());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, null, false);
        }
        this.f2431a.mo3722a((ListAdapter) this.f2437h);
        this.f2431a.mo3114a();
        return true;
    }

    /* renamed from: a */
    public void mo3114a() {
        if (!m3430h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo3121c() {
        if (mo3124d()) {
            this.f2431a.mo3121c();
        }
    }

    /* renamed from: d */
    public boolean mo3124d() {
        return !this.f2446q && this.f2431a.mo3124d();
    }

    public void onDismiss() {
        this.f2446q = true;
        this.f2436g.close();
        if (this.f2434d != null) {
            if (!this.f2434d.isAlive()) {
                this.f2434d = this.f2433c.getViewTreeObserver();
            }
            this.f2434d.removeGlobalOnLayoutListener(this.f2432b);
            this.f2434d = null;
        }
        this.f2433c.removeOnAttachStateChangeListener(this.f2442m);
        if (this.f2443n != null) {
            this.f2443n.onDismiss();
        }
    }

    /* renamed from: b */
    public void mo3106b(boolean z) {
        this.f2447r = false;
        if (this.f2437h != null) {
            this.f2437h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo3099a(C0807a aVar) {
        this.f2445p = aVar;
    }

    /* renamed from: a */
    public boolean mo3103a(C0816u uVar) {
        if (uVar.hasVisibleItems()) {
            C0804n nVar = new C0804n(this.f2435f, uVar, this.f2433c, this.f2438i, this.f2440k, this.f2441l);
            nVar.mo3360a(this.f2445p);
            nVar.mo3363a(C0803m.m3381b((C0790h) uVar));
            nVar.mo3362a(this.f2443n);
            this.f2443n = null;
            this.f2436g.mo3170a(false);
            int j = this.f2431a.mo3969j();
            int k = this.f2431a.mo3970k();
            if ((Gravity.getAbsoluteGravity(this.f2449t, C0595r.m2256f(this.f2444o)) & 7) == 5) {
                j += this.f2444o.getWidth();
            }
            if (nVar.mo3364a(j, k)) {
                if (this.f2445p != null) {
                    this.f2445p.mo2722a(uVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo3097a(C0790h hVar, boolean z) {
        if (hVar == this.f2436g) {
            mo3121c();
            if (this.f2445p != null) {
                this.f2445p.mo2721a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo3117a(View view) {
        this.f2444o = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3121c();
        return true;
    }

    /* renamed from: a */
    public void mo3118a(OnDismissListener onDismissListener) {
        this.f2443n = onDismissListener;
    }

    /* renamed from: e */
    public ListView mo3125e() {
        return this.f2431a.mo3125e();
    }

    /* renamed from: b */
    public void mo3120b(int i) {
        this.f2431a.mo3959c(i);
    }

    /* renamed from: c */
    public void mo3122c(int i) {
        this.f2431a.mo3960d(i);
    }

    /* renamed from: c */
    public void mo3123c(boolean z) {
        this.f2450u = z;
    }
}
