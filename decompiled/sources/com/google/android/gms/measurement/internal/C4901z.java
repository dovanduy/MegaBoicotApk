package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z */
final class C4901z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f15987a;

    /* renamed from: b */
    private final /* synthetic */ long f15988b;

    /* renamed from: c */
    private final /* synthetic */ C4741a f15989c;

    C4901z(C4741a aVar, String str, long j) {
        this.f15989c = aVar;
        this.f15987a = str;
        this.f15988b = j;
    }

    public final void run() {
        this.f15989c.m20337c(this.f15987a, this.f15988b);
    }
}
