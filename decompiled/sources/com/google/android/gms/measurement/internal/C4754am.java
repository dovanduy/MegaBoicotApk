package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.am */
public final class C4754am {

    /* renamed from: a */
    private final C4757ap f15430a;

    public C4754am(C4757ap apVar) {
        C3513t.m12625a(apVar);
        this.f15430a = apVar;
    }

    /* renamed from: a */
    public static boolean m20401a(Context context) {
        C3513t.m12625a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo17199a(Context context, Intent intent) {
        C4764aw a = C4764aw.m20471a(context, (C4888m) null);
        C4893r r = a.mo17158r();
        if (intent == null) {
            r.mo17754i().mo17763a("Receiver called with null intent");
            return;
        }
        a.mo17161u();
        String action = intent.getAction();
        r.mo17759x().mo17764a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            r.mo17759x().mo17763a("Starting wakeful intent.");
            this.f15430a.mo17120a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo17157q().mo17219a((Runnable) new C4755an(this, a, r));
            } catch (Exception e) {
                r.mo17754i().mo17764a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a2 = this.f15430a.mo17119a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                r.mo17759x().mo17763a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            r.mo17757v().mo17764a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String str = "?";
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
            Bundle a3 = a.mo17248j().mo17484a(Uri.parse(stringExtra));
            if (a3 == null) {
                r.mo17759x().mo17763a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    r.mo17754i().mo17763a("Install referrer is missing timestamp");
                }
                C4759ar q = a.mo17157q();
                C4756ao aoVar = new C4756ao(this, a, longExtra, a3, context, r, a2);
                q.mo17219a((Runnable) aoVar);
            }
        }
    }
}
