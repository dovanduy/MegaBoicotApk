package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.ab */
class C4743ab extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f15378a = "com.google.android.gms.measurement.internal.ab";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4852ec f15379b;

    /* renamed from: c */
    private boolean f15380c;

    /* renamed from: d */
    private boolean f15381d;

    C4743ab(C4852ec ecVar) {
        C3513t.m12625a(ecVar);
        this.f15379b = ecVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f15379b.mo17458j();
        String action = intent.getAction();
        this.f15379b.mo17158r().mo17759x().mo17764a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = this.f15379b.mo17449c().mo17768f();
            if (this.f15381d != f) {
                this.f15381d = f;
                this.f15379b.mo17157q().mo17219a((Runnable) new C4744ac(this, f));
            }
            return;
        }
        this.f15379b.mo17158r().mo17754i().mo17764a("NetworkBroadcastReceiver received unknown action", action);
    }

    /* renamed from: a */
    public final void mo17163a() {
        this.f15379b.mo17458j();
        this.f15379b.mo17157q().mo17144d();
        if (!this.f15380c) {
            this.f15379b.mo17154n().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f15381d = this.f15379b.mo17449c().mo17768f();
            this.f15379b.mo17158r().mo17759x().mo17764a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f15381d));
            this.f15380c = true;
        }
    }

    /* renamed from: b */
    public final void mo17164b() {
        this.f15379b.mo17458j();
        this.f15379b.mo17157q().mo17144d();
        this.f15379b.mo17157q().mo17144d();
        if (this.f15380c) {
            this.f15379b.mo17158r().mo17759x().mo17763a("Unregistering connectivity change receiver");
            this.f15380c = false;
            this.f15381d = false;
            try {
                this.f15379b.mo17154n().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f15379b.mo17158r().mo17761y_().mo17764a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
