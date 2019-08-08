package android.support.p014c.p015a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p017v4.content.p022a.C0354g;
import android.support.p017v4.graphics.C0402b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.c.a.g */
/* compiled from: PathInterpolatorCompat */
public class C0140g implements Interpolator {

    /* renamed from: a */
    private float[] f134a;

    /* renamed from: b */
    private float[] f135b;

    public C0140g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0140g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0354g.m1303a(resources, theme, attributeSet, C0130a.f118l);
        m231a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m231a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0354g.m1307a(xmlPullParser, "pathData")) {
            String a = C0354g.m1305a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0402b.m1508a(a);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("The path is null, which is created from ");
                sb.append(a);
                throw new InflateException(sb.toString());
            }
            m232a(a2);
        } else if (!C0354g.m1307a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (!C0354g.m1307a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            float a3 = C0354g.m1301a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0354g.m1301a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0354g.m1307a(xmlPullParser, "controlX2");
            if (a5 != C0354g.m1307a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                m229a(a3, a4);
            } else {
                m230a(a3, a4, C0354g.m1301a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0354g.m1301a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        }
    }

    /* renamed from: a */
    private void m229a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m232a(path);
    }

    /* renamed from: a */
    private void m230a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m232a(path);
    }

    /* renamed from: a */
    private void m232a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("The Path has a invalid length ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f134a = new float[min];
        this.f135b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.f134a[i2] = fArr[0];
            this.f135b[i2] = fArr[1];
        }
        if (((double) Math.abs(this.f134a[0])) <= 1.0E-5d && ((double) Math.abs(this.f135b[0])) <= 1.0E-5d) {
            int i3 = min - 1;
            if (((double) Math.abs(this.f134a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f135b[i3] - 1.0f)) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    int i5 = i4 + 1;
                    float f2 = this.f134a[i4];
                    if (f2 < f) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("The Path cannot loop back on itself, x :");
                        sb2.append(f2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f134a[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb3.append(this.f134a[0]);
        sb3.append(",");
        sb3.append(this.f135b[0]);
        sb3.append(" end:");
        int i6 = min - 1;
        sb3.append(this.f134a[i6]);
        sb3.append(",");
        sb3.append(this.f135b[i6]);
        throw new IllegalArgumentException(sb3.toString());
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f134a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f134a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f134a[length] - this.f134a[i];
        if (f2 == 0.0f) {
            return this.f135b[i];
        }
        float f3 = (f - this.f134a[i]) / f2;
        float f4 = this.f135b[i];
        return f4 + (f3 * (this.f135b[length] - f4));
    }
}
