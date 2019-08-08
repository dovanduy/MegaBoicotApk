package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C4823da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15671a;

    /* renamed from: b */
    private final /* synthetic */ boolean f15672b;

    /* renamed from: c */
    private final /* synthetic */ zzag f15673c;

    /* renamed from: d */
    private final /* synthetic */ zzk f15674d;

    /* renamed from: e */
    private final /* synthetic */ String f15675e;

    /* renamed from: f */
    private final /* synthetic */ C4815ct f15676f;

    C4823da(C4815ct ctVar, boolean z, boolean z2, zzag zzag, zzk zzk, String str) {
        this.f15676f = ctVar;
        this.f15671a = z;
        this.f15672b = z2;
        this.f15673c = zzag;
        this.f15674d = zzk;
        this.f15675e = str;
    }

    public final void run() {
        C4884i d = this.f15676f.f15644b;
        if (d == null) {
            this.f15676f.mo17158r().mo17761y_().mo17763a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f15671a) {
            this.f15676f.mo17364a(d, this.f15672b ? null : this.f15673c, this.f15674d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f15675e)) {
                    d.mo17267a(this.f15673c, this.f15674d);
                } else {
                    d.mo17268a(this.f15673c, this.f15675e, this.f15676f.mo17158r().mo17760y());
                }
            } catch (RemoteException e) {
                this.f15676f.mo17158r().mo17761y_().mo17764a("Failed to send event to the service", e);
            }
        }
        this.f15676f.m20696I();
    }
}
