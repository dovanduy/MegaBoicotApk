package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0602v;
import android.support.p017v4.view.C0606w;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0932a extends ViewGroup {

    /* renamed from: a */
    protected final C0933a f3060a;

    /* renamed from: b */
    protected final Context f3061b;

    /* renamed from: c */
    protected ActionMenuView f3062c;

    /* renamed from: d */
    protected ActionMenuPresenter f3063d;

    /* renamed from: e */
    protected int f3064e;

    /* renamed from: f */
    protected C0602v f3065f;

    /* renamed from: g */
    private boolean f3066g;

    /* renamed from: h */
    private boolean f3067h;

    /* renamed from: android.support.v7.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0933a implements C0606w {

        /* renamed from: a */
        int f3068a;

        /* renamed from: c */
        private boolean f3070c = false;

        protected C0933a() {
        }

        /* renamed from: a */
        public C0933a mo4862a(C0602v vVar, int i) {
            C0932a.this.f3065f = vVar;
            this.f3068a = i;
            return this;
        }

        /* renamed from: a */
        public void mo2131a(View view) {
            C0932a.super.setVisibility(0);
            this.f3070c = false;
        }

        /* renamed from: b */
        public void mo2132b(View view) {
            if (!this.f3070c) {
                C0932a.this.f3065f = null;
                C0932a.super.setVisibility(this.f3068a);
            }
        }

        /* renamed from: c */
        public void mo2133c(View view) {
            this.f3070c = true;
        }
    }

    /* renamed from: a */
    protected static int m4125a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    C0932a(Context context) {
        this(context, null);
    }

    C0932a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0932a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3060a = new C0933a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0673a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3061b = context;
        } else {
            this.f3061b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0682j.ActionBar, C0673a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0682j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f3063d != null) {
            this.f3063d.mo3509a(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3066g = false;
        }
        if (!this.f3066g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3066g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3066g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3067h = false;
        }
        if (!this.f3067h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3067h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3067h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f3064e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f3064e;
    }

    public int getAnimatedVisibility() {
        if (this.f3065f != null) {
            return this.f3060a.f3068a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public C0602v mo3437a(int i, long j) {
        if (this.f3065f != null) {
            this.f3065f.mo2125b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0602v a = C0595r.m2263l(this).mo2118a(1.0f);
            a.mo2119a(j);
            a.mo2120a((C0606w) this.f3060a.mo4862a(a, i));
            return a;
        }
        C0602v a2 = C0595r.m2263l(this).mo2118a(0.0f);
        a2.mo2119a(j);
        a2.mo2120a((C0606w) this.f3060a.mo4862a(a2, i));
        return a2;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f3065f != null) {
                this.f3065f.mo2125b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo3439a() {
        if (this.f3063d != null) {
            return this.f3063d.mo3515d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4859a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4860a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
