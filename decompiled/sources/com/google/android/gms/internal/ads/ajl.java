package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class ajl implements akv {

    /* renamed from: a */
    private WeakReference<atk> f11213a;

    public ajl(atk atk) {
        this.f11213a = new WeakReference<>(atk);
    }

    /* renamed from: a */
    public final View mo14400a() {
        atk atk = (atk) this.f11213a.get();
        if (atk != null) {
            return atk.mo14858l();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo14401b() {
        return this.f11213a.get() == null;
    }

    /* renamed from: c */
    public final akv mo14402c() {
        return new ajn((atk) this.f11213a.get());
    }
}
