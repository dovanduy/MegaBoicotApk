package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ci */
final class C4804ci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15613a;

    /* renamed from: b */
    private final /* synthetic */ String f15614b;

    /* renamed from: c */
    private final /* synthetic */ String f15615c;

    /* renamed from: d */
    private final /* synthetic */ String f15616d;

    /* renamed from: e */
    private final /* synthetic */ C4798cc f15617e;

    C4804ci(C4798cc ccVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f15617e = ccVar;
        this.f15613a = atomicReference;
        this.f15614b = str;
        this.f15615c = str2;
        this.f15616d = str3;
    }

    public final void run() {
        this.f15617e.f15564q.mo17257x().mo17369a(this.f15613a, this.f15614b, this.f15615c, this.f15616d);
    }
}
