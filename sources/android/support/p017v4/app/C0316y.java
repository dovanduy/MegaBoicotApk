package android.support.p017v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.y */
/* compiled from: OneShotPreDrawListener */
class C0316y implements OnAttachStateChangeListener, OnPreDrawListener {

    /* renamed from: a */
    private final View f784a;

    /* renamed from: b */
    private ViewTreeObserver f785b;

    /* renamed from: c */
    private final Runnable f786c;

    private C0316y(View view, Runnable runnable) {
        this.f784a = view;
        this.f785b = view.getViewTreeObserver();
        this.f786c = runnable;
    }

    /* renamed from: a */
    public static C0316y m1167a(View view, Runnable runnable) {
        C0316y yVar = new C0316y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yVar);
        view.addOnAttachStateChangeListener(yVar);
        return yVar;
    }

    public boolean onPreDraw() {
        mo1105a();
        this.f786c.run();
        return true;
    }

    /* renamed from: a */
    public void mo1105a() {
        if (this.f785b.isAlive()) {
            this.f785b.removeOnPreDrawListener(this);
        } else {
            this.f784a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f784a.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        this.f785b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1105a();
    }
}
