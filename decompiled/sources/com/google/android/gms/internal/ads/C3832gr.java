package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.p137b.C3238b;

/* renamed from: com.google.android.gms.internal.ads.gr */
final class C3832gr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bcd f13164a;

    /* renamed from: b */
    private final /* synthetic */ zzjj f13165b;

    /* renamed from: c */
    private final /* synthetic */ C3838gx f13166c;

    /* renamed from: d */
    private final /* synthetic */ C3830gp f13167d;

    C3832gr(C3830gp gpVar, bcd bcd, zzjj zzjj, C3838gx gxVar) {
        this.f13167d = gpVar;
        this.f13164a = bcd;
        this.f13165b = zzjj;
        this.f13166c = gxVar;
    }

    public final void run() {
        try {
            this.f13164a.mo15087a(C3238b.m11573a(this.f13167d.f13149c), this.f13165b, (String) null, (C3847hf) this.f13166c, this.f13167d.f13153g);
        } catch (RemoteException e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f13167d.f13147a);
            C3900je.m17432c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f13167d.mo15328a(this.f13167d.f13147a, 0);
        }
    }
}
