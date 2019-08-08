package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p028v7.view.menu.ActionMenuItemView;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.view.menu.C0790h.C0792b;
import android.support.p028v7.view.menu.C0794j;
import android.support.p028v7.view.menu.C0806o;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0808p;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends LinearLayoutCompat implements C0792b, C0808p {

    /* renamed from: a */
    C0791a f2541a;

    /* renamed from: b */
    C0834d f2542b;

    /* renamed from: c */
    private C0790h f2543c;

    /* renamed from: d */
    private Context f2544d;

    /* renamed from: e */
    private int f2545e;

    /* renamed from: f */
    private boolean f2546f;

    /* renamed from: g */
    private ActionMenuPresenter f2547g;

    /* renamed from: h */
    private C0807a f2548h;

    /* renamed from: i */
    private boolean f2549i;

    /* renamed from: j */
    private int f2550j;

    /* renamed from: k */
    private int f2551k;

    /* renamed from: l */
    private int f2552l;

    /* renamed from: android.support.v7.widget.ActionMenuView$LayoutParams */
    public static class LayoutParams extends android.support.p028v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty

        /* renamed from: a */
        public boolean f2553a;
        @ExportedProperty

        /* renamed from: b */
        public int f2554b;
        @ExportedProperty

        /* renamed from: c */
        public int f2555c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f2556d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f2557e;

        /* renamed from: f */
        boolean f2558f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2553a = layoutParams.f2553a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2553a = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0831a {
        /* renamed from: c */
        boolean mo3020c();

        /* renamed from: d */
        boolean mo3021d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0832b implements C0807a {
        /* renamed from: a */
        public void mo2721a(C0790h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2722a(C0790h hVar) {
            return false;
        }

        C0832b() {
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    private class C0833c implements C0791a {
        C0833c() {
        }

        /* renamed from: a */
        public boolean mo2667a(C0790h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f2542b != null && ActionMenuView.this.f2542b.mo3566a(menuItem);
        }

        /* renamed from: a */
        public void mo2661a(C0790h hVar) {
            if (ActionMenuView.this.f2541a != null) {
                ActionMenuView.this.f2541a.mo2661a(hVar);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    public interface C0834d {
        /* renamed from: a */
        boolean mo3566a(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2551k = (int) (56.0f * f);
        this.f2552l = (int) (4.0f * f);
        this.f2544d = context;
        this.f2545e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f2545e != i) {
            this.f2545e = i;
            if (i == 0) {
                this.f2544d = getContext();
            } else {
                this.f2544d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2545e;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f2547g = actionMenuPresenter;
        this.f2547g.mo3511a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2547g != null) {
            this.f2547g.mo3106b(false);
            if (this.f2547g.mo3519h()) {
                this.f2547g.mo3516e();
                this.f2547g.mo3515d();
            }
        }
    }

    public void setOnMenuItemClickListener(C0834d dVar) {
        this.f2542b = dVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f2549i;
        this.f2549i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2549i) {
            this.f2550j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f2549i || this.f2543c == null || size == this.f2550j)) {
            this.f2550j = size;
            this.f2543c.mo3187b(true);
        }
        int childCount = getChildCount();
        if (!this.f2549i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m3539c(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x025b A[LOOP:5: B:133:0x025b->B:138:0x027d, LOOP_START, PHI: r3 r34 
      PHI: (r3v5 int) = (r3v4 int), (r3v6 int) binds: [B:132:0x0259, B:138:0x027d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r34v1 int) = (r34v0 int), (r34v2 int) binds: [B:132:0x0259, B:138:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0289  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3539c(int r37, int r38) {
        /*
            r36 = this;
            r0 = r36
            int r1 = android.view.View.MeasureSpec.getMode(r38)
            int r2 = android.view.View.MeasureSpec.getSize(r37)
            int r3 = android.view.View.MeasureSpec.getSize(r38)
            int r4 = r36.getPaddingLeft()
            int r5 = r36.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r36.getPaddingTop()
            int r6 = r36.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r38
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f2551k
            int r4 = r2 / r4
            int r7 = r0.f2551k
            int r7 = r2 % r7
            r8 = 0
            if (r4 != 0) goto L_0x0037
            r0.setMeasuredDimension(r2, r8)
            return
        L_0x0037:
            int r9 = r0.f2551k
            int r7 = r7 / r4
            int r9 = r9 + r7
            int r7 = r36.getChildCount()
            r14 = r4
            r4 = r8
            r10 = r4
            r12 = r10
            r13 = r12
            r15 = r13
            r16 = r15
            r19 = 0
        L_0x0049:
            if (r4 >= r7) goto L_0x00da
            android.view.View r11 = r0.getChildAt(r4)
            int r8 = r11.getVisibility()
            r21 = r3
            r3 = 8
            if (r8 != r3) goto L_0x005d
            r23 = r2
            goto L_0x00d1
        L_0x005d:
            boolean r3 = r11 instanceof android.support.p028v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0070
            int r8 = r0.f2552l
            r22 = r13
            int r13 = r0.f2552l
            r23 = r2
            r2 = 0
            r11.setPadding(r8, r2, r13, r2)
            goto L_0x0075
        L_0x0070:
            r23 = r2
            r22 = r13
            r2 = 0
        L_0x0075:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r8 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r8
            r8.f2558f = r2
            r8.f2555c = r2
            r8.f2554b = r2
            r8.f2556d = r2
            r8.leftMargin = r2
            r8.rightMargin = r2
            if (r3 == 0) goto L_0x0094
            r2 = r11
            android.support.v7.view.menu.ActionMenuItemView r2 = (android.support.p028v7.view.menu.ActionMenuItemView) r2
            boolean r2 = r2.mo3019b()
            if (r2 == 0) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            r8.f2557e = r2
            boolean r2 = r8.f2553a
            if (r2 == 0) goto L_0x009d
            r2 = 1
            goto L_0x009e
        L_0x009d:
            r2 = r14
        L_0x009e:
            int r2 = m3538a(r11, r9, r2, r6, r5)
            int r3 = java.lang.Math.max(r15, r2)
            boolean r13 = r8.f2556d
            if (r13 == 0) goto L_0x00ac
            int r16 = r16 + 1
        L_0x00ac:
            boolean r8 = r8.f2553a
            if (r8 == 0) goto L_0x00b1
            r12 = 1
        L_0x00b1:
            int r14 = r14 - r2
            int r8 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r8)
            r8 = 1
            if (r2 != r8) goto L_0x00cb
            int r2 = r8 << r4
            r24 = r3
            long r2 = (long) r2
            long r25 = r19 | r2
            r13 = r22
            r15 = r24
            r19 = r25
            goto L_0x00d1
        L_0x00cb:
            r24 = r3
            r13 = r22
            r15 = r24
        L_0x00d1:
            int r4 = r4 + 1
            r3 = r21
            r2 = r23
            r8 = 0
            goto L_0x0049
        L_0x00da:
            r23 = r2
            r21 = r3
            r2 = 2
            if (r12 == 0) goto L_0x00e5
            if (r13 != r2) goto L_0x00e5
            r3 = 1
            goto L_0x00e6
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            r4 = 0
        L_0x00e7:
            r24 = 1
            if (r16 <= 0) goto L_0x0188
            if (r14 <= 0) goto L_0x0188
            r5 = 2147483647(0x7fffffff, float:NaN)
            r11 = r5
            r5 = 0
            r8 = 0
            r26 = 0
        L_0x00f5:
            if (r5 >= r7) goto L_0x0125
            android.view.View r2 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r2
            r28 = r4
            boolean r4 = r2.f2556d
            if (r4 != 0) goto L_0x0108
            goto L_0x011f
        L_0x0108:
            int r4 = r2.f2554b
            if (r4 >= r11) goto L_0x0113
            int r2 = r2.f2554b
            long r26 = r24 << r5
            r11 = r2
            r8 = 1
            goto L_0x011f
        L_0x0113:
            int r2 = r2.f2554b
            if (r2 != r11) goto L_0x011f
            long r29 = r24 << r5
            long r31 = r26 | r29
            int r8 = r8 + 1
            r26 = r31
        L_0x011f:
            int r5 = r5 + 1
            r4 = r28
            r2 = 2
            goto L_0x00f5
        L_0x0125:
            r28 = r4
            long r4 = r19 | r26
            if (r8 <= r14) goto L_0x0132
            r34 = r6
            r35 = r7
            r33 = r10
            goto L_0x0192
        L_0x0132:
            int r11 = r11 + 1
            r19 = r4
            r2 = 0
        L_0x0137:
            if (r2 >= r7) goto L_0x0184
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r5 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r5
            r33 = r10
            r8 = 1
            int r10 = r8 << r2
            r34 = r6
            r35 = r7
            long r6 = (long) r10
            long r24 = r26 & r6
            r17 = 0
            int r8 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x015e
            int r4 = r5.f2554b
            if (r4 != r11) goto L_0x017b
            long r4 = r19 | r6
            r19 = r4
            goto L_0x017b
        L_0x015e:
            if (r3 == 0) goto L_0x0171
            boolean r6 = r5.f2557e
            if (r6 == 0) goto L_0x0171
            r6 = 1
            if (r14 != r6) goto L_0x0172
            int r7 = r0.f2552l
            int r7 = r7 + r9
            int r8 = r0.f2552l
            r10 = 0
            r4.setPadding(r7, r10, r8, r10)
            goto L_0x0172
        L_0x0171:
            r6 = 1
        L_0x0172:
            int r4 = r5.f2554b
            int r4 = r4 + r6
            r5.f2554b = r4
            r5.f2558f = r6
            int r14 = r14 + -1
        L_0x017b:
            int r2 = r2 + 1
            r10 = r33
            r6 = r34
            r7 = r35
            goto L_0x0137
        L_0x0184:
            r2 = 2
            r4 = 1
            goto L_0x00e7
        L_0x0188:
            r28 = r4
            r34 = r6
            r35 = r7
            r33 = r10
            r4 = r19
        L_0x0192:
            if (r12 != 0) goto L_0x0199
            r2 = 1
            if (r13 != r2) goto L_0x019a
            r3 = r2
            goto L_0x019b
        L_0x0199:
            r2 = 1
        L_0x019a:
            r3 = 0
        L_0x019b:
            if (r14 <= 0) goto L_0x0252
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0252
            int r13 = r13 - r2
            if (r14 < r13) goto L_0x01aa
            if (r3 != 0) goto L_0x01aa
            if (r15 <= r2) goto L_0x0252
        L_0x01aa:
            int r2 = java.lang.Long.bitCount(r4)
            float r2 = (float) r2
            if (r3 != 0) goto L_0x01eb
            long r6 = r4 & r24
            r10 = 0
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L_0x01cc
            r3 = 0
            android.view.View r7 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r7 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r7
            boolean r7 = r7.f2557e
            if (r7 != 0) goto L_0x01cd
            float r2 = r2 - r6
            goto L_0x01cd
        L_0x01cc:
            r3 = 0
        L_0x01cd:
            int r7 = r35 + -1
            r8 = 1
            int r10 = r8 << r7
            long r10 = (long) r10
            long r12 = r4 & r10
            r10 = 0
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x01ec
            android.view.View r7 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r7 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r7
            boolean r7 = r7.f2557e
            if (r7 != 0) goto L_0x01ec
            float r2 = r2 - r6
            goto L_0x01ec
        L_0x01eb:
            r3 = 0
        L_0x01ec:
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x01f6
            int r14 = r14 * r9
            float r6 = (float) r14
            float r6 = r6 / r2
            int r8 = (int) r6
            goto L_0x01f7
        L_0x01f6:
            r8 = r3
        L_0x01f7:
            r6 = r3
            r11 = r28
            r2 = r35
        L_0x01fc:
            if (r6 >= r2) goto L_0x0257
            r7 = 1
            int r10 = r7 << r6
            long r12 = (long) r10
            long r14 = r4 & r12
            r12 = 0
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x020d
            r7 = 1
            r14 = 2
            goto L_0x024f
        L_0x020d:
            android.view.View r7 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r10 = r7.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r10 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r10
            boolean r7 = r7 instanceof android.support.p028v7.view.menu.ActionMenuItemView
            if (r7 == 0) goto L_0x0230
            r10.f2555c = r8
            r7 = 1
            r10.f2558f = r7
            if (r6 != 0) goto L_0x022c
            boolean r7 = r10.f2557e
            if (r7 != 0) goto L_0x022c
            int r7 = -r8
            r14 = 2
            int r7 = r7 / r14
            r10.leftMargin = r7
            goto L_0x022d
        L_0x022c:
            r14 = 2
        L_0x022d:
            r7 = 1
            r11 = 1
            goto L_0x024f
        L_0x0230:
            r14 = 2
            boolean r7 = r10.f2553a
            if (r7 == 0) goto L_0x0240
            r10.f2555c = r8
            r7 = 1
            r10.f2558f = r7
            int r11 = -r8
            int r11 = r11 / r14
            r10.rightMargin = r11
            r11 = r7
            goto L_0x024f
        L_0x0240:
            r7 = 1
            if (r6 == 0) goto L_0x0247
            int r15 = r8 / 2
            r10.leftMargin = r15
        L_0x0247:
            int r15 = r2 + -1
            if (r6 == r15) goto L_0x024f
            int r15 = r8 / 2
            r10.rightMargin = r15
        L_0x024f:
            int r6 = r6 + 1
            goto L_0x01fc
        L_0x0252:
            r2 = r35
            r3 = 0
            r11 = r28
        L_0x0257:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L_0x0282
        L_0x025b:
            if (r3 >= r2) goto L_0x0282
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r6 = (android.support.p028v7.widget.ActionMenuView.LayoutParams) r6
            boolean r7 = r6.f2558f
            if (r7 != 0) goto L_0x026e
            r7 = r34
            goto L_0x027d
        L_0x026e:
            int r7 = r6.f2554b
            int r7 = r7 * r9
            int r6 = r6.f2555c
            int r7 = r7 + r6
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r7 = r34
            r5.measure(r6, r7)
        L_0x027d:
            int r3 = r3 + 1
            r34 = r7
            goto L_0x025b
        L_0x0282:
            if (r1 == r4) goto L_0x0289
            r2 = r23
            r1 = r33
            goto L_0x028d
        L_0x0289:
            r1 = r21
            r2 = r23
        L_0x028d:
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.ActionMenuView.m3539c(int, int):void");
    }

    /* renamed from: a */
    static int m3538a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo3019b();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!layoutParams.f2553a && z2) {
            z = true;
        }
        layoutParams.f2556d = z;
        layoutParams.f2554b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f2549i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0994bg.m4486a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2553a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo3535a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    boolean a2 = mo3535a(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f2553a) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !layoutParams3.f2553a) {
                    int i21 = paddingLeft + layoutParams3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3554i();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2547g.mo3510a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2547g.mo3512c();
    }

    /* renamed from: a */
    public boolean mo3534a() {
        return this.f2546f;
    }

    public void setOverflowReserved(boolean z) {
        this.f2546f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams mo3555j() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f2691h = 16;
        return layoutParams;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo3555j();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.f2691h <= 0) {
            layoutParams2.f2691h = 16;
        }
        return layoutParams2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: c */
    public LayoutParams mo3539c() {
        LayoutParams b = mo3555j();
        b.f2553a = true;
        return b;
    }

    /* renamed from: a */
    public boolean mo3040a(C0794j jVar) {
        return this.f2543c.mo3172a((MenuItem) jVar, 0);
    }

    /* renamed from: a */
    public void mo3039a(C0790h hVar) {
        this.f2543c = hVar;
    }

    public Menu getMenu() {
        if (this.f2543c == null) {
            Context context = getContext();
            this.f2543c = new C0790h(context);
            this.f2543c.mo3164a((C0791a) new C0833c());
            this.f2547g = new ActionMenuPresenter(context);
            this.f2547g.mo3513c(true);
            this.f2547g.mo3099a(this.f2548h != null ? this.f2548h : new C0832b());
            this.f2543c.mo3167a((C0806o) this.f2547g, this.f2544d);
            this.f2547g.mo3511a(this);
        }
        return this.f2543c;
    }

    /* renamed from: a */
    public void mo3533a(C0807a aVar, C0791a aVar2) {
        this.f2548h = aVar;
        this.f2541a = aVar2;
    }

    /* renamed from: d */
    public C0790h mo3541d() {
        return this.f2543c;
    }

    /* renamed from: e */
    public boolean mo3543e() {
        return this.f2547g != null && this.f2547g.mo3515d();
    }

    /* renamed from: f */
    public boolean mo3544f() {
        return this.f2547g != null && this.f2547g.mo3516e();
    }

    /* renamed from: g */
    public boolean mo3545g() {
        return this.f2547g != null && this.f2547g.mo3519h();
    }

    /* renamed from: h */
    public boolean mo3553h() {
        return this.f2547g != null && this.f2547g.mo3520i();
    }

    /* renamed from: i */
    public void mo3554i() {
        if (this.f2547g != null) {
            this.f2547g.mo3517f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3535a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0831a)) {
            z = false | ((C0831a) childAt).mo3021d();
        }
        if (i > 0 && (childAt2 instanceof C0831a)) {
            z |= ((C0831a) childAt2).mo3020c();
        }
        return z;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2547g.mo3514d(z);
    }
}
