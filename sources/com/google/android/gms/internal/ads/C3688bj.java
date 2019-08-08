package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bj */
final /* synthetic */ class C3688bj implements Runnable {

    /* renamed from: a */
    private final C3687bi f12743a;

    /* renamed from: b */
    private final JSONObject f12744b;

    /* renamed from: c */
    private final C4019np f12745c;

    C3688bj(C3687bi biVar, JSONObject jSONObject, C4019np npVar) {
        this.f12743a = biVar;
        this.f12744b = jSONObject;
        this.f12745c = npVar;
    }

    public final void run() {
        this.f12743a.mo15200a(this.f12744b, this.f12745c);
    }
}
