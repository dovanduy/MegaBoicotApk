package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.ae */
final class C4967ae implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f16184a;

    /* renamed from: b */
    private final /* synthetic */ Intent f16185b;

    /* renamed from: c */
    private final /* synthetic */ zzb f16186c;

    C4967ae(zzb zzb, Intent intent, Intent intent2) {
        this.f16186c = zzb;
        this.f16184a = intent;
        this.f16185b = intent2;
    }

    public final void run() {
        this.f16186c.mo17903b(this.f16184a);
        this.f16186c.m21757d(this.f16185b);
    }
}
