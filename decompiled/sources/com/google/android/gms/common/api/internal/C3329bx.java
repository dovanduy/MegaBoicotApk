package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C3398r;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.bx */
final class C3329bx implements DeathRecipient, C3330by {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f9649a;

    /* renamed from: b */
    private final WeakReference<C3398r> f9650b;

    /* renamed from: c */
    private final WeakReference<IBinder> f9651c;

    private C3329bx(BasePendingResult<?> basePendingResult, C3398r rVar, IBinder iBinder) {
        this.f9650b = new WeakReference<>(rVar);
        this.f9649a = new WeakReference<>(basePendingResult);
        this.f9651c = new WeakReference<>(iBinder);
    }

    /* renamed from: a */
    public final void mo13263a(BasePendingResult<?> basePendingResult) {
        m11873a();
    }

    public final void binderDied() {
        m11873a();
    }

    /* renamed from: a */
    private final void m11873a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f9649a.get();
        C3398r rVar = (C3398r) this.f9650b.get();
        if (!(rVar == null || basePendingResult == null)) {
            rVar.mo13380a(basePendingResult.mo13158c().intValue());
        }
        IBinder iBinder = (IBinder) this.f9651c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ C3329bx(BasePendingResult basePendingResult, C3398r rVar, IBinder iBinder, C3328bw bwVar) {
        this(basePendingResult, null, iBinder);
    }
}
