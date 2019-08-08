package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.menu.C0790h.C0792b;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.support.p028v7.widget.ActionMenuView.C0831a;
import android.support.p028v7.widget.AppCompatTextView;
import android.support.p028v7.widget.C0934aa;
import android.support.p028v7.widget.C0982ba;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements C0809a, C0831a, OnClickListener {

    /* renamed from: b */
    C0794j f2222b;

    /* renamed from: c */
    C0792b f2223c;

    /* renamed from: d */
    C0776b f2224d;

    /* renamed from: e */
    private CharSequence f2225e;

    /* renamed from: f */
    private Drawable f2226f;

    /* renamed from: g */
    private C0934aa f2227g;

    /* renamed from: h */
    private boolean f2228h;

    /* renamed from: i */
    private boolean f2229i;

    /* renamed from: j */
    private int f2230j;

    /* renamed from: k */
    private int f2231k;

    /* renamed from: l */
    private int f2232l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0775a extends C0934aa {
        public C0775a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0812s mo3036a() {
            if (ActionMenuItemView.this.f2224d != null) {
                return ActionMenuItemView.this.f2224d.mo3038a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3037b() {
            boolean z = false;
            if (ActionMenuItemView.this.f2223c == null || !ActionMenuItemView.this.f2223c.mo3040a(ActionMenuItemView.this.f2222b)) {
                return false;
            }
            C0812s a = mo3036a();
            if (a != null && a.mo3124d()) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0776b {
        /* renamed from: a */
        public abstract C0812s mo3038a();
    }

    /* renamed from: a */
    public boolean mo3018a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2228h = m3177e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ActionMenuItemView, i, 0);
        this.f2230j = obtainStyledAttributes.getDimensionPixelSize(C0682j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2232l = (int) ((32.0f * resources.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f2231k = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2228h = m3177e();
        m3178f();
    }

    /* renamed from: e */
    private boolean m3177e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2231k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public C0794j getItemData() {
        return this.f2222b;
    }

    /* renamed from: a */
    public void mo3017a(C0794j jVar, int i) {
        this.f2222b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo3236a((C0809a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f2227g == null) {
            this.f2227g = new C0775a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2222b.hasSubMenu() || this.f2227g == null || !this.f2227g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        if (this.f2223c != null) {
            this.f2223c.mo3040a(this.f2222b);
        }
    }

    public void setItemInvoker(C0792b bVar) {
        this.f2223c = bVar;
    }

    public void setPopupCallback(C0776b bVar) {
        this.f2224d = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2229i != z) {
            this.f2229i = z;
            if (this.f2222b != null) {
                this.f2222b.mo3263h();
            }
        }
    }

    /* renamed from: f */
    private void m3178f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2225e);
        if (this.f2226f != null && (!this.f2222b.mo3273m() || (!this.f2228h && !this.f2229i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f2225e : null);
        CharSequence contentDescription = this.f2222b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f2222b.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2222b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f2222b.getTitle();
            }
            C0982ba.m4432a(this, charSequence2);
            return;
        }
        C0982ba.m4432a(this, tooltipText);
    }

    public void setIcon(Drawable drawable) {
        this.f2226f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2232l) {
                float f = ((float) this.f2232l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f2232l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f2232l) {
                float f2 = ((float) this.f2232l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f2232l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3178f();
    }

    /* renamed from: b */
    public boolean mo3019b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f2225e = charSequence;
        m3178f();
    }

    /* renamed from: c */
    public boolean mo3020c() {
        return mo3019b() && this.f2222b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo3021d() {
        return mo3019b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean b = mo3019b();
        if (b && this.f2231k >= 0) {
            super.setPadding(this.f2231k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f2230j) : this.f2230j;
        if (mode != 1073741824 && this.f2230j > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b && this.f2226f != null) {
            super.setPadding((getMeasuredWidth() - this.f2226f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
