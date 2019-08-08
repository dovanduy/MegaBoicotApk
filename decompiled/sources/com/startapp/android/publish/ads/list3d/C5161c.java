package com.startapp.android.publish.ads.list3d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.facebook.ads.AdError;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.LinkedList;

/* renamed from: com.startapp.android.publish.ads.list3d.c */
/* compiled from: StartAppSDK */
public class C5161c extends AdapterView<Adapter> {

    /* renamed from: A */
    private int f16598A = Integer.MIN_VALUE;

    /* renamed from: B */
    private boolean f16599B = false;

    /* renamed from: C */
    private boolean f16600C = false;

    /* renamed from: D */
    private boolean f16601D = false;

    /* renamed from: a */
    protected int f16602a = 0;

    /* renamed from: b */
    protected int f16603b;

    /* renamed from: c */
    protected int f16604c;

    /* renamed from: d */
    protected int f16605d;

    /* renamed from: e */
    protected int f16606e;

    /* renamed from: f */
    protected int f16607f;

    /* renamed from: g */
    protected int f16608g;

    /* renamed from: h */
    protected int f16609h;

    /* renamed from: i */
    protected int f16610i;

    /* renamed from: j */
    protected Dynamics f16611j;

    /* renamed from: k */
    protected float f16612k = 0.0f;

    /* renamed from: l */
    protected boolean f16613l = false;

    /* renamed from: m */
    protected boolean f16614m = false;

    /* renamed from: n */
    protected String f16615n;

    /* renamed from: o */
    protected String f16616o;

    /* renamed from: p */
    public BroadcastReceiver f16617p = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            double height = ((double) C5161c.this.getHeight()) / ((double) intent.getIntExtra("getHeight", C5161c.this.getHeight()));
            StringBuilder sb = new StringBuilder();
            sb.append(C5161c.this.f16618q);
            sb.append("Updating Position with Ratio: [");
            sb.append(height);
            sb.append("]");
            C5518g.m23561a(3, sb.toString());
            C5161c.this.f16602a = intent.getIntExtra("mTouchState", C5161c.this.f16602a);
            C5161c.this.f16603b = intent.getIntExtra("mTouchStartX", C5161c.this.f16603b);
            C5161c.this.f16604c = intent.getIntExtra("mTouchStartY", C5161c.this.f16604c);
            C5161c.this.f16608g = intent.getIntExtra("mListRotation", C5161c.this.f16608g);
            C5161c.this.f16609h = (int) (((double) intent.getIntExtra("mFirstItemPosition", C5161c.this.f16609h)) * height);
            C5161c.this.f16609h--;
            C5161c.this.f16610i = (int) (((double) intent.getIntExtra("mLastItemPosition", C5161c.this.f16610i)) * height);
            C5161c.this.f16610i--;
            C5161c.this.f16606e = (int) (((double) intent.getIntExtra("mListTop", C5161c.this.f16606e)) * height);
            C5161c.this.f16605d = (int) (((double) intent.getIntExtra("mListTopStart", C5161c.this.f16605d)) * height);
            C5161c.this.f16607f = (int) (((double) intent.getIntExtra("mListTopOffset", C5161c.this.f16607f)) * height);
            C5161c.this.f16611j = (Dynamics) intent.getParcelableExtra("mDynamics");
            C5161c.this.f16612k = intent.getFloatExtra("mLastVelocity", C5161c.this.f16612k);
            C5161c.this.f16611j.mo18962a(height);
            C5160b bVar = new C5160b(C5161c.this.getContext(), intent.getParcelableArrayListExtra("list"), "home", C5161c.this.f16615n, C5161c.this.f16616o);
            C5161c.this.setAdapter(bVar);
            C5161c.this.f16613l = true;
            C5161c.this.f16614m = true;
            C5161c.this.mo19035a(C5161c.this.f16612k, true);
            C5523b.m23588a(context).mo20504a((BroadcastReceiver) this);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f16618q = "List3DView";

    /* renamed from: r */
    private Adapter f16619r;

    /* renamed from: s */
    private VelocityTracker f16620s;

    /* renamed from: t */
    private Runnable f16621t;

    /* renamed from: u */
    private final LinkedList<View> f16622u = new LinkedList<>();

    /* renamed from: v */
    private Runnable f16623v;

    /* renamed from: w */
    private Rect f16624w;

    /* renamed from: x */
    private Camera f16625x;

    /* renamed from: y */
    private Matrix f16626y;

