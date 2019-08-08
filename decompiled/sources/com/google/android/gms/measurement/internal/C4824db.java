package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.db */
final class C4824db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15677a;

    /* renamed from: b */
    private final /* synthetic */ boolean f15678b;

    /* renamed from: c */
    private final /* synthetic */ zzo f15679c;

    /* renamed from: d */
    private final /* synthetic */ zzk f15680d;

    /* renamed from: e */
    private final /* synthetic */ zzo f15681e;

    /* renamed from: f */
    private final /* synthetic */ C4815ct f15682f;

    C4824db(C4815ct ctVar, boolean z, boolean z2, zzo zzo, zzk zzk, zzo zzo2) {
        this.f15682f = ctVar;
        this.f15677a = z;
        this.f15678b = z2;
        this.f15679c = zzo;
        this.f15680d = zzk;
        this.f15681e = zzo2;
    }

    public final void run() {
        C4884i d = this.f15682f.f15644b;
        if (d == null) {
            this.f15682f.mo17158r().mo17761y_().mo17763a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f15677a) {
            this.f15682f.mo17364a(d, this.f15678b ? null : this.f15679c, this.f15680d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f15681e.f16021a)) {
                    d.mo17272a(this.f15679c, this.f15680d);
                } else {
                    d.mo17271a(this.f15679c);
                }
            } catch (RemoteException e) {
                this.f15682f.mo17158r().mo17761y_().mo17764a("Failed to send conditional user property to the service", e);
            }
        }
        this.f15682f.m20696I();
    }
}
