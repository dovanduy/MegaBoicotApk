package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.p017v4.content.C0338a;
import android.util.Log;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.internal.C3375l;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C3214f extends C0338a<Void> implements C3375l {

    /* renamed from: f */
    private Semaphore f9418f = new Semaphore(0);

    /* renamed from: g */
    private Set<C3266f> f9419g;

    public C3214f(Context context, Set<C3266f> set) {
        super(context);
        this.f9419g = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final Void mo1187d() {
        int i = 0;
        for (C3266f a : this.f9419g) {
            if (a.mo13133a((C3375l) this)) {
                i++;
            }
        }
        try {
            this.f9418f.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo1223i() {
        this.f9418f.drainPermits();
        mo1237s();
    }

    /* renamed from: h */
    public final void mo13013h() {
        this.f9418f.release();
    }
}
