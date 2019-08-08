package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3900je;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.ag */
final class C3069ag implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ JSONObject f8955a;

    /* renamed from: b */
    private final /* synthetic */ C3068af f8956b;

    C3069ag(C3068af afVar, JSONObject jSONObject) {
        this.f8956b = afVar;
        this.f8955a = jSONObject;
    }

    public final void run() {
        this.f8956b.f8952a.mo14987a("fetchHttpRequestCompleted", this.f8955a);
        C3900je.m17429b("Dispatched http response.");
    }
}
