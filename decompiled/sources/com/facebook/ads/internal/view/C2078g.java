package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.g */
public class C2078g extends View {

    /* renamed from: a */
    private Paint f6614a;

    /* renamed from: b */
    private Paint f6615b;

    /* renamed from: c */
    private Paint f6616c;

    /* renamed from: d */
    private int f6617d;

    /* renamed from: e */
    private boolean f6618e;

    public C2078g(Context context) {
        this(context, 60, true);
    }

    public C2078g(Context context, int i, boolean z) {
        super(context);
        this.f6617d = i;
        this.f6618e = z;
        if (z) {
            this.f6614a = new Paint();
            this.f6614a.setColor(-3355444);
            this.f6614a.setStyle(Style.STROKE);
            this.f6614a.setStrokeWidth(3.0f);
            this.f6614a.setAntiAlias(true);
            this.f6615b = new Paint();
            this.f6615b.setColor(-1287371708);
            this.f6615b.setStyle(Style.FILL);
            this.f6615b.setAntiAlias(true);
            this.f6616c = new Paint();
            this.f6616c.setColor(-1);
            this.f6616c.setStyle(Style.STROKE);
            this.f6616c.setStrokeWidth(6.0f);
            this.f6616c.setAntiAlias(true);
        }
        float f = C2342x.f7369b;
        LayoutParams layoutParams = new LayoutParams((int) (((float) this.f6617d) * f), (int) (((float) this.f6617d) * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6618e) {
            if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = (i * 2) / 3;
            float f = (float) i;
            canvas.drawCircle(f, f, (float) i2, this.f6614a);
            canvas.drawCircle(f, f, (float) (i2 - 2), this.f6615b);
            int i3 = min / 3;
            float f2 = (float) i3;
            float f3 = (float) (i3 * 2);
            Canvas canvas2 = canvas;
            float f4 = f2;
            float f5 = f3;
            canvas2.drawLine(f2, f4, f3, f5, this.f6616c);
            canvas2.drawLine(f3, f4, f2, f5, this.f6616c);
        }
        super.onDraw(canvas);
    }
}
