package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ba */
final class C4769ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f15509a;

    /* renamed from: b */
    private final /* synthetic */ long f15510b;

    /* renamed from: c */
    private final /* synthetic */ C4741a f15511c;

    C4769ba(C4741a aVar, String str, long j) {
        this.f15511c = aVar;
        this.f15509a = str;
        this.f15510b = j;
    }

    public final void run() {
        this.f15511c.m20338d(this.f15509a, this.f15510b);
    }
}
