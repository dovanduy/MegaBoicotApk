package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qh */
final class C4092qh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f13846a;

    /* renamed from: b */
    private final /* synthetic */ C3862hu f13847b;

    /* renamed from: c */
    private final /* synthetic */ int f13848c;

    /* renamed from: d */
    private final /* synthetic */ C4090qf f13849d;

    C4092qh(C4090qf qfVar, View view, C3862hu huVar, int i) {
        this.f13849d = qfVar;
        this.f13846a = view;
        this.f13847b = huVar;
        this.f13848c = i;
    }

    public final void run() {
        this.f13849d.m17716a(this.f13846a, this.f13847b, this.f13848c - 1);
    }
}
