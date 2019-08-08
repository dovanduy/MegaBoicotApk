package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p028v7.app.ActionBar.C0684b;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.view.C0761a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ap */
/* compiled from: ScrollingTabContainerView */
public class C0961ap extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f3160j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f3161a;

    /* renamed from: b */
    LinearLayoutCompat f3162b;

    /* renamed from: c */
    int f3163c;

    /* renamed from: d */
    int f3164d;

    /* renamed from: e */
    private C0964b f3165e;

    /* renamed from: f */
    private Spinner f3166f;

    /* renamed from: g */
    private boolean f3167g;

    /* renamed from: h */
    private int f3168h;

    /* renamed from: i */
    private int f3169i;

    /* renamed from: android.support.v7.widget.ap$a */
    /* compiled from: ScrollingTabContainerView */
    private class C0963a extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        C0963a() {
        }

        public int getCount() {
            return C0961ap.this.f3162b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0965c) C0961ap.this.f3162b.getChildAt(i)).mo5042b();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0961ap.this.mo5023a((C0684b) getItem(i), true);
            }
            ((C0965c) view).mo5041a((C0684b) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0964b implements OnClickListener {
        C0964b() {
        }

        public void onClick(View view) {
            ((C0965c) view).mo5042b().mo2593d();
            int childCount = C0961ap.this.f3162b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0961ap.this.f3162b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0965c extends LinearLayout {

        /* renamed from: b */
        private final int[] f3175b = {16842964};

        /* renamed from: c */
        private C0684b f3176c;

        /* renamed from: d */
        private TextView f3177d;

        /* renamed from: e */
        private ImageView f3178e;

        /* renamed from: f */
        private View f3179f;

        public C0965c(Context context, C0684b bVar, boolean z) {
            super(context, null, C0673a.actionBarTabStyle);
            this.f3176c = bVar;
            C0977ay a = C0977ay.m4367a(context, null, this.f3175b, C0673a.actionBarTabStyle, 0);
            if (a.mo5100g(0)) {
                setBackgroundDrawable(a.mo5086a(0));
            }
            a.mo5087a();
            if (z) {
                setGravity(8388627);
            }
            mo5040a();
        }

        /* renamed from: a */
        public void mo5041a(C0684b bVar) {
            this.f3176c = bVar;
            mo5040a();
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0684b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0684b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0961ap.this.f3163c > 0 && getMeasuredWidth() > C0961ap.this.f3163c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C0961ap.this.f3163c, 1073741824), i2);
            }
        }

        /* renamed from: a */
        public void mo5040a() {
            C0684b bVar = this.f3176c;
            View c = bVar.mo2592c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f3179f = c;
                if (this.f3177d != null) {
                    this.f3177d.setVisibility(8);
                }
                if (this.f3178e != null) {
                    this.f3178e.setVisibility(8);
                    this.f3178e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f3179f != null) {
                removeView(this.f3179f);
                this.f3179f = null;
            }
            Drawable a = bVar.mo2590a();
            CharSequence b = bVar.mo2591b();
            if (a != null) {
                if (this.f3178e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f3178e = appCompatImageView;
                }
                this.f3178e.setImageDrawable(a);
                this.f3178e.setVisibility(0);
            } else if (this.f3178e != null) {
                this.f3178e.setVisibility(8);
                this.f3178e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f3177d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0673a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f3177d = appCompatTextView;
                }
                this.f3177d.setText(b);
                this.f3177d.setVisibility(0);
            } else if (this.f3177d != null) {
                this.f3177d.setVisibility(8);
                this.f3177d.setText(null);
            }
            if (this.f3178e != null) {
                this.f3178e.setContentDescription(bVar.mo2594e());
            }
            if (!z) {
                charSequence = bVar.mo2594e();
            }
            C0982ba.m4432a(this, charSequence);
        }

        /* renamed from: b */
        public C0684b mo5042b() {
            return this.f3176c;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f3162b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f3163c = -1;
        } else {
            if (childCount > 2) {
                this.f3163c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f3163c = MeasureSpec.getSize(i) / 2;
            }
            this.f3163c = Math.min(this.f3163c, this.f3164d);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3168h, 1073741824);
        if (z2 || !this.f3167g) {
            z = false;
        }
        if (z) {
            this.f3162b.measure(0, makeMeasureSpec);
            if (this.f3162b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m4288b();
            } else {
                m4289c();
            }
        } else {
            m4289c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f3169i);
        }
    }

    /* renamed from: a */
    private boolean m4287a() {
        return this.f3166f != null && this.f3166f.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.f3167g = z;
    }

    /* renamed from: b */
    private void m4288b() {
        if (!m4287a()) {
            if (this.f3166f == null) {
                this.f3166f = m4290d();
            }
            removeView(this.f3162b);
            addView(this.f3166f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f3166f.getAdapter() == null) {
                this.f3166f.setAdapter(new C0963a());
            }
            if (this.f3161a != null) {
                removeCallbacks(this.f3161a);
                this.f3161a = null;
            }
            this.f3166f.setSelection(this.f3169i);
        }
    }

    /* renamed from: c */
    private boolean m4289c() {
        if (!m4287a()) {
            return false;
        }
        removeView(this.f3166f);
        addView(this.f3162b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f3166f.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.f3169i = i;
        int childCount = this.f3162b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3162b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo5024a(i);
            }
            i2++;
        }
        if (this.f3166f != null && i >= 0) {
            this.f3166f.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.f3168h = i;
        requestLayout();
    }

    /* renamed from: d */
    private Spinner m4290d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0673a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0761a a = C0761a.m3097a(getContext());
        setContentHeight(a.mo2950e());
        this.f3164d = a.mo2952g();
    }

    /* renamed from: a */
    public void mo5024a(int i) {
        final View childAt = this.f3162b.getChildAt(i);
        if (this.f3161a != null) {
            removeCallbacks(this.f3161a);
        }
        this.f3161a = new Runnable() {
            public void run() {
                C0961ap.this.smoothScrollTo(childAt.getLeft() - ((C0961ap.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0961ap.this.f3161a = null;
            }
        };
        post(this.f3161a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3161a != null) {
            post(this.f3161a);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3161a != null) {
            removeCallbacks(this.f3161a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0965c mo5023a(C0684b bVar, boolean z) {
        C0965c cVar = new C0965c(getContext(), bVar, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f3168h));
        } else {
            cVar.setFocusable(true);
            if (this.f3165e == null) {
                this.f3165e = new C0964b();
            }
            cVar.setOnClickListener(this.f3165e);
        }
        return cVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0965c) view).mo5042b().mo2593d();
    }
}
