package android.support.p017v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p017v4.p023d.C0397l;
import android.support.p017v4.view.p027b.C0576b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v4.widget.d */
/* compiled from: CircularProgressDrawable */
public class C0643d extends Drawable implements Animatable {

    /* renamed from: c */
    private static final Interpolator f1679c = new LinearInterpolator();

    /* renamed from: d */
    private static final Interpolator f1680d = new C0576b();

    /* renamed from: e */
    private static final int[] f1681e = {-16777216};

    /* renamed from: a */
    float f1682a;

    /* renamed from: b */
    boolean f1683b;

    /* renamed from: f */
    private final C0646a f1684f = new C0646a();

    /* renamed from: g */
    private float f1685g;

    /* renamed from: h */
    private Resources f1686h;

    /* renamed from: i */
    private Animator f1687i;

    /* renamed from: android.support.v4.widget.d$a */
    /* compiled from: CircularProgressDrawable */
    private static class C0646a {

        /* renamed from: a */
        final RectF f1692a = new RectF();

        /* renamed from: b */
        final Paint f1693b = new Paint();

        /* renamed from: c */
        final Paint f1694c = new Paint();

        /* renamed from: d */
        final Paint f1695d = new Paint();

        /* renamed from: e */
        float f1696e = 0.0f;

        /* renamed from: f */
        float f1697f = 0.0f;

        /* renamed from: g */
        float f1698g = 0.0f;

        /* renamed from: h */
        float f1699h = 5.0f;

        /* renamed from: i */
        int[] f1700i;

        /* renamed from: j */
        int f1701j;

        /* renamed from: k */
        float f1702k;

        /* renamed from: l */
        float f1703l;

        /* renamed from: m */
        float f1704m;

        /* renamed from: n */
        boolean f1705n;

        /* renamed from: o */
        Path f1706o;

        /* renamed from: p */
        float f1707p = 1.0f;

        /* renamed from: q */
        float f1708q;

        /* renamed from: r */
        int f1709r;

        /* renamed from: s */
        int f1710s;

        /* renamed from: t */
        int f1711t = 255;

        /* renamed from: u */
        int f1712u;

