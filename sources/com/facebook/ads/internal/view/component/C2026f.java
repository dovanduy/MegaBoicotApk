package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.f */
public class C2026f extends ImageView {

    /* renamed from: a */
    private static final int f6397a = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final float[] f6398b = {(float) f6397a, (float) f6397a, (float) f6397a, (float) f6397a, (float) f6397a, (float) f6397a, (float) f6397a, (float) f6397a};

    /* renamed from: c */
    private final Path f6399c = new Path();

    /* renamed from: d */
    private final RectF f6400d = new RectF();

    /* renamed from: e */
    private float[] f6401e = f6398b;

    /* renamed from: f */
    private boolean f6402f = false;

    public C2026f(Context context) {
        super(context);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        float min = (float) (Math.min(getWidth(), getHeight()) / 2);
        return new float[]{min, min, min, min, min, min, min, min};
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6400d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6399c.reset();
        this.f6399c.addRoundRect(this.f6400d, this.f6402f ? getRadiiForCircularImage() : this.f6401e, Direction.CW);
        canvas.clipPath(this.f6399c);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.f6402f = z;
    }

    public void setRadius(int i) {
        float f = (float) ((int) (((float) i) * C2342x.f7369b));
        this.f6401e = new float[]{f, f, f, f, f, f, f, f};
    }

    public void setRadius(float[] fArr) {
        this.f6401e = fArr;
    }
}
