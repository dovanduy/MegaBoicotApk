package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0602v;
import android.support.p017v4.view.C0606w;
import android.support.p017v4.view.C0607x;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0677e;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0680h;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.view.menu.C0777a;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

/* renamed from: android.support.v7.widget.az */
/* compiled from: ToolbarWidgetWrapper */
public class C0978az implements C1031u {

    /* renamed from: a */
    Toolbar f3229a;

    /* renamed from: b */
    CharSequence f3230b;

    /* renamed from: c */
    Callback f3231c;

    /* renamed from: d */
    boolean f3232d;

    /* renamed from: e */
    private int f3233e;

    /* renamed from: f */
    private View f3234f;

    /* renamed from: g */
    private View f3235g;

    /* renamed from: h */
    private Drawable f3236h;

    /* renamed from: i */
    private Drawable f3237i;

    /* renamed from: j */
    private Drawable f3238j;

    /* renamed from: k */
    private boolean f3239k;

    /* renamed from: l */
    private CharSequence f3240l;

    /* renamed from: m */
    private CharSequence f3241m;

    /* renamed from: n */
    private ActionMenuPresenter f3242n;

    /* renamed from: o */
    private int f3243o;

    /* renamed from: p */
    private int f3244p;

    /* renamed from: q */
    private Drawable f3245q;

    /* renamed from: b */
    public void mo5116b(boolean z) {
    }

