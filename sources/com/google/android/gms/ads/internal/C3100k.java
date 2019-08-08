package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.k */
final class C3100k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f9032a;

    /* renamed from: b */
    private final /* synthetic */ int f9033b;

    /* renamed from: c */
    private final /* synthetic */ C3098i f9034c;

    C3100k(C3098i iVar, zzjj zzjj, int i) {
        this.f9034c = iVar;
        this.f9032a = zzjj;
        this.f9033b = i;
    }

    public final void run() {
        synchronized (this.f9034c.f9029s) {
            this.f9034c.m11118b(this.f9032a, this.f9033b);
        }
    }
}
