package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C4138s;
import com.google.android.gms.p137b.C3235a;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.r */
public final class C3122r extends C4138s {

    /* renamed from: a */
    private AdOverlayInfoParcel f9118a;

    /* renamed from: b */
    private Activity f9119b;

    /* renamed from: c */
    private boolean f9120c = false;

    /* renamed from: d */
    private boolean f9121d = false;

    public C3122r(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f9118a = adOverlayInfoParcel;
        this.f9119b = activity;
    }

    /* renamed from: a */
    private final synchronized void m11213a() {
        if (!this.f9121d) {
            if (this.f9118a.f9065c != null) {
                this.f9118a.f9065c.mo12557t_();
            }
            this.f9121d = true;
        }
    }

    /* renamed from: a */
    public final void mo12662a(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo12663a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.f9118a != null && !z) {
            if (bundle == null) {
                if (this.f9118a.f9064b != null) {
                    this.f9118a.f9064b.mo9646e();
                }
                if (!(this.f9119b.getIntent() == null || !this.f9119b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.f9118a.f9065c == null)) {
                    this.f9118a.f9065c.mo12556g();
                }
            }
            C3025aw.m10914b();
            if (!C3105a.m11174a((Context) this.f9119b, this.f9118a.f9063a, this.f9118a.f9071i)) {
                this.f9119b.finish();
            }
            return;
        }
        this.f9119b.finish();
    }

    /* renamed from: a */
    public final void mo12665a(C3235a aVar) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo12668b(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9120c);
    }

    /* renamed from: d */
    public final void mo12670d() throws RemoteException {
    }

    /* renamed from: e */
    public final boolean mo12671e() throws RemoteException {
        return false;
    }

    /* renamed from: f */
    public final void mo12672f() throws RemoteException {
    }

    /* renamed from: g */
    public final void mo12673g() throws RemoteException {
    }

    /* renamed from: h */
    public final void mo12674h() throws RemoteException {
        if (this.f9120c) {
            this.f9119b.finish();
            return;
        }
        this.f9120c = true;
        if (this.f9118a.f9065c != null) {
            this.f9118a.f9065c.mo12555f();
        }
    }

    /* renamed from: i */
    public final void mo12675i() throws RemoteException {
        if (this.f9118a.f9065c != null) {
            this.f9118a.f9065c.mo12554d();
        }
        if (this.f9119b.isFinishing()) {
            m11213a();
        }
    }

    /* renamed from: j */
    public final void mo12676j() throws RemoteException {
        if (this.f9119b.isFinishing()) {
            m11213a();
        }
    }

    /* renamed from: k */
    public final void mo12677k() throws RemoteException {
        if (this.f9119b.isFinishing()) {
            m11213a();
        }
    }

    /* renamed from: l */
    public final void mo12678l() throws RemoteException {
    }
}
