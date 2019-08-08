package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0583f;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.view.C0764c;
import android.support.p028v7.view.C0769g;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.view.menu.C0794j;
import android.support.p028v7.view.menu.C0806o;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0816u;
import android.support.p028v7.widget.ActionMenuView.C0834d;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f3005A;

    /* renamed from: B */
    private int f3006B;

    /* renamed from: C */
    private boolean f3007C;

    /* renamed from: D */
    private boolean f3008D;

    /* renamed from: E */
    private final ArrayList<View> f3009E;

    /* renamed from: F */
    private final ArrayList<View> f3010F;

    /* renamed from: G */
    private final int[] f3011G;

    /* renamed from: H */
    private final C0834d f3012H;

    /* renamed from: I */
    private C0978az f3013I;

    /* renamed from: J */
    private ActionMenuPresenter f3014J;

    /* renamed from: K */
    private C0929a f3015K;

    /* renamed from: L */
    private C0807a f3016L;

    /* renamed from: M */
    private C0791a f3017M;

    /* renamed from: N */
    private boolean f3018N;

    /* renamed from: O */
    private final Runnable f3019O;

    /* renamed from: a */
    ImageButton f3020a;

    /* renamed from: b */
    View f3021b;

    /* renamed from: c */
    int f3022c;

    /* renamed from: d */
    C0930b f3023d;

    /* renamed from: e */
    private ActionMenuView f3024e;

    /* renamed from: f */
    private TextView f3025f;

    /* renamed from: g */
    private TextView f3026g;

    /* renamed from: h */
    private ImageButton f3027h;

    /* renamed from: i */
    private ImageView f3028i;

    /* renamed from: j */
    private Drawable f3029j;

    /* renamed from: k */
    private CharSequence f3030k;

    /* renamed from: l */
    private Context f3031l;

    /* renamed from: m */
    private int f3032m;

    /* renamed from: n */
    private int f3033n;

    /* renamed from: o */
    private int f3034o;

    /* renamed from: p */
    private int f3035p;

    /* renamed from: q */
    private int f3036q;

    /* renamed from: r */
    private int f3037r;

    /* renamed from: s */
    private int f3038s;

    /* renamed from: t */
    private int f3039t;

    /* renamed from: u */
    private C0959an f3040u;

    /* renamed from: v */
    private int f3041v;

    /* renamed from: w */
    private int f3042w;

    /* renamed from: x */
    private int f3043x;

    /* renamed from: y */
    private CharSequence f3044y;

    /* renamed from: z */
    private CharSequence f3045z;

    /* renamed from: android.support.v7.widget.Toolbar$LayoutParams */
    public static class LayoutParams extends android.support.p028v7.app.ActionBar.LayoutParams {

        /* renamed from: b */
        int f3049b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3049b = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f3049b = 0;
            this.f1778a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.support.p028v7.app.ActionBar.LayoutParams) layoutParams);
            this.f3049b = 0;
            this.f3049b = layoutParams.f3049b;
        }

        public LayoutParams(android.support.p028v7.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3049b = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.f3049b = 0;
            mo4838a(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3049b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4838a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f3050a;

        /* renamed from: c */
        boolean f3051c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3050a = parcel.readInt();
            this.f3051c = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3050a);
            parcel.writeInt(this.f3051c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0929a implements C0806o {

        /* renamed from: a */
        C0790h f3052a;

        /* renamed from: b */
        C0794j f3053b;

        /* renamed from: a */
        public void mo3097a(C0790h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo3099a(C0807a aVar) {
        }

        /* renamed from: a */
        public boolean mo3103a(C0816u uVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3107b() {
            return false;
        }

        C0929a() {
        }

        /* renamed from: a */
        public void mo3096a(Context context, C0790h hVar) {
            if (!(this.f3052a == null || this.f3053b == null)) {
                this.f3052a.mo3198d(this.f3053b);
            }
            this.f3052a = hVar;
        }

        /* renamed from: b */
        public void mo3106b(boolean z) {
            if (this.f3053b != null) {
                boolean z2 = false;
                if (this.f3052a != null) {
                    int size = this.f3052a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f3052a.getItem(i) == this.f3053b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo3108b(this.f3052a, this.f3053b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo3102a(C0790h hVar, C0794j jVar) {
            Toolbar.this.mo4799i();
            ViewParent parent = Toolbar.this.f3020a.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f3020a);
                }
                Toolbar.this.addView(Toolbar.this.f3020a);
            }
            Toolbar.this.f3021b = jVar.getActionView();
            this.f3053b = jVar;
            ViewParent parent2 = Toolbar.this.f3021b.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f3021b);
                }
                LayoutParams j = Toolbar.this.generateDefaultLayoutParams();
                j.f1778a = 8388611 | (Toolbar.this.f3022c & 112);
                j.f3049b = 2;
                Toolbar.this.f3021b.setLayoutParams(j);
                Toolbar.this.addView(Toolbar.this.f3021b);
            }
            Toolbar.this.mo4801k();
            Toolbar.this.requestLayout();
            jVar.mo3248e(true);
            if (Toolbar.this.f3021b instanceof C0764c) {
                ((C0764c) Toolbar.this.f3021b).mo2956a();
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo3108b(C0790h hVar, C0794j jVar) {
            if (Toolbar.this.f3021b instanceof C0764c) {
                ((C0764c) Toolbar.this.f3021b).mo2957b();
            }
            Toolbar.this.removeView(Toolbar.this.f3021b);
            Toolbar.this.removeView(Toolbar.this.f3020a);
            Toolbar.this.f3021b = null;
            Toolbar.this.mo4802l();
            this.f3053b = null;
            Toolbar.this.requestLayout();
            jVar.mo3248e(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public interface C0930b {
        /* renamed from: a */
        boolean mo4845a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3043x = 8388627;
        this.f3009E = new ArrayList<>();
        this.f3010F = new ArrayList<>();
        this.f3011G = new int[2];
        this.f3012H = new C0834d() {
            /* renamed from: a */
            public boolean mo3566a(MenuItem menuItem) {
                if (Toolbar.this.f3023d != null) {
                    return Toolbar.this.f3023d.mo4845a(menuItem);
                }
                return false;
            }
        };
        this.f3019O = new Runnable() {
            public void run() {
                Toolbar.this.mo4765d();
            }
        };
        C0977ay a = C0977ay.m4367a(getContext(), attributeSet, C0682j.Toolbar, i, 0);
        this.f3033n = a.mo5099g(C0682j.Toolbar_titleTextAppearance, 0);
        this.f3034o = a.mo5099g(C0682j.Toolbar_subtitleTextAppearance, 0);
        this.f3043x = a.mo5091c(C0682j.Toolbar_android_gravity, this.f3043x);
        this.f3022c = a.mo5091c(C0682j.Toolbar_buttonGravity, 48);
        int d = a.mo5093d(C0682j.Toolbar_titleMargin, 0);
        if (a.mo5100g(C0682j.Toolbar_titleMargins)) {
            d = a.mo5093d(C0682j.Toolbar_titleMargins, d);
        }
        this.f3039t = d;
        this.f3038s = d;
        this.f3037r = d;
        this.f3036q = d;
        int d2 = a.mo5093d(C0682j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f3036q = d2;
        }
        int d3 = a.mo5093d(C0682j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f3037r = d3;
        }
        int d4 = a.mo5093d(C0682j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f3038s = d4;
        }
        int d5 = a.mo5093d(C0682j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f3039t = d5;
        }
        this.f3035p = a.mo5095e(C0682j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo5093d(C0682j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo5093d(C0682j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo5095e(C0682j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo5095e(C0682j.Toolbar_contentInsetRight, 0);
        m4089s();
        this.f3040u.mo5020b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f3040u.mo5017a(d6, d7);
        }
        this.f3041v = a.mo5093d(C0682j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3042w = a.mo5093d(C0682j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3029j = a.mo5086a(C0682j.Toolbar_collapseIcon);
        this.f3030k = a.mo5092c(C0682j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo5092c(C0682j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo5092c(C0682j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f3031l = getContext();
        setPopupTheme(a.mo5099g(C0682j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo5086a(C0682j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo5092c(C0682j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo5086a(C0682j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo5092c(C0682j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo5100g(C0682j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo5089b(C0682j.Toolbar_titleTextColor, -1));
        }
        if (a.mo5100g(C0682j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo5089b(C0682j.Toolbar_subtitleTextColor, -1));
        }
        a.mo5087a();
    }

    public void setPopupTheme(int i) {
        if (this.f3032m != i) {
            this.f3032m = i;
            if (i == 0) {
                this.f3031l = getContext();
            } else {
                this.f3031l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f3032m;
    }

    public int getTitleMarginStart() {
        return this.f3036q;
    }

    public void setTitleMarginStart(int i) {
        this.f3036q = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f3038s;
    }

    public void setTitleMarginTop(int i) {
        this.f3038s = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f3037r;
    }

    public void setTitleMarginEnd(int i) {
        this.f3037r = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f3039t;
    }

    public void setTitleMarginBottom(int i) {
        this.f3039t = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m4089s();
        C0959an anVar = this.f3040u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        anVar.mo5018a(z);
    }

    public void setLogo(int i) {
        setLogo(C0740a.m3008b(getContext(), i));
    }

    /* renamed from: a */
    public boolean mo4760a() {
        return getVisibility() == 0 && this.f3024e != null && this.f3024e.mo3534a();
    }

    /* renamed from: b */
    public boolean mo4762b() {
        return this.f3024e != null && this.f3024e.mo3545g();
    }

    /* renamed from: c */
    public boolean mo4763c() {
        return this.f3024e != null && this.f3024e.mo3553h();
    }

    /* renamed from: d */
    public boolean mo4765d() {
        return this.f3024e != null && this.f3024e.mo3543e();
    }

    /* renamed from: e */
    public boolean mo4766e() {
        return this.f3024e != null && this.f3024e.mo3544f();
    }

    /* renamed from: a */
    public void mo4758a(C0790h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.f3024e != null) {
            m4085o();
            C0790h d = this.f3024e.mo3541d();
            if (d != hVar) {
                if (d != null) {
                    d.mo3186b((C0806o) this.f3014J);
                    d.mo3186b((C0806o) this.f3015K);
                }
                if (this.f3015K == null) {
                    this.f3015K = new C0929a();
                }
                actionMenuPresenter.mo3514d(true);
                if (hVar != null) {
                    hVar.mo3167a((C0806o) actionMenuPresenter, this.f3031l);
                    hVar.mo3167a((C0806o) this.f3015K, this.f3031l);
                } else {
                    actionMenuPresenter.mo3096a(this.f3031l, (C0790h) null);
                    this.f3015K.mo3096a(this.f3031l, (C0790h) null);
                    actionMenuPresenter.mo3106b(true);
                    this.f3015K.mo3106b(true);
                }
                this.f3024e.setPopupTheme(this.f3032m);
                this.f3024e.setPresenter(actionMenuPresenter);
                this.f3014J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: f */
    public void mo4767f() {
        if (this.f3024e != null) {
            this.f3024e.mo3554i();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m4083m();
            if (!m4082d(this.f3028i)) {
                m4075a((View) this.f3028i, true);
            }
        } else if (this.f3028i != null && m4082d(this.f3028i)) {
            removeView(this.f3028i);
            this.f3010F.remove(this.f3028i);
        }
        if (this.f3028i != null) {
            this.f3028i.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.f3028i != null) {
            return this.f3028i.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4083m();
        }
        if (this.f3028i != null) {
            this.f3028i.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.f3028i != null) {
            return this.f3028i.getContentDescription();
        }
        return null;
    }

    /* renamed from: m */
    private void m4083m() {
        if (this.f3028i == null) {
            this.f3028i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: g */
    public boolean mo4768g() {
        return (this.f3015K == null || this.f3015K.f3053b == null) ? false : true;
    }

    /* renamed from: h */
    public void mo4798h() {
        C0794j jVar = this.f3015K == null ? null : this.f3015K.f3053b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f3044y;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3025f == null) {
                Context context = getContext();
                this.f3025f = new AppCompatTextView(context);
                this.f3025f.setSingleLine();
                this.f3025f.setEllipsize(TruncateAt.END);
                if (this.f3033n != 0) {
                    this.f3025f.setTextAppearance(context, this.f3033n);
                }
                if (this.f3005A != 0) {
                    this.f3025f.setTextColor(this.f3005A);
                }
            }
            if (!m4082d(this.f3025f)) {
                m4075a((View) this.f3025f, true);
            }
        } else if (this.f3025f != null && m4082d(this.f3025f)) {
            removeView(this.f3025f);
            this.f3010F.remove(this.f3025f);
        }
        if (this.f3025f != null) {
            this.f3025f.setText(charSequence);
        }
        this.f3044y = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f3045z;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3026g == null) {
                Context context = getContext();
                this.f3026g = new AppCompatTextView(context);
                this.f3026g.setSingleLine();
                this.f3026g.setEllipsize(TruncateAt.END);
                if (this.f3034o != 0) {
                    this.f3026g.setTextAppearance(context, this.f3034o);
                }
                if (this.f3006B != 0) {
                    this.f3026g.setTextColor(this.f3006B);
                }
            }
            if (!m4082d(this.f3026g)) {
                m4075a((View) this.f3026g, true);
            }
        } else if (this.f3026g != null && m4082d(this.f3026g)) {
            removeView(this.f3026g);
            this.f3010F.remove(this.f3026g);
        }
        if (this.f3026g != null) {
            this.f3026g.setText(charSequence);
        }
        this.f3045z = charSequence;
    }

    /* renamed from: a */
    public void mo4757a(Context context, int i) {
        this.f3033n = i;
        if (this.f3025f != null) {
            this.f3025f.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public void mo4761b(Context context, int i) {
        this.f3034o = i;
        if (this.f3026g != null) {
            this.f3026g.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.f3005A = i;
        if (this.f3025f != null) {
            this.f3025f.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.f3006B = i;
        if (this.f3026g != null) {
            this.f3026g.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f3027h != null) {
            return this.f3027h.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4086p();
        }
        if (this.f3027h != null) {
            this.f3027h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0740a.m3008b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m4086p();
            if (!m4082d(this.f3027h)) {
                m4075a((View) this.f3027h, true);
            }
        } else if (this.f3027h != null && m4082d(this.f3027h)) {
            removeView(this.f3027h);
            this.f3010F.remove(this.f3027h);
        }
        if (this.f3027h != null) {
            this.f3027h.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.f3027h != null) {
            return this.f3027h.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m4086p();
        this.f3027h.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m4084n();
        return this.f3024e.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m4084n();
        this.f3024e.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m4084n();
        return this.f3024e.getOverflowIcon();
    }

    /* renamed from: n */
    private void m4084n() {
        m4085o();
        if (this.f3024e.mo3541d() == null) {
            C0790h hVar = (C0790h) this.f3024e.getMenu();
            if (this.f3015K == null) {
                this.f3015K = new C0929a();
            }
            this.f3024e.setExpandedActionViewsExclusive(true);
            hVar.mo3167a((C0806o) this.f3015K, this.f3031l);
        }
    }

    /* renamed from: o */
    private void m4085o() {
        if (this.f3024e == null) {
            this.f3024e = new ActionMenuView(getContext());
            this.f3024e.setPopupTheme(this.f3032m);
            this.f3024e.setOnMenuItemClickListener(this.f3012H);
            this.f3024e.mo3533a(this.f3016L, this.f3017M);
            LayoutParams j = generateDefaultLayoutParams();
            j.f1778a = 8388613 | (this.f3022c & 112);
            this.f3024e.setLayoutParams(j);
            m4075a((View) this.f3024e, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0769g(getContext());
    }

    public void setOnMenuItemClickListener(C0930b bVar) {
        this.f3023d = bVar;
    }

    /* renamed from: a */
    public void mo4756a(int i, int i2) {
        m4089s();
        this.f3040u.mo5017a(i, i2);
    }

    public int getContentInsetStart() {
        if (this.f3040u != null) {
            return this.f3040u.mo5021c();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        if (this.f3040u != null) {
            return this.f3040u.mo5022d();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        if (this.f3040u != null) {
            return this.f3040u.mo5016a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f3040u != null) {
            return this.f3040u.mo5019b();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        if (this.f3041v != Integer.MIN_VALUE) {
            return this.f3041v;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3041v) {
            this.f3041v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        if (this.f3042w != Integer.MIN_VALUE) {
            return this.f3042w;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3042w) {
            this.f3042w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f3041v, 0));
        }
        return getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f3024e
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.support.v7.widget.ActionMenuView r0 = r3.f3024e
            android.support.v7.view.menu.h r0 = r0.mo3541d()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0027
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f3042w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x002b
        L_0x0027:
            int r0 = r3.getContentInsetEnd()
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C0595r.m2256f(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0595r.m2256f(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: p */
    private void m4086p() {
        if (this.f3027h == null) {
            this.f3027h = new AppCompatImageButton(getContext(), null, C0673a.toolbarNavigationButtonStyle);
            LayoutParams j = generateDefaultLayoutParams();
            j.f1778a = 8388611 | (this.f3022c & 112);
            this.f3027h.setLayoutParams(j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4799i() {
        if (this.f3020a == null) {
            this.f3020a = new AppCompatImageButton(getContext(), null, C0673a.toolbarNavigationButtonStyle);
            this.f3020a.setImageDrawable(this.f3029j);
            this.f3020a.setContentDescription(this.f3030k);
            LayoutParams j = generateDefaultLayoutParams();
            j.f1778a = 8388611 | (this.f3022c & 112);
            j.f3049b = 2;
            this.f3020a.setLayoutParams(j);
            this.f3020a.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo4798h();
                }
            });
        }
    }

    /* renamed from: a */
    private void m4075a(View view, boolean z) {
        LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f3049b = 1;
        if (!z || this.f3021b == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f3010F.add(view);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f3015K == null || this.f3015K.f3053b == null)) {
            savedState.f3050a = this.f3015K.f3053b.getItemId();
        }
        savedState.f3051c = mo4762b();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        C0790h d = this.f3024e != null ? this.f3024e.mo3541d() : null;
        if (!(savedState.f3050a == 0 || this.f3015K == null || d == null)) {
            MenuItem findItem = d.findItem(savedState.f3050a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.f3051c) {
            m4087q();
        }
    }

    /* renamed from: q */
    private void m4087q() {
        removeCallbacks(this.f3019O);
        post(this.f3019O);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3019O);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3007C = false;
        }
        if (!this.f3007C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3007C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3007C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3008D = false;
        }
        if (!this.f3008D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3008D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3008D = false;
        }
        return true;
    }

    /* renamed from: a */
    private void m4074a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m4071a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: r */
    private boolean m4088r() {
        if (!this.f3018N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m4077a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f3011G;
        if (C0994bg.m4486a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (m4077a((View) this.f3027h)) {
            m4074a((View) this.f3027h, i, 0, i2, 0, this.f3035p);
            i5 = this.f3027h.getMeasuredWidth() + m4079b((View) this.f3027h);
            i4 = Math.max(0, this.f3027h.getMeasuredHeight() + m4081c(this.f3027h));
            i3 = View.combineMeasuredStates(0, this.f3027h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m4077a((View) this.f3020a)) {
            m4074a((View) this.f3020a, i, 0, i2, 0, this.f3035p);
            i5 = this.f3020a.getMeasuredWidth() + m4079b((View) this.f3020a);
            i4 = Math.max(i4, this.f3020a.getMeasuredHeight() + m4081c(this.f3020a));
            i3 = View.combineMeasuredStates(i3, this.f3020a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m4077a((View) this.f3024e)) {
            m4074a((View) this.f3024e, i, max, i2, 0, this.f3035p);
            i6 = this.f3024e.getMeasuredWidth() + m4079b((View) this.f3024e);
            i4 = Math.max(i4, this.f3024e.getMeasuredHeight() + m4081c(this.f3024e));
            i3 = View.combineMeasuredStates(i3, this.f3024e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m4077a(this.f3021b)) {
            max2 += m4071a(this.f3021b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3021b.getMeasuredHeight() + m4081c(this.f3021b));
            i3 = View.combineMeasuredStates(i3, this.f3021b.getMeasuredState());
        }
        if (m4077a((View) this.f3028i)) {
            max2 += m4071a((View) this.f3028i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3028i.getMeasuredHeight() + m4081c(this.f3028i));
            i3 = View.combineMeasuredStates(i3, this.f3028i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f3049b == 0 && m4077a(childAt)) {
                i11 += m4071a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m4081c(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f3038s + this.f3039t;
        int i14 = this.f3036q + this.f3037r;
        if (m4077a((View) this.f3025f)) {
            m4071a((View) this.f3025f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f3025f.getMeasuredWidth() + m4079b((View) this.f3025f);
            i7 = this.f3025f.getMeasuredHeight() + m4081c(this.f3025f);
            i9 = View.combineMeasuredStates(i3, this.f3025f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m4077a((View) this.f3026g)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m4071a((View) this.f3026g, i, i11 + i14, i2, i15, iArr));
            i7 += this.f3026g.getMeasuredHeight() + m4081c(this.f3026g);
            i9 = View.combineMeasuredStates(i16, this.f3026g.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m4088r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02aa A[LOOP:0: B:101:0x02a8->B:102:0x02aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cc A[LOOP:1: B:104:0x02ca->B:105:0x02cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0306 A[LOOP:2: B:112:0x0304->B:113:0x0306, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = android.support.p017v4.view.C0595r.m2256f(r24)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            int r6 = r24.getPaddingLeft()
            int r7 = r24.getPaddingRight()
            int r8 = r24.getPaddingTop()
            int r9 = r24.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f3011G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p017v4.view.C0595r.m2262k(r24)
            if (r12 < 0) goto L_0x003a
            int r13 = r29 - r27
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f3027h
            boolean r13 = r0.m4077a(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r13 = r0.f3027h
            int r13 = r0.m4080b(r13, r10, r11, r12)
            r14 = r6
            goto L_0x0057
        L_0x004d:
            android.widget.ImageButton r13 = r0.f3027h
            int r13 = r0.m4072a(r13, r6, r11, r12)
            r14 = r13
            goto L_0x0056
        L_0x0055:
            r14 = r6
        L_0x0056:
            r13 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f3020a
            boolean r15 = r0.m4077a(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f3020a
            int r13 = r0.m4080b(r15, r13, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f3020a
            int r14 = r0.m4072a(r15, r14, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f3024e
            boolean r15 = r0.m4077a(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f3024e
            int r14 = r0.m4072a(r15, r14, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f3024e
            int r13 = r0.m4080b(r15, r13, r11, r12)
        L_0x0085:
            int r15 = r24.getCurrentContentInsetLeft()
            int r16 = r24.getCurrentContentInsetRight()
            int r2 = r15 - r14
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r13
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r14, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r13, r10)
            android.view.View r13 = r0.f3021b
            boolean r13 = r0.m4077a(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f3021b
            int r10 = r0.m4080b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f3021b
            int r2 = r0.m4072a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f3028i
            boolean r13 = r0.m4077a(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f3028i
            int r10 = r0.m4080b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f3028i
            int r2 = r0.m4072a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f3025f
            boolean r13 = r0.m4077a(r13)
            android.widget.TextView r14 = r0.f3026g
            boolean r14 = r0.m4077a(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f3025f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r15 = (android.support.p028v7.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r19 = r7
            android.widget.TextView r7 = r0.f3025f
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r19 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f3026g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r7 = (android.support.p028v7.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r20 = r4
            android.widget.TextView r4 = r0.f3026g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r20 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r21 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x029a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f3025f
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f3026g
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f3026g
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f3025f
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r4 = (android.support.p028v7.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r7 = (android.support.p028v7.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f3025f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f3026g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r21 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r21 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f3043x
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a9
            r12 = 80
            if (r6 == r12) goto L_0x019d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.f3038s
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0184
            int r2 = r4.topMargin
            int r3 = r0.f3038s
            int r6 = r2 + r3
            goto L_0x019b
        L_0x0184:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f3039t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x019b
            int r2 = r7.bottomMargin
            int r3 = r0.f3039t
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x019b:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x019d:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f3039t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b6
        L_0x01a9:
            r23 = r2
            int r2 = r24.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f3038s
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x022b
            if (r15 == 0) goto L_0x01be
            int r3 = r0.f3036q
            r1 = 1
            goto L_0x01c0
        L_0x01be:
            r1 = 1
            r3 = 0
        L_0x01c0:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f6
            android.widget.TextView r1 = r0.f3025f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p028v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f3025f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f3025f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f3025f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f3037r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f7
        L_0x01f6:
            r2 = r10
        L_0x01f7:
            if (r14 == 0) goto L_0x021f
            android.widget.TextView r1 = r0.f3026g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p028v7.widget.Toolbar.LayoutParams) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f3026g
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f3026g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3026g
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f3037r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0220
        L_0x021f:
            r3 = r10
        L_0x0220:
            if (r15 == 0) goto L_0x0227
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0227:
            r2 = r23
            goto L_0x0128
        L_0x022b:
            if (r15 == 0) goto L_0x0233
            int r3 = r0.f3036q
            r18 = r3
            r7 = 0
            goto L_0x0236
        L_0x0233:
            r7 = 0
            r18 = 0
        L_0x0236:
            r1 = r11[r7]
            int r1 = r18 - r1
            int r2 = java.lang.Math.max(r7, r1)
            int r2 = r23 + r2
            int r1 = -r1
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x026c
            android.widget.TextView r1 = r0.f3025f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p028v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r3 = r0.f3025f
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f3025f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3025f
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f3037r
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026d
        L_0x026c:
            r3 = r2
        L_0x026d:
            if (r14 == 0) goto L_0x0293
            android.widget.TextView r1 = r0.f3026g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p028v7.widget.Toolbar.LayoutParams) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f3026g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f3026g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f3026g
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f3037r
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0294
        L_0x0293:
            r4 = r2
        L_0x0294:
            if (r15 == 0) goto L_0x029a
            int r2 = java.lang.Math.max(r3, r4)
        L_0x029a:
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            r3 = 3
            r0.m4076a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            int r1 = r1.size()
            r3 = r2
            r2 = r7
        L_0x02a8:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<android.view.View> r4 = r0.f3009E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m4072a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a8
        L_0x02bb:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            r2 = 5
            r0.m4076a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            int r1 = r1.size()
            r2 = r7
        L_0x02ca:
            if (r2 >= r1) goto L_0x02db
            java.util.ArrayList<android.view.View> r4 = r0.f3009E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m4080b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02ca
        L_0x02db:
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            r2 = 1
            r0.m4076a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            int r1 = r0.m4073a(r1, r11)
            int r4 = r20 - r21
            int r4 = r4 - r19
            int r4 = r4 / 2
            int r6 = r21 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f7
            goto L_0x02fe
        L_0x02f7:
            if (r1 <= r10) goto L_0x02fd
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fe
        L_0x02fd:
            r3 = r2
        L_0x02fe:
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            int r1 = r1.size()
        L_0x0304:
            if (r7 >= r1) goto L_0x0315
            java.util.ArrayList<android.view.View> r2 = r0.f3009E
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m4072a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0304
        L_0x0315:
            java.util.ArrayList<android.view.View> r1 = r0.f3009E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private int m4073a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i6 = layoutParams.leftMargin - i;
            int i7 = layoutParams.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = Math.max(0, -i7);
            i = max3;
        }
        return i5;
    }

    /* renamed from: a */
    private int m4072a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m4070a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: b */
    private int m4080b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m4070a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: a */
    private int m4070a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a = m4069a(layoutParams.f1778a);
        if (a == 48) {
            return getPaddingTop() - i2;
        }
        if (a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < layoutParams.topMargin) {
            i3 = layoutParams.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < layoutParams.bottomMargin) {
                i3 = Math.max(0, i3 - (layoutParams.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m4069a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f3043x & 112;
    }

    /* renamed from: a */
    private void m4076a(List<View> list, int i) {
        boolean z = C0595r.m2256f(this) == 1;
        int childCount = getChildCount();
        int a = C0579c.m2179a(i, C0595r.m2256f(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3049b == 0 && m4077a(childAt) && m4078b(layoutParams.f1778a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f3049b == 0 && m4077a(childAt2) && m4078b(layoutParams2.f1778a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m4078b(int i) {
        int f = C0595r.m2256f(this);
        int a = C0579c.m2179a(i, f) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (f == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: a */
    private boolean m4077a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m4079b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0583f.m2190a(marginLayoutParams) + C0583f.m2191b(marginLayoutParams);
    }

    /* renamed from: c */
    private int m4081c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.support.p028v7.app.ActionBar.LayoutParams) {
            return new LayoutParams((android.support.p028v7.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public C1031u getWrapper() {
        if (this.f3013I == null) {
            this.f3013I = new C0978az(this, true);
        }
        return this.f3013I;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4801k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f3049b == 2 || childAt == this.f3024e)) {
                removeViewAt(childCount);
                this.f3010F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4802l() {
        for (int size = this.f3010F.size() - 1; size >= 0; size--) {
            addView((View) this.f3010F.get(size));
        }
        this.f3010F.clear();
    }

    /* renamed from: d */
    private boolean m4082d(View view) {
        return view.getParent() == this || this.f3010F.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.f3018N = z;
        requestLayout();
    }

    /* renamed from: a */
    public void mo4759a(C0807a aVar, C0791a aVar2) {
        this.f3016L = aVar;
        this.f3017M = aVar2;
        if (this.f3024e != null) {
            this.f3024e.mo3533a(aVar, aVar2);
        }
    }

    /* renamed from: s */
    private void m4089s() {
        if (this.f3040u == null) {
            this.f3040u = new C0959an();
        }
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3014J;
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f3031l;
    }
}
