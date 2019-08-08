package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.C3025aw;
import java.lang.ref.WeakReference;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ny */
final class C4028ny extends C4031oa implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f13636a;

    public C4028ny(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f13636a = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15695a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15696b(ViewTreeObserver viewTreeObserver) {
        C3025aw.m10919g().mo15541a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f13636a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo15700b();
        }
    }
}
