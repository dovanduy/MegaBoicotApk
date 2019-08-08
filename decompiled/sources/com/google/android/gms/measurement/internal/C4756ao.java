package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.ao */
final class C4756ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4764aw f15433a;

    /* renamed from: b */
    private final /* synthetic */ long f15434b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f15435c;

    /* renamed from: d */
    private final /* synthetic */ Context f15436d;

    /* renamed from: e */
    private final /* synthetic */ C4893r f15437e;

    /* renamed from: f */
    private final /* synthetic */ PendingResult f15438f;

    C4756ao(C4754am amVar, C4764aw awVar, long j, Bundle bundle, Context context, C4893r rVar, PendingResult pendingResult) {
        this.f15433a = awVar;
        this.f15434b = j;
        this.f15435c = bundle;
        this.f15436d = context;
        this.f15437e = rVar;
        this.f15438f = pendingResult;
    }

    public final void run() {
        long a = this.f15433a.mo17241c().f15391h.mo17188a();
        long j = this.f15434b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f15435c.putLong("click_timestamp", j);
        }
        this.f15435c.putString("_cis", "referrer broadcast");
        C4764aw.m20471a(this.f15436d, (C4888m) null).mo17246h().mo17318a("auto", "_cmp", this.f15435c);
        this.f15437e.mo17759x().mo17763a("Install campaign recorded");
        if (this.f15438f != null) {
            this.f15438f.finish();
        }
    }
}
