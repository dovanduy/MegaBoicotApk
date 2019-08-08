package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.g */
public class C2027g extends RelativeLayout {

    /* renamed from: a */
    protected int f6403a = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: b */
    private final Path f6404b = new Path();

    /* renamed from: c */
    private final RectF f6405c = new RectF();

    public C2027g(Context context) {
        super(context);
        C2342x.m9082a((View) this, 0);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6405c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6404b.reset();
        this.f6404b.addRoundRect(this.f6405c, (float) this.f6403a, (float) this.f6403a, Direction.CW);
        canvas.clipPath(this.f6404b);
        super.onDraw(canvas);
    }

    public void setCornerRadius(int i) {
        this.f6403a = (int) (((float) i) * C2342x.f7369b);
    }
}
