package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final class atu implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3695bq f12222a;

    /* renamed from: b */
    private final /* synthetic */ atr f12223b;

    atu(atr atr, C3695bq bqVar) {
        this.f12223b = atr;
        this.f12222a = bqVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C4089qe qeVar = (C4089qe) this.f12223b.f12215a.get();
        if (qeVar == null) {
            this.f12222a.mo15209b("/showOverlay", this);
        } else {
            qeVar.getView().setVisibility(0);
        }
    }
}
