package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.view.C0602v;
import android.support.p017v4.widget.C0656k;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p033d.p034a.C0754c;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.x */
/* compiled from: DropDownListView */
class C1044x extends ListView {

    /* renamed from: a */
    C1046b f3448a;

    /* renamed from: b */
    private final Rect f3449b = new Rect();

    /* renamed from: c */
    private int f3450c = 0;

    /* renamed from: d */
    private int f3451d = 0;

    /* renamed from: e */
    private int f3452e = 0;

    /* renamed from: f */
    private int f3453f = 0;

    /* renamed from: g */
    private int f3454g;

    /* renamed from: h */
    private Field f3455h;

    /* renamed from: i */
    private C1045a f3456i;

    /* renamed from: j */
    private boolean f3457j;

    /* renamed from: k */
    private boolean f3458k;

    /* renamed from: l */
    private boolean f3459l;

    /* renamed from: m */
    private C0602v f3460m;

    /* renamed from: n */
    private C0656k f3461n;

    /* renamed from: android.support.v7.widget.x$a */
    /* compiled from: DropDownListView */
    private static class C1045a extends C0754c {

        /* renamed from: a */
        private boolean f3462a = true;

        C1045a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5356a(boolean z) {
            this.f3462a = z;
        }

        public boolean setState(int[] iArr) {
            if (this.f3462a) {
                return super.setState(iArr);
            }
            return false;
        }

        public void draw(Canvas canvas) {
            if (this.f3462a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3462a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3462a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3462a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.x$b */
    /* compiled from: DropDownListView */
    private class C1046b implements Runnable {
        C1046b() {
        }

        public void run() {
            C1044x.this.f3448a = null;
            C1044x.this.drawableStateChanged();
        }

        /* renamed from: a */
        public void mo5357a() {
            C1044x.this.f3448a = null;
            C1044x.this.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo5358b() {
            C1044x.this.post(this);
        }
    }

    C1044x(Context context, boolean z) {
        super(context, null, C0673a.dropDownListViewStyle);
        this.f3458k = z;
        setCacheColorHint(0);
        try {
            this.f3455h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3455h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f3458k && this.f3457j) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f3458k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3458k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f3458k || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        this.f3456i = drawable != null ? new C1045a(drawable) : null;
        super.setSelector(this.f3456i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3450c = rect.left;
        this.f3451d = rect.top;
        this.f3452e = rect.right;
        this.f3453f = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f3448a == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m4829a();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m4832a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3454g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f3448a != null) {
            this.f3448a.mo5357a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public int mo4897a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i11 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                if (i5 >= 0 && i11 > i5 && i10 > 0 && i8 != i4) {
                    i4 = i10;
                }
                return i4;
            }
            if (i5 >= 0 && i11 >= i5) {
                i10 = i8;
            }
        }
        return i8;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f3456i != null) {
            this.f3456i.mo5356a(z);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3448a == null) {
            this.f3448a = new C1046b();
            this.f3448a.mo5358b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m4829a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3448a = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4898a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x000f;
                case 3: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r9 = r1
            r3 = r2
            goto L_0x0041
        L_0x000c:
            r9 = r1
            r3 = r9
            goto L_0x0041
        L_0x000f:
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r1
        L_0x0012:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x0019
            goto L_0x000c
        L_0x0019:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x002c
            r9 = r2
            goto L_0x0041
        L_0x002c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m4834a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x0009
            r7.m4833a(r3, r5)
            goto L_0x0009
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            if (r9 == 0) goto L_0x0048
        L_0x0045:
            r7.m4835b()
        L_0x0048:
            if (r3 == 0) goto L_0x0060
            android.support.v4.widget.k r9 = r7.f3461n
            if (r9 != 0) goto L_0x0055
            android.support.v4.widget.k r9 = new android.support.v4.widget.k
            r9.<init>(r7)
            r7.f3461n = r9
        L_0x0055:
            android.support.v4.widget.k r9 = r7.f3461n
            r9.mo2418a(r2)
            android.support.v4.widget.k r9 = r7.f3461n
            r9.onTouch(r7, r8)
            goto L_0x0069
        L_0x0060:
            android.support.v4.widget.k r8 = r7.f3461n
            if (r8 == 0) goto L_0x0069
            android.support.v4.widget.k r8 = r7.f3461n
            r8.mo2418a(r1)
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C1044x.mo4898a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m4833a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f3457j = z;
    }

    /* renamed from: a */
    private void m4829a() {
        Drawable selector = getSelector();
        if (selector != null && m4837c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m4832a(Canvas canvas) {
        if (!this.f3449b.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f3449b);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m4831a(int i, View view, float f, float f2) {
        m4830a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0407a.m1537a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m4830a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m4836b(i, view);
        if (z2) {
            Rect rect = this.f3449b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0407a.m1537a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private void m4836b(int i, View view) {
        Rect rect = this.f3449b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3450c;
        rect.top -= this.f3451d;
        rect.right += this.f3452e;
        rect.bottom += this.f3453f;
        try {
            boolean z = this.f3455h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3455h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m4835b() {
        this.f3459l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3454g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f3460m != null) {
            this.f3460m.mo2125b();
            this.f3460m = null;
        }
    }

    /* renamed from: a */
    private void m4834a(View view, int i, float f, float f2) {
        this.f3459l = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f3454g != -1) {
            View childAt = getChildAt(this.f3454g - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f3454g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m4831a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: c */
    private boolean m4837c() {
        return this.f3459l;
    }
}
