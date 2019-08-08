package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.C3025aw;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ly */
public final class C3974ly {

    /* renamed from: a */
    private final View f13532a;

    /* renamed from: b */
    private Activity f13533b;

    /* renamed from: c */
    private boolean f13534c;

    /* renamed from: d */
    private boolean f13535d;

    /* renamed from: e */
    private boolean f13536e;

    /* renamed from: f */
    private OnGlobalLayoutListener f13537f;

    /* renamed from: g */
    private OnScrollChangedListener f13538g;

    public C3974ly(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f13533b = activity;
        this.f13532a = view;
        this.f13537f = onGlobalLayoutListener;
        this.f13538g = onScrollChangedListener;
    }

    /* renamed from: b */
    private static ViewTreeObserver m17361b(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: e */
    private final void m17362e() {
        if (!this.f13534c) {
            if (this.f13537f != null) {
                if (this.f13533b != null) {
                    Activity activity = this.f13533b;
                    OnGlobalLayoutListener onGlobalLayoutListener = this.f13537f;
                    ViewTreeObserver b = m17361b(activity);
                    if (b != null) {
                        b.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                C3025aw.m10907A();
                C4027nx.m17491a(this.f13532a, this.f13537f);
            }
            if (this.f13538g != null) {
                if (this.f13533b != null) {
                    Activity activity2 = this.f13533b;
                    OnScrollChangedListener onScrollChangedListener = this.f13538g;
                    ViewTreeObserver b2 = m17361b(activity2);
                    if (b2 != null) {
                        b2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                C3025aw.m10907A();
                C4027nx.m17492a(this.f13532a, this.f13538g);
            }
            this.f13534c = true;
        }
    }

    /* renamed from: f */
    private final void m17363f() {
        if (this.f13533b != null && this.f13534c) {
            if (this.f13537f != null) {
                Activity activity = this.f13533b;
                OnGlobalLayoutListener onGlobalLayoutListener = this.f13537f;
                ViewTreeObserver b = m17361b(activity);
                if (b != null) {
                    C3025aw.m10919g().mo15541a(b, onGlobalLayoutListener);
                }
            }
            if (this.f13538g != null) {
                Activity activity2 = this.f13533b;
                OnScrollChangedListener onScrollChangedListener = this.f13538g;
                ViewTreeObserver b2 = m17361b(activity2);
                if (b2 != null) {
                    b2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f13534c = false;
        }
    }

    /* renamed from: a */
    public final void mo15617a() {
        this.f13536e = true;
        if (this.f13535d) {
            m17362e();
        }
    }

    /* renamed from: a */
    public final void mo15618a(Activity activity) {
        this.f13533b = activity;
    }

    /* renamed from: b */
    public final void mo15619b() {
        this.f13536e = false;
        m17363f();
    }

    /* renamed from: c */
    public final void mo15620c() {
        this.f13535d = true;
        if (this.f13536e) {
            m17362e();
        }
    }

    /* renamed from: d */
    public final void mo15621d() {
        this.f13535d = false;
        m17363f();
    }
}
