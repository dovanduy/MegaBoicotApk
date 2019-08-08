package com.facebook.ads.internal.view;

import android.content.Context;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.widget.C0667s;
import android.support.p017v4.widget.C0667s.C0670a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.component.p102a.C2018l;

/* renamed from: com.facebook.ads.internal.view.u */
public class C2289u extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2018l f7220a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0667s f7221b = C0667s.m2640a((ViewGroup) this, 1.0f, (C0670a) new C2292b());

    /* renamed from: c */
    private C2291a f7222c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f7223d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f7224e = 0;

    /* renamed from: f */
    private int f7225f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f7226g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f7227h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f7228i;

    /* renamed from: com.facebook.ads.internal.view.u$a */
    public interface C2291a {
        /* renamed from: a */
        void mo8634a();

        /* renamed from: b */
        void mo8635b();
    }

    /* renamed from: com.facebook.ads.internal.view.u$b */
    private class C2292b extends C0670a {
        private C2292b() {
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int paddingTop = C2289u.this.getPaddingTop();
            return Math.min(Math.max(i, paddingTop), C2289u.this.f7226g);
        }

        public int getViewVerticalDragRange(View view) {
            return C2289u.this.f7226g;
        }

        public void onViewDragStateChanged(int i) {
            if (i != C2289u.this.f7224e) {
                if (i == 0 && (C2289u.this.f7224e == 1 || C2289u.this.f7224e == 2)) {
                    if (C2289u.this.f7227h == C2289u.this.f7228i) {
                        C2289u.m8985d(C2289u.this);
                    } else if (C2289u.this.f7227h == C2289u.this.f7226g) {
                        C2289u.this.m8984d();
                    }
                }
                C2289u.this.f7224e = i;
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            C2289u.this.f7227h = i2;
        }

        public void onViewReleased(View view, float f, float f2) {
            if (C2289u.this.f7227h == C2289u.this.f7228i) {
                C2289u.this.f7223d = false;
                return;
            }
            boolean z = true;
            if (C2289u.this.f7227h == C2289u.this.f7226g) {
                C2289u.this.f7223d = true;
                return;
            }
            double d = (double) f2;
            if (d <= 800.0d) {
                if (d >= -800.0d) {
                    if (C2289u.this.f7227h <= C2289u.this.f7226g / 2) {
                        int b = C2289u.this.f7227h;
                        int e = C2289u.this.f7226g / 2;
                    }
                }
                z = false;
            }
            if (C2289u.this.f7221b.mo2549a(0, z ? C2289u.this.f7226g : C2289u.this.f7228i)) {
                C0595r.m2252d(C2289u.this);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            return view == C2289u.this.f7220a;
        }
    }

    public C2289u(Context context, C2018l lVar, int i, int i2) {
        super(context);
        this.f7220a = lVar;
        this.f7228i = i2;
        this.f7220a.setLayoutParams(new LayoutParams(-1, -1));
        this.f7226g = i;
        this.f7227h = this.f7226g;
        this.f7220a.offsetTopAndBottom(this.f7226g);
        this.f7225f = this.f7226g;
        addView(this.f7220a);
        setBackgroundColor(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m8984d() {
        this.f7223d = true;
        if (this.f7222c != null) {
            this.f7222c.mo8634a();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m8985d(C2289u uVar) {
        uVar.f7223d = false;
        if (uVar.f7222c != null) {
            uVar.f7222c.mo8635b();
        }
    }

    /* renamed from: a */
    public void mo8677a() {
        this.f7220a.offsetTopAndBottom(this.f7226g);
        this.f7225f = this.f7226g;
        m8984d();
    }

    /* renamed from: b */
    public void mo8678b() {
        this.f7220a.offsetTopAndBottom(this.f7228i);
        this.f7225f = this.f7228i;
    }

    /* renamed from: c */
    public boolean mo8679c() {
        return this.f7223d;
    }

    public void computeScroll() {
        if (this.f7221b.mo2552a(true)) {
            C0595r.m2252d(this);
        } else {
            this.f7225f = this.f7220a.getTop();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7223d && this.f7221b.mo2558b((View) this.f7220a, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f7220a.getScrollY() == 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7220a.offsetTopAndBottom(this.f7225f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f7220a.mo8197a(motionEvent);
        if (!this.f7221b.mo2558b((View) this.f7220a, x, y)) {
            return super.onTouchEvent(motionEvent);
        }
        this.f7221b.mo2554b(motionEvent);
        return true;
    }

    public void setDragListener(C2291a aVar) {
        this.f7222c = aVar;
    }

    public void setDragRange(int i) {
        this.f7226g = i;
        this.f7221b.mo2551a((View) this.f7220a, 0, this.f7226g);
    }
}