    public C0978az(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0680h.abc_action_bar_up_description, C0677e.abc_ic_ab_back_material);
    }

    public C0978az(Toolbar toolbar, boolean z, int i, int i2) {
        this.f3243o = 0;
        this.f3244p = 0;
        this.f3229a = toolbar;
        this.f3230b = toolbar.getTitle();
        this.f3240l = toolbar.getSubtitle();
        this.f3239k = this.f3230b != null;
        this.f3238j = toolbar.getNavigationIcon();
        C0977ay a = C0977ay.m4367a(toolbar.getContext(), null, C0682j.ActionBar, C0673a.actionBarStyle, 0);
        this.f3245q = a.mo5086a(C0682j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.mo5092c(C0682j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo5115b(c);
            }
            CharSequence c2 = a.mo5092c(C0682j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                mo5119c(c2);
            }
            Drawable a2 = a.mo5086a(C0682j.ActionBar_logo);
            if (a2 != null) {
                mo5114b(a2);
            }
            Drawable a3 = a.mo5086a(C0682j.ActionBar_icon);
            if (a3 != null) {
                mo5104a(a3);
            }
            if (this.f3238j == null && this.f3245q != null) {
                mo5118c(this.f3245q);
            }
            mo5117c(a.mo5084a(C0682j.ActionBar_displayOptions, 0));
            int g = a.mo5099g(C0682j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo5108a(LayoutInflater.from(this.f3229a.getContext()).inflate(g, this.f3229a, false));
                mo5117c(this.f3233e | 16);
            }
            int f = a.mo5097f(C0682j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f3229a.getLayoutParams();
                layoutParams.height = f;
                this.f3229a.setLayoutParams(layoutParams);
            }
            int d = a.mo5093d(C0682j.ActionBar_contentInsetStart, -1);
            int d2 = a.mo5093d(C0682j.ActionBar_contentInsetEnd, -1);
            if (d >= 0 || d2 >= 0) {
                this.f3229a.mo4756a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo5099g(C0682j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                this.f3229a.mo4757a(this.f3229a.getContext(), g2);
            }
            int g3 = a.mo5099g(C0682j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                this.f3229a.mo4761b(this.f3229a.getContext(), g3);
            }
            int g4 = a.mo5099g(C0682j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f3229a.setPopupTheme(g4);
            }
        } else {
            this.f3233e = m4387r();
        }
        a.mo5087a();
        mo5125e(i);
        this.f3241m = this.f3229a.getNavigationContentDescription();
        this.f3229a.setNavigationOnClickListener(new OnClickListener() {

            /* renamed from: a */
            final C0777a f3246a;

            {
                C0777a aVar = new C0777a(C0978az.this.f3229a.getContext(), 0, 16908332, 0, 0, C0978az.this.f3230b);
                this.f3246a = aVar;
            }

            public void onClick(View view) {
                if (C0978az.this.f3231c != null && C0978az.this.f3232d) {
                    C0978az.this.f3231c.onMenuItemSelected(0, this.f3246a);
                }
            }
        });
    }

    /* renamed from: e */
    public void mo5125e(int i) {
        if (i != this.f3244p) {
            this.f3244p = i;
            if (TextUtils.isEmpty(this.f3229a.getNavigationContentDescription())) {
                mo5127f(this.f3244p);
            }
        }
    }

    /* renamed from: r */
    private int m4387r() {
        if (this.f3229a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3245q = this.f3229a.getNavigationIcon();
        return 15;
    }

    /* renamed from: a */
    public ViewGroup mo5102a() {
        return this.f3229a;
    }

    /* renamed from: b */
    public Context mo5112b() {
        return this.f3229a.getContext();
    }

    /* renamed from: c */
    public boolean mo5120c() {
        return this.f3229a.mo4768g();
    }

    /* renamed from: d */
    public void mo5121d() {
        this.f3229a.mo4798h();
    }

    /* renamed from: a */
    public void mo5109a(Callback callback) {
        this.f3231c = callback;
    }

    /* renamed from: a */
    public void mo5110a(CharSequence charSequence) {
        if (!this.f3239k) {
            m4386e(charSequence);
        }
    }

    /* renamed from: e */
    public CharSequence mo5124e() {
        return this.f3229a.getTitle();
    }

    /* renamed from: b */
    public void mo5115b(CharSequence charSequence) {
        this.f3239k = true;
        m4386e(charSequence);
    }

    /* renamed from: e */
    private void m4386e(CharSequence charSequence) {
        this.f3230b = charSequence;
        if ((this.f3233e & 8) != 0) {
            this.f3229a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void mo5119c(CharSequence charSequence) {
        this.f3240l = charSequence;
        if ((this.f3233e & 8) != 0) {
            this.f3229a.setSubtitle(charSequence);
        }
    }

    /* renamed from: f */
    public void mo5126f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo5128g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: a */
    public void mo5103a(int i) {
        mo5104a(i != 0 ? C0740a.m3008b(mo5112b(), i) : null);
    }

    /* renamed from: a */
    public void mo5104a(Drawable drawable) {
        this.f3236h = drawable;
        m4388s();
    }

    /* renamed from: b */
    public void mo5113b(int i) {
        mo5114b(i != 0 ? C0740a.m3008b(mo5112b(), i) : null);
    }

    /* renamed from: b */
    public void mo5114b(Drawable drawable) {
        this.f3237i = drawable;
        m4388s();
    }

    /* renamed from: s */
    private void m4388s() {
        Drawable drawable = (this.f3233e & 2) != 0 ? (this.f3233e & 1) != 0 ? this.f3237i != null ? this.f3237i : this.f3236h : this.f3236h : null;
        this.f3229a.setLogo(drawable);
    }

    /* renamed from: h */
    public boolean mo5129h() {
        return this.f3229a.mo4760a();
    }

    /* renamed from: i */
    public boolean mo5130i() {
        return this.f3229a.mo4762b();
    }

    /* renamed from: j */
    public boolean mo5131j() {
        return this.f3229a.mo4763c();
    }

    /* renamed from: k */
    public boolean mo5132k() {
        return this.f3229a.mo4765d();
    }

    /* renamed from: l */
    public boolean mo5133l() {
        return this.f3229a.mo4766e();
    }

    /* renamed from: m */
    public void mo5134m() {
        this.f3232d = true;
    }

    /* renamed from: a */
    public void mo5107a(Menu menu, C0807a aVar) {
        if (this.f3242n == null) {
            this.f3242n = new ActionMenuPresenter(this.f3229a.getContext());
            this.f3242n.mo3095a(C0678f.action_menu_presenter);
        }
        this.f3242n.mo3099a(aVar);
        this.f3229a.mo4758a((C0790h) menu, this.f3242n);
    }

    /* renamed from: n */
    public void mo5135n() {
        this.f3229a.mo4767f();
    }

    /* renamed from: o */
    public int mo5136o() {
        return this.f3233e;
    }

    /* renamed from: c */
    public void mo5117c(int i) {
        int i2 = this.f3233e ^ i;
        this.f3233e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4390u();
                }
                m4389t();
            }
            if ((i2 & 3) != 0) {
                m4388s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3229a.setTitle(this.f3230b);
                    this.f3229a.setSubtitle(this.f3240l);
                } else {
                    this.f3229a.setTitle((CharSequence) null);
                    this.f3229a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.f3235g != null) {
                if ((i & 16) != 0) {
                    this.f3229a.addView(this.f3235g);
                } else {
                    this.f3229a.removeView(this.f3235g);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5106a(C0961ap apVar) {
        if (this.f3234f != null && this.f3234f.getParent() == this.f3229a) {
            this.f3229a.removeView(this.f3234f);
        }
        this.f3234f = apVar;
        if (apVar != null && this.f3243o == 2) {
            this.f3229a.addView(this.f3234f, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f3234f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f1778a = 8388691;
            apVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo5111a(boolean z) {
        this.f3229a.setCollapsible(z);
    }

    /* renamed from: p */
    public int mo5137p() {
        return this.f3243o;
    }

    /* renamed from: a */
    public void mo5108a(View view) {
        if (!(this.f3235g == null || (this.f3233e & 16) == 0)) {
            this.f3229a.removeView(this.f3235g);
        }
        this.f3235g = view;
        if (view != null && (this.f3233e & 16) != 0) {
            this.f3229a.addView(this.f3235g);
        }
    }

    /* renamed from: a */
    public C0602v mo5101a(final int i, long j) {
        return C0595r.m2263l(this.f3229a).mo2118a(i == 0 ? 1.0f : 0.0f).mo2119a(j).mo2120a((C0606w) new C0607x() {

            /* renamed from: c */
            private boolean f3250c = false;

            /* renamed from: a */
            public void mo2131a(View view) {
                C0978az.this.f3229a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo2132b(View view) {
                if (!this.f3250c) {
                    C0978az.this.f3229a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo2133c(View view) {
                this.f3250c = true;
            }
        });
    }

    /* renamed from: c */
    public void mo5118c(Drawable drawable) {
        this.f3238j = drawable;
        m4389t();
    }

    /* renamed from: t */
    private void m4389t() {
        if ((this.f3233e & 4) != 0) {
            this.f3229a.setNavigationIcon(this.f3238j != null ? this.f3238j : this.f3245q);
        } else {
            this.f3229a.setNavigationIcon((Drawable) null);
        }
    }

    /* renamed from: d */
    public void mo5123d(CharSequence charSequence) {
        this.f3241m = charSequence;
        m4390u();
    }

    /* renamed from: f */
    public void mo5127f(int i) {
        mo5123d((CharSequence) i == 0 ? null : mo5112b().getString(i));
    }

    /* renamed from: u */
    private void m4390u() {
        if ((this.f3233e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3241m)) {
            this.f3229a.setNavigationContentDescription(this.f3244p);
        } else {
            this.f3229a.setNavigationContentDescription(this.f3241m);
        }
    }

    /* renamed from: d */
    public void mo5122d(int i) {
        this.f3229a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo5105a(C0807a aVar, C0791a aVar2) {
        this.f3229a.mo4759a(aVar, aVar2);
    }

    /* renamed from: q */
    public Menu mo5138q() {
        return this.f3229a.getMenu();
    }
}
