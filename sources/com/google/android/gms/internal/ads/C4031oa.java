package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.oa */
abstract class C4031oa {

    /* renamed from: a */
    private final WeakReference<View> f13638a;

    public C4031oa(View view) {
        this.f13638a = new WeakReference<>(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m17500c() {
        View view = (View) this.f13638a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: a */
    public final void mo15699a() {
        ViewTreeObserver c = m17500c();
        if (c != null) {
            mo15695a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15695a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void mo15700b() {
        ViewTreeObserver c = m17500c();
        if (c != null) {
            mo15696b(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15696b(ViewTreeObserver viewTreeObserver);
}
