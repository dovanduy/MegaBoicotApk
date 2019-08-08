package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mz */
final /* synthetic */ class C4002mz implements Runnable {

    /* renamed from: a */
    private final C4019np f13594a;

    /* renamed from: b */
    private final C4008ne f13595b;

    /* renamed from: c */
    private final Class f13596c;

    /* renamed from: d */
    private final C3991mo f13597d;

    /* renamed from: e */
    private final Executor f13598e;

    C4002mz(C4019np npVar, C4008ne neVar, Class cls, C3991mo moVar, Executor executor) {
        this.f13594a = npVar;
        this.f13595b = neVar;
        this.f13596c = cls;
        this.f13597d = moVar;
        this.f13598e = executor;
    }

    public final void run() {
        C3996mt.m17459a(this.f13594a, this.f13595b, this.f13596c, this.f13597d, this.f13598e);
    }
}
