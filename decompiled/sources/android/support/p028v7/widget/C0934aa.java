package android.support.p028v7.widget;

import android.os.SystemClock;
import android.support.p028v7.view.menu.C0812s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.aa */
/* compiled from: ForwardingListener */
public abstract class C0934aa implements OnAttachStateChangeListener, OnTouchListener {

    /* renamed from: a */
    private final float f3071a;

    /* renamed from: b */
    private final int f3072b;

    /* renamed from: c */
    final View f3073c;

    /* renamed from: d */
    private final int f3074d;

    /* renamed from: e */
    private Runnable f3075e;

    /* renamed from: f */
    private Runnable f3076f;

    /* renamed from: g */
    private boolean f3077g;

    /* renamed from: h */
    private int f3078h;

    /* renamed from: i */
    private final int[] f3079i = new int[2];

    /* renamed from: android.support.v7.widget.aa$a */
    /* compiled from: ForwardingListener */
    private class C0935a implements Runnable {
        C0935a() {
        }

        public void run() {
            ViewParent parent = C0934aa.this.f3073c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    /* compiled from: ForwardingListener */
    private class C0936b implements Runnable {
        C0936b() {
        }

        public void run() {
            C0934aa.this.mo4863d();
        }
    }

    /* renamed from: a */
    public abstract C0812s mo3036a();

    public void onViewAttachedToWindow(View view) {
    }

    public C0934aa(View view) {
        this.f3073c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3071a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3072b = ViewConfiguration.getTapTimeout();
        this.f3074d = (this.f3072b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3077g;
        if (z2) {
            z = m4139b(motionEvent) || !mo3530c();
        } else {
            z = m4136a(motionEvent) && mo3037b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3073c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3077g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3077g = false;
        this.f3078h = -1;
        if (this.f3075e != null) {
            this.f3073c.removeCallbacks(this.f3075e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo3037b() {
        C0812s a = mo3036a();
        if (a != null && !a.mo3124d()) {
            a.mo3114a();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3530c() {
        C0812s a = mo3036a();
        if (a != null && a.mo3124d()) {
            a.mo3121c();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m4136a(MotionEvent motionEvent) {
        View view = this.f3073c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3078h = motionEvent.getPointerId(0);
                if (this.f3075e == null) {
                    this.f3075e = new C0935a();
                }
                view.postDelayed(this.f3075e, (long) this.f3072b);
                if (this.f3076f == null) {
                    this.f3076f = new C0936b();
                }
                view.postDelayed(this.f3076f, (long) this.f3074d);
                break;
            case 1:
            case 3:
                m4141e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3078h);
                if (findPointerIndex >= 0 && !m4137a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f3071a)) {
                    m4141e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
        }
        return false;
    }

    /* renamed from: e */
    private void m4141e() {
        if (this.f3076f != null) {
            this.f3073c.removeCallbacks(this.f3076f);
        }
        if (this.f3075e != null) {
            this.f3073c.removeCallbacks(this.f3075e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4863d() {
        m4141e();
        View view = this.f3073c;
        if (view.isEnabled() && !view.isLongClickable() && mo3037b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3077g = true;
        }
    }

    /* renamed from: b */
    private boolean m4139b(MotionEvent motionEvent) {
        View view = this.f3073c;
        C0812s a = mo3036a();
        if (a == null || !a.mo3124d()) {
            return false;
        }
        C1044x xVar = (C1044x) a.mo3125e();
        if (xVar == null || !xVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m4140b(view, obtainNoHistory);
        m4138a(xVar, obtainNoHistory);
        boolean a2 = xVar.mo4898a(obtainNoHistory, this.f3078h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!a2 || !z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m4137a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m4138a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3079i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m4140b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3079i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }
}
