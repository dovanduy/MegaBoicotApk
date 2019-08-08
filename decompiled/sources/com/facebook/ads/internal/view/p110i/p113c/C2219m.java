package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.Button;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.i.c.m */
public class C2219m extends Button {

    /* renamed from: a */
    private final Path f6965a;

    /* renamed from: b */
    private final Path f6966b;

    /* renamed from: c */
    private final Paint f6967c;

    /* renamed from: d */
    private final Path f6968d;

    /* renamed from: e */
    private boolean f6969e;

    public C2219m(Context context) {
        this(context, false);
    }

    public C2219m(Context context, final boolean z) {
        super(context);
        this.f6969e = false;
        this.f6965a = new Path();
        this.f6966b = new Path();
        this.f6968d = new Path();
        this.f6967c = new Paint() {
            {
                setStyle(Style.FILL_AND_STROKE);
                setStrokeCap(Cap.ROUND);
                setStrokeWidth(3.0f);
                setAntiAlias(true);
                setColor(z ? -1 : -10066330);
            }
        };
        setClickable(true);
        C2342x.m9082a((View) this, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Path path;
        if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = ((float) Math.max(canvas.getWidth(), canvas.getHeight())) / 100.0f;
        if (this.f6969e) {
            this.f6968d.rewind();
            float f = 26.5f * max;
            float f2 = 15.5f * max;
            this.f6968d.moveTo(f, f2);
            this.f6968d.lineTo(f, 84.5f * max);
            this.f6968d.lineTo(90.0f * max, 50.0f * max);
            this.f6968d.lineTo(f, f2);
            this.f6968d.close();
            path = this.f6968d;
        } else {
            this.f6965a.rewind();
            float f3 = 29.0f * max;
            float f4 = 21.0f * max;
            this.f6965a.moveTo(f3, f4);
            float f5 = 79.0f * max;
            this.f6965a.lineTo(f3, f5);
            float f6 = 45.0f * max;
            this.f6965a.lineTo(f6, f5);
            this.f6965a.lineTo(f6, f4);
            this.f6965a.lineTo(f3, f4);
            this.f6965a.close();
            this.f6966b.rewind();
            float f7 = 55.0f * max;
            this.f6966b.moveTo(f7, f4);
            this.f6966b.lineTo(f7, f5);
            float f8 = 71.0f * max;
            this.f6966b.lineTo(f8, f5);
            this.f6966b.lineTo(f8, f4);
            this.f6966b.lineTo(f7, f4);
            this.f6966b.close();
            canvas.drawPath(this.f6965a, this.f6967c);
            path = this.f6966b;
        }
        canvas.drawPath(path, this.f6967c);
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.f6969e = z;
        refreshDrawableState();
        invalidate();
    }
}
