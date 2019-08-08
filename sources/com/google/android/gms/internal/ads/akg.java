package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3025aw;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@C3718cm
public final class akg implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final long f11253a = ((Long) aoq.m14620f().mo14695a(aru.f11868bn)).longValue();

    /* renamed from: b */
    private final Context f11254b;

    /* renamed from: c */
    private Application f11255c;

    /* renamed from: d */
    private final WindowManager f11256d;

    /* renamed from: e */
    private final PowerManager f11257e;

    /* renamed from: f */
    private final KeyguardManager f11258f;

    /* renamed from: g */
    private BroadcastReceiver f11259g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f11260h;

    /* renamed from: i */
    private WeakReference<View> f11261i;

    /* renamed from: j */
    private akl f11262j;

    /* renamed from: k */
    private C3964lo f11263k = new C3964lo(f11253a);

    /* renamed from: l */
    private boolean f11264l = false;

    /* renamed from: m */
    private int f11265m = -1;

    /* renamed from: n */
    private final HashSet<akk> f11266n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f11267o;

    /* renamed from: p */
    private final Rect f11268p;

    public akg(Context context, View view) {
        this.f11254b = context.getApplicationContext();
        this.f11256d = (WindowManager) context.getSystemService("window");
        this.f11257e = (PowerManager) this.f11254b.getSystemService("power");
        this.f11258f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f11254b instanceof Application) {
            this.f11255c = (Application) this.f11254b;
            this.f11262j = new akl((Application) this.f11254b, this);
        }
        this.f11267o = context.getResources().getDisplayMetrics();
        this.f11268p = new Rect();
        this.f11268p.right = this.f11256d.getDefaultDisplay().getWidth();
        this.f11268p.bottom = this.f11256d.getDefaultDisplay().getHeight();
        View view2 = this.f11261i != null ? (View) this.f11261i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m14322b(view2);
        }
        this.f11261i = new WeakReference<>(view);
        if (view != null) {
            if (C3025aw.m10919g().mo15544a(view)) {
                m14318a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    private final Rect m14315a(Rect rect) {
        return new Rect(m14320b(rect.left), m14320b(rect.top), m14320b(rect.right), m14320b(rect.bottom));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14316a(int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        if (this.f11266n.size() != 0 && this.f11261i != null) {
            View view = (View) this.f11261i.get();
            boolean z3 = false;
            boolean z4 = i2 == 1;
            boolean z5 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    C3900je.m17430b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f11265m != -1) {
                windowVisibility = this.f11265m;
            }
            boolean z6 = !z5 && C3025aw.m10917e().mo15520a(view, this.f11257e, this.f11258f) && z2 && z && windowVisibility == 0;
            if (z4 && !this.f11263k.mo15608a() && z6 == this.f11264l) {
                return;
            }
            if (z6 || this.f11264l || i2 != 1) {
                long b = C3025aw.m10924l().mo13695b();
                boolean isScreenOn = this.f11257e.isScreenOn();
                if (view != null) {
                    z3 = C3025aw.m10919g().mo15544a(view);
                }
                akj akj = new akj(b, isScreenOn, z3, view != null ? view.getWindowVisibility() : 8, m14315a(this.f11268p), m14315a(rect), m14315a(rect2), z2, m14315a(rect3), z, m14315a(rect4), this.f11267o.density, z6);
                Iterator it = this.f11266n.iterator();
                while (it.hasNext()) {
                    ((akk) it.next()).mo14431a(akj);
                }
                this.f11264l = z6;
            }
        }
    }

    /* renamed from: a */
    private final void m14317a(Activity activity, int i) {
        if (this.f11261i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f11261i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f11265m = i;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m14318a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f11260h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f11259g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f11259g = new aki(this);
            C3025aw.m10911E().mo15615a(this.f11254b, this.f11259g, intentFilter);
        }
        if (this.f11255c != null) {
            try {
                this.f11255c.registerActivityLifecycleCallbacks(this.f11262j);
            } catch (Exception e) {
                C3900je.m17430b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: b */
    private final int m14320b(int i) {
        return (int) (((float) i) / this.f11267o.density);
    }

    /* renamed from: b */
    private final void m14321b() {
        C3025aw.m10917e();
        C3909jn.f13411a.post(new akh(this));
    }

    /* renamed from: b */
    private final void m14322b(View view) {
        try {
            if (this.f11260h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f11260h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f11260h = null;
            }
        } catch (Exception e) {
            C3900je.m17430b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C3900je.m17430b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f11259g != null) {
            try {
                C3025aw.m10911E().mo15614a(this.f11254b, this.f11259g);
            } catch (IllegalStateException e3) {
                C3900je.m17430b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C3025aw.m10921i().mo15436a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f11259g = null;
        }
        if (this.f11255c != null) {
            try {
                this.f11255c.unregisterActivityLifecycleCallbacks(this.f11262j);
            } catch (Exception e5) {
                C3900je.m17430b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo14415a() {
        m14316a(4);
    }

    /* renamed from: a */
    public final void mo14416a(akk akk) {
        this.f11266n.add(akk);
        m14316a(3);
    }

    /* renamed from: b */
    public final void mo14417b(akk akk) {
        this.f11266n.remove(akk);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m14317a(activity, 0);
        m14316a(3);
        m14321b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m14316a(3);
        m14321b();
    }

    public final void onActivityPaused(Activity activity) {
        m14317a(activity, 4);
        m14316a(3);
        m14321b();
    }

    public final void onActivityResumed(Activity activity) {
        m14317a(activity, 0);
        m14316a(3);
        m14321b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m14316a(3);
        m14321b();
    }

    public final void onActivityStarted(Activity activity) {
        m14317a(activity, 0);
        m14316a(3);
        m14321b();
    }

    public final void onActivityStopped(Activity activity) {
        m14316a(3);
        m14321b();
    }

    public final void onGlobalLayout() {
        m14316a(2);
        m14321b();
    }

    public final void onScrollChanged() {
        m14316a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f11265m = -1;
        m14318a(view);
        m14316a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f11265m = -1;
        m14316a(3);
        m14321b();
        m14322b(view);
    }
}
