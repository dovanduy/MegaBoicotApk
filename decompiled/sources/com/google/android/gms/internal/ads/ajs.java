package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import org.json.JSONObject;

@C3718cm
public final class ajs implements akf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ajj f11222a;

    /* renamed from: b */
    private final C4089qe f11223b;

    /* renamed from: c */
    private final C3067ae<C4089qe> f11224c = new ajt(this);

    /* renamed from: d */
    private final C3067ae<C4089qe> f11225d = new aju(this);

    /* renamed from: e */
    private final C3067ae<C4089qe> f11226e = new ajv(this);

    public ajs(ajj ajj, C4089qe qeVar) {
        this.f11222a = ajj;
        this.f11223b = qeVar;
        C4089qe qeVar2 = this.f11223b;
        qeVar2.mo15880a("/updateActiveView", this.f11224c);
        qeVar2.mo15880a("/untrackActiveViewUnit", this.f11225d);
        qeVar2.mo15880a("/visibilityChanged", this.f11226e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f11222a.f11188a.mo14371d());
        C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final void mo14406a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f11223b.mo14994b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f11222a.mo14390b((akf) this);
        }
    }

    /* renamed from: a */
    public final boolean mo14407a() {
        return true;
    }

    /* renamed from: b */
    public final void mo14408b() {
        C4089qe qeVar = this.f11223b;
        qeVar.mo15884b("/visibilityChanged", this.f11226e);
        qeVar.mo15884b("/untrackActiveViewUnit", this.f11225d);
        qeVar.mo15884b("/updateActiveView", this.f11224c);
    }
}
