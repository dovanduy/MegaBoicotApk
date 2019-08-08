package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0564b.C0567c;
import android.support.p028v7.widget.RecyclerView.C0881i.C0884a;
import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f2663a = false;

    /* renamed from: b */
    int f2664b = -1;

    /* renamed from: c */
    int[] f2665c;

    /* renamed from: d */
    View[] f2666d;

    /* renamed from: e */
    final SparseIntArray f2667e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f2668f = new SparseIntArray();

    /* renamed from: g */
    C0851b f2669g = new C0850a();

    /* renamed from: h */
    final Rect f2670h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p028v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        int f2671a = -1;

        /* renamed from: b */
        int f2672b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo3832a() {
            return this.f2671a;
        }

        /* renamed from: b */
        public int mo3833b() {
            return this.f2672b;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0850a extends C0851b {
        /* renamed from: a */
        public int mo3834a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo3835a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static abstract class C0851b {

        /* renamed from: a */
        final SparseIntArray f2673a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2674b = false;

        /* renamed from: a */
        public abstract int mo3834a(int i);

        /* renamed from: a */
        public void mo3836a() {
            this.f2673a.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3838b(int i, int i2) {
            if (!this.f2674b) {
                return mo3835a(i, i2);
            }
            int i3 = this.f2673a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo3835a(i, i2);
            this.f2673a.put(i, a);
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3835a(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3834a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f2674b
                if (r2 == 0) goto L_0x0028
                android.util.SparseIntArray r2 = r5.f2673a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0028
                int r2 = r5.mo3837b(r6)
                if (r2 < 0) goto L_0x0028
                android.util.SparseIntArray r3 = r5.f2673a
                int r3 = r3.get(r2)
                int r4 = r5.mo3834a(r2)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L_0x002a
            L_0x0028:
                r2 = r1
                r3 = r2
            L_0x002a:
                if (r2 >= r6) goto L_0x003b
                int r4 = r5.mo3834a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0035
                r3 = r1
                goto L_0x0038
            L_0x0035:
                if (r3 <= r7) goto L_0x0038
                r3 = r4
            L_0x0038:
                int r2 = r2 + 1
                goto L_0x002a
            L_0x003b:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003f
                return r3
            L_0x003f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.GridLayoutManager.C0851b.mo3835a(int, int):int");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3837b(int i) {
            int size = this.f2673a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2673a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2673a.size()) {
                return -1;
            }
            return this.f2673a.keyAt(i4);
        }

        /* renamed from: c */
        public int mo3839c(int i, int i2) {
            int a = mo3834a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo3834a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3807a(getProperties(context, attributeSet, i, i2).f2783b);
    }

    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public int getRowCountForAccessibility(C0892o oVar, C0898s sVar) {
        if (this.mOrientation == 0) {
            return this.f2664b;
        }
        if (sVar.mo4484e() < 1) {
            return 0;
        }
        return m3617a(oVar, sVar, sVar.mo4484e() - 1) + 1;
    }

    public int getColumnCountForAccessibility(C0892o oVar, C0898s sVar) {
        if (this.mOrientation == 1) {
            return this.f2664b;
        }
        if (sVar.mo4484e() < 1) {
            return 0;
        }
        return m3617a(oVar, sVar, sVar.mo4484e() - 1) + 1;
    }

    public void onInitializeAccessibilityNodeInfoForItem(C0892o oVar, C0898s sVar, View view, C0564b bVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, bVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a = m3617a(oVar, sVar, layoutParams2.mo4195f());
        if (this.mOrientation == 0) {
            bVar.mo2006b((Object) C0567c.m2158a(layoutParams2.mo3832a(), layoutParams2.mo3833b(), a, 1, this.f2664b > 1 && layoutParams2.mo3833b() == this.f2664b, false));
        } else {
            bVar.mo2006b((Object) C0567c.m2158a(a, 1, layoutParams2.mo3832a(), layoutParams2.mo3833b(), this.f2664b > 1 && layoutParams2.mo3833b() == this.f2664b, false));
        }
    }

    public void onLayoutChildren(C0892o oVar, C0898s sVar) {
        if (sVar.mo4480a()) {
            m3626b();
        }
        super.onLayoutChildren(oVar, sVar);
        m3618a();
    }

    public void onLayoutCompleted(C0898s sVar) {
        super.onLayoutCompleted(sVar);
        this.f2663a = false;
    }

    /* renamed from: a */
    private void m3618a() {
        this.f2667e.clear();
        this.f2668f.clear();
    }

    /* renamed from: b */
    private void m3626b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int f = layoutParams.mo4195f();
            this.f2667e.put(f, layoutParams.mo3833b());
            this.f2668f.put(f, layoutParams.mo3832a());
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f2669g.mo3836a();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2669g.mo3836a();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f2669g.mo3836a();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2669g.mo3836a();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2669g.mo3836a();
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public android.support.p028v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean checkLayoutParams(android.support.p028v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: c */
    private void m3629c() {
        int i;
        if (getOrientation() == 1) {
            i = (getWidth() - getPaddingRight()) - getPaddingLeft();
        } else {
            i = (getHeight() - getPaddingBottom()) - getPaddingTop();
        }
        m3627b(i);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2665c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, this.f2665c[this.f2665c.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, this.f2665c[this.f2665c.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    /* renamed from: b */
    private void m3627b(int i) {
        this.f2665c = m3624a(this.f2665c, this.f2664b, i);
    }

    /* renamed from: a */
    static int[] m3624a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3806a(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            return this.f2665c[i2 + i] - this.f2665c[i];
        }
        return this.f2665c[this.f2664b - i] - this.f2665c[(this.f2664b - i) - i2];
    }

    /* access modifiers changed from: 0000 */
    public void onAnchorReady(C0892o oVar, C0898s sVar, C0853a aVar, int i) {
        super.onAnchorReady(oVar, sVar, aVar, i);
        m3629c();
        if (sVar.mo4484e() > 0 && !sVar.mo4480a()) {
            m3621a(oVar, sVar, aVar, i);
        }
        m3630d();
    }

    /* renamed from: d */
    private void m3630d() {
        if (this.f2666d == null || this.f2666d.length != this.f2664b) {
            this.f2666d = new View[this.f2664b];
        }
    }

    public int scrollHorizontallyBy(int i, C0892o oVar, C0898s sVar) {
        m3629c();
        m3630d();
        return super.scrollHorizontallyBy(i, oVar, sVar);
    }

    public int scrollVerticallyBy(int i, C0892o oVar, C0898s sVar) {
        m3629c();
        m3630d();
        return super.scrollVerticallyBy(i, oVar, sVar);
    }

    /* renamed from: a */
    private void m3621a(C0892o oVar, C0898s sVar, C0853a aVar, int i) {
        boolean z = i == 1;
        int b = m3625b(oVar, sVar, aVar.f2696b);
        if (z) {
            while (b > 0 && aVar.f2696b > 0) {
                aVar.f2696b--;
                b = m3625b(oVar, sVar, aVar.f2696b);
            }
            return;
        }
        int e = sVar.mo4484e() - 1;
        int i2 = aVar.f2696b;
        while (i2 < e) {
            int i3 = i2 + 1;
            int b2 = m3625b(oVar, sVar, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        aVar.f2696b = i2;
    }

    /* access modifiers changed from: 0000 */
    public View findReferenceChild(C0892o oVar, C0898s sVar, int i, int i2, int i3) {
        ensureLayoutState();
        int c = this.mOrientationHelper.mo4918c();
        int d = this.mOrientationHelper.mo4920d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3 && m3625b(oVar, sVar, position) == 0) {
                if (((android.support.p028v7.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).mo4193d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo4913a(childAt) < d && this.mOrientationHelper.mo4917b(childAt) >= c) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    private int m3617a(C0892o oVar, C0898s sVar, int i) {
        if (!sVar.mo4480a()) {
            return this.f2669g.mo3839c(i, this.f2664b);
        }
        int b = oVar.mo4431b(i);
        if (b != -1) {
            return this.f2669g.mo3839c(b, this.f2664b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private int m3625b(C0892o oVar, C0898s sVar, int i) {
        if (!sVar.mo4480a()) {
            return this.f2669g.mo3838b(i, this.f2664b);
        }
        int i2 = this.f2668f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo4431b(i);
        if (b != -1) {
            return this.f2669g.mo3838b(b, this.f2664b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: c */
    private int m3628c(C0892o oVar, C0898s sVar, int i) {
        if (!sVar.mo4480a()) {
            return this.f2669g.mo3834a(i);
        }
        int i2 = this.f2667e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo4431b(i);
        if (b != -1) {
            return this.f2669g.mo3834a(b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public void collectPrefetchPositionsForLayoutState(C0898s sVar, C0855c cVar, C0884a aVar) {
        int i = this.f2664b;
        for (int i2 = 0; i2 < this.f2664b && cVar.mo3947a(sVar) && i > 0; i2++) {
            int i3 = cVar.f2707d;
            aVar.mo4398b(i3, Math.max(0, cVar.f2710g));
            i -= this.f2669g.mo3834a(i3);
            cVar.f2707d += cVar.f2708e;
        }
    }

    /* access modifiers changed from: 0000 */
    public void layoutChunk(C0892o oVar, C0898s sVar, C0855c cVar, C0854b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        C0892o oVar2 = oVar;
        C0898s sVar2 = sVar;
        C0855c cVar2 = cVar;
        C0854b bVar2 = bVar;
        int i9 = this.mOrientationHelper.mo4928i();
        boolean z2 = i9 != 1073741824;
        int i10 = getChildCount() > 0 ? this.f2665c[this.f2664b] : 0;
        if (z2) {
            m3629c();
        }
        boolean z3 = cVar2.f2708e == 1;
        int i11 = this.f2664b;
        if (!z3) {
            i11 = m3625b(oVar2, sVar2, cVar2.f2707d) + m3628c(oVar2, sVar2, cVar2.f2707d);
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f2664b && cVar2.mo3947a(sVar2) && i11 > 0) {
            int i14 = cVar2.f2707d;
            int c = m3628c(oVar2, sVar2, i14);
            if (c > this.f2664b) {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i14);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f2664b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
            i11 -= c;
            if (i11 < 0) {
                break;
            }
            View a = cVar2.mo3944a(oVar2);
            if (a == null) {
                break;
            }
            i12 += c;
            this.f2666d[i13] = a;
            i13++;
        }
        if (i13 == 0) {
            bVar2.f2701b = true;
            return;
        }
        float f = 0.0f;
        int i15 = i13;
        m3620a(oVar2, sVar2, i13, i12, z3);
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            View view = this.f2666d[i17];
            if (cVar2.f2714k != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view);
                } else {
                    addDisappearingView(view, 0);
                }
            } else if (z3) {
                addView(view);
                z = false;
            } else {
                z = false;
                addView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f2670h);
            m3623a(view, i9, z);
            int e = this.mOrientationHelper.mo4923e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (1.0f * ((float) this.mOrientationHelper.mo4925f(view))) / ((float) ((LayoutParams) view.getLayoutParams()).f2672b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            m3619a(f, i10);
            i16 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                View view2 = this.f2666d[i18];
                m3623a(view2, 1073741824, true);
                int e2 = this.mOrientationHelper.mo4923e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            View view3 = this.f2666d[i19];
            if (this.mOrientationHelper.mo4923e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f2765d;
                int i20 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i21 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int a2 = mo3806a(layoutParams.f2671a, layoutParams.f2672b);
                if (this.mOrientation == 1) {
                    int childMeasureSpec = getChildMeasureSpec(a2, 1073741824, i21, layoutParams.width, false);
                    i8 = MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i7 = childMeasureSpec;
                } else {
                    i7 = MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    i8 = getChildMeasureSpec(a2, 1073741824, i20, layoutParams.height, false);
                }
                m3622a(view3, i7, i8, true);
            }
        }
        int i22 = 0;
        bVar2.f2700a = i16;
        if (this.mOrientation == 1) {
            if (cVar2.f2709f == -1) {
                int i23 = cVar2.f2705b;
                i = i23;
                i2 = i23 - i16;
            } else {
                int i24 = cVar2.f2705b;
                i2 = i24;
                i = i16 + i24;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f2709f == -1) {
            int i25 = cVar2.f2705b;
            i2 = 0;
            i = 0;
            int i26 = i25 - i16;
            i3 = i25;
            i4 = i26;
        } else {
            i4 = cVar2.f2705b;
            i3 = i16 + i4;
            i2 = 0;
            i = 0;
        }
        while (i22 < i15) {
            View view4 = this.f2666d[i22];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                i2 = getPaddingTop() + this.f2665c[layoutParams2.f2671a];
                i = this.mOrientationHelper.mo4925f(view4) + i2;
            } else if (isLayoutRTL()) {
                int paddingLeft = getPaddingLeft() + this.f2665c[this.f2664b - layoutParams2.f2671a];
                i5 = paddingLeft;
                i6 = paddingLeft - this.mOrientationHelper.mo4925f(view4);
                int i27 = i2;
                int i28 = i;
                layoutDecoratedWithMargins(view4, i6, i27, i5, i28);
                if (!layoutParams2.mo4193d() || layoutParams2.mo4194e()) {
                    bVar2.f2702c = true;
                }
                bVar2.f2703d |= view4.hasFocusable();
                i22++;
                i4 = i6;
                i2 = i27;
                i3 = i5;
                i = i28;
            } else {
                i4 = getPaddingLeft() + this.f2665c[layoutParams2.f2671a];
                i3 = this.mOrientationHelper.mo4925f(view4) + i4;
            }
            i6 = i4;
            i5 = i3;
            int i272 = i2;
            int i282 = i;
            layoutDecoratedWithMargins(view4, i6, i272, i5, i282);
            if (!layoutParams2.mo4193d()) {
            }
            bVar2.f2702c = true;
            bVar2.f2703d |= view4.hasFocusable();
            i22++;
            i4 = i6;
            i2 = i272;
            i3 = i5;
            i = i282;
        }
        Arrays.fill(this.f2666d, null);
    }

    /* renamed from: a */
    private void m3623a(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f2765d;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int a = mo3806a(layoutParams.f2671a, layoutParams.f2672b);
        if (this.mOrientation == 1) {
            i2 = getChildMeasureSpec(a, i, i5, layoutParams.width, false);
            i3 = getChildMeasureSpec(this.mOrientationHelper.mo4924f(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(a, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.mo4924f(), getWidthMode(), i5, layoutParams.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        m3622a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m3619a(float f, int i) {
        m3627b(Math.max(Math.round(f * ((float) this.f2664b)), i));
    }

    /* renamed from: a */
    private void m3622a(View view, int i, int i2, boolean z) {
        boolean z2;
        android.support.p028v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p028v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m3620a(C0892o oVar, C0898s sVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = -1;
        int i6 = 0;
        if (z) {
            i3 = 1;
            i5 = i;
            i4 = 0;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View view = this.f2666d[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f2672b = m3628c(oVar, sVar, getPosition(view));
            layoutParams.f2671a = i6;
            i6 += layoutParams.f2672b;
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo3807a(int i) {
        if (i != this.f2664b) {
            this.f2663a = true;
            if (i < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Span count should be at least 1. Provided ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f2664b = i;
            this.f2669g.mo3836a();
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (r13 == r10) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r27, int r28, android.support.p028v7.widget.RecyclerView.C0892o r29, android.support.p028v7.widget.RecyclerView.C0898s r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            android.view.View r3 = r26.findContainingItemView(r27)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r5 = (android.support.p028v7.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f2671a
            int r7 = r5.f2671a
            int r5 = r5.f2672b
            int r7 = r7 + r5
            android.view.View r5 = super.onFocusSearchFailed(r27, r28, r29, r30)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r28
            int r5 = r0.convertFocusDirectionToLayoutDirection(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = r9
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.mShouldReverseLayout
            if (r5 == r10) goto L_0x0034
            r5 = r9
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r26.getChildCount()
            int r5 = r5 - r9
            r11 = r10
            r12 = r11
            goto L_0x0047
        L_0x0040:
            int r5 = r26.getChildCount()
            r11 = r5
            r12 = r9
            r5 = 0
        L_0x0047:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L_0x0053
            boolean r13 = r26.isLayoutRTL()
            if (r13 == 0) goto L_0x0053
            r13 = r9
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.m3617a(r1, r2, r5)
            r8 = r10
            r18 = r8
            r15 = 0
            r17 = 0
            r10 = r4
        L_0x005f:
            if (r5 == r11) goto L_0x0146
            int r9 = r0.m3617a(r1, r2, r5)
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != r3) goto L_0x006d
            goto L_0x0146
        L_0x006d:
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x0087
            if (r9 == r14) goto L_0x0087
            if (r4 == 0) goto L_0x0079
            goto L_0x0146
        L_0x0079:
            r21 = r3
            r23 = r8
            r24 = r10
            r22 = r11
            r8 = r17
            r11 = r18
            goto L_0x0132
        L_0x0087:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r9 = (android.support.p028v7.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f2671a
            r21 = r3
            int r3 = r9.f2671a
            r22 = r11
            int r11 = r9.f2672b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a3
            if (r2 != r6) goto L_0x00a3
            if (r3 != r7) goto L_0x00a3
            return r1
        L_0x00a3:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00ab
            if (r4 == 0) goto L_0x00b3
        L_0x00ab:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00be
            if (r10 != 0) goto L_0x00be
        L_0x00b3:
            r23 = r8
            r24 = r10
            r8 = r17
        L_0x00b9:
            r11 = r18
        L_0x00bb:
            r19 = 1
            goto L_0x0102
        L_0x00be:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00db
            if (r11 <= r15) goto L_0x00d1
            goto L_0x00b3
        L_0x00d1:
            if (r11 != r15) goto L_0x00f8
            if (r2 <= r8) goto L_0x00d7
            r11 = 1
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            if (r13 != r11) goto L_0x00f8
            goto L_0x00b3
        L_0x00db:
            if (r4 != 0) goto L_0x00f8
            r23 = r8
            r24 = r10
            r8 = 1
            r10 = 0
            boolean r16 = r0.isViewPartiallyVisible(r1, r10, r8)
            if (r16 == 0) goto L_0x00fc
            r8 = r17
            if (r11 <= r8) goto L_0x00ee
            goto L_0x00b9
        L_0x00ee:
            if (r11 != r8) goto L_0x00fe
            r11 = r18
            if (r2 <= r11) goto L_0x00f5
            r10 = 1
        L_0x00f5:
            if (r13 != r10) goto L_0x0100
            goto L_0x00bb
        L_0x00f8:
            r23 = r8
            r24 = r10
        L_0x00fc:
            r8 = r17
        L_0x00fe:
            r11 = r18
        L_0x0100:
            r19 = 0
        L_0x0102:
            if (r19 == 0) goto L_0x0132
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x011f
            int r4 = r9.f2671a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r17 = r8
            r18 = r11
            r10 = r24
            r8 = r4
            r4 = r1
            goto L_0x013a
        L_0x011f:
            int r8 = r9.f2671a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r17 = r3
            r18 = r8
            r8 = r23
            goto L_0x013a
        L_0x0132:
            r17 = r8
            r18 = r11
            r8 = r23
            r10 = r24
        L_0x013a:
            int r5 = r5 + r12
            r3 = r21
            r11 = r22
            r1 = r29
            r2 = r30
            r9 = 1
            goto L_0x005f
        L_0x0146:
            r24 = r10
            if (r4 == 0) goto L_0x014c
            r24 = r4
        L_0x014c:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):android.view.View");
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2663a;
    }
}
