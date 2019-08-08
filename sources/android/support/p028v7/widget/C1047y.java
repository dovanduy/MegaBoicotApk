package android.support.p028v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.widget.RecyclerView.C0880h;
import android.support.p028v7.widget.RecyclerView.C0888l;
import android.support.p028v7.widget.RecyclerView.C0889m;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.y */
/* compiled from: FastScroller */
class C1047y extends C0880h implements C0888l {

    /* renamed from: k */
    private static final int[] f3464k = {16842919};

    /* renamed from: l */
    private static final int[] f3465l = new int[0];

    /* renamed from: A */
    private int f3466A = 0;

    /* renamed from: B */
    private final int[] f3467B = new int[2];

    /* renamed from: C */
    private final int[] f3468C = new int[2];

    /* renamed from: D */
    private final Runnable f3469D = new Runnable() {
        public void run() {
            C1047y.this.mo5366b(500);
        }
    };

    /* renamed from: E */
    private final C0889m f3470E = new C0889m() {
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1047y.this.mo5362a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    };

    /* renamed from: a */
    final StateListDrawable f3471a;

    /* renamed from: b */
    final Drawable f3472b;

    /* renamed from: c */
    int f3473c;

    /* renamed from: d */
    int f3474d;

    /* renamed from: e */
    float f3475e;

    /* renamed from: f */
    int f3476f;

    /* renamed from: g */
    int f3477g;

    /* renamed from: h */
    float f3478h;

    /* renamed from: i */
    final ValueAnimator f3479i = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: j */
    int f3480j = 0;

    /* renamed from: m */
    private final int f3481m;

    /* renamed from: n */
    private final int f3482n;

    /* renamed from: o */
    private final int f3483o;

    /* renamed from: p */
    private final int f3484p;

    /* renamed from: q */
    private final StateListDrawable f3485q;

    /* renamed from: r */
    private final Drawable f3486r;

    /* renamed from: s */
    private final int f3487s;

    /* renamed from: t */
    private final int f3488t;

    /* renamed from: u */
    private int f3489u = 0;

    /* renamed from: v */
    private int f3490v = 0;

    /* renamed from: w */
    private RecyclerView f3491w;

    /* renamed from: x */
    private boolean f3492x = false;

    /* renamed from: y */
    private boolean f3493y = false;

    /* renamed from: z */
    private int f3494z = 0;

    /* renamed from: android.support.v7.widget.y$a */
    /* compiled from: FastScroller */
    private class C1050a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f3498b = false;

