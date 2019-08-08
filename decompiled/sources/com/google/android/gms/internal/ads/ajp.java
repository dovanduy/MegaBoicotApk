package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class ajp implements akv {

    /* renamed from: a */
    private final WeakReference<View> f11218a;

    /* renamed from: b */
    private final WeakReference<C3878ij> f11219b;

    public ajp(View view, C3878ij ijVar) {
        this.f11218a = new WeakReference<>(view);
        this.f11219b = new WeakReference<>(ijVar);
    }

    /* renamed from: a */
    public final View mo14400a() {
        return (View) this.f11218a.get();
    }

    /* renamed from: b */
    public final boolean mo14401b() {
        return this.f11218a.get() == null || this.f11219b.get() == null;
    }

    /* renamed from: c */
    public final akv mo14402c() {
        return new ajo((View) this.f11218a.get(), (C3878ij) this.f11219b.get());
    }
}
