package com.google.android.gms.common.api;

import android.support.p017v4.p023d.C0376a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.internal.C3337cc;
import com.google.android.gms.common.internal.C3513t;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.c */
public class C3261c extends Exception {

    /* renamed from: a */
    private final C0376a<C3337cc<?>, ConnectionResult> f9472a;

    public C3261c(C0376a<C3337cc<?>, ConnectionResult> aVar) {
        this.f9472a = aVar;
    }

    /* renamed from: a */
    public ConnectionResult mo13111a(C3263e<? extends C3248d> eVar) {
        C3337cc d = eVar.mo13119d();
        C3513t.m12636b(this.f9472a.get(d) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f9472a.get(d);
    }

    /* renamed from: a */
    public final C0376a<C3337cc<?>, ConnectionResult> mo13110a() {
        return this.f9472a;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C3337cc ccVar : this.f9472a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f9472a.get(ccVar);
            if (connectionResult.mo13042b()) {
                z = false;
            }
            String a = ccVar.mo13272a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(2 + String.valueOf(a).length() + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
