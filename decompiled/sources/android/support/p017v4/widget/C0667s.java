package android.support.p017v4.widget;

import android.content.Context;
import android.support.p017v4.view.C0595r;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.s */
/* compiled from: ViewDragHelper */
public class C0667s {

    /* renamed from: v */
    private static final Interpolator f1751v = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f1752a;

    /* renamed from: b */
    private int f1753b;

    /* renamed from: c */
    private int f1754c = -1;

    /* renamed from: d */
    private float[] f1755d;

    /* renamed from: e */
    private float[] f1756e;

    /* renamed from: f */
    private float[] f1757f;

    /* renamed from: g */
    private float[] f1758g;

    /* renamed from: h */
    private int[] f1759h;

    /* renamed from: i */
    private int[] f1760i;

    /* renamed from: j */
    private int[] f1761j;

    /* renamed from: k */
    private int f1762k;

    /* renamed from: l */
    private VelocityTracker f1763l;

    /* renamed from: m */
    private float f1764m;

    /* renamed from: n */
    private float f1765n;

    /* renamed from: o */
    private int f1766o;

    /* renamed from: p */
    private int f1767p;

    /* renamed from: q */
    private OverScroller f1768q;

    /* renamed from: r */
    private final C0670a f1769r;

    /* renamed from: s */
    private View f1770s;

    /* renamed from: t */
    private boolean f1771t;

    /* renamed from: u */
    private final ViewGroup f1772u;

    /* renamed from: w */
    private final Runnable f1773w = new Runnable() {
        public void run() {
            C0667s.this.mo2560c(0);
        }
    };

    /* renamed from: android.support.v4.widget.s$a */
    /* compiled from: ViewDragHelper */
    public static abstract class C0670a {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(View view, int i);
    }

