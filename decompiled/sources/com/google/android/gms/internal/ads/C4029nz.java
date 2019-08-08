package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.nz */
final class C4029nz extends C4031oa implements OnScrollChangedListener {

    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f13637a;

    public C4029nz(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f13637a = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15695a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15696b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f13637a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo15700b();
        }
    }
}
