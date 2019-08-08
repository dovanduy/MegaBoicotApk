package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final class azw implements C3067ae<ban> {

    /* renamed from: a */
    private final /* synthetic */ agw f12485a;

    /* renamed from: b */
    private final /* synthetic */ aze f12486b;

    /* renamed from: c */
    private final /* synthetic */ C3965lp f12487c;

    /* renamed from: d */
    private final /* synthetic */ azq f12488d;

    azw(azq azq, agw agw, aze aze, C3965lp lpVar) {
        this.f12488d = azq;
        this.f12485a = agw;
        this.f12486b = aze;
        this.f12487c = lpVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f12488d.f12464a) {
            C3900je.m17433d("JS Engine is requesting an update");
            if (this.f12488d.f12471h == 0) {
                C3900je.m17433d("Starting reload.");
                this.f12488d.f12471h = 2;
                this.f12488d.mo15027a(this.f12485a);
            }
            this.f12486b.mo15017b("/requestReload", (C3067ae) this.f12487c.mo15609a());
        }
    }
}
