package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cs */
final class C4814cs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4810co f15641a;

    /* renamed from: b */
    private final /* synthetic */ C4811cp f15642b;

    C4814cs(C4811cp cpVar, C4810co coVar) {
        this.f15642b = cpVar;
        this.f15641a = coVar;
    }

    public final void run() {
        this.f15642b.m20650a(this.f15641a, false);
        this.f15642b.f15631a = null;
        this.f15642b.mo17148h().mo17362a((C4810co) null);
    }
}
