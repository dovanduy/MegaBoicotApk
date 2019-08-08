package android.support.p017v4.view.p027b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
/* compiled from: LookupTableInterpolator */
abstract class C0578d implements Interpolator {

    /* renamed from: a */
    private final float[] f1418a;

    /* renamed from: b */
    private final float f1419b = (1.0f / ((float) (this.f1418a.length - 1)));

    protected C0578d(float[] fArr) {
        this.f1418a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1418a.length - 1)) * f), this.f1418a.length - 2);
        return this.f1418a[min] + (((f - (((float) min) * this.f1419b)) / this.f1419b) * (this.f1418a[min + 1] - this.f1418a[min]));
    }
}
