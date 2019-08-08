package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.j */
final class C3099j implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f9030a;

    /* renamed from: b */
    private final /* synthetic */ C3098i f9031b;

    C3099j(C3098i iVar, zzjj zzjj) {
        this.f9031b = iVar;
        this.f9030a = zzjj;
    }

    public final void run() {
        synchronized (this.f9031b.f9029s) {
            if (this.f9031b.m11120d()) {
                this.f9031b.m11117b(this.f9030a);
            } else {
                this.f9031b.m11118b(this.f9030a, 1);
            }
        }
    }
}
