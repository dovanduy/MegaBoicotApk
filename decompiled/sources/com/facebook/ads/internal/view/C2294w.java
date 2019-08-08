package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.w */
public class C2294w extends TextView {

    /* renamed from: a */
    private float f7233a;

    /* renamed from: b */
    private float f7234b = 8.0f;

    public C2294w(Context context) {
        super(context);
        super.setSingleLine();
        super.setMaxLines(1);
        this.f7233a = getTextSize() / C2342x.f7369b;
        setEllipsize(TruncateAt.END);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.f7233a; f >= this.f7234b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.f7233a) {
            this.f7234b = f;
        }
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextSize(float f) {
        this.f7233a = f;
        super.setTextSize(f);
    }
}