        C0646a() {
            this.f1693b.setStrokeCap(Cap.SQUARE);
            this.f1693b.setAntiAlias(true);
            this.f1693b.setStyle(Style.STROKE);
            this.f1694c.setStyle(Style.FILL);
            this.f1694c.setAntiAlias(true);
            this.f1695d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2475a(float f, float f2) {
            this.f1709r = (int) f;
            this.f1710s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2478a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1692a;
            float f = this.f1708q + (this.f1699h / 2.0f);
            if (this.f1708q <= 0.0f) {
                f = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f1709r) * this.f1707p) / 2.0f, this.f1699h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f, ((float) rect.centerY()) - f, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f);
            float f2 = (this.f1696e + this.f1698g) * 360.0f;
            float f3 = ((this.f1697f + this.f1698g) * 360.0f) - f2;
            this.f1693b.setColor(this.f1712u);
            this.f1693b.setAlpha(this.f1711t);
            float f4 = this.f1699h / 2.0f;
            rectF.inset(f4, f4);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1695d);
            float f5 = -f4;
            rectF.inset(f5, f5);
            canvas.drawArc(rectF, f2, f3, false, this.f1693b);
            mo2477a(canvas, f2, f3, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2477a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1705n) {
                if (this.f1706o == null) {
                    this.f1706o = new Path();
                    this.f1706o.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f1706o.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f1709r) * this.f1707p) / 2.0f;
                this.f1706o.moveTo(0.0f, 0.0f);
                this.f1706o.lineTo(((float) this.f1709r) * this.f1707p, 0.0f);
                this.f1706o.lineTo((((float) this.f1709r) * this.f1707p) / 2.0f, ((float) this.f1710s) * this.f1707p);
                this.f1706o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f1699h / 2.0f));
                this.f1706o.close();
                this.f1694c.setColor(this.f1712u);
                this.f1694c.setAlpha(this.f1711t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1706o, this.f1694c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2481a(int[] iArr) {
            this.f1700i = iArr;
            mo2484b(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2476a(int i) {
            this.f1712u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2484b(int i) {
            this.f1701j = i;
            this.f1712u = this.f1700i[this.f1701j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2473a() {
            return this.f1700i[mo2482b()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo2482b() {
            return (this.f1701j + 1) % this.f1700i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2485c() {
            mo2484b(mo2482b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2479a(ColorFilter colorFilter) {
            this.f1693b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2487c(int i) {
            this.f1711t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo2488d() {
            return this.f1711t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2474a(float f) {
            this.f1699h = f;
            this.f1693b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2483b(float f) {
            this.f1696e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo2490e() {
            return this.f1696e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public float mo2492f() {
            return this.f1702k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo2494g() {
            return this.f1703l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo2495h() {
            return this.f1700i[this.f1701j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2486c(float f) {
            this.f1697f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo2496i() {
            return this.f1697f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2489d(float f) {
            this.f1698g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo2491e(float f) {
            this.f1708q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2480a(boolean z) {
            if (this.f1705n != z) {
                this.f1705n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo2493f(float f) {
            if (f != this.f1707p) {
                this.f1707p = f;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public float mo2497j() {
            return this.f1704m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo2498k() {
            this.f1702k = this.f1696e;
            this.f1703l = this.f1697f;
            this.f1704m = this.f1698g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo2499l() {
            this.f1702k = 0.0f;
            this.f1703l = 0.0f;
            this.f1704m = 0.0f;
            mo2483b(0.0f);
            mo2486c(0.0f);
            mo2489d(0.0f);
        }
    }

    /* renamed from: a */
    private int m2528a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    public int getOpacity() {
        return -3;
    }

    public C0643d(Context context) {
        this.f1686h = ((Context) C0397l.m1469a(context)).getResources();
        this.f1684f.mo2481a(f1681e);
        mo2451a(2.5f);
        m2529a();
    }

    /* renamed from: a */
    private void m2530a(float f, float f2, float f3, float f4) {
        C0646a aVar = this.f1684f;
        float f5 = this.f1686h.getDisplayMetrics().density;
        aVar.mo2474a(f2 * f5);
        aVar.mo2491e(f * f5);
        aVar.mo2484b(0);
        aVar.mo2475a(f3 * f5, f4 * f5);
    }

    /* renamed from: a */
    public void mo2455a(int i) {
        if (i == 0) {
            m2530a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m2530a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2451a(float f) {
        this.f1684f.mo2474a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2456a(boolean z) {
        this.f1684f.mo2480a(z);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo2458b(float f) {
        this.f1684f.mo2493f(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2452a(float f, float f2) {
        this.f1684f.mo2483b(f);
        this.f1684f.mo2486c(f2);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo2459c(float f) {
        this.f1684f.mo2489d(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo2457a(int... iArr) {
        this.f1684f.mo2481a(iArr);
        this.f1684f.mo2484b(0);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1685g, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1684f.mo2478a(canvas, bounds);
        canvas.restore();
    }

    public void setAlpha(int i) {
        this.f1684f.mo2487c(i);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f1684f.mo2488d();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1684f.mo2479a(colorFilter);
        invalidateSelf();
    }

    /* renamed from: d */
    private void m2532d(float f) {
        this.f1685g = f;
    }

    public boolean isRunning() {
        return this.f1687i.isRunning();
    }

    public void start() {
        this.f1687i.cancel();
        this.f1684f.mo2498k();
        if (this.f1684f.mo2496i() != this.f1684f.mo2490e()) {
            this.f1683b = true;
            this.f1687i.setDuration(666);
            this.f1687i.start();
            return;
        }
        this.f1684f.mo2484b(0);
        this.f1684f.mo2499l();
        this.f1687i.setDuration(1332);
        this.f1687i.start();
    }

    public void stop() {
        this.f1687i.cancel();
        m2532d(0.0f);
        this.f1684f.mo2480a(false);
        this.f1684f.mo2484b(0);
        this.f1684f.mo2499l();
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2453a(float f, C0646a aVar) {
        if (f > 0.75f) {
            aVar.mo2476a(m2528a((f - 0.75f) / 0.25f, aVar.mo2495h(), aVar.mo2473a()));
        } else {
            aVar.mo2476a(aVar.mo2495h());
        }
    }

    /* renamed from: b */
    private void m2531b(float f, C0646a aVar) {
        mo2453a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.mo2497j() / 0.8f)) + 1.0d);
        aVar.mo2483b(aVar.mo2492f() + (((aVar.mo2494g() - 0.01f) - aVar.mo2492f()) * f));
        aVar.mo2486c(aVar.mo2494g());
        aVar.mo2489d(aVar.mo2497j() + ((floor - aVar.mo2497j()) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2454a(float f, C0646a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f1683b) {
            m2531b(f, aVar);
        } else if (f != 1.0f || z) {
            float j = aVar.mo2497j();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float f5 = aVar.mo2492f();
                f3 = f5;
                f2 = (0.79f * f1680d.getInterpolation(f4)) + 0.01f + f5;
            } else {
                f2 = aVar.mo2492f() + 0.79f;
                f3 = f2 - ((0.79f * (1.0f - f1680d.getInterpolation((f - 0.5f) / 0.5f))) + 0.01f);
            }
            float f6 = j + (0.20999998f * f);
            float f7 = 216.0f * (f + this.f1682a);
            aVar.mo2483b(f3);
            aVar.mo2486c(f2);
            aVar.mo2489d(f6);
            m2532d(f7);
        }
    }

    /* renamed from: a */
    private void m2529a() {
        final C0646a aVar = this.f1684f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0643d.this.mo2453a(floatValue, aVar);
                C0643d.this.mo2454a(floatValue, aVar, false);
                C0643d.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1679c);
        ofFloat.addListener(new AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                C0643d.this.f1682a = 0.0f;
            }

            public void onAnimationRepeat(Animator animator) {
                C0643d.this.mo2454a(1.0f, aVar, true);
                aVar.mo2498k();
                aVar.mo2485c();
                if (C0643d.this.f1683b) {
                    C0643d.this.f1683b = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo2480a(false);
                    return;
                }
                C0643d.this.f1682a += 1.0f;
            }
        });
        this.f1687i = ofFloat;
    }
}
