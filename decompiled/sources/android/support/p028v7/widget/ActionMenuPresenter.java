package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.view.C0572b;
import android.support.p017v4.view.C0572b.C0573a;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.view.C0761a;
import android.support.p028v7.view.menu.ActionMenuItemView;
import android.support.p028v7.view.menu.ActionMenuItemView.C0776b;
import android.support.p028v7.view.menu.C0778b;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0794j;
import android.support.p028v7.view.menu.C0804n;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0808p;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.support.p028v7.view.menu.C0812s;
import android.support.p028v7.view.menu.C0816u;
import android.support.p028v7.widget.ActionMenuView.C0831a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
class ActionMenuPresenter extends C0778b implements C0573a {

    /* renamed from: A */
    private C0825b f2509A;

    /* renamed from: g */
    C0827d f2510g;

    /* renamed from: h */
    C0829e f2511h;

    /* renamed from: i */
    C0824a f2512i;

    /* renamed from: j */
    C0826c f2513j;

    /* renamed from: k */
    final C0830f f2514k = new C0830f();

    /* renamed from: l */
    int f2515l;

    /* renamed from: m */
    private Drawable f2516m;

    /* renamed from: n */
    private boolean f2517n;

    /* renamed from: o */
    private boolean f2518o;

    /* renamed from: p */
    private boolean f2519p;

    /* renamed from: q */
    private int f2520q;

    /* renamed from: r */
    private int f2521r;

    /* renamed from: s */
    private int f2522s;

    /* renamed from: t */
    private boolean f2523t;

    /* renamed from: u */
    private boolean f2524u;

    /* renamed from: v */
    private boolean f2525v;

    /* renamed from: w */
    private boolean f2526w;

    /* renamed from: x */
    private int f2527x;

    /* renamed from: y */
    private final SparseBooleanArray f2528y = new SparseBooleanArray();

