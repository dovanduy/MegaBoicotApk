package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ev */
final class C3782ev implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3781eu f12986a;

    C3782ev(C3781eu euVar) {
        this.f12986a = euVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f12986a.f12979b) {
            if (!this.f12986a.f12982e.isDone()) {
                if (this.f12986a.f12980c.equals(map.get("request_id"))) {
                    C3788fa faVar = new C3788fa(1, map);
                    String f = faVar.mo15282f();
                    String valueOf = String.valueOf(faVar.mo15278b());
                    StringBuilder sb = new StringBuilder(24 + String.valueOf(f).length() + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(f);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    C3900je.m17435e(sb.toString());
                    this.f12986a.f12982e.mo15686b(faVar);
                }
            }
        }
    }
}
