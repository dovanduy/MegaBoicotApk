package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class axc extends aox {

    /* renamed from: a */
    private final /* synthetic */ axb f12345a;

    axc(axb axb) {
        this.f12345a = axb;
    }

    /* renamed from: a */
    public final void mo14529a() throws RemoteException {
        this.f12345a.f12344a.add(new axd(this));
    }

    /* renamed from: a */
    public final void mo14530a(int i) throws RemoteException {
        this.f12345a.f12344a.add(new axe(this, i));
        C3900je.m17043a("Pooled interstitial failed to load.");
    }

    /* renamed from: b */
    public final void mo14531b() throws RemoteException {
        this.f12345a.f12344a.add(new axf(this));
    }

    /* renamed from: c */
    public final void mo14532c() throws RemoteException {
        this.f12345a.f12344a.add(new axg(this));
        C3900je.m17043a("Pooled interstitial loaded.");
    }

    /* renamed from: d */
    public final void mo14533d() throws RemoteException {
        this.f12345a.f12344a.add(new axh(this));
    }

    /* renamed from: e */
    public final void mo14534e() throws RemoteException {
        this.f12345a.f12344a.add(new axk(this));
    }

    /* renamed from: f */
    public final void mo14535f() throws RemoteException {
        this.f12345a.f12344a.add(new axj(this));
    }
}