    /* renamed from: z */
    private View f2529z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        public int f2530a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2530a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2530a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    private class C0824a extends C0804n {
        public C0824a(Context context, C0816u uVar, View view) {
            super(context, uVar, view, false, C0673a.actionOverflowMenuStyle);
            if (!((C0794j) uVar.getItem()).mo3270j()) {
                mo3361a(ActionMenuPresenter.this.f2510g == null ? (View) ActionMenuPresenter.this.f2282f : ActionMenuPresenter.this.f2510g);
            }
            mo3360a((C0807a) ActionMenuPresenter.this.f2514k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3368e() {
            ActionMenuPresenter.this.f2512i = null;
            ActionMenuPresenter.this.f2515l = 0;
            super.mo3368e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    private class C0825b extends C0776b {
        C0825b() {
        }

        /* renamed from: a */
        public C0812s mo3038a() {
            if (ActionMenuPresenter.this.f2512i != null) {
                return ActionMenuPresenter.this.f2512i.mo3365b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    private class C0826c implements Runnable {

        /* renamed from: b */
        private C0829e f2534b;

        public C0826c(C0829e eVar) {
            this.f2534b = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f2279c != null) {
                ActionMenuPresenter.this.f2279c.mo3203g();
            }
            View view = (View) ActionMenuPresenter.this.f2282f;
            if (!(view == null || view.getWindowToken() == null || !this.f2534b.mo3366c())) {
                ActionMenuPresenter.this.f2511h = this.f2534b;
            }
            ActionMenuPresenter.this.f2513j = null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    private class C0827d extends AppCompatImageView implements C0831a {

        /* renamed from: b */
        private final float[] f2536b = new float[2];

        /* renamed from: c */
        public boolean mo3020c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo3021d() {
            return false;
        }

        public C0827d(Context context) {
            super(context, null, C0673a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0982ba.m4432a(this, getContentDescription());
            setOnTouchListener(new C0934aa(this, ActionMenuPresenter.this) {
                /* renamed from: a */
                public C0812s mo3036a() {
                    if (ActionMenuPresenter.this.f2511h == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f2511h.mo3365b();
                }

                /* renamed from: b */
                public boolean mo3037b() {
                    ActionMenuPresenter.this.mo3515d();
                    return true;
                }

                /* renamed from: c */
                public boolean mo3530c() {
                    if (ActionMenuPresenter.this.f2513j != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo3516e();
                    return true;
                }
            });
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo3515d();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0407a.m1539a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    private class C0829e extends C0804n {
        public C0829e(Context context, C0790h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0673a.actionOverflowMenuStyle);
            mo3359a(8388613);
            mo3360a((C0807a) ActionMenuPresenter.this.f2514k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3368e() {
            if (ActionMenuPresenter.this.f2279c != null) {
                ActionMenuPresenter.this.f2279c.close();
            }
            ActionMenuPresenter.this.f2511h = null;
            super.mo3368e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    private class C0830f implements C0807a {
        C0830f() {
        }

        /* renamed from: a */
        public boolean mo2722a(C0790h hVar) {
            boolean z = false;
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f2515l = ((C0816u) hVar).getItem().getItemId();
            C0807a a = ActionMenuPresenter.this.mo3092a();
            if (a != null) {
                z = a.mo2722a(hVar);
            }
            return z;
        }

        /* renamed from: a */
        public void mo2721a(C0790h hVar, boolean z) {
            if (hVar instanceof C0816u) {
                hVar.mo3218q().mo3170a(false);
            }
            C0807a a = ActionMenuPresenter.this.mo3092a();
            if (a != null) {
                a.mo2721a(hVar, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0679g.abc_action_menu_layout, C0679g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public void mo3096a(Context context, C0790h hVar) {
        super.mo3096a(context, hVar);
        Resources resources = context.getResources();
        C0761a a = C0761a.m3097a(context);
        if (!this.f2519p) {
            this.f2518o = a.mo2947b();
        }
        if (!this.f2525v) {
            this.f2520q = a.mo2948c();
        }
        if (!this.f2523t) {
            this.f2522s = a.mo2946a();
        }
        int i = this.f2520q;
        if (this.f2518o) {
            if (this.f2510g == null) {
                this.f2510g = new C0827d(this.f2277a);
                if (this.f2517n) {
                    this.f2510g.setImageDrawable(this.f2516m);
                    this.f2516m = null;
                    this.f2517n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f2510g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2510g.getMeasuredWidth();
        } else {
            this.f2510g = null;
        }
        this.f2521r = i;
        this.f2527x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f2529z = null;
    }

    /* renamed from: a */
    public void mo3509a(Configuration configuration) {
        if (!this.f2523t) {
            this.f2522s = C0761a.m3097a(this.f2278b).mo2946a();
        }
        if (this.f2279c != null) {
            this.f2279c.mo3187b(true);
        }
    }

    /* renamed from: c */
    public void mo3513c(boolean z) {
        this.f2518o = z;
        this.f2519p = true;
    }

    /* renamed from: d */
    public void mo3514d(boolean z) {
        this.f2526w = z;
    }

    /* renamed from: a */
    public void mo3510a(Drawable drawable) {
        if (this.f2510g != null) {
            this.f2510g.setImageDrawable(drawable);
            return;
        }
        this.f2517n = true;
        this.f2516m = drawable;
    }

    /* renamed from: c */
    public Drawable mo3512c() {
        if (this.f2510g != null) {
            return this.f2510g.getDrawable();
        }
        if (this.f2517n) {
            return this.f2516m;
        }
        return null;
    }

    /* renamed from: a */
    public C0808p mo3093a(ViewGroup viewGroup) {
        C0808p pVar = this.f2282f;
        C0808p a = super.mo3093a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo3094a(C0794j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo3274n()) {
            actionView = super.mo3094a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo3098a(C0794j jVar, C0809a aVar) {
        aVar.mo3017a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2282f);
        if (this.f2509A == null) {
            this.f2509A = new C0825b();
        }
        actionMenuItemView.setPopupCallback(this.f2509A);
    }

    /* renamed from: a */
    public boolean mo3101a(int i, C0794j jVar) {
        return jVar.mo3270j();
    }

    /* renamed from: b */
    public void mo3106b(boolean z) {
        super.mo3106b(z);
        ((View) this.f2282f).requestLayout();
        boolean z2 = false;
        if (this.f2279c != null) {
            ArrayList l = this.f2279c.mo3211l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                C0572b a = ((C0794j) l.get(i)).mo494a();
                if (a != null) {
                    a.mo2055a((C0573a) this);
                }
            }
        }
        ArrayList m = this.f2279c != null ? this.f2279c.mo3212m() : null;
        if (this.f2518o && m != null) {
            int size2 = m.size();
            if (size2 == 1) {
                z2 = !((C0794j) m.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2510g == null) {
                this.f2510g = new C0827d(this.f2277a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2510g.getParent();
            if (viewGroup != this.f2282f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2510g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2282f;
                actionMenuView.addView(this.f2510g, actionMenuView.mo3539c());
            }
        } else if (this.f2510g != null && this.f2510g.getParent() == this.f2282f) {
            ((ViewGroup) this.f2282f).removeView(this.f2510g);
        }
        ((ActionMenuView) this.f2282f).setOverflowReserved(this.f2518o);
    }

    /* renamed from: a */
    public boolean mo3104a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2510g) {
            return false;
        }
        return super.mo3104a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo3103a(C0816u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C0816u uVar2 = uVar;
        while (uVar2.mo3408t() != this.f2279c) {
            uVar2 = (C0816u) uVar2.mo3408t();
        }
        View a = m3497a(uVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f2515l = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2512i = new C0824a(this.f2278b, uVar, a);
        this.f2512i.mo3363a(z);
        this.f2512i.mo3358a();
        super.mo3103a(uVar);
        return true;
    }

    /* renamed from: a */
    private View m3497a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2282f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0809a) && ((C0809a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo3515d() {
        if (!this.f2518o || mo3519h() || this.f2279c == null || this.f2282f == null || this.f2513j != null || this.f2279c.mo3212m().isEmpty()) {
            return false;
        }
        C0829e eVar = new C0829e(this.f2278b, this.f2279c, this.f2510g, true);
        this.f2513j = new C0826c(eVar);
        ((View) this.f2282f).post(this.f2513j);
        super.mo3103a((C0816u) null);
        return true;
    }

    /* renamed from: e */
    public boolean mo3516e() {
        if (this.f2513j == null || this.f2282f == null) {
            C0829e eVar = this.f2511h;
            if (eVar == null) {
                return false;
            }
            eVar.mo3367d();
            return true;
        }
        ((View) this.f2282f).removeCallbacks(this.f2513j);
        this.f2513j = null;
        return true;
    }

    /* renamed from: f */
    public boolean mo3517f() {
        return mo3516e() | mo3518g();
    }

    /* renamed from: g */
    public boolean mo3518g() {
        if (this.f2512i == null) {
            return false;
        }
        this.f2512i.mo3367d();
        return true;
    }

    /* renamed from: h */
    public boolean mo3519h() {
        return this.f2511h != null && this.f2511h.mo3369f();
    }

    /* renamed from: i */
    public boolean mo3520i() {
        return this.f2513j != null || mo3519h();
    }

    /* renamed from: b */
    public boolean mo3107b() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        boolean z3 = false;
        if (actionMenuPresenter.f2279c != null) {
            arrayList = actionMenuPresenter.f2279c.mo3209j();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f2522s;
        int i6 = actionMenuPresenter.f2521r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2282f;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = i5;
        for (int i10 = 0; i10 < i; i10++) {
            C0794j jVar = (C0794j) arrayList.get(i10);
            if (jVar.mo3272l()) {
                i7++;
            } else if (jVar.mo3271k()) {
                i8++;
            } else {
                z4 = true;
            }
            if (actionMenuPresenter.f2526w && jVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (actionMenuPresenter.f2518o && (z4 || i8 + i7 > i9)) {
            i9--;
        }
        int i11 = i9 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f2528y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f2524u) {
            i3 = i6 / actionMenuPresenter.f2527x;
            i2 = ((i6 % actionMenuPresenter.f2527x) / i3) + actionMenuPresenter.f2527x;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = i6;
        int i14 = 0;
        while (i14 < i) {
            C0794j jVar2 = (C0794j) arrayList.get(i14);
            if (jVar2.mo3272l()) {
                View a = actionMenuPresenter.mo3094a(jVar2, actionMenuPresenter.f2529z, viewGroup);
                if (actionMenuPresenter.f2529z == null) {
                    actionMenuPresenter.f2529z = a;
                }
                if (actionMenuPresenter.f2524u) {
                    i3 -= ActionMenuView.m3538a(a, i2, i3, makeMeasureSpec, z3 ? 1 : 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    z2 = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z2 = true;
                }
                jVar2.mo3246d(z2);
                z = z3;
                i4 = i;
            } else if (jVar2.mo3271k()) {
                int groupId2 = jVar2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = (i11 > 0 || z5) && i13 > 0 && (!actionMenuPresenter.f2524u || i3 > 0);
                if (z6) {
                    boolean z7 = z6;
                    View a2 = actionMenuPresenter.mo3094a(jVar2, actionMenuPresenter.f2529z, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f2529z == null) {
                        actionMenuPresenter.f2529z = a2;
                    }
                    if (actionMenuPresenter.f2524u) {
                        int a3 = ActionMenuView.m3538a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z7 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    if (actionMenuPresenter.f2524u) {
                        z6 = z7 & (i13 >= 0);
                    } else {
                        z6 = z7 & (i13 + i12 > 0);
                    }
                } else {
                    boolean z8 = z6;
                    i4 = i;
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i14) {
                        C0794j jVar3 = (C0794j) arrayList.get(i15);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo3270j()) {
                                i11++;
                            }
                            jVar3.mo3246d(false);
                        }
                        i15++;
                    }
                }
                if (z6) {
                    i11--;
                }
                jVar2.mo3246d(z6);
                z = false;
            } else {
                z = z3;
                i4 = i;
                jVar2.mo3246d(z);
            }
            i14++;
            z3 = z;
            i = i4;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3097a(C0790h hVar, boolean z) {
        mo3517f();
        super.mo3097a(hVar, z);
    }

    /* renamed from: a */
    public void mo2064a(boolean z) {
        if (z) {
            super.mo3103a((C0816u) null);
        } else if (this.f2279c != null) {
            this.f2279c.mo3170a(false);
        }
    }

    /* renamed from: a */
    public void mo3511a(ActionMenuView actionMenuView) {
        this.f2282f = actionMenuView;
        actionMenuView.mo3039a(this.f2279c);
    }
}
