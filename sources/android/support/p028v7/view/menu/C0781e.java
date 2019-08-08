package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.widget.C0943ae;
import android.support.p028v7.widget.C0944af;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
/* compiled from: CascadingMenuPopup */
final class C0781e extends C0803m implements C0806o, OnKeyListener, OnDismissListener {

    /* renamed from: g */
    private static final int f2291g = C0679g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private OnDismissListener f2292A;

    /* renamed from: a */
    final Handler f2293a;

    /* renamed from: b */
    final List<C0786a> f2294b = new ArrayList();

    /* renamed from: c */
    final OnGlobalLayoutListener f2295c = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0781e.this.mo3124d() && C0781e.this.f2294b.size() > 0 && !((C0786a) C0781e.this.f2294b.get(0)).f2325a.mo3964g()) {
                View view = C0781e.this.f2296d;
                if (view == null || !view.isShown()) {
                    C0781e.this.mo3121c();
                    return;
                }
                for (C0786a aVar : C0781e.this.f2294b) {
                    aVar.f2325a.mo3114a();
                }
            }
        }
    };

    /* renamed from: d */
    View f2296d;

    /* renamed from: e */
    ViewTreeObserver f2297e;

    /* renamed from: f */
    boolean f2298f;

    /* renamed from: h */
    private final Context f2299h;

    /* renamed from: i */
    private final int f2300i;

    /* renamed from: j */
    private final int f2301j;

    /* renamed from: k */
    private final int f2302k;

    /* renamed from: l */
    private final boolean f2303l;

    /* renamed from: m */
    private final List<C0790h> f2304m = new ArrayList();

    /* renamed from: n */
    private final OnAttachStateChangeListener f2305n = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0781e.this.f2297e != null) {
                if (!C0781e.this.f2297e.isAlive()) {
                    C0781e.this.f2297e = view.getViewTreeObserver();
                }
                C0781e.this.f2297e.removeGlobalOnLayoutListener(C0781e.this.f2295c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private final C0943ae f2306o = new C0943ae() {
        /* renamed from: a */
        public void mo3132a(C0790h hVar, MenuItem menuItem) {
            C0781e.this.f2293a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo3133b(final C0790h hVar, final MenuItem menuItem) {
            final C0786a aVar = null;
            C0781e.this.f2293a.removeCallbacksAndMessages(null);
            int size = C0781e.this.f2294b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == ((C0786a) C0781e.this.f2294b.get(i)).f2326b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0781e.this.f2294b.size()) {
                    aVar = (C0786a) C0781e.this.f2294b.get(i2);
                }
                C0781e.this.f2293a.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C0781e.this.f2298f = true;
                            aVar.f2326b.mo3170a(false);
                            C0781e.this.f2298f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo3172a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: p */
    private int f2307p = 0;

    /* renamed from: q */
    private int f2308q = 0;

    /* renamed from: r */
    private View f2309r;

    /* renamed from: s */
    private int f2310s;

    /* renamed from: t */
    private boolean f2311t;

    /* renamed from: u */
    private boolean f2312u;

    /* renamed from: v */
    private int f2313v;

    /* renamed from: w */
    private int f2314w;

    /* renamed from: x */
    private boolean f2315x;

    /* renamed from: y */
    private boolean f2316y;

    /* renamed from: z */
    private C0807a f2317z;

    /* renamed from: android.support.v7.view.menu.e$a */
    /* compiled from: CascadingMenuPopup */
    private static class C0786a {

        /* renamed from: a */
        public final C0944af f2325a;

        /* renamed from: b */
        public final C0790h f2326b;

        /* renamed from: c */
        public final int f2327c;

        public C0786a(C0944af afVar, C0790h hVar, int i) {
            this.f2325a = afVar;
            this.f2326b = hVar;
            this.f2327c = i;
        }

        /* renamed from: a */
        public ListView mo3135a() {
            return this.f2325a.mo3125e();
        }
    }

    /* renamed from: b */
    public boolean mo3107b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo3126f() {
        return false;
    }

    public C0781e(Context context, View view, int i, int i2, boolean z) {
        this.f2299h = context;
        this.f2309r = view;
        this.f2301j = i;
        this.f2302k = i2;
        this.f2303l = z;
        this.f2315x = false;
        this.f2310s = m3233i();
        Resources resources = context.getResources();
        this.f2300i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0676d.abc_config_prefDialogWidth));
        this.f2293a = new Handler();
    }

    /* renamed from: a */
    public void mo3119a(boolean z) {
        this.f2315x = z;
    }

    /* renamed from: h */
    private C0944af m3232h() {
        C0944af afVar = new C0944af(this.f2299h, null, this.f2301j, this.f2302k);
        afVar.mo4893a(this.f2306o);
        afVar.mo3953a((OnItemClickListener) this);
        afVar.mo3954a((OnDismissListener) this);
        afVar.mo3957b(this.f2309r);
        afVar.mo3961e(this.f2308q);
        afVar.mo3955a(true);
        afVar.mo3966h(2);
        return afVar;
    }

    /* renamed from: a */
    public void mo3114a() {
        if (!mo3124d()) {
            for (C0790h c : this.f2304m) {
                m3229c(c);
            }
            this.f2304m.clear();
            this.f2296d = this.f2309r;
            if (this.f2296d != null) {
                boolean z = this.f2297e == null;
                this.f2297e = this.f2296d.getViewTreeObserver();
                if (z) {
                    this.f2297e.addOnGlobalLayoutListener(this.f2295c);
                }
                this.f2296d.addOnAttachStateChangeListener(this.f2305n);
            }
        }
    }

    /* renamed from: c */
    public void mo3121c() {
        int size = this.f2294b.size();
        if (size > 0) {
            C0786a[] aVarArr = (C0786a[]) this.f2294b.toArray(new C0786a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0786a aVar = aVarArr[i];
                if (aVar.f2325a.mo3124d()) {
                    aVar.f2325a.mo3121c();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3121c();
        return true;
    }

    /* renamed from: i */
    private int m3233i() {
        return C0595r.m2256f(this.f2309r) == 1 ? 0 : 1;
    }

    /* renamed from: d */
    private int m3230d(int i) {
        ListView a = ((C0786a) this.f2294b.get(this.f2294b.size() - 1)).mo3135a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2296d.getWindowVisibleDisplayFrame(rect);
        if (this.f2310s == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo3116a(C0790h hVar) {
        hVar.mo3167a((C0806o) this, this.f2299h);
        if (mo3124d()) {
            m3229c(hVar);
        } else {
            this.f2304m.add(hVar);
        }
    }

    /* renamed from: c */
    private void m3229c(C0790h hVar) {
        View view;
        C0786a aVar;
        int i;
        int i2;
        LayoutInflater from = LayoutInflater.from(this.f2299h);
        C0789g gVar = new C0789g(hVar, from, this.f2303l, f2291g);
        if (!mo3124d() && this.f2315x) {
            gVar.mo3148a(true);
        } else if (mo3124d()) {
            gVar.mo3148a(C0803m.m3381b(hVar));
        }
        int a = m3379a(gVar, null, this.f2299h, this.f2300i);
        C0944af h = m3232h();
        h.mo3722a((ListAdapter) gVar);
        h.mo3963g(a);
        h.mo3961e(this.f2308q);
        if (this.f2294b.size() > 0) {
            aVar = (C0786a) this.f2294b.get(this.f2294b.size() - 1);
            view = m3228a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h.mo4896c(false);
            h.mo4894a((Object) null);
            int d = m3230d(a);
            boolean z = d == 1;
            this.f2310s = d;
            if (VERSION.SDK_INT >= 26) {
                h.mo3957b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2309r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2308q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2309r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            int i3 = (this.f2308q & 5) == 5 ? z ? i + a : i - view.getWidth() : z ? i + view.getWidth() : i - a;
            h.mo3959c(i3);
            h.mo3958b(true);
            h.mo3960d(i2);
        } else {
            if (this.f2311t) {
                h.mo3959c(this.f2313v);
            }
            if (this.f2312u) {
                h.mo3960d(this.f2314w);
            }
            h.mo3951a(mo3356g());
        }
        this.f2294b.add(new C0786a(h, hVar, this.f2310s));
        h.mo3114a();
        ListView e = h.mo3125e();
        e.setOnKeyListener(this);
        if (aVar == null && this.f2316y && hVar.mo3213n() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0679g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(hVar.mo3213n());
            e.addHeaderView(frameLayout, null, false);
            h.mo3114a();
        }
    }

    /* renamed from: a */
    private MenuItem m3227a(C0790h hVar, C0790h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m3228a(C0786a aVar, C0790h hVar) {
        int i;
        C0789g gVar;
        MenuItem a = m3227a(aVar.f2326b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo3135a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0789g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0789g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: d */
    public boolean mo3124d() {
        return this.f2294b.size() > 0 && ((C0786a) this.f2294b.get(0)).f2325a.mo3124d();
    }

    public void onDismiss() {
        C0786a aVar;
        int size = this.f2294b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0786a) this.f2294b.get(i);
            if (!aVar.f2325a.mo3124d()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f2326b.mo3170a(false);
        }
    }

    /* renamed from: b */
    public void mo3106b(boolean z) {
        for (C0786a a : this.f2294b) {
            m3380a(a.mo3135a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo3099a(C0807a aVar) {
        this.f2317z = aVar;
    }

    /* renamed from: a */
    public boolean mo3103a(C0816u uVar) {
        for (C0786a aVar : this.f2294b) {
            if (uVar == aVar.f2326b) {
                aVar.mo3135a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo3116a((C0790h) uVar);
        if (this.f2317z != null) {
            this.f2317z.mo2722a(uVar);
        }
        return true;
    }

    /* renamed from: d */
    private int m3231d(C0790h hVar) {
        int size = this.f2294b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == ((C0786a) this.f2294b.get(i)).f2326b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo3097a(C0790h hVar, boolean z) {
        int d = m3231d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f2294b.size()) {
                ((C0786a) this.f2294b.get(i)).f2326b.mo3170a(false);
            }
            C0786a aVar = (C0786a) this.f2294b.remove(d);
            aVar.f2326b.mo3186b((C0806o) this);
            if (this.f2298f) {
                aVar.f2325a.mo4895b(null);
                aVar.f2325a.mo3956b(0);
            }
            aVar.f2325a.mo3121c();
            int size = this.f2294b.size();
            if (size > 0) {
                this.f2310s = ((C0786a) this.f2294b.get(size - 1)).f2327c;
            } else {
                this.f2310s = m3233i();
            }
            if (size == 0) {
                mo3121c();
                if (this.f2317z != null) {
                    this.f2317z.mo2721a(hVar, true);
                }
                if (this.f2297e != null) {
                    if (this.f2297e.isAlive()) {
                        this.f2297e.removeGlobalOnLayoutListener(this.f2295c);
                    }
                    this.f2297e = null;
                }
                this.f2296d.removeOnAttachStateChangeListener(this.f2305n);
                this.f2292A.onDismiss();
            } else if (z) {
                ((C0786a) this.f2294b.get(0)).f2326b.mo3170a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo3115a(int i) {
        if (this.f2307p != i) {
            this.f2307p = i;
            this.f2308q = C0579c.m2179a(i, C0595r.m2256f(this.f2309r));
        }
    }

    /* renamed from: a */
    public void mo3117a(View view) {
        if (this.f2309r != view) {
            this.f2309r = view;
            this.f2308q = C0579c.m2179a(this.f2307p, C0595r.m2256f(this.f2309r));
        }
    }

    /* renamed from: a */
    public void mo3118a(OnDismissListener onDismissListener) {
        this.f2292A = onDismissListener;
    }

    /* renamed from: e */
    public ListView mo3125e() {
        if (this.f2294b.isEmpty()) {
            return null;
        }
        return ((C0786a) this.f2294b.get(this.f2294b.size() - 1)).mo3135a();
    }

    /* renamed from: b */
    public void mo3120b(int i) {
        this.f2311t = true;
        this.f2313v = i;
    }

    /* renamed from: c */
    public void mo3122c(int i) {
        this.f2312u = true;
        this.f2314w = i;
    }

    /* renamed from: c */
    public void mo3123c(boolean z) {
        this.f2316y = z;
    }
}
