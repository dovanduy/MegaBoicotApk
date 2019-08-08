package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jp */
final class C3911jp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f13422a;

    /* renamed from: b */
    private final /* synthetic */ C3909jn f13423b;

    C3911jp(C3909jn jnVar, Context context) {
        this.f13423b = jnVar;
        this.f13422a = context;
    }

    public final void run() {
        synchronized (this.f13423b.f13412b) {
            this.f13423b.f13414d = C3909jn.m17163d(this.f13422a);
            this.f13423b.f13412b.notifyAll();
        }
    }
}
