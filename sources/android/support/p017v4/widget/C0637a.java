package android.support.p017v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p017v4.view.C0595r;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0637a implements OnTouchListener {

    /* renamed from: r */
    private static final int f1643r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0638a f1644a = new C0638a();

    /* renamed from: b */
    final View f1645b;

    /* renamed from: c */
    boolean f1646c;

    /* renamed from: d */
    boolean f1647d;

    /* renamed from: e */
    boolean f1648e;

    /* renamed from: f */
    private final Interpolator f1649f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f1650g;

    /* renamed from: h */
    private float[] f1651h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f1652i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f1653j;

    /* renamed from: k */
    private int f1654k;

    /* renamed from: l */
    private float[] f1655l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f1656m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1657n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f1658o;

    /* renamed from: p */
    private boolean f1659p;

    /* renamed from: q */
    private boolean f1660q;

    /* renamed from: android.support.v4.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0638a {

        /* renamed from: a */
        private int f1661a;

        /* renamed from: b */
        private int f1662b;

        /* renamed from: c */
        private float f1663c;

        /* renamed from: d */
        private float f1664d;

        /* renamed from: e */
        private long f1665e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1666f = 0;

        /* renamed from: g */
        private int f1667g = 0;

        /* renamed from: h */
        private int f1668h = 0;

        /* renamed from: i */
        private long f1669i = -1;

        /* renamed from: j */
        private float f1670j;

        /* renamed from: k */
        private int f1671k;

        /* renamed from: a */
        private float m2512a(float f) {
            return (-4.0f * f * f) + (4.0f * f);
        }

        C0638a() {
        }

        /* renamed from: a */
        public void mo2434a(int i) {
            this.f1661a = i;
        }

        /* renamed from: b */
        public void mo2436b(int i) {
            this.f1662b = i;
        }

        /* renamed from: a */
        public void mo2432a() {
            this.f1665e = AnimationUtils.currentAnimationTimeMillis();
            this.f1669i = -1;
            this.f1666f = this.f1665e;
            this.f1670j = 0.5f;
            this.f1667g = 0;
            this.f1668h = 0;
        }

        /* renamed from: b */
        public void mo2435b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1671k = C0637a.m2493a((int) (currentAnimationTimeMillis - this.f1665e), 0, this.f1662b);
            this.f1670j = m2513a(currentAnimationTimeMillis);
            this.f1669i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean mo2437c() {
            return this.f1669i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1669i + ((long) this.f1671k);
        }

        /* renamed from: a */
        private float m2513a(long j) {
            if (j < this.f1665e) {
                return 0.0f;
            }
            if (this.f1669i < 0 || j < this.f1669i) {
                return 0.5f * C0637a.m2490a(((float) (j - this.f1665e)) / ((float) this.f1661a), 0.0f, 1.0f);
            }
            return (1.0f - this.f1670j) + (this.f1670j * C0637a.m2490a(((float) (j - this.f1669i)) / ((float) this.f1671k), 0.0f, 1.0f));
        }

        /* renamed from: d */
        public void mo2438d() {
            if (this.f1666f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m2512a(m2513a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1666f;
            this.f1666f = currentAnimationTimeMillis;
            float f = ((float) j) * a;
            this.f1667g = (int) (this.f1663c * f);
            this.f1668h = (int) (f * this.f1664d);
        }

        /* renamed from: a */
        public void mo2433a(float f, float f2) {
            this.f1663c = f;
            this.f1664d = f2;
        }

        /* renamed from: e */
        public int mo2439e() {
            return (int) (this.f1663c / Math.abs(this.f1663c));
        }

        /* renamed from: f */
        public int mo2440f() {
            return (int) (this.f1664d / Math.abs(this.f1664d));
        }

        /* renamed from: g */
        public int mo2441g() {
            return this.f1667g;
        }

        /* renamed from: h */
        public int mo2442h() {
            return this.f1668h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0639b implements Runnable {
        C0639b() {
        }

        public void run() {
            if (C0637a.this.f1648e) {
                if (C0637a.this.f1646c) {
                    C0637a.this.f1646c = false;
                    C0637a.this.f1644a.mo2432a();
                }
                C0638a aVar = C0637a.this.f1644a;
                if (aVar.mo2437c() || !C0637a.this.mo2420a()) {
                    C0637a.this.f1648e = false;
                    return;
                }
                if (C0637a.this.f1647d) {
                    C0637a.this.f1647d = false;
                    C0637a.this.mo2423b();
                }
                aVar.mo2438d();
                C0637a.this.mo2419a(aVar.mo2441g(), aVar.mo2442h());
                C0595r.m2242a(C0637a.this.f1645b, (Runnable) this);
            }
        }
    }

    /* renamed from: a */
    static float m2490a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2493a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract void mo2419a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo2429e(int i);

    /* renamed from: f */
    public abstract boolean mo2430f(int i);

    public C0637a(View view) {
        this.f1645b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((315.0f * displayMetrics.density) + 0.5f);
        float f = (float) i;
        mo2416a(f, f);
        float f2 = (float) i2;
        mo2421b(f2, f2);
        mo2417a(1);
        mo2428e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2426d(0.2f, 0.2f);
        mo2424c(1.0f, 1.0f);
        mo2422b(f1643r);
        mo2425c(500);
        mo2427d(500);
    }

    /* renamed from: a */
    public C0637a mo2418a(boolean z) {
        if (this.f1659p && !z) {
            m2495d();
        }
        this.f1659p = z;
        return this;
    }

    /* renamed from: a */
    public C0637a mo2416a(float f, float f2) {
        this.f1657n[0] = f / 1000.0f;
        this.f1657n[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0637a mo2421b(float f, float f2) {
        this.f1656m[0] = f / 1000.0f;
        this.f1656m[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0637a mo2424c(float f, float f2) {
        this.f1655l[0] = f / 1000.0f;
        this.f1655l[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0637a mo2417a(int i) {
        this.f1653j = i;
        return this;
    }

    /* renamed from: d */
    public C0637a mo2426d(float f, float f2) {
        this.f1651h[0] = f;
        this.f1651h[1] = f2;
        return this;
    }

    /* renamed from: e */
    public C0637a mo2428e(float f, float f2) {
        this.f1652i[0] = f;
        this.f1652i[1] = f2;
        return this;
    }

    /* renamed from: b */
    public C0637a mo2422b(int i) {
        this.f1654k = i;
        return this;
    }

    /* renamed from: c */
    public C0637a mo2425c(int i) {
        this.f1644a.mo2434a(i);
        return this;
    }

    /* renamed from: d */
    public C0637a mo2427d(int i) {
        this.f1644a.mo2436b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f1659p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1647d = true;
                this.f1658o = false;
                break;
            case 1:
            case 3:
                m2495d();
                break;
            case 2:
                break;
        }
        this.f1644a.mo2433a(m2492a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1645b.getWidth()), m2492a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1645b.getHeight()));
        if (!this.f1648e && mo2420a()) {
            m2494c();
        }
        if (this.f1660q && this.f1648e) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2420a() {
        C0638a aVar = this.f1644a;
        int f = aVar.mo2440f();
        int e = aVar.mo2439e();
        return (f != 0 && mo2430f(f)) || (e != 0 && mo2429e(e));
    }

    /* renamed from: c */
    private void m2494c() {
        if (this.f1650g == null) {
            this.f1650g = new C0639b();
        }
        this.f1648e = true;
        this.f1646c = true;
        if (this.f1658o || this.f1654k <= 0) {
            this.f1650g.run();
        } else {
            C0595r.m2243a(this.f1645b, this.f1650g, (long) this.f1654k);
        }
        this.f1658o = true;
    }

    /* renamed from: d */
    private void m2495d() {
        if (this.f1646c) {
            this.f1648e = false;
        } else {
            this.f1644a.mo2435b();
        }
    }

    /* renamed from: a */
    private float m2492a(int i, float f, float f2, float f3) {
        float a = m2491a(this.f1651h[i], f2, this.f1652i[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1655l[i];
        float f5 = this.f1656m[i];
        float f6 = this.f1657n[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m2490a(a * f7, f5, f6);
        }
        return -m2490a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m2491a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2490a(f * f2, 0.0f, f3);
        float f6 = m2496f(f2 - f4, a) - m2496f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1649f.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1649f.getInterpolation(f6);
        }
        return m2490a(f5, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m2496f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1653j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (!this.f1648e || this.f1653j != 1) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2423b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1645b.onTouchEvent(obtain);
        obtain.recycle();
    }
}
