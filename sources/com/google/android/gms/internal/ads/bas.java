package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
public final class bas {

    /* renamed from: a */
    private final Object f12517a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private baz f12518b;

    /* renamed from: a */
    public final baz mo15045a(Context context, zzang zzang) {
        baz baz;
        synchronized (this.f12517a) {
            if (this.f12518b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f12518b = new baz(context, zzang, (String) aoq.m14620f().mo14695a(aru.f11775a));
            }
            baz = this.f12518b;
        }
        return baz;
    }
}
