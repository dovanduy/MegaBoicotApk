package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f2455a;

    /* renamed from: b */
    Drawable f2456b;

    /* renamed from: c */
    Drawable f2457c;

    /* renamed from: d */
    boolean f2458d;

    /* renamed from: e */
    boolean f2459e;

    /* renamed from: f */
    private boolean f2460f;

    /* renamed from: g */
    private View f2461g;

    /* renamed from: h */
    private View f2462h;

    /* renamed from: i */
    private View f2463i;

    /* renamed from: j */
    private int f2464j;

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0595r.m2239a((View) this, (Drawable) new C0981b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ActionBar);
        this.f2455a = obtainStyledAttributes.getDrawable(C0682j.ActionBar_background);
        this.f2456b = obtainStyledAttributes.getDrawable(C0682j.ActionBar_backgroundStacked);
        this.f2464j = obtainStyledAttributes.getDimensionPixelSize(C0682j.ActionBar_height, -1);
        if (getId() == C0678f.split_action_bar) {
            this.f2458d = true;
            this.f2457c = obtainStyledAttributes.getDrawable(C0682j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f2458d ? this.f2455a == null && this.f2456b == null : this.f2457c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2462h = findViewById(C0678f.action_bar);
        this.f2463i = findViewById(C0678f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f2455a != null) {
            this.f2455a.setCallback(null);
            unscheduleDrawable(this.f2455a);
        }
        this.f2455a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2462h != null) {
                this.f2455a.setBounds(this.f2462h.getLeft(), this.f2462h.getTop(), this.f2462h.getRight(), this.f2462h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2458d ? this.f2455a == null && this.f2456b == null : this.f2457c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f2456b != null) {
            this.f2456b.setCallback(null);
            unscheduleDrawable(this.f2456b);
        }
        this.f2456b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2459e && this.f2456b != null) {
                this.f2456b.setBounds(this.f2461g.getLeft(), this.f2461g.getTop(), this.f2461g.getRight(), this.f2461g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f2458d ? this.f2455a == null && this.f2456b == null : this.f2457c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f2457c != null) {
            this.f2457c.setCallback(null);
            unscheduleDrawable(this.f2457c);
        }
        this.f2457c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2458d && this.f2457c != null) {
                this.f2457c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2458d ? this.f2455a == null && this.f2456b == null : this.f2457c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f2455a != null) {
            this.f2455a.setVisible(z, false);
        }
        if (this.f2456b != null) {
            this.f2456b.setVisible(z, false);
        }
        if (this.f2457c != null) {
            this.f2457c.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2455a && !this.f2458d) || (drawable == this.f2456b && this.f2459e) || ((drawable == this.f2457c && this.f2458d) || super.verifyDrawable(drawable));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2455a != null && this.f2455a.isStateful()) {
            this.f2455a.setState(getDrawableState());
        }
        if (this.f2456b != null && this.f2456b.isStateful()) {
            this.f2456b.setState(getDrawableState());
        }
        if (this.f2457c != null && this.f2457c.isStateful()) {
            this.f2457c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2455a != null) {
            this.f2455a.jumpToCurrentState();
        }
        if (this.f2456b != null) {
            this.f2456b.jumpToCurrentState();
        }
        if (this.f2457c != null) {
            this.f2457c.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f2460f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2460f || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(C0961ap apVar) {
        if (this.f2461g != null) {
            removeView(this.f2461g);
        }
        this.f2461g = apVar;
        if (apVar != null) {
            addView(apVar);
            LayoutParams layoutParams = apVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            apVar.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f2461g;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3459a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m3460b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void onMeasure(int i, int i2) {
        if (this.f2462h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f2464j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f2464j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2462h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (!(this.f2461g == null || this.f2461g.getVisibility() == 8 || mode == 1073741824)) {
                int i3 = !m3459a(this.f2462h) ? m3460b(this.f2462h) : !m3459a(this.f2463i) ? m3460b(this.f2463i) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m3460b(this.f2461g), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.f2461g
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0013
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L_0x0013
            r1 = r10
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r6 == 0) goto L_0x0035
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L_0x0035
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L_0x0035:
            boolean r7 = r5.f2458d
            if (r7 == 0) goto L_0x004f
            android.graphics.drawable.Drawable r6 = r5.f2457c
            if (r6 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r6 = r5.f2457c
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto L_0x00c6
        L_0x004c:
            r10 = r0
            goto L_0x00c6
        L_0x004f:
            android.graphics.drawable.Drawable r7 = r5.f2455a
            if (r7 == 0) goto L_0x00a9
            android.view.View r7 = r5.f2462h
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0079
            android.graphics.drawable.Drawable r7 = r5.f2455a
            android.view.View r8 = r5.f2462h
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f2462h
            int r9 = r9.getTop()
            android.view.View r0 = r5.f2462h
            int r0 = r0.getRight()
            android.view.View r2 = r5.f2462h
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x00a8
        L_0x0079:
            android.view.View r7 = r5.f2463i
            if (r7 == 0) goto L_0x00a3
            android.view.View r7 = r5.f2463i
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x00a3
            android.graphics.drawable.Drawable r7 = r5.f2455a
            android.view.View r8 = r5.f2463i
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f2463i
            int r9 = r9.getTop()
            android.view.View r0 = r5.f2463i
            int r0 = r0.getRight()
            android.view.View r2 = r5.f2463i
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x00a8
        L_0x00a3:
            android.graphics.drawable.Drawable r7 = r5.f2455a
            r7.setBounds(r0, r0, r0, r0)
        L_0x00a8:
            r0 = r10
        L_0x00a9:
            r5.f2459e = r1
            if (r1 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r7 = r5.f2456b
            if (r7 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r7 = r5.f2456b
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
        L_0x00c6:
            if (r10 == 0) goto L_0x00cb
            r5.invalidate()
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }
}
