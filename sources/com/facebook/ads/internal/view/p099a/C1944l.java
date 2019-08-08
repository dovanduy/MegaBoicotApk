package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.a.l */
public class C1944l extends ViewGroup {

    /* renamed from: a */
    private static final int f6108a = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: b */
    private int f6109b;

    public C1944l(Context context) {
        super(context);
        setMotionEventSplittingEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingLeft + measuredWidth > i5) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.f6109b;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
            paddingLeft += measuredWidth + f6108a;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int i3 = getChildCount() > 0 ? 1 : 0;
        int i4 = paddingLeft;
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight() + f6108a);
            if (i4 + measuredWidth > size) {
                i3++;
                i4 = getPaddingLeft();
            }
            i4 += measuredWidth + f6108a;
        }
        this.f6109b = i5;
        setMeasuredDimension(size, (i3 * this.f6109b) + f6108a);
    }
}
