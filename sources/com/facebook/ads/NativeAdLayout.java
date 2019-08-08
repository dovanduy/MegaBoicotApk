package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p099a.C1917c;

public class NativeAdLayout extends FrameLayout {

    /* renamed from: a */
    private View f4735a;

    /* renamed from: b */
    private int f4736b = 0;

    /* renamed from: c */
    private int f4737c = 0;

    public NativeAdLayout(Context context) {
        super(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void clearAdReportingLayout() {
        C2342x.m9085a((ViewGroup) this);
        removeView(this.f4735a);
        this.f4735a = null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f4737c > 0 && getMeasuredWidth() > this.f4737c) {
            i3 = this.f4737c;
        } else if (getMeasuredWidth() < this.f4736b) {
            i3 = this.f4736b;
        } else {
            return;
        }
        setMeasuredDimension(i3, getMeasuredHeight());
    }

    public void setAdReportingLayout(C1917c cVar) {
        this.f4735a = cVar;
        this.f4735a.setLayoutParams(new LayoutParams(-1, -1));
        C2342x.m9085a((ViewGroup) this);
        addView(this.f4735a);
    }

    public void setMaxWidth(int i) {
        this.f4737c = i;
    }

    public void setMinWidth(int i) {
        this.f4736b = i;
    }
}
