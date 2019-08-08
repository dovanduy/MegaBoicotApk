package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.ce */
final class C4800ce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f15595a;

    /* renamed from: b */
    private final /* synthetic */ String f15596b;

    /* renamed from: c */
    private final /* synthetic */ long f15597c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f15598d;

    /* renamed from: e */
    private final /* synthetic */ boolean f15599e;

    /* renamed from: f */
    private final /* synthetic */ boolean f15600f;

    /* renamed from: g */
    private final /* synthetic */ boolean f15601g;

    /* renamed from: h */
    private final /* synthetic */ String f15602h;

    /* renamed from: i */
    private final /* synthetic */ C4798cc f15603i;

    C4800ce(C4798cc ccVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f15603i = ccVar;
        this.f15595a = str;
        this.f15596b = str2;
        this.f15597c = j;
        this.f15598d = bundle;
        this.f15599e = z;
        this.f15600f = z2;
        this.f15601g = z3;
        this.f15602h = str3;
    }

    public final void run() {
        this.f15603i.m20588a(this.f15595a, this.f15596b, this.f15597c, this.f15598d, this.f15599e, this.f15600f, this.f15601g, this.f15602h);
    }
}
