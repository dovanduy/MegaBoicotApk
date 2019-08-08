package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.common.p140b.C3403b;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.stats.C3541a;
import com.google.android.gms.internal.p148e.C4497cf;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.aj */
public final class C4751aj {

    /* renamed from: a */
    final C4764aw f15424a;

    C4751aj(C4764aw awVar) {
        this.f15424a = awVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17195a(String str) {
        if (str == null || str.isEmpty()) {
            this.f15424a.mo17158r().mo17757v().mo17763a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f15424a.mo17157q().mo17144d();
        if (!m20397a()) {
            this.f15424a.mo17158r().mo17757v().mo17763a("Install Referrer Reporter is not available");
            return;
        }
        this.f15424a.mo17158r().mo17757v().mo17763a("Install Referrer Reporter is initializing");
        C4752ak akVar = new C4752ak(this, str);
        this.f15424a.mo17157q().mo17144d();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f15424a.mo17154n().getPackageManager();
        if (packageManager == null) {
            this.f15424a.mo17158r().mo17754i().mo17763a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f15424a.mo17158r().mo17757v().mo17763a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m20397a()) {
                this.f15424a.mo17158r().mo17757v().mo17763a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f15424a.mo17158r().mo17757v().mo17764a("Install Referrer Service is", C3541a.m12711a().mo13686a(this.f15424a.mo17154n(), new Intent(intent), akVar, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f15424a.mo17158r().mo17761y_().mo17764a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m20397a() {
        boolean z = false;
        try {
            C3403b a = C3404c.m12230a(this.f15424a.mo17154n());
            if (a == null) {
                this.f15424a.mo17158r().mo17757v().mo17763a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo13395b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f15424a.mo17158r().mo17757v().mo17764a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo17194a(String str, C4497cf cfVar) {
        this.f15424a.mo17157q().mo17144d();
        if (cfVar == null) {
            this.f15424a.mo17158r().mo17754i().mo17763a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = cfVar.mo16565a(bundle);
            if (a != null) {
                return a;
            }
            this.f15424a.mo17158r().mo17761y_().mo17763a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f15424a.mo17158r().mo17761y_().mo17764a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
