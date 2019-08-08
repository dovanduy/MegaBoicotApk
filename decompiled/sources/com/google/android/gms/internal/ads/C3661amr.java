package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.amr */
public final class C3661amr implements C3678b {

    /* renamed from: a */
    private final Executor f11442a;

    public C3661amr(Handler handler) {
        this.f11442a = new ans(this, handler);
    }

    /* renamed from: a */
    public final void mo14523a(avm<?> avm, bbm<?> bbm) {
        mo14524a(avm, bbm, null);
    }

    /* renamed from: a */
    public final void mo14524a(avm<?> avm, bbm<?> bbm, Runnable runnable) {
        avm.mo14910k();
        avm.mo14899b("post-response");
        this.f11442a.execute(new aoo(this, avm, bbm, runnable));
    }

    /* renamed from: a */
    public final void mo14525a(avm<?> avm, C3738df dfVar) {
        avm.mo14899b("post-error");
        this.f11442a.execute(new aoo(this, avm, bbm.m15926a(dfVar), null));
    }
}
