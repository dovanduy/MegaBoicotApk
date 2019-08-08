package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cj */
final class C4805cj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15618a;

    /* renamed from: b */
    private final /* synthetic */ String f15619b;

    /* renamed from: c */
    private final /* synthetic */ String f15620c;

    /* renamed from: d */
    private final /* synthetic */ String f15621d;

    /* renamed from: e */
    private final /* synthetic */ boolean f15622e;

    /* renamed from: f */
    private final /* synthetic */ C4798cc f15623f;

    C4805cj(C4798cc ccVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f15623f = ccVar;
        this.f15618a = atomicReference;
        this.f15619b = str;
        this.f15620c = str2;
        this.f15621d = str3;
        this.f15622e = z;
    }

    public final void run() {
        this.f15623f.f15564q.mo17257x().mo17370a(this.f15618a, this.f15619b, this.f15620c, this.f15621d, this.f15622e);
    }
}
