package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cf */
final class C4801cf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f15604a;

    /* renamed from: b */
    private final /* synthetic */ String f15605b;

    /* renamed from: c */
    private final /* synthetic */ Object f15606c;

    /* renamed from: d */
    private final /* synthetic */ long f15607d;

    /* renamed from: e */
    private final /* synthetic */ C4798cc f15608e;

    C4801cf(C4798cc ccVar, String str, String str2, Object obj, long j) {
        this.f15608e = ccVar;
        this.f15604a = str;
        this.f15605b = str2;
        this.f15606c = obj;
        this.f15607d = j;
    }

    public final void run() {
        this.f15608e.mo17320a(this.f15604a, this.f15605b, this.f15606c, this.f15607d);
    }
}
