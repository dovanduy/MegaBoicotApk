package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.support.p028v7.widget.C0977ay;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0809a, SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0794j f2237a;

    /* renamed from: b */
    private ImageView f2238b;

    /* renamed from: c */
    private RadioButton f2239c;

    /* renamed from: d */
    private TextView f2240d;

    /* renamed from: e */
    private CheckBox f2241e;

    /* renamed from: f */
    private TextView f2242f;

    /* renamed from: g */
    private ImageView f2243g;

    /* renamed from: h */
    private ImageView f2244h;

    /* renamed from: i */
    private LinearLayout f2245i;

    /* renamed from: j */
    private Drawable f2246j;

    /* renamed from: k */
    private int f2247k;

    /* renamed from: l */
    private Context f2248l;

    /* renamed from: m */
    private boolean f2249m;

    /* renamed from: n */
    private Drawable f2250n;

    /* renamed from: o */
    private boolean f2251o;

    /* renamed from: p */
    private int f2252p;

    /* renamed from: q */
    private LayoutInflater f2253q;

    /* renamed from: r */
    private boolean f2254r;

    /* renamed from: a */
    public boolean mo3018a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0977ay a = C0977ay.m4367a(getContext(), attributeSet, C0682j.MenuView, i, 0);
        this.f2246j = a.mo5086a(C0682j.MenuView_android_itemBackground);
        this.f2247k = a.mo5099g(C0682j.MenuView_android_itemTextAppearance, -1);
        this.f2249m = a.mo5088a(C0682j.MenuView_preserveIconSpacing, false);
        this.f2248l = context;
        this.f2250n = a.mo5086a(C0682j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0673a.dropDownListViewStyle, 0);
        this.f2251o = obtainStyledAttributes.hasValue(0);
        a.mo5087a();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0595r.m2239a((View) this, this.f2246j);
        this.f2240d = (TextView) findViewById(C0678f.title);
        if (this.f2247k != -1) {
            this.f2240d.setTextAppearance(this.f2248l, this.f2247k);
        }
        this.f2242f = (TextView) findViewById(C0678f.shortcut);
        this.f2243g = (ImageView) findViewById(C0678f.submenuarrow);
        if (this.f2243g != null) {
            this.f2243g.setImageDrawable(this.f2250n);
        }
        this.f2244h = (ImageView) findViewById(C0678f.group_divider);
        this.f2245i = (LinearLayout) findViewById(C0678f.content);
    }

    /* renamed from: a */
    public void mo3017a(C0794j jVar, int i) {
        this.f2237a = jVar;
        this.f2252p = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo3236a((C0809a) this));
        setCheckable(jVar.isCheckable());
        mo3044a(jVar.mo3249f(), jVar.mo3245d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    private void m3189a(View view) {
        m3190a(view, -1);
    }

    /* renamed from: a */
    private void m3190a(View view, int i) {
        if (this.f2245i != null) {
            this.f2245i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.f2254r = z;
        this.f2249m = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2240d.setText(charSequence);
            if (this.f2240d.getVisibility() != 0) {
                this.f2240d.setVisibility(0);
            }
        } else if (this.f2240d.getVisibility() != 8) {
            this.f2240d.setVisibility(8);
        }
    }

    public C0794j getItemData() {
        return this.f2237a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f2239c != null || this.f2241e != null) {
            if (this.f2237a.mo3250g()) {
                if (this.f2239c == null) {
                    m3192c();
                }
                compoundButton2 = this.f2239c;
                compoundButton = this.f2241e;
            } else {
                if (this.f2241e == null) {
                    m3193d();
                }
                compoundButton2 = this.f2241e;
                compoundButton = this.f2239c;
            }
            if (z) {
                compoundButton2.setChecked(this.f2237a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f2241e != null) {
                    this.f2241e.setVisibility(8);
                }
                if (this.f2239c != null) {
                    this.f2239c.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2237a.mo3250g()) {
            if (this.f2239c == null) {
                m3192c();
            }
            compoundButton = this.f2239c;
        } else {
            if (this.f2241e == null) {
                m3193d();
            }
            compoundButton = this.f2241e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f2243g != null) {
            this.f2243g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo3044a(boolean z, char c) {
        int i = (!z || !this.f2237a.mo3249f()) ? 8 : 0;
        if (i == 0) {
            this.f2242f.setText(this.f2237a.mo3247e());
        }
        if (this.f2242f.getVisibility() != i) {
            this.f2242f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2237a.mo3265i() || this.f2254r;
        if (!z && !this.f2249m) {
            return;
        }
        if (this.f2238b != null || drawable != null || this.f2249m) {
            if (this.f2238b == null) {
                m3191b();
            }
            if (drawable != null || this.f2249m) {
                ImageView imageView = this.f2238b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2238b.getVisibility() != 0) {
                    this.f2238b.setVisibility(0);
                }
            } else {
                this.f2238b.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2238b != null && this.f2249m) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2238b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m3191b() {
        this.f2238b = (ImageView) getInflater().inflate(C0679g.abc_list_menu_item_icon, this, false);
        m3190a((View) this.f2238b, 0);
    }

    /* renamed from: c */
    private void m3192c() {
        this.f2239c = (RadioButton) getInflater().inflate(C0679g.abc_list_menu_item_radio, this, false);
        m3189a(this.f2239c);
    }

    /* renamed from: d */
    private void m3193d() {
        this.f2241e = (CheckBox) getInflater().inflate(C0679g.abc_list_menu_item_checkbox, this, false);
        m3189a(this.f2241e);
    }

    private LayoutInflater getInflater() {
        if (this.f2253q == null) {
            this.f2253q = LayoutInflater.from(getContext());
        }
        return this.f2253q;
    }

    public void setGroupDividerEnabled(boolean z) {
        if (this.f2244h != null) {
            this.f2244h.setVisibility((this.f2251o || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f2244h != null && this.f2244h.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2244h.getLayoutParams();
            rect.top += this.f2244h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }
}
