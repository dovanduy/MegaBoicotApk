package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bo */
final class C3693bo implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f12753a;

    /* renamed from: b */
    private final /* synthetic */ C3687bi f12754b;

    C3693bo(C3687bi biVar, WeakReference weakReference) {
        this.f12754b = biVar;
        this.f12753a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f12754b.m16435a(this.f12753a, false);
    }
}
