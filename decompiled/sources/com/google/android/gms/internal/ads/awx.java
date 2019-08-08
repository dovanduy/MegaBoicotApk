package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class awx implements Runnable {

    /* renamed from: a */
    private final aww f12330a;

    /* renamed from: b */
    private final awp f12331b;

    /* renamed from: c */
    private final C4019np f12332c;

    /* renamed from: d */
    private final zzsg f12333d;

    awx(aww aww, awp awp, C4019np npVar, zzsg zzsg) {
        this.f12330a = aww;
        this.f12331b = awp;
        this.f12332c = npVar;
        this.f12333d = zzsg;
    }

    public final void run() {
        aww aww = this.f12330a;
        awp awp = this.f12331b;
        C4019np npVar = this.f12332c;
        try {
            npVar.mo15686b(awp.mo13018e().mo14926a(this.f12333d));
        } catch (RemoteException e) {
            C3900je.m17430b("Unable to obtain a cache service instance.", e);
            npVar.mo15685a(e);
            aww.f12327a.m15618a();
        }
    }
}
