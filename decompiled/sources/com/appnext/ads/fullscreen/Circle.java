package com.appnext.ads.fullscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.appnext.core.C1326f;

public class Circle extends View {

    /* renamed from: dq */
    private static final int f3584dq = 180;

    /* renamed from: dr */
    private Paint f3585dr;

    /* renamed from: ds */
    private RectF f3586ds;

    /* renamed from: dt */
    private float f3587dt;

    public Circle(Context context) {
        super(context);
        init(context);
    }

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f3586ds, 180.0f, this.f3587dt, false, this.f3585dr);
    }

    public float getAngle() {
        return this.f3587dt;
    }

    public void setAngle(float f) {
        this.f3587dt = f;
    }

    /* renamed from: a */
    private static int m4924a(Context context, float f) {
        return C1326f.m5657a(context, f);
    }

    private void init(Context context) {
        float a = (float) C1326f.m5657a(context, 5.0f);
        this.f3585dr = new Paint();
        this.f3585dr.setAntiAlias(true);
        this.f3585dr.setStyle(Style.STROKE);
        this.f3585dr.setStrokeWidth(a);
        this.f3585dr.setColor(-1);
        this.f3585dr.setShadowLayer(2.0f, 2.0f, 2.0f, Color.argb(128, 0, 0, 0));
        setLayerType(1, this.f3585dr);
        this.f3586ds = new RectF(a, a, ((float) C1326f.m5657a(context, 20.0f)) + a, ((float) C1326f.m5657a(context, 20.0f)) + a);
        this.f3587dt = 360.0f;
    }
}
