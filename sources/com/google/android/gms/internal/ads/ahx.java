package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class ahx implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final Handler f11105a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f11106b;

    /* renamed from: c */
    private Application f11107c;

    /* renamed from: d */
    private final PowerManager f11108d;

    /* renamed from: e */
    private final KeyguardManager f11109e;

    /* renamed from: f */
    private final ahn f11110f;

    /* renamed from: g */
    private BroadcastReceiver f11111g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f11112h;

    /* renamed from: i */
    private WeakReference<View> f11113i;

    /* renamed from: j */
    private ahb f11114j;

    /* renamed from: k */
    private boolean f11115k = false;

    /* renamed from: l */
    private int f11116l = -1;

    /* renamed from: m */
    private long f11117m = -3;

    public ahx(ahn ahn, View view) {
        this.f11110f = ahn;
        this.f11106b = ahn.f11057a;
        this.f11108d = (PowerManager) this.f11106b.getSystemService("power");
        this.f11109e = (KeyguardManager) this.f11106b.getSystemService("keyguard");
        if (this.f11106b instanceof Application) {
            this.f11107c = (Application) this.f11106b;
            this.f11114j = new ahb((Application) this.f11106b, this);
        }
        mo14327a(view);
    }

    /* renamed from: a */
    private final void m14167a(Activity activity, int i) {
        if (this.f11113i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f11113i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f11116l = i;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m14169b() {
        f11105a.post(new ahy(this));
    }

    /* renamed from: b */
    private final void m14170b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f11112h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f11111g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f11111g = new ahz(this);
            this.f11106b.registerReceiver(this.f11111g, intentFilter);
        }
        if (this.f11107c != null) {
            try {
                this.f11107c.registerActivityLifecycleCallbacks(this.f11114j);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14171c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f11113i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f11113i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0017
            r2 = -3
            r9.f11117m = r2
            r9.f11115k = r1
            return
        L_0x0017:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.ahn r4 = r9.f11110f
            boolean r4 = r4.mo14314j()
            r5 = 1
            if (r4 != 0) goto L_0x005d
            android.app.KeyguardManager r4 = r9.f11109e
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x005b
            android.app.Activity r4 = com.google.android.gms.internal.ads.ahv.m14159a(r0)
            if (r4 == 0) goto L_0x0057
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0048
            r4 = 0
            goto L_0x004c
        L_0x0048:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0057
            r4 = r5
            goto L_0x0058
        L_0x0057:
            r4 = r1
        L_0x0058:
            if (r4 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r4 = r1
            goto L_0x005e
        L_0x005d:
            r4 = r5
        L_0x005e:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.f11116l
            r8 = -1
            if (r7 == r8) goto L_0x0069
            int r6 = r9.f11116l
        L_0x0069:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0086
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0086
            android.os.PowerManager r0 = r9.f11108d
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            r1 = r5
        L_0x0086:
            boolean r0 = r9.f11115k
            if (r0 == r1) goto L_0x0097
            if (r1 == 0) goto L_0x0091
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0093
        L_0x0091:
            r2 = -2
        L_0x0093:
            r9.f11117m = r2
            r9.f11115k = r1
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahx.m14171c():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14172c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f11112h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f11112h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f11112h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f11111g
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.f11106b     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.f11111g     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f11111g = r0
        L_0x003a:
            android.app.Application r4 = r3.f11107c
            if (r4 == 0) goto L_0x0045
            android.app.Application r4 = r3.f11107c     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.ads.ahb r0 = r3.f11114j     // Catch:{ Exception -> 0x0045 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahx.m14172c(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo14326a() {
        if (this.f11117m == -2 && this.f11113i.get() == null) {
            this.f11117m = -3;
        }
        return this.f11117m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14327a(View view) {
        long j;
        View view2 = this.f11113i != null ? (View) this.f11113i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m14172c(view2);
        }
        this.f11113i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m14170b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f11117m = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m14167a(activity, 0);
        m14171c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m14171c();
    }

    public final void onActivityPaused(Activity activity) {
        m14167a(activity, 4);
        m14171c();
    }

    public final void onActivityResumed(Activity activity) {
        m14167a(activity, 0);
        m14171c();
        m14169b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m14171c();
    }

    public final void onActivityStarted(Activity activity) {
        m14167a(activity, 0);
        m14171c();
    }

    public final void onActivityStopped(Activity activity) {
        m14171c();
    }

    public final void onGlobalLayout() {
        m14171c();
    }

    public final void onScrollChanged() {
        m14171c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f11116l = -1;
        m14170b(view);
        m14171c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f11116l = -1;
        m14171c();
        m14169b();
        m14172c(view);
    }
}
