package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final class atv implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3695bq f12224a;

    /* renamed from: b */
    private final /* synthetic */ atr f12225b;

    atv(atr atr, C3695bq bqVar) {
        this.f12225b = atr;
        this.f12224a = bqVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C4089qe qeVar = (C4089qe) this.f12225b.f12215a.get();
        if (qeVar == null) {
            this.f12224a.mo15209b("/hideOverlay", this);
        } else {
            qeVar.getView().setVisibility(8);
        }
    }
}
