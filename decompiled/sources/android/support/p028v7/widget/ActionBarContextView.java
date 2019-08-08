package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0602v;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0806o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0932a {

    /* renamed from: g */
    private CharSequence f2465g;

    /* renamed from: h */
    private CharSequence f2466h;

    /* renamed from: i */
    private View f2467i;

    /* renamed from: j */
    private View f2468j;

    /* renamed from: k */
    private LinearLayout f2469k;

    /* renamed from: l */
    private TextView f2470l;

    /* renamed from: m */
    private TextView f2471m;

    /* renamed from: n */
    private int f2472n;

    /* renamed from: o */
    private int f2473o;

    /* renamed from: p */
    private boolean f2474p;

    /* renamed from: q */
    private int f2475q;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0602v mo3437a(int i, long j) {
        return super.mo3437a(i, j);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0977ay a = C0977ay.m4367a(context, attributeSet, C0682j.ActionMode, i, 0);
        C0595r.m2239a((View) this, a.mo5086a(C0682j.ActionMode_background));
        this.f2472n = a.mo5099g(C0682j.ActionMode_titleTextStyle, 0);
        this.f2473o = a.mo5099g(C0682j.ActionMode_subtitleTextStyle, 0);
        this.f3064e = a.mo5097f(C0682j.ActionMode_height, 0);
        this.f2475q = a.mo5099g(C0682j.ActionMode_closeItemLayout, C0679g.abc_action_mode_close_item_material);
        a.mo5087a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3063d != null) {
            this.f3063d.mo3516e();
            this.f3063d.mo3518g();
        }
    }

    public void setContentHeight(int i) {
        this.f3064e = i;
    }

    public void setCustomView(View view) {
        if (this.f2468j != null) {
            removeView(this.f2468j);
        }
        this.f2468j = view;
        if (!(view == null || this.f2469k == null)) {
            removeView(this.f2469k);
            this.f2469k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2465g = charSequence;
        m3461e();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2466h = charSequence;
        m3461e();
    }

    public CharSequence getTitle() {
        return this.f2465g;
    }

    public CharSequence getSubtitle() {
        return this.f2466h;
    }

    /* renamed from: e */
    private void m3461e() {
        if (this.f2469k == null) {
            LayoutInflater.from(getContext()).inflate(C0679g.abc_action_bar_title_item, this);
            this.f2469k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2470l = (TextView) this.f2469k.findViewById(C0678f.action_bar_title);
            this.f2471m = (TextView) this.f2469k.findViewById(C0678f.action_bar_subtitle);
            if (this.f2472n != 0) {
                this.f2470l.setTextAppearance(getContext(), this.f2472n);
            }
            if (this.f2473o != 0) {
                this.f2471m.setTextAppearance(getContext(), this.f2473o);
            }
        }
        this.f2470l.setText(this.f2465g);
        this.f2471m.setText(this.f2466h);
        boolean z = !TextUtils.isEmpty(this.f2465g);
        boolean z2 = !TextUtils.isEmpty(this.f2466h);
        int i = 8;
        this.f2471m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f2469k;
        if (z || z2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f2469k.getParent() == null) {
            addView(this.f2469k);
        }
    }

    /* renamed from: a */
    public void mo3438a(final C0762b bVar) {
        if (this.f2467i == null) {
            this.f2467i = LayoutInflater.from(getContext()).inflate(this.f2475q, this, false);
            addView(this.f2467i);
        } else if (this.f2467i.getParent() == null) {
            addView(this.f2467i);
        }
        this.f2467i.findViewById(C0678f.action_mode_close_button).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                bVar.mo2808c();
            }
        });
        C0790h hVar = (C0790h) bVar.mo2805b();
        if (this.f3063d != null) {
            this.f3063d.mo3517f();
        }
        this.f3063d = new ActionMenuPresenter(getContext());
        this.f3063d.mo3513c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        hVar.mo3167a((C0806o) this.f3063d, this.f3061b);
        this.f3062c = (ActionMenuView) this.f3063d.mo3093a((ViewGroup) this);
        C0595r.m2239a((View) this.f3062c, (Drawable) null);
        addView(this.f3062c, layoutParams);
    }

    /* renamed from: b */
    public void mo3440b() {
        if (this.f2467i == null) {
            mo3441c();
        }
    }

    /* renamed from: c */
    public void mo3441c() {
        removeAllViews();
        this.f2468j = null;
        this.f3062c = null;
    }

    /* renamed from: a */
    public boolean mo3439a() {
        if (this.f3063d != null) {
            return this.f3063d.mo3515d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used ");
            sb2.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        } else {
            int size = MeasureSpec.getSize(i);
            if (this.f3064e > 0) {
                i3 = this.f3064e;
            } else {
                i3 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i3 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            if (this.f2467i != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2467i.getLayoutParams();
                paddingLeft = mo4859a(this.f2467i, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f3062c != null && this.f3062c.getParent() == this) {
                paddingLeft = mo4859a(this.f3062c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f2469k != null && this.f2468j == null) {
                if (this.f2474p) {
                    this.f2469k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2469k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f2469k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo4859a(this.f2469k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f2468j != null) {
                LayoutParams layoutParams = this.f2468j.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.f2468j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i4));
            }
            if (this.f3064e <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0994bg.m4486a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f2467i == null || this.f2467i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2467i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m4125a(paddingRight, i6, a);
            i5 = m4125a(a2 + mo4860a(this.f2467i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        if (!(this.f2469k == null || this.f2468j != null || this.f2469k.getVisibility() == 8)) {
            i5 += mo4860a(this.f2469k, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        if (this.f2468j != null) {
            mo4860a(this.f2468j, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f3062c != null) {
            mo4860a(this.f3062c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2465g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2474p) {
            requestLayout();
        }
        this.f2474p = z;
    }

    /* renamed from: d */
    public boolean mo3442d() {
        return this.f2474p;
    }
}