    /* renamed from: z */
    private Paint f16627z;

    public View getSelectedView() {
        return null;
    }

    public C5161c(Context context, AttributeSet attributeSet, String str, String str2) {
        super(context, attributeSet);
        this.f16615n = str;
        this.f16616o = str2;
    }

    public void setTag(String str) {
        this.f16618q = str;
    }

    /* renamed from: a */
    public void mo19034a() {
        this.f16613l = true;
    }

    public void setHint(boolean z) {
        this.f16600C = z;
    }

    /* renamed from: b */
    public boolean mo19038b() {
        return this.f16600C;
    }

    /* renamed from: c */
    public boolean mo19039c() {
        return this.f16599B;
    }

    public void setFade(boolean z) {
        this.f16599B = z;
    }

    public void setAdapter(Adapter adapter) {
        if (m22172d() && mo19039c()) {
            C5509c.m23508a((View) this, 0.0f);
        }
        this.f16619r = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public Adapter getAdapter() {
        return this.f16619r;
    }

    public void setSelection(int i) {
        throw new UnsupportedOperationException("Not supported");
    }

    /* renamed from: d */
    private boolean m22172d() {
        return C5509c.m23514a();
    }

    public void setDynamics(Dynamics dynamics) {
        if (this.f16611j != null) {
            dynamics.mo18964a(this.f16611j.mo18961a(), this.f16611j.mo18968b(), AnimationUtils.currentAnimationTimeMillis());
        }
        this.f16611j = dynamics;
    }

    /* renamed from: e */
    private void m22173e() {
        if (!this.f16601D) {
            this.f16601D = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new Runnable() {
                public void run() {
                    C5161c.this.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
                    C5161c.this.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
                }
            }, 5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        float f = 0.0f;
        switch (motionEvent.getAction()) {
            case 0:
                if (m22172d()) {
                    C5509c.m23509a((View) this, 1500);
                }
                m22160a(motionEvent);
                break;
            case 1:
                if (this.f16602a == 1) {
                    m22164b((int) motionEvent.getX(), (int) motionEvent.getY());
                } else if (this.f16602a == 2) {
                    this.f16620s.addMovement(motionEvent);
                    this.f16620s.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
                    f = this.f16620s.getYVelocity();
                    this.f16612k = f;
                }
                m22163b(f);
                break;
            case 2:
                if (this.f16602a == 1) {
                    m22165b(motionEvent);
                }
                if (this.f16602a == 2) {
                    this.f16620s.addMovement(motionEvent);
                    mo19036a(((int) motionEvent.getY()) - this.f16604c);
                    break;
                }
                break;
            default:
                m22163b(0.0f);
                break;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f16613l && this.f16619r != null) {
            if (getChildCount() == 0) {
                if (mo19038b()) {
                    this.f16606e = getHeight() / 3;
                }
                if (!this.f16614m) {
                    this.f16610i = -1;
                } else {
                    this.f16610i = this.f16609h;
                    this.f16609h++;
                }
                m22168c(this.f16606e, 0);
            } else {
                int a = (this.f16606e + this.f16607f) - mo19033a(getChildAt(0));
                m22167c(a);
                m22170d(a);
            }
            m22176h();
            if (mo19038b()) {
                m22173e();
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = (float) (getHeight() / 2);
        float f = (((float) (top + height)) - height2) / height2;
        float cos = (float) (1.0d - (0.15000000596046448d * (1.0d - Math.cos((double) f))));
        float f2 = (((float) this.f16608g) - (20.0f * f)) % 90.0f;
        if (f2 < 0.0f) {
            f2 += 90.0f;
        }
        float f3 = f2;
        if (f3 < 45.0f) {
            Canvas canvas2 = canvas;
            Bitmap bitmap = drawingCache;
            int i = top;
            int i2 = left;
            int i3 = width;
            int i4 = height;
            float f4 = cos;
            m22159a(canvas2, bitmap, i, i2, i3, i4, f4, f3 - 90.0f);
            m22159a(canvas2, bitmap, i, i2, i3, i4, f4, f3);
        } else {
            Canvas canvas3 = canvas;
            Bitmap bitmap2 = drawingCache;
            int i5 = top;
            int i6 = left;
            int i7 = width;
            int i8 = height;
            float f5 = cos;
            m22159a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3);
            m22159a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3 - 90.0f);
        }
        return false;
    }

    /* renamed from: a */
    private void m22159a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.f16625x == null) {
            this.f16625x = new Camera();
        }
        this.f16625x.save();
        this.f16625x.translate(0.0f, 0.0f, (float) i4);
        this.f16625x.rotateX(f2);
        float f3 = (float) (-i4);
        this.f16625x.translate(0.0f, 0.0f, f3);
        if (this.f16626y == null) {
            this.f16626y = new Matrix();
        }
        this.f16625x.getMatrix(this.f16626y);
        this.f16625x.restore();
        this.f16626y.preTranslate((float) (-i3), f3);
        this.f16626y.postScale(f, f);
        this.f16626y.postTranslate((float) (i2 + i3), (float) (i + i4));
        if (this.f16627z == null) {
            this.f16627z = new Paint();
            this.f16627z.setAntiAlias(true);
            this.f16627z.setFilterBitmap(true);
        }
        this.f16627z.setColorFilter(m22157a(f2));
        canvas.drawBitmap(bitmap, this.f16626y, this.f16627z);
    }

