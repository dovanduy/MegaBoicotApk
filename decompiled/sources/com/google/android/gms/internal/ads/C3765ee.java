package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ee */
final class C3765ee implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f12936a;

    /* renamed from: b */
    final /* synthetic */ String f12937b;

    /* renamed from: c */
    private final /* synthetic */ C3763ec f12938c;

    C3765ee(C3763ec ecVar, JSONObject jSONObject, String str) {
        this.f12938c = ecVar;
        this.f12936a = jSONObject;
        this.f12937b = str;
    }

    public final void run() {
        this.f12938c.f12932l = C3763ec.f12924d.mo15030b((agw) null);
        this.f12938c.f12932l.mo15691a(new C3766ef(this), new C3767eg(this));
    }
}
