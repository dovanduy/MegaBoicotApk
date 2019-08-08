package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ex */
final class C3784ex implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3781eu f12988a;

    C3784ex(C3781eu euVar) {
        this.f12988a = euVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f12988a.f12979b) {
            if (!this.f12988a.f12982e.isDone()) {
                C3788fa faVar = new C3788fa(-2, map);
                if (this.f12988a.f12980c.equals(faVar.mo15284h())) {
                    this.f12988a.f12982e.mo15686b(faVar);
                }
            }
        }
    }
}
