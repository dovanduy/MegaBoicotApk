package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.p148e.C4497cf;
import com.google.android.gms.internal.p148e.C4531dg;

/* renamed from: com.google.android.gms.measurement.internal.ak */
public final class C4752ak implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4751aj f15425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f15426b;

    C4752ak(C4751aj ajVar, String str) {
        this.f15425a = ajVar;
        this.f15426b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f15425a.f15424a.mo17158r().mo17754i().mo17763a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C4497cf a = C4531dg.m19469a(iBinder);
            if (a == null) {
                this.f15425a.f15424a.mo17158r().mo17754i().mo17763a("Install Referrer Service implementation was not found");
                return;
            }
            this.f15425a.f15424a.mo17158r().mo17757v().mo17763a("Install Referrer Service connected");
            this.f15425a.f15424a.mo17157q().mo17219a((Runnable) new C4753al(this, a, this));
        } catch (Exception e) {
            this.f15425a.f15424a.mo17158r().mo17754i().mo17764a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15425a.f15424a.mo17158r().mo17757v().mo17763a("Install Referrer Service disconnected");
    }
}