    /* renamed from: a */
    public static C0667s m2641a(ViewGroup viewGroup, C0670a aVar) {
        return new C0667s(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    public static C0667s m2640a(ViewGroup viewGroup, float f, C0670a aVar) {
        C0667s a = m2641a(viewGroup, aVar);
        a.f1753b = (int) (((float) a.f1753b) * (1.0f / f));
        return a;
    }

    private C0667s(Context context, ViewGroup viewGroup, C0670a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f1772u = viewGroup;
            this.f1769r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1766o = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f1753b = viewConfiguration.getScaledTouchSlop();
            this.f1764m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1765n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1768q = new OverScroller(context, f1751v);
        }
    }

    /* renamed from: a */
    public void mo2546a(float f) {
        this.f1765n = f;
    }

    /* renamed from: a */
    public int mo2545a() {
        return this.f1752a;
    }

    /* renamed from: a */
    public void mo2547a(int i) {
        this.f1767p = i;
    }

    /* renamed from: b */
    public int mo2553b() {
        return this.f1766o;
    }

    /* renamed from: a */
    public void mo2548a(View view, int i) {
        if (view.getParent() != this.f1772u) {
            StringBuilder sb = new StringBuilder();
            sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sb.append(this.f1772u);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f1770s = view;
        this.f1754c = i;
        this.f1769r.onViewCaptured(view, i);
        mo2560c(1);
    }

    /* renamed from: c */
    public View mo2559c() {
        return this.f1770s;
    }

    /* renamed from: d */
    public int mo2562d() {
        return this.f1753b;
    }

    /* renamed from: e */
    public void mo2565e() {
        this.f1754c = -1;
        m2655g();
        if (this.f1763l != null) {
            this.f1763l.recycle();
            this.f1763l = null;
        }
    }

    /* renamed from: f */
    public void mo2566f() {
        mo2565e();
        if (this.f1752a == 2) {
            int currX = this.f1768q.getCurrX();
            int currY = this.f1768q.getCurrY();
            this.f1768q.abortAnimation();
            int currX2 = this.f1768q.getCurrX();
            int currY2 = this.f1768q.getCurrY();
            this.f1769r.onViewPositionChanged(this.f1770s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo2560c(0);
    }

    /* renamed from: a */
    public boolean mo2551a(View view, int i, int i2) {
        this.f1770s = view;
        this.f1754c = -1;
        boolean a = m2645a(i, i2, 0, 0);
        if (!a && this.f1752a == 0 && this.f1770s != null) {
            this.f1770s = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2549a(int i, int i2) {
        if (this.f1771t) {
            return m2645a(i, i2, (int) this.f1763l.getXVelocity(this.f1754c), (int) this.f1763l.getYVelocity(this.f1754c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m2645a(int i, int i2, int i3, int i4) {
        int left = this.f1770s.getLeft();
        int top = this.f1770s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1768q.abortAnimation();
            mo2560c(0);
            return false;
        }
        this.f1768q.startScroll(left, top, i5, i6, m2639a(this.f1770s, i5, i6, i3, i4));
        mo2560c(2);
        return true;
    }

    /* renamed from: a */
    private int m2639a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m2648b(i3, (int) this.f1765n, (int) this.f1764m);
        int b2 = m2648b(i4, (int) this.f1765n, (int) this.f1764m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) ((((float) m2638a(i, b, this.f1769r.getViewHorizontalDragRange(view))) * f5) + (((float) m2638a(i2, b2, this.f1769r.getViewVerticalDragRange(view))) * f6));
    }

    /* renamed from: a */
    private int m2638a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f1772u.getWidth();
        float f = (float) (width / 2);
        float b = f + (m2647b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = 4 * Math.round(1000.0f * Math.abs(b / ((float) abs)));
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    private int m2648b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m2637a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: b */
    private float m2647b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    public boolean mo2552a(boolean z) {
        if (this.f1752a == 2) {
            boolean computeScrollOffset = this.f1768q.computeScrollOffset();
            int currX = this.f1768q.getCurrX();
            int currY = this.f1768q.getCurrY();
            int left = currX - this.f1770s.getLeft();
            int top = currY - this.f1770s.getTop();
            if (left != 0) {
                C0595r.m2253d(this.f1770s, left);
            }
            if (top != 0) {
                C0595r.m2250c(this.f1770s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1769r.onViewPositionChanged(this.f1770s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1768q.getFinalX() && currY == this.f1768q.getFinalY()) {
                this.f1768q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1772u.post(this.f1773w);
                } else {
                    mo2560c(0);
                }
            }
        }
        if (this.f1752a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2642a(float f, float f2) {
        this.f1771t = true;
        this.f1769r.onViewReleased(this.f1770s, f, f2);
        this.f1771t = false;
        if (this.f1752a == 1) {
            mo2560c(0);
        }
    }

    /* renamed from: g */
    private void m2655g() {
        if (this.f1755d != null) {
            Arrays.fill(this.f1755d, 0.0f);
            Arrays.fill(this.f1756e, 0.0f);
            Arrays.fill(this.f1757f, 0.0f);
            Arrays.fill(this.f1758g, 0.0f);
            Arrays.fill(this.f1759h, 0);
            Arrays.fill(this.f1760i, 0);
            Arrays.fill(this.f1761j, 0);
            this.f1762k = 0;
        }
    }

    /* renamed from: e */
    private void m2653e(int i) {
        if (this.f1755d != null && mo2555b(i)) {
            this.f1755d[i] = 0.0f;
            this.f1756e[i] = 0.0f;
            this.f1757f[i] = 0.0f;
            this.f1758g[i] = 0.0f;
            this.f1759h[i] = 0;
            this.f1760i[i] = 0;
            this.f1761j[i] = 0;
            this.f1762k = ((1 << i) ^ -1) & this.f1762k;
        }
    }

    /* renamed from: f */
    private void m2654f(int i) {
        if (this.f1755d == null || this.f1755d.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.f1755d != null) {
                System.arraycopy(this.f1755d, 0, fArr, 0, this.f1755d.length);
                System.arraycopy(this.f1756e, 0, fArr2, 0, this.f1756e.length);
                System.arraycopy(this.f1757f, 0, fArr3, 0, this.f1757f.length);
                System.arraycopy(this.f1758g, 0, fArr4, 0, this.f1758g.length);
                System.arraycopy(this.f1759h, 0, iArr, 0, this.f1759h.length);
                System.arraycopy(this.f1760i, 0, iArr2, 0, this.f1760i.length);
                System.arraycopy(this.f1761j, 0, iArr3, 0, this.f1761j.length);
            }
            this.f1755d = fArr;
            this.f1756e = fArr2;
            this.f1757f = fArr3;
            this.f1758g = fArr4;
            this.f1759h = iArr;
            this.f1760i = iArr2;
            this.f1761j = iArr3;
        }
    }

    /* renamed from: a */
    private void m2643a(float f, float f2, int i) {
        m2654f(i);
        float[] fArr = this.f1755d;
        this.f1757f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1756e;
        this.f1758g[i] = f2;
        fArr2[i] = f2;
        this.f1759h[i] = m2652e((int) f, (int) f2);
        this.f1762k |= 1 << i;
    }

    /* renamed from: c */
    private void m2651c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2656g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1757f[pointerId] = x;
                this.f1758g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public boolean mo2555b(int i) {
        return ((1 << i) & this.f1762k) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2560c(int i) {
        this.f1772u.removeCallbacks(this.f1773w);
        if (this.f1752a != i) {
            this.f1752a = i;
            this.f1769r.onViewDragStateChanged(i);
            if (this.f1752a == 0) {
                this.f1770s = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2557b(View view, int i) {
        if (view == this.f1770s && this.f1754c == i) {
            return true;
        }
        if (view == null || !this.f1769r.tryCaptureView(view, i)) {
            return false;
        }
        this.f1754c = i;
        mo2548a(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r12 != r11) goto L_0x00dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2550a(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.mo2565e()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1763l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1763l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1763l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f6;
                case 2: goto L_0x0067;
                case 3: goto L_0x00f6;
                case 4: goto L_0x0025;
                case 5: goto L_0x0030;
                case 6: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            r5 = 0
            goto L_0x012d
        L_0x0028:
            int r1 = r1.getPointerId(r3)
            r0.m2653e(r1)
            goto L_0x0025
        L_0x0030:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m2643a(r7, r1, r2)
            int r3 = r0.f1752a
            if (r3 != 0) goto L_0x0055
            int[] r1 = r0.f1759h
            r1 = r1[r2]
            int r3 = r0.f1767p
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0025
            android.support.v4.widget.s$a r3 = r0.f1769r
            int r4 = r0.f1767p
            r1 = r1 & r4
            r3.onEdgeTouched(r1, r2)
            goto L_0x0025
        L_0x0055:
            int r3 = r0.f1752a
            if (r3 != r4) goto L_0x0025
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo2563d(r3, r1)
            android.view.View r3 = r0.f1770s
            if (r1 != r3) goto L_0x0025
            r0.mo2557b(r1, r2)
            goto L_0x0025
        L_0x0067:
            float[] r2 = r0.f1755d
            if (r2 == 0) goto L_0x0025
            float[] r2 = r0.f1756e
            if (r2 != 0) goto L_0x0070
            goto L_0x0025
        L_0x0070:
            int r2 = r18.getPointerCount()
            r3 = 0
        L_0x0075:
            if (r3 >= r2) goto L_0x00f1
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m2656g(r4)
            if (r7 != 0) goto L_0x0083
            goto L_0x00ee
        L_0x0083:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1755d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1756e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo2563d(r7, r8)
            if (r7 == 0) goto L_0x00a7
            boolean r8 = r0.m2646a(r7, r9, r10)
            if (r8 == 0) goto L_0x00a7
            r8 = r6
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r8 == 0) goto L_0x00dd
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.s$a r14 = r0.f1769r
            int r12 = r14.clampViewPositionHorizontal(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.s$a r5 = r0.f1769r
            int r5 = r5.clampViewPositionVertical(r7, r15, r14)
            android.support.v4.widget.s$a r14 = r0.f1769r
            int r14 = r14.getViewHorizontalDragRange(r7)
            android.support.v4.widget.s$a r15 = r0.f1769r
            int r15 = r15.getViewVerticalDragRange(r7)
            if (r14 == 0) goto L_0x00d6
            if (r14 <= 0) goto L_0x00dd
            if (r12 != r11) goto L_0x00dd
        L_0x00d6:
            if (r15 == 0) goto L_0x00f1
            if (r15 <= 0) goto L_0x00dd
            if (r5 != r13) goto L_0x00dd
            goto L_0x00f1
        L_0x00dd:
            r0.m2649b(r9, r10, r4)
            int r5 = r0.f1752a
            if (r5 != r6) goto L_0x00e5
            goto L_0x00f1
        L_0x00e5:
            if (r8 == 0) goto L_0x00ee
            boolean r4 = r0.mo2557b(r7, r4)
            if (r4 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00f1:
            r17.m2651c(r18)
            goto L_0x0025
        L_0x00f6:
            r17.mo2565e()
            goto L_0x0025
        L_0x00fb:
            float r2 = r18.getX()
            float r3 = r18.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m2643a(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo2563d(r2, r3)
            android.view.View r3 = r0.f1770s
            if (r2 != r3) goto L_0x011c
            int r3 = r0.f1752a
            if (r3 != r4) goto L_0x011c
            r0.mo2557b(r2, r1)
        L_0x011c:
            int[] r2 = r0.f1759h
            r2 = r2[r1]
            int r3 = r0.f1767p
            r3 = r3 & r2
            if (r3 == 0) goto L_0x012d
            android.support.v4.widget.s$a r3 = r0.f1769r
            int r4 = r0.f1767p
            r2 = r2 & r4
            r3.onEdgeTouched(r2, r1)
        L_0x012d:
            int r1 = r0.f1752a
            if (r1 != r6) goto L_0x0132
            r5 = r6
        L_0x0132:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.widget.C0667s.mo2550a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void mo2554b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo2565e();
        }
        if (this.f1763l == null) {
            this.f1763l = VelocityTracker.obtain();
        }
        this.f1763l.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View d = mo2563d((int) x, (int) y);
                m2643a(x, y, pointerId);
                mo2557b(d, pointerId);
                int i3 = this.f1759h[pointerId];
                if ((this.f1767p & i3) != 0) {
                    this.f1769r.onEdgeTouched(i3 & this.f1767p, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f1752a == 1) {
                    m2657h();
                }
                mo2565e();
                return;
            case 2:
                if (this.f1752a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2656g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1755d[pointerId2];
                            float f2 = y2 - this.f1756e[pointerId2];
                            m2649b(f, f2, pointerId2);
                            if (this.f1752a != 1) {
                                View d2 = mo2563d((int) x2, (int) y2);
                                if (m2646a(d2, f, f2) && mo2557b(d2, pointerId2)) {
                                }
                            }
                            m2651c(motionEvent);
                            return;
                        }
                        i2++;
                    }
                    m2651c(motionEvent);
                    return;
                } else if (m2656g(this.f1754c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1754c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    int i4 = (int) (x3 - this.f1757f[this.f1754c]);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) - this.f1758g[this.f1754c]);
                    m2650b(this.f1770s.getLeft() + i4, this.f1770s.getTop() + y3, i4, y3);
                    m2651c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f1752a == 1) {
                    m2642a(0.0f, 0.0f);
                }
                mo2565e();
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m2643a(x4, y4, pointerId3);
                if (this.f1752a == 0) {
                    mo2557b(mo2563d((int) x4, (int) y4), pointerId3);
                    int i5 = this.f1759h[pointerId3];
                    if ((this.f1767p & i5) != 0) {
                        this.f1769r.onEdgeTouched(i5 & this.f1767p, pointerId3);
                        return;
                    }
                    return;
                } else if (mo2561c((int) x4, (int) y4)) {
                    mo2557b(this.f1770s, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1752a == 1 && pointerId4 == this.f1754c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f1754c) {
                                if (mo2563d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f1770s && mo2557b(this.f1770s, pointerId5)) {
                                    i = this.f1754c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m2657h();
                    }
                }
                m2653e(pointerId4);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m2649b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2644a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2644a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2644a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2644a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1760i;
            iArr[i] = iArr[i] | i2;
            this.f1769r.onEdgeDragStarted(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m2644a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if ((this.f1759h[i] & i2) != i2 || (this.f1767p & i2) == 0 || (this.f1761j[i] & i2) == i2 || (this.f1760i[i] & i2) == i2 || (abs <= ((float) this.f1753b) && abs2 <= ((float) this.f1753b))) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f1769r.onEdgeLock(i2)) {
            if ((this.f1760i[i] & i2) == 0 && abs > ((float) this.f1753b)) {
                z = true;
            }
            return z;
        }
        int[] iArr = this.f1761j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m2646a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f1769r.getViewHorizontalDragRange(view) > 0;
        boolean z3 = this.f1769r.getViewVerticalDragRange(view) > 0;
        if (z2 && z3) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1753b * this.f1753b))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f1753b)) {
                z = true;
            }
            return z;
        } else if (!z3) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1753b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: d */
    public boolean mo2564d(int i) {
        int length = this.f1755d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo2556b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo2556b(int i, int i2) {
        boolean z = false;
        if (!mo2555b(i2)) {
            return false;
        }
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 2) == 2;
        float f = this.f1757f[i2] - this.f1755d[i2];
        float f2 = this.f1758g[i2] - this.f1756e[i2];
        if (z2 && z3) {
            if ((f * f) + (f2 * f2) > ((float) (this.f1753b * this.f1753b))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f1753b)) {
                z = true;
            }
            return z;
        } else if (!z3) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.f1753b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: h */
    private void m2657h() {
        this.f1763l.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f1764m);
        m2642a(m2637a(this.f1763l.getXVelocity(this.f1754c), this.f1765n, this.f1764m), m2637a(this.f1763l.getYVelocity(this.f1754c), this.f1765n, this.f1764m));
    }

    /* renamed from: b */
    private void m2650b(int i, int i2, int i3, int i4) {
        int left = this.f1770s.getLeft();
        int top = this.f1770s.getTop();
        if (i3 != 0) {
            i = this.f1769r.clampViewPositionHorizontal(this.f1770s, i, i3);
            C0595r.m2253d(this.f1770s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1769r.clampViewPositionVertical(this.f1770s, i2, i4);
            C0595r.m2250c(this.f1770s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f1769r.onViewPositionChanged(this.f1770s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    public boolean mo2561c(int i, int i2) {
        return mo2558b(this.f1770s, i, i2);
    }

    /* renamed from: b */
    public boolean mo2558b(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public View mo2563d(int i, int i2) {
        for (int childCount = this.f1772u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1772u.getChildAt(this.f1769r.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m2652e(int i, int i2) {
        int i3 = i < this.f1772u.getLeft() + this.f1766o ? 1 : 0;
        if (i2 < this.f1772u.getTop() + this.f1766o) {
            i3 |= 4;
        }
        if (i > this.f1772u.getRight() - this.f1766o) {
            i3 |= 2;
        }
        return i2 > this.f1772u.getBottom() - this.f1766o ? i3 | 8 : i3;
    }

    /* renamed from: g */
    private boolean m2656g(int i) {
        if (mo2555b(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }
}
