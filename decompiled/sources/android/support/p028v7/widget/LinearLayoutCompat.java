package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.LinearLayoutCompat */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f2675a;

    /* renamed from: b */
    private int f2676b;

    /* renamed from: c */
    private int f2677c;

    /* renamed from: d */
    private int f2678d;

    /* renamed from: e */
    private int f2679e;

    /* renamed from: f */
    private int f2680f;

    /* renamed from: g */
    private float f2681g;

    /* renamed from: h */
    private boolean f2682h;

    /* renamed from: i */
    private int[] f2683i;

    /* renamed from: j */
    private int[] f2684j;

    /* renamed from: k */
    private Drawable f2685k;

    /* renamed from: l */
    private int f2686l;

    /* renamed from: m */
    private int f2687m;

    /* renamed from: n */
    private int f2688n;

    /* renamed from: o */
    private int f2689o;

    /* renamed from: android.support.v7.widget.LinearLayoutCompat$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: g */
        public float f2690g;

        /* renamed from: h */
        public int f2691h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2691h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.LinearLayoutCompat_Layout);
            this.f2690g = obtainStyledAttributes.getFloat(C0682j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2691h = obtainStyledAttributes.getInt(C0682j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2691h = -1;
            this.f2690g = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2691h = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3840a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3841a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo3847b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo3854d(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2675a = true;
        this.f2676b = -1;
        this.f2677c = 0;
        this.f2679e = 8388659;
        C0977ay a = C0977ay.m4367a(context, attributeSet, C0682j.LinearLayoutCompat, i, 0);
        int a2 = a.mo5084a(C0682j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo5084a(C0682j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo5088a(C0682j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f2681g = a.mo5083a(C0682j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2676b = a.mo5084a(C0682j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2682h = a.mo5088a(C0682j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo5086a(C0682j.LinearLayoutCompat_divider));
        this.f2688n = a.mo5084a(C0682j.LinearLayoutCompat_showDividers, 0);
        this.f2689o = a.mo5095e(C0682j.LinearLayoutCompat_dividerPadding, 0);
        a.mo5087a();
    }

    public void setShowDividers(int i) {
        if (i != this.f2688n) {
            requestLayout();
        }
        this.f2688n = i;
    }

    public int getShowDividers() {
        return this.f2688n;
    }

    public Drawable getDividerDrawable() {
        return this.f2685k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f2685k) {
            this.f2685k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f2686l = drawable.getIntrinsicWidth();
                this.f2687m = drawable.getIntrinsicHeight();
            } else {
                this.f2686l = 0;
                this.f2687m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f2689o = i;
    }

    public int getDividerPadding() {
        return this.f2689o;
    }

    public int getDividerWidth() {
        return this.f2686l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f2685k != null) {
            if (this.f2678d == 1) {
                mo3844a(canvas);
            } else {
                mo3851b(canvas);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3844a(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View b = mo3848b(i2);
            if (!(b == null || b.getVisibility() == 8 || !mo3853c(i2))) {
                mo3845a(canvas, (b.getTop() - ((LayoutParams) b.getLayoutParams()).topMargin) - this.f2687m);
            }
        }
        if (mo3853c(virtualChildCount)) {
            View b2 = mo3848b(virtualChildCount - 1);
            if (b2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f2687m;
            } else {
                i = b2.getBottom() + ((LayoutParams) b2.getLayoutParams()).bottomMargin;
            }
            mo3845a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3851b(Canvas canvas) {
        int i;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0994bg.m4486a(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View b = mo3848b(i3);
            if (!(b == null || b.getVisibility() == 8 || !mo3853c(i3))) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (a) {
                    i2 = b.getRight() + layoutParams.rightMargin;
                } else {
                    i2 = (b.getLeft() - layoutParams.leftMargin) - this.f2686l;
                }
                mo3852b(canvas, i2);
            }
        }
        if (mo3853c(virtualChildCount)) {
            View b2 = mo3848b(virtualChildCount - 1);
            if (b2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) b2.getLayoutParams();
                if (a) {
                    i = (b2.getLeft() - layoutParams2.leftMargin) - this.f2686l;
                } else {
                    i = b2.getRight() + layoutParams2.rightMargin;
                }
            } else if (a) {
                i = getPaddingLeft();
            } else {
                i = (getWidth() - getPaddingRight()) - this.f2686l;
            }
            mo3852b(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3845a(Canvas canvas, int i) {
        this.f2685k.setBounds(getPaddingLeft() + this.f2689o, i, (getWidth() - getPaddingRight()) - this.f2689o, this.f2687m + i);
        this.f2685k.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3852b(Canvas canvas, int i) {
        this.f2685k.setBounds(i, getPaddingTop() + this.f2689o, this.f2686l + i, (getHeight() - getPaddingBottom()) - this.f2689o);
        this.f2685k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f2675a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2682h = z;
    }

    public int getBaseline() {
        if (this.f2676b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f2676b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f2676b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i = this.f2677c;
            if (this.f2678d == 1) {
                int i2 = this.f2679e & 112;
                if (i2 != 48) {
                    if (i2 == 16) {
                        i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2680f) / 2;
                    } else if (i2 == 80) {
                        i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2680f;
                    }
                }
            }
            return i + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
        } else if (this.f2676b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2676b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f2676b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo3848b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2681g;
    }

    public void setWeightSum(float f) {
        this.f2681g = Math.max(0.0f, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2678d == 1) {
            mo3842a(i, i2);
        } else {
            mo3849b(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3853c(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f2688n & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f2688n & 4) != 0) {
                z = true;
            }
            return z;
        } else if ((this.f2688n & 2) == 0) {
            return false;
        } else {
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                } else if (getChildAt(i2).getVisibility() != 8) {
                    z = true;
                    break;
                } else {
                    i2--;
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0334  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3842a(int r41, int r42) {
        /*
            r40 = this;
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = 0
            r7.f2680f = r10
            int r11 = r40.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r41)
            int r13 = android.view.View.MeasureSpec.getMode(r42)
            int r14 = r7.f2676b
            boolean r15 = r7.f2682h
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L_0x002b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0199
            android.view.View r4 = r7.mo3848b(r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.f2680f
            int r10 = r7.mo3854d(r6)
            int r4 = r4 + r10
            r7.f2680f = r4
            r31 = r11
            r28 = r13
            r4 = r22
            goto L_0x018f
        L_0x0048:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005f
            int r1 = r7.mo3841a(r4, r6)
            int r6 = r6 + r1
            r31 = r11
            r28 = r13
            r4 = r22
            r1 = r24
            goto L_0x018f
        L_0x005f:
            boolean r1 = r7.mo3853c(r6)
            if (r1 == 0) goto L_0x006c
            int r1 = r7.f2680f
            int r10 = r7.f2687m
            int r1 = r1 + r10
            r7.f2680f = r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r1 = r10.f2690g
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a7
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a7
            float r0 = r10.f2690g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            int r0 = r7.f2680f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f2680f = r0
            r8 = r4
            r34 = r5
            r31 = r11
            r28 = r13
            r18 = r17
            r32 = r22
            r33 = r24
            r30 = r26
            r13 = r6
            goto L_0x0113
        L_0x00a7:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.f2690g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00ba
        L_0x00b8:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ba:
            r23 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            int r0 = r7.f2680f
            r27 = r0
            goto L_0x00c7
        L_0x00c5:
            r27 = 0
        L_0x00c7:
            r0 = r7
            r28 = r13
            r13 = r24
            r24 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r31 = r11
            r11 = r3
            r3 = r8
            r8 = r4
            r33 = r13
            r32 = r22
            r13 = r24
            r4 = r23
            r34 = r5
            r5 = r9
            r13 = r6
            r6 = r27
            r0.mo3846a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f2
            r10.height = r0
        L_0x00f2:
            int r0 = r8.getMeasuredHeight()
            int r1 = r7.f2680f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.mo3847b(r8)
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f2680f = r1
            if (r15 == 0) goto L_0x0112
            int r3 = java.lang.Math.max(r0, r11)
            goto L_0x0113
        L_0x0112:
            r3 = r11
        L_0x0113:
            if (r14 < 0) goto L_0x011d
            int r6 = r13 + 1
            if (r14 != r6) goto L_0x011d
            int r0 = r7.f2680f
            r7.f2677c = r0
        L_0x011d:
            if (r13 >= r14) goto L_0x012d
            float r0 = r10.f2690g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x012d:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x013b
            int r0 = r10.width
            r1 = -1
            if (r0 != r1) goto L_0x013b
            r0 = r17
            r20 = r0
            goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            int r1 = r10.leftMargin
            int r2 = r10.rightMargin
            int r1 = r1 + r2
            int r2 = r8.getMeasuredWidth()
            int r2 = r2 + r1
            r4 = r30
            int r4 = java.lang.Math.max(r4, r2)
            int r5 = r8.getMeasuredState()
            r6 = r33
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r19 == 0) goto L_0x0160
            int r6 = r10.width
            r11 = -1
            if (r6 != r11) goto L_0x0160
            r6 = r17
            goto L_0x0161
        L_0x0160:
            r6 = 0
        L_0x0161:
            float r10 = r10.f2690g
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0176
            if (r0 == 0) goto L_0x016c
        L_0x0169:
            r10 = r32
            goto L_0x016e
        L_0x016c:
            r1 = r2
            goto L_0x0169
        L_0x016e:
            int r0 = java.lang.Math.max(r10, r1)
            r10 = r0
            r0 = r34
            goto L_0x0181
        L_0x0176:
            r10 = r32
            if (r0 == 0) goto L_0x017b
            r2 = r1
        L_0x017b:
            r1 = r34
            int r0 = java.lang.Math.max(r1, r2)
        L_0x0181:
            int r1 = r7.mo3841a(r8, r13)
            int r1 = r1 + r13
            r2 = r4
            r19 = r6
            r4 = r10
            r6 = r1
            r1 = r5
            r5 = r0
            r0 = r25
        L_0x018f:
            int r6 = r6 + 1
            r13 = r28
            r11 = r31
            r8 = r41
            goto L_0x002b
        L_0x0199:
            r6 = r1
            r4 = r2
            r1 = r5
            r31 = r11
            r28 = r13
            r2 = r22
            r11 = r3
            int r3 = r7.f2680f
            if (r3 <= 0) goto L_0x01b7
            r3 = r31
            boolean r5 = r7.mo3853c(r3)
            if (r5 == 0) goto L_0x01b9
            int r5 = r7.f2680f
            int r8 = r7.f2687m
            int r5 = r5 + r8
            r7.f2680f = r5
            goto L_0x01b9
        L_0x01b7:
            r3 = r31
        L_0x01b9:
            if (r15 == 0) goto L_0x0212
            r5 = r28
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r8) goto L_0x01c7
            if (r5 != 0) goto L_0x01c4
            goto L_0x01c7
        L_0x01c4:
            r35 = r4
            goto L_0x0216
        L_0x01c7:
            r8 = 0
            r7.f2680f = r8
            r8 = 0
        L_0x01cb:
            if (r8 >= r3) goto L_0x01c4
            android.view.View r13 = r7.mo3848b(r8)
            if (r13 != 0) goto L_0x01dd
            int r13 = r7.f2680f
            int r14 = r7.mo3854d(r8)
            int r13 = r13 + r14
            r7.f2680f = r13
            goto L_0x01e8
        L_0x01dd:
            int r14 = r13.getVisibility()
            if (r14 != r10) goto L_0x01eb
            int r13 = r7.mo3841a(r13, r8)
            int r8 = r8 + r13
        L_0x01e8:
            r35 = r4
            goto L_0x020b
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r14 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r14
            int r10 = r7.f2680f
            int r21 = r10 + r11
            r35 = r4
            int r4 = r14.topMargin
            int r21 = r21 + r4
            int r4 = r14.bottomMargin
            int r21 = r21 + r4
            int r4 = r7.mo3847b(r13)
            int r4 = r21 + r4
            int r4 = java.lang.Math.max(r10, r4)
            r7.f2680f = r4
        L_0x020b:
            int r8 = r8 + 1
            r4 = r35
            r10 = 8
            goto L_0x01cb
        L_0x0212:
            r35 = r4
            r5 = r28
        L_0x0216:
            int r4 = r7.f2680f
            int r8 = r40.getPaddingTop()
            int r10 = r40.getPaddingBottom()
            int r8 = r8 + r10
            int r4 = r4 + r8
            r7.f2680f = r4
            int r4 = r7.f2680f
            int r8 = r40.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r8)
            r8 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r9, r8)
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r4
            int r10 = r7.f2680f
            int r8 = r8 - r10
            if (r18 != 0) goto L_0x0285
            if (r8 == 0) goto L_0x0243
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0243
            goto L_0x0285
        L_0x0243:
            int r0 = java.lang.Math.max(r1, r2)
            if (r15 == 0) goto L_0x027f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r5 == r1) goto L_0x027f
            r1 = 0
        L_0x024e:
            if (r1 >= r3) goto L_0x027f
            android.view.View r2 = r7.mo3848b(r1)
            if (r2 == 0) goto L_0x027c
            int r5 = r2.getVisibility()
            r8 = 8
            if (r5 != r8) goto L_0x025f
            goto L_0x027c
        L_0x025f:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.f2690g
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x027c
            int r5 = r2.getMeasuredWidth()
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r8)
            r2.measure(r5, r10)
        L_0x027c:
            int r1 = r1 + 1
            goto L_0x024e
        L_0x027f:
            r1 = r35
            r11 = r41
            goto L_0x037a
        L_0x0285:
            float r2 = r7.f2681g
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x028d
            float r0 = r7.f2681g
        L_0x028d:
            r2 = 0
            r7.f2680f = r2
            r11 = r0
            r0 = r2
            r10 = r8
            r8 = r1
            r1 = r35
        L_0x0296:
            if (r0 >= r3) goto L_0x0369
            android.view.View r13 = r7.mo3848b(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02aa
            r37 = r11
            r11 = r41
            goto L_0x0362
        L_0x02aa:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r14 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r14
            float r2 = r14.f2690g
            int r18 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x030a
            float r15 = (float) r10
            float r15 = r15 * r2
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r2
            int r10 = r10 - r15
            int r2 = r40.getPaddingLeft()
            int r18 = r40.getPaddingRight()
            int r2 = r2 + r18
            r36 = r10
            int r10 = r14.leftMargin
            int r2 = r2 + r10
            int r10 = r14.rightMargin
            int r2 = r2 + r10
            int r10 = r14.width
            r37 = r11
            r11 = r41
            int r2 = getChildMeasureSpec(r11, r2, r10)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02ed
            r10 = 1073741824(0x40000000, float:2.0)
            if (r5 == r10) goto L_0x02e1
            goto L_0x02ef
        L_0x02e1:
            if (r15 <= 0) goto L_0x02e4
            goto L_0x02e5
        L_0x02e4:
            r15 = 0
        L_0x02e5:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r2, r15)
            goto L_0x02ff
        L_0x02ed:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02ef:
            int r18 = r13.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02f8
            r15 = 0
        L_0x02f8:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r2, r15)
        L_0x02ff:
            int r2 = r13.getMeasuredState()
            r2 = r2 & -256(0xffffffffffffff00, float:NaN)
            int r6 = android.view.View.combineMeasuredStates(r6, r2)
            goto L_0x0311
        L_0x030a:
            r2 = r11
            r11 = r41
            r37 = r2
            r36 = r10
        L_0x0311:
            int r2 = r14.leftMargin
            int r10 = r14.rightMargin
            int r2 = r2 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r2
            int r1 = java.lang.Math.max(r1, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x032d
            int r15 = r14.width
            r38 = r1
            r1 = -1
            if (r15 != r1) goto L_0x0330
            r15 = r17
            goto L_0x0331
        L_0x032d:
            r38 = r1
            r1 = -1
        L_0x0330:
            r15 = 0
        L_0x0331:
            if (r15 == 0) goto L_0x0334
            goto L_0x0335
        L_0x0334:
            r2 = r10
        L_0x0335:
            int r2 = java.lang.Math.max(r8, r2)
            if (r19 == 0) goto L_0x0342
            int r8 = r14.width
            if (r8 != r1) goto L_0x0342
            r8 = r17
            goto L_0x0343
        L_0x0342:
            r8 = 0
        L_0x0343:
            int r10 = r7.f2680f
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo3847b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f2680f = r1
            r19 = r8
            r10 = r36
            r1 = r38
            r8 = r2
        L_0x0362:
            int r0 = r0 + 1
            r11 = r37
            r2 = 0
            goto L_0x0296
        L_0x0369:
            r11 = r41
            int r0 = r7.f2680f
            int r2 = r40.getPaddingTop()
            int r5 = r40.getPaddingBottom()
            int r2 = r2 + r5
            int r0 = r0 + r2
            r7.f2680f = r0
            r0 = r8
        L_0x037a:
            if (r19 != 0) goto L_0x0381
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0381
            goto L_0x0382
        L_0x0381:
            r0 = r1
        L_0x0382:
            int r1 = r40.getPaddingLeft()
            int r2 = r40.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r40.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r6)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x03a0
            r7.m3644c(r3, r9)
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.LinearLayoutCompat.mo3842a(int, int):void");
    }

    /* renamed from: c */
    private void m3644c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo3848b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3849b(int r42, int r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = 0
            r7.f2680f = r10
            int r11 = r41.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getMode(r43)
            int[] r0 = r7.f2683i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f2684j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f2683i = r0
            int[] r0 = new int[r14]
            r7.f2684j = r0
        L_0x0026:
            int[] r15 = r7.f2683i
            int[] r6 = r7.f2684j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f2675a
            boolean r3 = r7.f2682h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L_0x0062:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0203
            android.view.View r6 = r7.mo3848b(r1)
            if (r6 != 0) goto L_0x0081
            int r5 = r7.f2680f
            int r6 = r7.mo3854d(r1)
            int r5 = r5 + r6
            r7.f2680f = r5
        L_0x0077:
            r30 = r0
            r0 = r1
            r1 = r2
            r31 = r3
            r35 = r4
            goto L_0x01ef
        L_0x0081:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008d
            int r5 = r7.mo3841a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0077
        L_0x008d:
            boolean r5 = r7.mo3853c(r1)
            if (r5 == 0) goto L_0x009a
            int r5 = r7.f2680f
            int r10 = r7.f2686l
            int r5 = r5 + r10
            r7.f2680f = r5
        L_0x009a:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r5 = r10.f2690g
            float r30 = r0 + r5
            if (r12 != r2) goto L_0x00f0
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f0
            float r0 = r10.f2690g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            if (r19 == 0) goto L_0x00be
            int r0 = r7.f2680f
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f2680f = r0
            goto L_0x00cc
        L_0x00be:
            int r0 = r7.f2680f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f2680f = r0
        L_0x00cc:
            if (r4 == 0) goto L_0x00e1
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r33 = r1
            r31 = r3
            r35 = r4
            r8 = r6
            r29 = -2
            goto L_0x0162
        L_0x00e1:
            r33 = r1
            r31 = r3
            r35 = r4
            r8 = r6
            r22 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r29 = -2
            goto L_0x0164
        L_0x00f0:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ff
            float r0 = r10.f2690g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x0102
        L_0x00ff:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0102:
            int r0 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            int r0 = r7.f2680f
            r29 = r0
            goto L_0x010d
        L_0x010b:
            r29 = 0
        L_0x010d:
            r32 = 0
            r0 = r7
            r33 = r1
            r1 = r6
            r34 = r2
            r2 = r33
            r31 = r3
            r3 = r8
            r35 = r4
            r4 = r29
            r29 = r5
            r8 = -1
            r5 = r9
            r8 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r32
            r0.mo3846a(r1, r2, r3, r4, r5, r6)
            r0 = r34
            if (r0 == r9) goto L_0x0130
            r10.width = r0
        L_0x0130:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x0147
            int r1 = r7.f2680f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            int r3 = r7.mo3847b(r8)
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f2680f = r1
            goto L_0x015c
        L_0x0147:
            int r1 = r7.f2680f
            int r2 = r1 + r0
            int r3 = r10.leftMargin
            int r2 = r2 + r3
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            int r3 = r7.mo3847b(r8)
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f2680f = r1
        L_0x015c:
            if (r31 == 0) goto L_0x0162
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0162:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0164:
            if (r13 == r1) goto L_0x0170
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0170
            r0 = r18
            r27 = r0
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            int r2 = r10.topMargin
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            int r3 = r8.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r8.getMeasuredState()
            r6 = r25
            int r4 = android.view.View.combineMeasuredStates(r6, r4)
            if (r35 == 0) goto L_0x01b1
            int r5 = r8.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01b1
            int r6 = r10.f2691h
            if (r6 >= 0) goto L_0x0195
            int r6 = r7.f2679e
            goto L_0x0197
        L_0x0195:
            int r6 = r10.f2691h
        L_0x0197:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r3 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01b1:
            r5 = r21
            int r5 = java.lang.Math.max(r5, r3)
            if (r26 == 0) goto L_0x01c1
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01c1
            r6 = r18
            goto L_0x01c2
        L_0x01c1:
            r6 = 0
        L_0x01c2:
            float r9 = r10.f2690g
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d6
            if (r0 == 0) goto L_0x01cd
        L_0x01ca:
            r10 = r24
            goto L_0x01cf
        L_0x01cd:
            r2 = r3
            goto L_0x01ca
        L_0x01cf:
            int r24 = java.lang.Math.max(r10, r2)
        L_0x01d3:
            r10 = r33
            goto L_0x01e4
        L_0x01d6:
            r10 = r24
            if (r0 == 0) goto L_0x01db
            r3 = r2
        L_0x01db:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r3)
            r24 = r10
            goto L_0x01d3
        L_0x01e4:
            int r0 = r7.mo3841a(r8, r10)
            int r0 = r0 + r10
            r25 = r4
            r21 = r5
            r26 = r6
        L_0x01ef:
            int r0 = r0 + 1
            r2 = r1
            r6 = r28
            r3 = r31
            r4 = r35
            r5 = -1
            r8 = r42
            r9 = r43
            r10 = 0
            r1 = r0
            r0 = r30
            goto L_0x0062
        L_0x0203:
            r1 = r2
            r31 = r3
            r35 = r4
            r3 = r21
            r2 = r23
            r10 = r24
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -2
            int r4 = r7.f2680f
            if (r4 <= 0) goto L_0x0225
            boolean r4 = r7.mo3853c(r11)
            if (r4 == 0) goto L_0x0225
            int r4 = r7.f2680f
            int r8 = r7.f2686l
            int r4 = r4 + r8
            r7.f2680f = r4
        L_0x0225:
            r4 = r15[r18]
            r8 = -1
            if (r4 != r8) goto L_0x0237
            r4 = 0
            r1 = r15[r4]
            if (r1 != r8) goto L_0x0237
            r1 = r15[r17]
            if (r1 != r8) goto L_0x0237
            r1 = r15[r16]
            if (r1 == r8) goto L_0x0267
        L_0x0237:
            r1 = r15[r16]
            r4 = 0
            r8 = r15[r4]
            r5 = r15[r18]
            r9 = r15[r17]
            int r5 = java.lang.Math.max(r5, r9)
            int r5 = java.lang.Math.max(r8, r5)
            int r1 = java.lang.Math.max(r1, r5)
            r5 = r28[r16]
            r8 = r28[r4]
            r4 = r28[r18]
            r9 = r28[r17]
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r1 = r1 + r4
            int r21 = java.lang.Math.max(r3, r1)
            r3 = r21
        L_0x0267:
            if (r31 == 0) goto L_0x02c8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r1) goto L_0x026f
            if (r12 != 0) goto L_0x02c8
        L_0x026f:
            r1 = 0
            r7.f2680f = r1
            r1 = 0
        L_0x0273:
            if (r1 >= r11) goto L_0x02c8
            android.view.View r4 = r7.mo3848b(r1)
            if (r4 != 0) goto L_0x0285
            int r4 = r7.f2680f
            int r5 = r7.mo3854d(r1)
            int r4 = r4 + r5
            r7.f2680f = r4
            goto L_0x0292
        L_0x0285:
            int r5 = r4.getVisibility()
            r8 = 8
            if (r5 != r8) goto L_0x0295
            int r4 = r7.mo3841a(r4, r1)
            int r1 = r1 + r4
        L_0x0292:
            r36 = r1
            goto L_0x02c5
        L_0x0295:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r5
            if (r19 == 0) goto L_0x02ae
            int r8 = r7.f2680f
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo3847b(r4)
            int r9 = r9 + r4
            int r8 = r8 + r9
            r7.f2680f = r8
            goto L_0x0292
        L_0x02ae:
            int r8 = r7.f2680f
            int r9 = r8 + r14
            r36 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo3847b(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r8, r9)
            r7.f2680f = r1
        L_0x02c5:
            int r1 = r36 + 1
            goto L_0x0273
        L_0x02c8:
            int r1 = r7.f2680f
            int r4 = r41.getPaddingLeft()
            int r5 = r41.getPaddingRight()
            int r4 = r4 + r5
            int r1 = r1 + r4
            r7.f2680f = r1
            int r1 = r7.f2680f
            int r4 = r41.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r4)
            r4 = r42
            r5 = 0
            r8 = -1
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r1
            int r9 = r7.f2680f
            int r5 = r5 - r9
            if (r22 != 0) goto L_0x0338
            if (r5 == 0) goto L_0x02f8
            int r21 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x02f8
            goto L_0x0338
        L_0x02f8:
            int r0 = java.lang.Math.max(r2, r10)
            if (r31 == 0) goto L_0x0334
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0334
            r2 = 0
        L_0x0303:
            if (r2 >= r11) goto L_0x0334
            android.view.View r5 = r7.mo3848b(r2)
            if (r5 == 0) goto L_0x0331
            int r8 = r5.getVisibility()
            r10 = 8
            if (r8 != r10) goto L_0x0314
            goto L_0x0331
        L_0x0314:
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r8 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r8
            float r8 = r8.f2690g
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x0331
            r8 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r8)
            int r12 = r5.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            r5.measure(r10, r12)
        L_0x0331:
            int r2 = r2 + 1
            goto L_0x0303
        L_0x0334:
            r5 = r43
            goto L_0x04d2
        L_0x0338:
            float r3 = r7.f2681g
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x0340
            float r0 = r7.f2681g
        L_0x0340:
            r15[r16] = r8
            r15[r17] = r8
            r15[r18] = r8
            r3 = 0
            r15[r3] = r8
            r28[r16] = r8
            r28[r17] = r8
            r28[r18] = r8
            r28[r3] = r8
            r7.f2680f = r3
            r10 = r2
            r3 = r8
            r2 = r0
            r0 = 0
        L_0x0357:
            if (r0 >= r11) goto L_0x0480
            android.view.View r14 = r7.mo3848b(r0)
            if (r14 == 0) goto L_0x0473
            int r8 = r14.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x0369
            goto L_0x0473
        L_0x0369:
            android.view.ViewGroup$LayoutParams r8 = r14.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r8 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r8
            float r9 = r8.f2690g
            int r21 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x03ce
            float r4 = (float) r5
            float r4 = r4 * r9
            float r4 = r4 / r2
            int r4 = (int) r4
            float r2 = r2 - r9
            int r5 = r5 - r4
            int r9 = r41.getPaddingTop()
            int r21 = r41.getPaddingBottom()
            int r9 = r9 + r21
            r37 = r2
            int r2 = r8.topMargin
            int r9 = r9 + r2
            int r2 = r8.bottomMargin
            int r9 = r9 + r2
            int r2 = r8.height
            r38 = r5
            r5 = r43
            int r2 = getChildMeasureSpec(r5, r9, r2)
            int r9 = r8.width
            if (r9 != 0) goto L_0x03ac
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 == r9) goto L_0x03a0
            goto L_0x03ae
        L_0x03a0:
            if (r4 <= 0) goto L_0x03a3
            goto L_0x03a4
        L_0x03a3:
            r4 = 0
        L_0x03a4:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            r14.measure(r4, r2)
            goto L_0x03be
        L_0x03ac:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x03ae:
            int r21 = r14.getMeasuredWidth()
            int r4 = r21 + r4
            if (r4 >= 0) goto L_0x03b7
            r4 = 0
        L_0x03b7:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            r14.measure(r4, r2)
        L_0x03be:
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r6 = android.view.View.combineMeasuredStates(r6, r2)
            r2 = r37
            r4 = r38
            goto L_0x03d1
        L_0x03ce:
            r4 = r5
            r5 = r43
        L_0x03d1:
            if (r19 == 0) goto L_0x03f2
            int r9 = r7.f2680f
            int r21 = r14.getMeasuredWidth()
            r39 = r2
            int r2 = r8.leftMargin
            int r21 = r21 + r2
            int r2 = r8.rightMargin
            int r21 = r21 + r2
            int r2 = r7.mo3847b(r14)
            int r21 = r21 + r2
            int r9 = r9 + r21
            r7.f2680f = r9
            r40 = r4
        L_0x03ef:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x040f
        L_0x03f2:
            r39 = r2
            int r2 = r7.f2680f
            int r9 = r14.getMeasuredWidth()
            int r9 = r9 + r2
            r40 = r4
            int r4 = r8.leftMargin
            int r9 = r9 + r4
            int r4 = r8.rightMargin
            int r9 = r9 + r4
            int r4 = r7.mo3847b(r14)
            int r9 = r9 + r4
            int r2 = java.lang.Math.max(r2, r9)
            r7.f2680f = r2
            goto L_0x03ef
        L_0x040f:
            if (r13 == r2) goto L_0x0419
            int r2 = r8.height
            r4 = -1
            if (r2 != r4) goto L_0x0419
            r2 = r18
            goto L_0x041a
        L_0x0419:
            r2 = 0
        L_0x041a:
            int r4 = r8.topMargin
            int r9 = r8.bottomMargin
            int r4 = r4 + r9
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 + r4
            int r3 = java.lang.Math.max(r3, r9)
            if (r2 == 0) goto L_0x042b
            goto L_0x042c
        L_0x042b:
            r4 = r9
        L_0x042c:
            int r2 = java.lang.Math.max(r10, r4)
            if (r26 == 0) goto L_0x043a
            int r4 = r8.height
            r10 = -1
            if (r4 != r10) goto L_0x043b
            r4 = r18
            goto L_0x043c
        L_0x043a:
            r10 = -1
        L_0x043b:
            r4 = 0
        L_0x043c:
            if (r35 == 0) goto L_0x0469
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0469
            int r10 = r8.f2691h
            if (r10 >= 0) goto L_0x044b
            int r8 = r7.f2679e
            goto L_0x044d
        L_0x044b:
            int r8 = r8.f2691h
        L_0x044d:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r8 = r8 >> 4
            r8 = r8 & -2
            int r8 = r8 >> 1
            r10 = r15[r8]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r8] = r10
            r10 = r28[r8]
            int r9 = r9 - r14
            int r9 = java.lang.Math.max(r10, r9)
            r28[r8] = r9
            goto L_0x046b
        L_0x0469:
            r21 = 4
        L_0x046b:
            r10 = r2
            r26 = r4
            r2 = r39
            r4 = r40
            goto L_0x0478
        L_0x0473:
            r4 = r5
            r5 = r43
            r21 = 4
        L_0x0478:
            int r0 = r0 + 1
            r5 = r4
            r4 = r42
            r8 = -1
            goto L_0x0357
        L_0x0480:
            r5 = r43
            int r0 = r7.f2680f
            int r2 = r41.getPaddingLeft()
            int r4 = r41.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f2680f = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04a2
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04a2
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04a2
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04d1
        L_0x04a2:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r8 = r15[r18]
            r9 = r15[r17]
            int r8 = java.lang.Math.max(r8, r9)
            int r4 = java.lang.Math.max(r4, r8)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r28[r16]
            r2 = r28[r2]
            r8 = r28[r18]
            r9 = r28[r17]
            int r8 = java.lang.Math.max(r8, r9)
            int r2 = java.lang.Math.max(r2, r8)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r3, r0)
            r3 = r0
        L_0x04d1:
            r0 = r10
        L_0x04d2:
            if (r26 != 0) goto L_0x04d9
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04d9
            goto L_0x04da
        L_0x04d9:
            r0 = r3
        L_0x04da:
            int r2 = r41.getPaddingTop()
            int r3 = r41.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r2 = r41.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r6
            r1 = r1 | r2
            int r2 = r6 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x0500
            r0 = r42
            r7.m3645d(r11, r0)
        L_0x0500:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.LinearLayoutCompat.mo3849b(int, int):void");
    }

    /* renamed from: d */
    private void m3645d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo3848b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3846a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2678d == 1) {
            mo3843a(i, i2, i3, i4);
        } else {
            mo3850b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3843a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f2679e & 112;
        int i10 = this.f2679e & 8388615;
        if (i9 == 16) {
            i5 = (((i4 - i2) - this.f2680f) / 2) + getPaddingTop();
        } else if (i9 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f2680f;
        }
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View b = mo3848b(i11);
            if (b == null) {
                i5 += mo3854d(i11);
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                int i12 = layoutParams.f2691h;
                if (i12 < 0) {
                    i12 = i10;
                }
                int a = C0579c.m2179a(i12, C0595r.m2256f(this)) & 7;
                if (a == 1) {
                    i7 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (a != 5) {
                    i7 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i7 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                }
                int i13 = i7;
                if (mo3853c(i11)) {
                    i5 += this.f2687m;
                }
                int i14 = i5 + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                m3643a(b, i13, i14 + mo3840a(b), measuredWidth, measuredHeight);
                i11 += mo3841a(b, i11);
                i5 = i14 + measuredHeight + layoutParams2.bottomMargin + mo3847b(b);
                i6 = 1;
                i11 += i6;
            }
            i6 = 1;
            i11 += i6;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3850b(int r28, int r29, int r30, int r31) {
        /*
            r27 = this;
            r6 = r27
            boolean r2 = android.support.p028v7.widget.C0994bg.m4486a(r27)
            int r7 = r27.getPaddingTop()
            int r3 = r31 - r29
            int r4 = r27.getPaddingBottom()
            int r8 = r3 - r4
            int r3 = r3 - r7
            int r4 = r27.getPaddingBottom()
            int r9 = r3 - r4
            int r10 = r27.getVirtualChildCount()
            int r3 = r6.f2679e
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            int r4 = r6.f2679e
            r11 = r4 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f2675a
            int[] r13 = r6.f2683i
            int[] r14 = r6.f2684j
            int r4 = android.support.p017v4.view.C0595r.m2256f(r27)
            int r3 = android.support.p017v4.view.C0579c.m2179a(r3, r4)
            r15 = 2
            r5 = 1
            if (r3 == r5) goto L_0x004e
            r4 = 5
            if (r3 == r4) goto L_0x0041
            int r0 = r27.getPaddingLeft()
            goto L_0x0059
        L_0x0041:
            int r3 = r27.getPaddingLeft()
            int r3 = r3 + r30
            int r3 = r3 - r28
            int r0 = r6.f2680f
            int r0 = r3 - r0
            goto L_0x0059
        L_0x004e:
            int r3 = r27.getPaddingLeft()
            int r0 = r30 - r28
            int r1 = r6.f2680f
            int r0 = r0 - r1
            int r0 = r0 / r15
            int r0 = r0 + r3
        L_0x0059:
            r1 = 0
            if (r2 == 0) goto L_0x0063
            int r2 = r10 + -1
            r16 = r2
            r17 = -1
            goto L_0x0067
        L_0x0063:
            r16 = r1
            r17 = r5
        L_0x0067:
            r3 = r1
        L_0x0068:
            if (r3 >= r10) goto L_0x0153
            int r1 = r17 * r3
            int r2 = r16 + r1
            android.view.View r1 = r6.mo3848b(r2)
            if (r1 != 0) goto L_0x0085
            int r1 = r6.mo3854d(r2)
            int r0 = r0 + r1
            r18 = r5
            r26 = r7
            r23 = r10
            r24 = r11
        L_0x0081:
            r20 = -1
            goto L_0x0146
        L_0x0085:
            int r5 = r1.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x013a
            int r15 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r1.getLayoutParams()
            r4 = r20
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.p028v7.widget.LinearLayoutCompat.LayoutParams) r4
            if (r12 == 0) goto L_0x00ad
            r22 = r3
            int r3 = r4.height
            r23 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00b1
            int r3 = r1.getBaseline()
            goto L_0x00b2
        L_0x00ad:
            r22 = r3
            r23 = r10
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            int r10 = r4.f2691h
            if (r10 >= 0) goto L_0x00b7
            r10 = r11
        L_0x00b7:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r24 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00f6
            r11 = 48
            if (r10 == r11) goto L_0x00e3
            r11 = 80
            if (r10 == r11) goto L_0x00cc
            r3 = r7
            r11 = -1
        L_0x00c9:
            r18 = 1
            goto L_0x0104
        L_0x00cc:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00e1
            int r20 = r1.getMeasuredHeight()
            int r20 = r20 - r3
            r3 = 2
            r21 = r14[r3]
            int r21 = r21 - r20
            int r10 = r10 - r21
        L_0x00e1:
            r3 = r10
            goto L_0x00c9
        L_0x00e3:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00f2
            r18 = 1
            r20 = r13[r18]
            int r20 = r20 - r3
            int r10 = r10 + r20
            goto L_0x00f4
        L_0x00f2:
            r18 = 1
        L_0x00f4:
            r3 = r10
            goto L_0x0104
        L_0x00f6:
            r11 = -1
            r18 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x0104:
            boolean r10 = r6.mo3853c(r2)
            if (r10 == 0) goto L_0x010d
            int r10 = r6.f2686l
            int r0 = r0 + r10
        L_0x010d:
            int r10 = r4.leftMargin
            int r10 = r10 + r0
            int r0 = r6.mo3840a(r1)
            int r19 = r10 + r0
            r0 = r6
            r25 = r1
            r11 = r2
            r2 = r19
            r19 = r22
            r26 = r7
            r20 = -1
            r7 = r4
            r4 = r15
            r0.m3643a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo3847b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo3841a(r0, r11)
            int r3 = r19 + r0
            r0 = r10
            goto L_0x0146
        L_0x013a:
            r19 = r3
            r26 = r7
            r23 = r10
            r24 = r11
            r18 = 1
            goto L_0x0081
        L_0x0146:
            int r3 = r3 + 1
            r5 = r18
            r10 = r23
            r11 = r24
            r7 = r26
            r15 = 2
            goto L_0x0068
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.LinearLayoutCompat.mo3850b(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m3643a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.f2678d != i) {
            this.f2678d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f2678d;
    }

    public void setGravity(int i) {
        if (this.f2679e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2679e = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f2679e;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f2679e) != i2) {
            this.f2679e = i2 | (this.f2679e & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f2679e & 112) != i2) {
            this.f2679e = i2 | (this.f2679e & -113);
            requestLayout();
        }
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f2678d == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.f2678d == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
}
