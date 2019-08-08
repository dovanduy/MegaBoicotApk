package com.facebook.ads.internal.view.p100b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.b */
public class C1956b extends ProgressBar {

    /* renamed from: a */
    private static final int f6139a = Color.argb(26, 0, 0, 0);

    /* renamed from: b */
    private static final int f6140b = Color.rgb(88, 144, 255);

    /* renamed from: c */
    private Rect f6141c = new Rect();

    /* renamed from: d */
    private Paint f6142d = new Paint();

    public C1956b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ClipDrawable(new ColorDrawable(f6140b), 3, 1)}));
        this.f6142d.setStyle(Style.FILL);
        this.f6142d.setColor(f6139a);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.f6141c, this.f6142d);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6141c.set(0, 0, getMeasuredWidth(), 2);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : Math.max(i, 5));
    }
}
