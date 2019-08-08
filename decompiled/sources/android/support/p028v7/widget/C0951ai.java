package android.support.p028v7.widget;

import android.graphics.PointF;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0895r.C0896a;
import android.support.p028v7.widget.RecyclerView.C0895r.C0897b;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.ai */
/* compiled from: PagerSnapHelper */
public class C0951ai extends C0967ar {

    /* renamed from: b */
    private C0948ah f3116b;

    /* renamed from: c */
    private C0948ah f3117c;

    /* renamed from: a */
    public int[] mo4931a(C0881i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.canScrollHorizontally()) {
            iArr[0] = m4231a(iVar, view, m4235e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.canScrollVertically()) {
            iArr[1] = m4231a(iVar, view, m4234d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    public View mo4930a(C0881i iVar) {
        if (iVar.canScrollVertically()) {
            return m4232a(iVar, m4234d(iVar));
        }
        if (iVar.canScrollHorizontally()) {
            return m4232a(iVar, m4235e(iVar));
        }
        return null;
    }

    /* renamed from: a */
    public int mo4929a(C0881i iVar, int i, int i2) {
        int itemCount = iVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (iVar.canScrollVertically()) {
            view = m4233b(iVar, m4234d(iVar));
        } else if (iVar.canScrollHorizontally()) {
            view = m4233b(iVar, m4235e(iVar));
        }
        if (view == null) {
            return -1;
        }
        int position = iVar.getPosition(view);
        if (position == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !iVar.canScrollHorizontally() ? i2 > 0 : i > 0;
        if (iVar instanceof C0897b) {
            PointF computeScrollVectorForPosition = ((C0897b) iVar).computeScrollVectorForPosition(itemCount - 1);
            if (computeScrollVectorForPosition != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                position--;
            }
        } else if (z2) {
            position++;
        }
        return position;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0942ad mo4932b(C0881i iVar) {
        if (!(iVar instanceof C0897b)) {
            return null;
        }
        return new C0942ad(this.f3181a.getContext()) {
            /* access modifiers changed from: protected */
            public void onTargetFound(View view, C0898s sVar, C0896a aVar) {
                int[] a = C0951ai.this.mo4931a(C0951ai.this.f3181a.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    aVar.mo4475a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }

            /* access modifiers changed from: protected */
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            public int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }
        };
    }

    /* renamed from: a */
    private int m4231a(C0881i iVar, View view, C0948ah ahVar) {
        int i;
        int a = ahVar.mo4913a(view) + (ahVar.mo4923e(view) / 2);
        if (iVar.getClipToPadding()) {
            i = ahVar.mo4918c() + (ahVar.mo4924f() / 2);
        } else {
            i = ahVar.mo4922e() / 2;
        }
        return a - i;
    }

    /* renamed from: a */
    private View m4232a(C0881i iVar, C0948ah ahVar) {
        int i;
        int childCount = iVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (iVar.getClipToPadding()) {
            i = ahVar.mo4918c() + (ahVar.mo4924f() / 2);
        } else {
            i = ahVar.mo4922e() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = iVar.getChildAt(i3);
            int abs = Math.abs((ahVar.mo4913a(childAt) + (ahVar.mo4923e(childAt) / 2)) - i);
            if (abs < i2) {
                view = childAt;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    private View m4233b(C0881i iVar, C0948ah ahVar) {
        int childCount = iVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = iVar.getChildAt(i2);
            int a = ahVar.mo4913a(childAt);
            if (a < i) {
                view = childAt;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: d */
    private C0948ah m4234d(C0881i iVar) {
        if (this.f3116b == null || this.f3116b.f3113a != iVar) {
            this.f3116b = C0948ah.m4186b(iVar);
        }
        return this.f3116b;
    }

    /* renamed from: e */
    private C0948ah m4235e(C0881i iVar) {
        if (this.f3117c == null || this.f3117c.f3113a != iVar) {
            this.f3117c = C0948ah.m4184a(iVar);
        }
        return this.f3117c;
    }
}
