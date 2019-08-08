package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.br */
final class C4786br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f15559a;

    /* renamed from: b */
    private final /* synthetic */ String f15560b;

    /* renamed from: c */
    private final /* synthetic */ String f15561c;

    /* renamed from: d */
    private final /* synthetic */ long f15562d;

    /* renamed from: e */
    private final /* synthetic */ C4766ay f15563e;

    C4786br(C4766ay ayVar, String str, String str2, String str3, long j) {
        this.f15563e = ayVar;
        this.f15559a = str;
        this.f15560b = str2;
        this.f15561c = str3;
        this.f15562d = j;
    }

    public final void run() {
        if (this.f15559a == null) {
            this.f15563e.f15501a.mo17462p().mo17256w().mo17351a(this.f15560b, (C4810co) null);
            return;
        }
        this.f15563e.f15501a.mo17462p().mo17256w().mo17351a(this.f15560b, new C4810co(this.f15561c, this.f15559a, this.f15562d));
    }
}
