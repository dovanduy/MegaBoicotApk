package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.p028v7.widget.C0942ad;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.support.p028v7.widget.RecyclerView.LayoutParams;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.ads.internal.view.p104d.C2034a;
import com.facebook.ads.internal.view.p104d.C2035b;

public class HScrollLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private final C2035b f5995a;

    /* renamed from: b */
    private final C2034a f5996b;

    /* renamed from: c */
    private final Context f5997c;

    /* renamed from: d */
    private int[] f5998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f5999e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f6000f = 50.0f;

    /* renamed from: g */
    private C1909a f6001g;

    /* renamed from: h */
    private int f6002h;

    /* renamed from: com.facebook.ads.internal.view.HScrollLinearLayoutManager$a */
    private class C1909a extends C0942ad {
        public C1909a(Context context) {
            super(context);
        }

        public int calculateDxToMakeVisible(View view, int i) {
            C0881i layoutManager = getLayoutManager();
            if (!layoutManager.canScrollHorizontally()) {
                return 0;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return calculateDtToFit(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i) + HScrollLinearLayoutManager.this.f5999e;
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return HScrollLinearLayoutManager.this.f6000f / ((float) displayMetrics.densityDpi);
        }

        public PointF computeScrollVectorForPosition(int i) {
            return HScrollLinearLayoutManager.this.computeScrollVectorForPosition(i);
        }

        /* access modifiers changed from: protected */
        public int getHorizontalSnapPreference() {
            return -1;
        }
    }

    public HScrollLinearLayoutManager(Context context, C2035b bVar, C2034a aVar) {
        super(context);
        this.f5997c = context;
        this.f5995a = bVar;
        this.f5996b = aVar;
        this.f6002h = -1;
        this.f6001g = new C1909a(this.f5997c);
    }

    /* renamed from: a */
    public void mo7953a(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.f6000f = (float) (50.0d / d);
        this.f6001g = new C1909a(this.f5997c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7954a(int i) {
        this.f6002h = i;
    }

    /* renamed from: b */
    public void mo7955b(int i) {
        this.f5999e = i;
    }

    public void onMeasure(C0892o oVar, C0898s sVar, int i, int i2) {
        int[] iArr;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if ((mode == 1073741824 && getOrientation() == 1) || (mode2 == 1073741824 && getOrientation() == 0)) {
            super.onMeasure(oVar, sVar, i, i2);
            return;
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f5996b.mo8251b(this.f6002h)) {
            iArr = this.f5996b.mo8250a(this.f6002h);
        } else {
            int[] iArr2 = {0, 0};
            if (sVar.mo4484e() >= 1) {
                int childCount = getChildCount() > 0 ? 1 : getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.f5998d = this.f5995a.mo8252a(findViewByPosition(i3), MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                    if (getOrientation() == 0) {
                        iArr2[0] = iArr2[0] + this.f5998d[0];
                        if (i3 == 0) {
                            iArr2[1] = this.f5998d[1] + getPaddingTop() + getPaddingBottom();
                        }
                    } else {
                        iArr2[1] = iArr2[1] + this.f5998d[1];
                        if (i3 == 0) {
                            iArr2[0] = this.f5998d[0] + getPaddingLeft() + getPaddingRight();
                        }
                    }
                }
                if (this.f6002h != -1) {
                    this.f5996b.mo8249a(this.f6002h, iArr2);
                }
            }
            iArr = iArr2;
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void scrollToPosition(int i) {
        super.scrollToPositionWithOffset(i, this.f5999e);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, C0898s sVar, int i) {
        this.f6001g.setTargetPosition(i);
        startSmoothScroll(this.f6001g);
    }
}