        C1050a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3498b) {
                this.f3498b = false;
                return;
            }
            if (((Float) C1047y.this.f3479i.getAnimatedValue()).floatValue() == 0.0f) {
                C1047y.this.f3480j = 0;
                C1047y.this.mo5361a(0);
            } else {
                C1047y.this.f3480j = 2;
                C1047y.this.mo5360a();
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f3498b = true;
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    /* compiled from: FastScroller */
    private class C1051b implements AnimatorUpdateListener {
        C1051b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (255.0f * ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C1047y.this.f3471a.setAlpha(floatValue);
            C1047y.this.f3472b.setAlpha(floatValue);
            C1047y.this.mo5360a();
        }
    }

    /* renamed from: a */
    public void mo4402a(boolean z) {
    }

    C1047y(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3471a = stateListDrawable;
        this.f3472b = drawable;
        this.f3485q = stateListDrawable2;
        this.f3486r = drawable2;
        this.f3483o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3484p = Math.max(i, drawable.getIntrinsicWidth());
        this.f3487s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3488t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3481m = i2;
        this.f3482n = i3;
        this.f3471a.setAlpha(255);
        this.f3472b.setAlpha(255);
        this.f3479i.addListener(new C1050a());
        this.f3479i.addUpdateListener(new C1051b());
        mo5363a(recyclerView);
    }

    /* renamed from: a */
    public void mo5363a(RecyclerView recyclerView) {
        if (this.f3491w != recyclerView) {
            if (this.f3491w != null) {
                m4850d();
            }
            this.f3491w = recyclerView;
            if (this.f3491w != null) {
                m4848c();
            }
        }
    }

    /* renamed from: c */
    private void m4848c() {
        this.f3491w.addItemDecoration(this);
        this.f3491w.addOnItemTouchListener(this);
        this.f3491w.addOnScrollListener(this.f3470E);
    }

    /* renamed from: d */
    private void m4850d() {
        this.f3491w.removeItemDecoration(this);
        this.f3491w.removeOnItemTouchListener(this);
        this.f3491w.removeOnScrollListener(this.f3470E);
        m4852f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5360a() {
        this.f3491w.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5361a(int i) {
        if (i == 2 && this.f3494z != 2) {
            this.f3471a.setState(f3464k);
            m4852f();
        }
        if (i == 0) {
            mo5360a();
        } else {
            mo5365b();
        }
        if (this.f3494z == 2 && i != 2) {
            this.f3471a.setState(f3465l);
            m4849c(1200);
        } else if (i == 1) {
            m4849c(1500);
        }
        this.f3494z = i;
    }

    /* renamed from: e */
    private boolean m4851e() {
        return C0595r.m2256f(this.f3491w) == 1;
    }

    /* renamed from: b */
    public void mo5365b() {
        int i = this.f3480j;
        if (i != 0) {
            if (i == 3) {
                this.f3479i.cancel();
            } else {
                return;
            }
        }
        this.f3480j = 1;
        this.f3479i.setFloatValues(new float[]{((Float) this.f3479i.getAnimatedValue()).floatValue(), 1.0f});
        this.f3479i.setDuration(500);
        this.f3479i.setStartDelay(0);
        this.f3479i.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5366b(int i) {
        switch (this.f3480j) {
            case 1:
                this.f3479i.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f3480j = 3;
        this.f3479i.setFloatValues(new float[]{((Float) this.f3479i.getAnimatedValue()).floatValue(), 0.0f});
        this.f3479i.setDuration((long) i);
        this.f3479i.start();
    }

    /* renamed from: f */
    private void m4852f() {
        this.f3491w.removeCallbacks(this.f3469D);
    }

    /* renamed from: c */
    private void m4849c(int i) {
        m4852f();
        this.f3491w.postDelayed(this.f3469D, (long) i);
    }

    /* renamed from: a */
    public void mo4273a(Canvas canvas, RecyclerView recyclerView, C0898s sVar) {
        if (this.f3489u == this.f3491w.getWidth() && this.f3490v == this.f3491w.getHeight()) {
            if (this.f3480j != 0) {
                if (this.f3492x) {
                    m4845a(canvas);
                }
                if (this.f3493y) {
                    m4847b(canvas);
                }
            }
            return;
        }
        this.f3489u = this.f3491w.getWidth();
        this.f3490v = this.f3491w.getHeight();
        mo5361a(0);
    }

    /* renamed from: a */
    private void m4845a(Canvas canvas) {
        int i = this.f3489u - this.f3483o;
        int i2 = this.f3474d - (this.f3473c / 2);
        this.f3471a.setBounds(0, 0, this.f3483o, this.f3473c);
        this.f3472b.setBounds(0, 0, this.f3484p, this.f3490v);
        if (m4851e()) {
            this.f3472b.draw(canvas);
            canvas.translate((float) this.f3483o, (float) i2);
            canvas.scale(-1.0f, 1.0f);
            this.f3471a.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f3483o), (float) (-i2));
            return;
        }
        canvas.translate((float) i, 0.0f);
        this.f3472b.draw(canvas);
        canvas.translate(0.0f, (float) i2);
        this.f3471a.draw(canvas);
        canvas.translate((float) (-i), (float) (-i2));
    }

    /* renamed from: b */
    private void m4847b(Canvas canvas) {
        int i = this.f3490v - this.f3487s;
        int i2 = this.f3477g - (this.f3476f / 2);
        this.f3485q.setBounds(0, 0, this.f3476f, this.f3487s);
        this.f3486r.setBounds(0, 0, this.f3489u, this.f3488t);
        canvas.translate(0.0f, (float) i);
        this.f3486r.draw(canvas);
        canvas.translate((float) i2, 0.0f);
        this.f3485q.draw(canvas);
        canvas.translate((float) (-i2), (float) (-i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5362a(int i, int i2) {
        int computeVerticalScrollRange = this.f3491w.computeVerticalScrollRange();
        int i3 = this.f3490v;
        this.f3492x = computeVerticalScrollRange - i3 > 0 && this.f3490v >= this.f3481m;
        int computeHorizontalScrollRange = this.f3491w.computeHorizontalScrollRange();
        int i4 = this.f3489u;
        this.f3493y = computeHorizontalScrollRange - i4 > 0 && this.f3489u >= this.f3481m;
        if (this.f3492x || this.f3493y) {
            if (this.f3492x) {
                float f = (float) i3;
                this.f3474d = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3473c = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3493y) {
                float f2 = (float) i4;
                this.f3477g = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3476f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (this.f3494z == 0 || this.f3494z == 1) {
                mo5361a(1);
            }
            return;
        }
        if (this.f3494z != 0) {
            mo5361a(0);
        }
    }

    /* renamed from: a */
    public boolean mo4403a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3494z == 1) {
            boolean a = mo5364a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo5367b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f3466A = 1;
                this.f3478h = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f3466A = 2;
                this.f3475e = (float) ((int) motionEvent.getY());
            }
            mo5361a(2);
        } else if (this.f3494z != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo4404b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3494z != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo5364a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo5367b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f3466A = 1;
                        this.f3478h = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f3466A = 2;
                        this.f3475e = (float) ((int) motionEvent.getY());
                    }
                    mo5361a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3494z == 2) {
                this.f3475e = 0.0f;
                this.f3478h = 0.0f;
                mo5361a(1);
                this.f3466A = 0;
            } else if (motionEvent.getAction() == 2 && this.f3494z == 2) {
                mo5365b();
                if (this.f3466A == 1) {
                    m4846b(motionEvent.getX());
                }
                if (this.f3466A == 2) {
                    m4844a(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: a */
    private void m4844a(float f) {
        int[] g = m4853g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f3474d) - max) >= 2.0f) {
            int a = m4843a(this.f3475e, max, g, this.f3491w.computeVerticalScrollRange(), this.f3491w.computeVerticalScrollOffset(), this.f3490v);
            if (a != 0) {
                this.f3491w.scrollBy(0, a);
            }
            this.f3475e = max;
        }
    }

    /* renamed from: b */
    private void m4846b(float f) {
        int[] h = m4854h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f3477g) - max) >= 2.0f) {
            int a = m4843a(this.f3478h, max, h, this.f3491w.computeHorizontalScrollRange(), this.f3491w.computeHorizontalScrollOffset(), this.f3489u);
            if (a != 0) {
                this.f3491w.scrollBy(a, 0);
            }
            this.f3478h = max;
        }
    }

    /* renamed from: a */
    private int m4843a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5364a(float f, float f2) {
        if (!m4851e() ? f >= ((float) (this.f3489u - this.f3483o)) : f <= ((float) (this.f3483o / 2))) {
            if (f2 >= ((float) (this.f3474d - (this.f3473c / 2))) && f2 <= ((float) (this.f3474d + (this.f3473c / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5367b(float f, float f2) {
        return f2 >= ((float) (this.f3490v - this.f3487s)) && f >= ((float) (this.f3477g - (this.f3476f / 2))) && f <= ((float) (this.f3477g + (this.f3476f / 2)));
    }

    /* renamed from: g */
    private int[] m4853g() {
        this.f3467B[0] = this.f3482n;
        this.f3467B[1] = this.f3490v - this.f3482n;
        return this.f3467B;
    }

    /* renamed from: h */
    private int[] m4854h() {
        this.f3468C[0] = this.f3482n;
        this.f3468C[1] = this.f3489u - this.f3482n;
        return this.f3468C;
    }
}
