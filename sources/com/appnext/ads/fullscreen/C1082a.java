package com.appnext.ads.fullscreen;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/* renamed from: com.appnext.ads.fullscreen.a */
public final class C1082a extends Animation {

    /* renamed from: du */
    private Circle f3616du;

    /* renamed from: dv */
    private float f3617dv;

    /* renamed from: dw */
    private float f3618dw;

    public C1082a(Circle circle, float f) {
        setInterpolator(new LinearInterpolator());
        this.f3617dv = circle.getAngle();
        this.f3618dw = f;
        this.f3616du = circle;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        this.f3616du.setAngle(this.f3617dv - ((this.f3617dv - this.f3618dw) * f));
        this.f3616du.invalidate();
        this.f3616du.requestLayout();
    }
}
