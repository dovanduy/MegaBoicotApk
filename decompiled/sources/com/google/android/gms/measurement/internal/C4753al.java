package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C3541a;
import com.google.android.gms.internal.p148e.C4497cf;

/* renamed from: com.google.android.gms.measurement.internal.al */
final class C4753al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4497cf f15427a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f15428b;

    /* renamed from: c */
    private final /* synthetic */ C4752ak f15429c;

    C4753al(C4752ak akVar, C4497cf cfVar, ServiceConnection serviceConnection) {
        this.f15429c = akVar;
        this.f15427a = cfVar;
        this.f15428b = serviceConnection;
    }

    public final void run() {
        C4751aj ajVar = this.f15429c.f15425a;
        String a = this.f15429c.f15426b;
        C4497cf cfVar = this.f15427a;
        ServiceConnection serviceConnection = this.f15428b;
        Bundle a2 = ajVar.mo17194a(a, cfVar);
        ajVar.f15424a.mo17157q().mo17144d();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                ajVar.f15424a.mo17158r().mo17761y_().mo17763a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    ajVar.f15424a.mo17158r().mo17761y_().mo17763a("No referrer defined in install referrer response");
                } else {
                    ajVar.f15424a.mo17158r().mo17759x().mo17764a("InstallReferrer API result", string);
                    C4862el j2 = ajVar.f15424a.mo17248j();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = j2.mo17484a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a3 == null) {
                        ajVar.f15424a.mo17158r().mo17761y_().mo17763a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                ajVar.f15424a.mo17158r().mo17761y_().mo17763a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j3);
                            }
                        }
                        if (j == ajVar.f15424a.mo17241c().f15392i.mo17188a()) {
                            ajVar.f15424a.mo17161u();
                            ajVar.f15424a.mo17158r().mo17759x().mo17763a("Campaign has already been logged");
                        } else {
                            ajVar.f15424a.mo17241c().f15392i.mo17189a(j);
                            ajVar.f15424a.mo17161u();
                            ajVar.f15424a.mo17158r().mo17759x().mo17764a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a3.putString("_cis", "referrer API");
                            ajVar.f15424a.mo17246h().mo17318a("auto", "_cmp", a3);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C3541a.m12711a().mo13685a(ajVar.f15424a.mo17154n(), serviceConnection);
        }
    }
}