    /* renamed from: a */
    private LightingColorFilter m22157a(float f) {
        double cos = Math.cos((3.141592653589793d * ((double) f)) / 180.0d);
        int i = 55 + ((int) (200.0d * cos));
        int pow = (int) (70.0d * Math.pow(cos, 200.0d));
        if (i > 255) {
            i = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        return new LightingColorFilter(Color.rgb(i, i, i), Color.rgb(pow, pow, pow));
    }

    /* renamed from: a */
    private void m22160a(MotionEvent motionEvent) {
        removeCallbacks(this.f16621t);
        this.f16603b = (int) motionEvent.getX();
        this.f16604c = (int) motionEvent.getY();
        this.f16605d = mo19033a(getChildAt(0)) - this.f16607f;
        m22175g();
        this.f16620s = VelocityTracker.obtain();
        this.f16620s.addMovement(motionEvent);
        this.f16602a = 1;
    }

    /* renamed from: b */
    private void m22163b(float f) {
        mo19035a(f, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19035a(float f, boolean z) {
        if (this.f16620s != null || z) {
            if (this.f16620s != null) {
                this.f16620s.recycle();
            }
            this.f16620s = null;
            removeCallbacks(this.f16623v);
            if (this.f16621t == null) {
                this.f16621t = new Runnable() {
                    public void run() {
                        if (C5161c.this.f16611j != null) {
                            View childAt = C5161c.this.getChildAt(0);
                            if (childAt != null) {
                                C5161c.this.f16605d = C5161c.this.mo19033a(childAt) - C5161c.this.f16607f;
                                C5161c.this.f16611j.mo18966a(AnimationUtils.currentAnimationTimeMillis());
                                C5161c.this.mo19036a(((int) C5161c.this.f16611j.mo18961a()) - C5161c.this.f16605d);
                            }
                            if (!C5161c.this.f16611j.mo18967a(0.5f, 0.4f)) {
                                C5161c.this.postDelayed(this, 16);
                            }
                        }
                    }
                };
            }
            if (this.f16611j != null) {
                if (!z) {
                    this.f16611j.mo18964a((float) this.f16606e, f, AnimationUtils.currentAnimationTimeMillis());
                }
                post(this.f16621t);
            }
            this.f16602a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f16621t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19036a(int i) {
        this.f16606e = this.f16605d + i;
        this.f16608g = (-(270 * this.f16606e)) / getHeight();
        m22174f();
        requestLayout();
    }

    /* renamed from: f */
    private void m22174f() {
        int i;
        int i2 = this.f16608g % 90;
        if (i2 < 45) {
            i = ((-(this.f16608g - i2)) * getHeight()) / 270;
        } else {
            i = ((-((this.f16608g + 90) - i2)) * getHeight()) / 270;
        }
        if (this.f16598A == Integer.MIN_VALUE && this.f16610i == this.f16619r.getCount() - 1 && m22166c(getChildAt(getChildCount() - 1)) < getHeight()) {
            this.f16598A = i;
        }
        if (i > 0) {
            i = 0;
        } else if (i < this.f16598A) {
            i = this.f16598A;
        }
        float f = (float) i;
        this.f16611j.mo18963a(f);
        this.f16611j.mo18969b(f);
    }

    /* renamed from: g */
    private void m22175g() {
        if (this.f16623v == null) {
            this.f16623v = new Runnable() {
                public void run() {
                    if (C5161c.this.f16602a == 1) {
                        int a = C5161c.this.mo19032a(C5161c.this.f16603b, C5161c.this.f16604c);
                        if (a != -1) {
                            C5161c.this.mo19037b(a);
                        }
                    }
                }
            };
        }
        postDelayed(this.f16623v, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: b */
    private boolean m22165b(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (x >= this.f16603b - 10 && x <= this.f16603b + 10 && y >= this.f16604c - 10 && y <= this.f16604c + 10) {
            return false;
        }
        removeCallbacks(this.f16623v);
        this.f16602a = 2;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo19032a(int i, int i2) {
        if (this.f16624w == null) {
            this.f16624w = new Rect();
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHitRect(this.f16624w);
            if (this.f16624w.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m22164b(int i, int i2) {
        int a = mo19032a(i, i2);
        if (a != -1) {
            int i3 = this.f16609h + a;
            performItemClick(getChildAt(a), i3, this.f16619r.getItemId(i3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19037b(int i) {
        View childAt = getChildAt(i);
        int i2 = this.f16609h + i;
        long itemId = this.f16619r.getItemId(i2);
        OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i2, itemId);
        }
    }

    /* renamed from: c */
    private void m22167c(int i) {
        int childCount = getChildCount();
        if (this.f16610i != this.f16619r.getCount() - 1 && childCount > 1) {
            View childAt = getChildAt(0);
            while (childAt != null && m22166c(childAt) + i < 0) {
                removeViewInLayout(childAt);
                childCount--;
                this.f16622u.addLast(childAt);
                this.f16609h++;
                this.f16607f += m22169d(childAt);
                childAt = childCount > 1 ? getChildAt(0) : null;
            }
        }
        if (this.f16609h != 0 && childCount > 1) {
            View childAt2 = getChildAt(childCount - 1);
            while (childAt2 != null && mo19033a(childAt2) + i > getHeight()) {
                removeViewInLayout(childAt2);
                childCount--;
                this.f16622u.addLast(childAt2);
                this.f16610i--;
                childAt2 = childCount > 1 ? getChildAt(childCount - 1) : null;
            }
        }
    }

    /* renamed from: d */
    private void m22170d(int i) {
        m22168c(m22166c(getChildAt(getChildCount() - 1)), i);
        m22171d(mo19033a(getChildAt(0)), i);
    }

    /* renamed from: c */
    private void m22168c(int i, int i2) {
        while (i + i2 < getHeight() && this.f16610i < this.f16619r.getCount() - 1) {
            this.f16610i++;
            View view = this.f16619r.getView(this.f16610i, getCachedView(), this);
            m22161a(view, 0);
            i += m22169d(view);
        }
    }

    /* renamed from: d */
    private void m22171d(int i, int i2) {
        while (i + i2 > 0 && this.f16609h > 0) {
            this.f16609h--;
            View view = this.f16619r.getView(this.f16609h, getCachedView(), this);
            m22161a(view, 1);
            int d = m22169d(view);
            i -= d;
            this.f16607f -= d;
        }
    }

    /* renamed from: a */
    private void m22161a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -2);
        }
        int i2 = i == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i2, layoutParams, true);
        view.measure(((int) (((float) getWidth()) * 0.85f)) | 1073741824, 0);
    }

    /* renamed from: h */
    private void m22176h() {
        int i = this.f16606e + this.f16607f;
        float width = ((float) getWidth()) * 0.0f;
        float height = 1.0f / (((float) getHeight()) * 0.9f);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int sin = (int) (((double) width) * Math.sin(6.283185307179586d * ((double) height) * ((double) i)));
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int width2 = sin + ((getWidth() - measuredWidth) / 2);
            int b = m22162b(childAt);
            int i3 = i + b;
            childAt.layout(width2, i3, measuredWidth + width2, i3 + measuredHeight);
            i += measuredHeight + (2 * b);
        }
    }

    private View getCachedView() {
        if (this.f16622u.size() != 0) {
            return (View) this.f16622u.removeFirst();
        }
        return null;
    }

    /* renamed from: b */
    private int m22162b(View view) {
        return (int) ((((float) view.getMeasuredHeight()) * 0.35000002f) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo19033a(View view) {
        return view.getTop() - m22162b(view);
    }

    /* renamed from: c */
    private int m22166c(View view) {
        return view.getBottom() + m22162b(view);
    }

    /* renamed from: d */
    private int m22169d(View view) {
        return view.getMeasuredHeight() + (2 * m22162b(view));
    }

    public int getFirstItemPosition() {
        return this.f16609h;
    }

    public int getLastItemPosition() {
        return this.f16610i;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }
}
