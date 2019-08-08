package android.support.p028v7.widget;

import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0599s;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.bb */
/* compiled from: TooltipCompatHandler */
class C0983bb implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {

    /* renamed from: j */
    private static C0983bb f3252j;

    /* renamed from: k */
    private static C0983bb f3253k;

    /* renamed from: a */
    private final View f3254a;

    /* renamed from: b */
    private final CharSequence f3255b;

    /* renamed from: c */
    private final int f3256c;

    /* renamed from: d */
    private final Runnable f3257d = new Runnable() {
        public void run() {
            C0983bb.this.mo5146a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f3258e = new Runnable() {
        public void run() {
            C0983bb.this.mo5145a();
        }
    };

    /* renamed from: f */
    private int f3259f;

    /* renamed from: g */
    private int f3260g;

    /* renamed from: h */
    private C0986bc f3261h;

    /* renamed from: i */
    private boolean f3262i;

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: a */
    public static void m4434a(View view, CharSequence charSequence) {
        if (f3252j != null && f3252j.f3254a == view) {
            m4433a((C0983bb) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f3253k != null && f3253k.f3254a == view) {
                f3253k.mo5145a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0983bb(view, charSequence);
    }

    private C0983bb(View view, CharSequence charSequence) {
        this.f3254a = view;
        this.f3255b = charSequence;
        this.f3256c = C0599s.m2287a(ViewConfiguration.get(this.f3254a.getContext()));
        m4438d();
        this.f3254a.setOnLongClickListener(this);
        this.f3254a.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.f3259f = view.getWidth() / 2;
        this.f3260g = view.getHeight() / 2;
        mo5146a(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3261h != null && this.f3262i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3254a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m4438d();
                mo5145a();
            }
        } else if (this.f3254a.isEnabled() && this.f3261h == null && m4435a(motionEvent)) {
            m4433a(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        mo5145a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5146a(boolean z) {
        long j;
        if (C0595r.m2276y(this.f3254a)) {
            m4433a((C0983bb) null);
            if (f3253k != null) {
                f3253k.mo5145a();
            }
            f3253k = this;
            this.f3262i = z;
            this.f3261h = new C0986bc(this.f3254a.getContext());
            this.f3261h.mo5154a(this.f3254a, this.f3259f, this.f3260g, this.f3262i, this.f3255b);
            this.f3254a.addOnAttachStateChangeListener(this);
            if (this.f3262i) {
                j = 2500;
            } else if ((C0595r.m2266o(this.f3254a) & 1) == 1) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3254a.removeCallbacks(this.f3258e);
            this.f3254a.postDelayed(this.f3258e, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5145a() {
        if (f3253k == this) {
            f3253k = null;
            if (this.f3261h != null) {
                this.f3261h.mo5153a();
                this.f3261h = null;
                m4438d();
                this.f3254a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3252j == this) {
            m4433a((C0983bb) null);
        }
        this.f3254a.removeCallbacks(this.f3258e);
    }

    /* renamed from: a */
    private static void m4433a(C0983bb bbVar) {
        if (f3252j != null) {
            f3252j.m4437c();
        }
        f3252j = bbVar;
        if (f3252j != null) {
            f3252j.m4436b();
        }
    }

    /* renamed from: b */
    private void m4436b() {
        this.f3254a.postDelayed(this.f3257d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m4437c() {
        this.f3254a.removeCallbacks(this.f3257d);
    }

    /* renamed from: a */
    private boolean m4435a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f3259f) <= this.f3256c && Math.abs(y - this.f3260g) <= this.f3256c) {
            return false;
        }
        this.f3259f = x;
        this.f3260g = y;
        return true;
    }

    /* renamed from: d */
    private void m4438d() {
        this.f3259f = Integer.MAX_VALUE;
        this.f3260g = Integer.MAX_VALUE;
    }
}
