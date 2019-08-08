package com.facebook.ads.internal.view.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class CircularProgressView extends View {

    /* renamed from: a */
    private final float f6262a = (3.0f * Resources.getSystem().getDisplayMetrics().density);

    /* renamed from: b */
    private final RectF f6263b = new RectF();

    /* renamed from: c */
    private final Paint f6264c = new Paint(1);

    /* renamed from: d */
    private final Paint f6265d;

    /* renamed from: e */
    private float f6266e = 0.0f;

    public CircularProgressView(Context context) {
        super(context);
        this.f6264c.setStyle(Style.STROKE);
        this.f6264c.setStrokeWidth(this.f6262a);
        this.f6265d = new Paint(1);
        this.f6265d.setStyle(Style.STROKE);
        this.f6265d.setStrokeWidth(this.f6262a);
    }

    /* renamed from: a */
    public void mo8124a(int i, int i2) {
        this.f6264c.setColor(i);
        this.f6265d.setColor(i2);
    }

    @Keep
    public float getProgress() {
        return this.f6266e;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f6263b, 0.0f, 360.0f, false, this.f6264c);
        canvas.drawArc(this.f6263b, -90.0f, (360.0f * this.f6266e) / 100.0f, false, this.f6265d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        float f = (float) min;
        this.f6263b.set((this.f6262a / 2.0f) + 0.0f + ((float) getPaddingLeft()), 0.0f + (this.f6262a / 2.0f) + ((float) getPaddingTop()), (f - (this.f6262a / 2.0f)) - ((float) getPaddingRight()), (f - (this.f6262a / 2.0f)) - ((float) getPaddingBottom()));
    }

    @Keep
    public void setProgress(float f) {
        this.f6266e = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", new float[]{f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
