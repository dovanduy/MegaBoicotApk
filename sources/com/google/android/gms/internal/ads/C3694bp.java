package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bp */
final class C3694bp implements OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f12755a;

    /* renamed from: b */
    private final /* synthetic */ C3687bi f12756b;

    C3694bp(C3687bi biVar, WeakReference weakReference) {
        this.f12756b = biVar;
        this.f12755a = weakReference;
    }

    public final void onScrollChanged() {
        this.f12756b.m16435a(this.f12755a, true);
    }
}
