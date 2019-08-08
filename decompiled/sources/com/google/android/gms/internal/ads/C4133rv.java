package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.rv */
final class C4133rv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f13980a;

    /* renamed from: b */
    private final /* synthetic */ C3862hu f13981b;

    /* renamed from: c */
    private final /* synthetic */ int f13982c;

    /* renamed from: d */
    private final /* synthetic */ C4131rt f13983d;

    C4133rv(C4131rt rtVar, View view, C3862hu huVar, int i) {
        this.f13983d = rtVar;
        this.f13980a = view;
        this.f13981b = huVar;
        this.f13982c = i;
    }

    public final void run() {
        this.f13983d.m17985a(this.f13980a, this.f13981b, this.f13982c - 1);
    }
}
